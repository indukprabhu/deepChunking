package x10.regionarray;


@x10.runtime.impl.java.X10Generated
final public class PolyScanner extends x10.core.Ref implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<PolyScanner> $RTT = 
        x10.rtt.NamedType.<PolyScanner> make("x10.regionarray.PolyScanner",
                                             PolyScanner.class);
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.regionarray.PolyScanner $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        $_obj.C = $deserializer.readObject();
        $_obj.myMin = $deserializer.readObject();
        $_obj.myMax = $deserializer.readObject();
        $_obj.minSum = $deserializer.readObject();
        $_obj.maxSum = $deserializer.readObject();
        $_obj.parFlags = $deserializer.readObject();
        $_obj.min2 = $deserializer.readObject();
        $_obj.max2 = $deserializer.readObject();
        $_obj.rank = $deserializer.readLong();
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.regionarray.PolyScanner $_obj = new x10.regionarray.PolyScanner((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        $serializer.write(this.C);
        $serializer.write(this.myMin);
        $serializer.write(this.myMax);
        $serializer.write(this.minSum);
        $serializer.write(this.maxSum);
        $serializer.write(this.parFlags);
        $serializer.write(this.min2);
        $serializer.write(this.max2);
        $serializer.write(this.rank);
        
    }
    
    // constructor just for allocation
    public PolyScanner(final java.lang.System[] $dummy) {
        
    }
    
    
    // properties
    
    //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
    public long rank;
    

    
    //#line 70 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
    public x10.regionarray.PolyMat C;
    
    //#line 74 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
    public x10.regionarray.Array<x10.regionarray.VarMat> myMin;
    
    //#line 75 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
    public x10.regionarray.Array<x10.regionarray.VarMat> myMax;
    
    //#line 76 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
    public x10.regionarray.Array<x10.regionarray.VarMat> minSum;
    
    //#line 77 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
    public x10.regionarray.Array<x10.regionarray.VarMat> maxSum;
    
    //#line 79 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
    public x10.regionarray.Array<x10.core.Boolean> parFlags;
    
    //#line 80 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
    public x10.regionarray.Array<x10.regionarray.Array<x10.regionarray.PolyRow>> min2;
    
    //#line 81 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
    public x10.regionarray.Array<x10.regionarray.Array<x10.regionarray.PolyRow>> max2;
    
    
    //#line 83 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
    public static x10.regionarray.PolyScanner make(final x10.regionarray.PolyMat pm) {
        
        //#line 84 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
        final x10.regionarray.PolyScanner x = ((x10.regionarray.PolyScanner)(new x10.regionarray.PolyScanner((java.lang.System[]) null)));
        
        //#line 84 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
        x.x10$regionarray$PolyScanner$$init$S(((x10.regionarray.PolyMat)(pm)));
        
        //#line 85 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
        x.init();
        
        //#line 86 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
        return x;
    }
    
    
    //#line 89 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
    // creation method for java code (1-phase java constructor)
    public PolyScanner(final x10.regionarray.PolyMat pm) {
        this((java.lang.System[]) null);
        x10$regionarray$PolyScanner$$init$S(pm);
    }
    
    // constructor for non-virtual call
    final public x10.regionarray.PolyScanner x10$regionarray$PolyScanner$$init$S(final x10.regionarray.PolyMat pm) {
         {
            
            //#line 90 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            final long t$132718 = pm.rank;
            
            //#line 90 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            this.rank = t$132718;
            
            
            //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            final x10.regionarray.PolyScanner this$132733 = this;
            
            //#line 91 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            x10.regionarray.PolyMat pm0 = pm.simplifyAll();
            
            //#line 93 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            this.C = ((x10.regionarray.PolyMat)(pm));
            
            //#line 94 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            final x10.regionarray.PolyMat t$132188 = ((x10.regionarray.PolyMat)(pm0));
            
            //#line 94 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            final long r = t$132188.rank;
            
            //#line 95 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            final x10.regionarray.Array n = ((x10.regionarray.Array)(new x10.regionarray.Array<x10.regionarray.VarMat>((java.lang.System[]) null, x10.regionarray.VarMat.$RTT)));
            
            //#line 268 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long size$131979 = r;
            
            //#line 270 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.regionarray.RectRegion1D myReg$132734 = ((x10.regionarray.RectRegion1D)(new x10.regionarray.RectRegion1D((java.lang.System[]) null)));
            
            //#line 270 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$132719 = ((size$131979) - (((long)(1L))));
            
            //#line 270 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            myReg$132734.x10$regionarray$RectRegion1D$$init$S(t$132719);
            
            //#line 271 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.regionarray.Region t$132720 = ((x10.regionarray.Region)
                                                      myReg$132734);
            
            //#line 271 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ((x10.regionarray.Array<x10.regionarray.VarMat>)n).region = ((x10.regionarray.Region)(t$132720));
            
            //#line 271 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ((x10.regionarray.Array<x10.regionarray.VarMat>)n).rank = 1L;
            
            //#line 271 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ((x10.regionarray.Array<x10.regionarray.VarMat>)n).rect = true;
            
            //#line 271 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ((x10.regionarray.Array<x10.regionarray.VarMat>)n).zeroBased = true;
            
            //#line 271 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ((x10.regionarray.Array<x10.regionarray.VarMat>)n).rail = true;
            
            //#line 271 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ((x10.regionarray.Array<x10.regionarray.VarMat>)n).size = size$131979;
            {
                
            }
            
            //#line 273 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$132735 = ((x10.regionarray.Array<x10.regionarray.VarMat>)n).layout_min1 = 0L;
            
            //#line 273 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$132736 = ((x10.regionarray.Array<x10.regionarray.VarMat>)n).layout_stride1 = t$132735;
            
            //#line 273 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ((x10.regionarray.Array<x10.regionarray.VarMat>)n).layout_min0 = t$132736;
            
            //#line 274 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ((x10.regionarray.Array<x10.regionarray.VarMat>)n).layout = null;
            
            //#line 275 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.core.Rail t$132737 = ((x10.core.Rail)(new x10.core.Rail<x10.regionarray.VarMat>(x10.regionarray.VarMat.$RTT, ((long)(size$131979)))));
            
            //#line 275 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ((x10.regionarray.Array<x10.regionarray.VarMat>)n).raw = ((x10.core.Rail)(t$132737));
            
            //#line 96 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            this.myMin = ((x10.regionarray.Array)(n));
            
            //#line 97 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            final x10.regionarray.Array x = ((x10.regionarray.Array)(new x10.regionarray.Array<x10.regionarray.VarMat>((java.lang.System[]) null, x10.regionarray.VarMat.$RTT)));
            
            //#line 268 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long size$131984 = r;
            
            //#line 270 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.regionarray.RectRegion1D myReg$132738 = ((x10.regionarray.RectRegion1D)(new x10.regionarray.RectRegion1D((java.lang.System[]) null)));
            
            //#line 270 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$132721 = ((size$131984) - (((long)(1L))));
            
            //#line 270 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            myReg$132738.x10$regionarray$RectRegion1D$$init$S(t$132721);
            
            //#line 271 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.regionarray.Region t$132722 = ((x10.regionarray.Region)
                                                      myReg$132738);
            
            //#line 271 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ((x10.regionarray.Array<x10.regionarray.VarMat>)x).region = ((x10.regionarray.Region)(t$132722));
            
            //#line 271 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ((x10.regionarray.Array<x10.regionarray.VarMat>)x).rank = 1L;
            
            //#line 271 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ((x10.regionarray.Array<x10.regionarray.VarMat>)x).rect = true;
            
            //#line 271 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ((x10.regionarray.Array<x10.regionarray.VarMat>)x).zeroBased = true;
            
            //#line 271 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ((x10.regionarray.Array<x10.regionarray.VarMat>)x).rail = true;
            
            //#line 271 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ((x10.regionarray.Array<x10.regionarray.VarMat>)x).size = size$131984;
            {
                
            }
            
            //#line 273 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$132739 = ((x10.regionarray.Array<x10.regionarray.VarMat>)x).layout_min1 = 0L;
            
            //#line 273 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$132740 = ((x10.regionarray.Array<x10.regionarray.VarMat>)x).layout_stride1 = t$132739;
            
            //#line 273 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ((x10.regionarray.Array<x10.regionarray.VarMat>)x).layout_min0 = t$132740;
            
            //#line 274 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ((x10.regionarray.Array<x10.regionarray.VarMat>)x).layout = null;
            
            //#line 275 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.core.Rail t$132741 = ((x10.core.Rail)(new x10.core.Rail<x10.regionarray.VarMat>(x10.regionarray.VarMat.$RTT, ((long)(size$131984)))));
            
            //#line 275 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ((x10.regionarray.Array<x10.regionarray.VarMat>)x).raw = ((x10.core.Rail)(t$132741));
            
            //#line 98 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            this.myMax = ((x10.regionarray.Array)(x));
            
            //#line 99 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            final x10.regionarray.Array nSum = ((x10.regionarray.Array)(new x10.regionarray.Array<x10.regionarray.VarMat>((java.lang.System[]) null, x10.regionarray.VarMat.$RTT)));
            
            //#line 268 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long size$131989 = r;
            
            //#line 270 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.regionarray.RectRegion1D myReg$132742 = ((x10.regionarray.RectRegion1D)(new x10.regionarray.RectRegion1D((java.lang.System[]) null)));
            
            //#line 270 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$132723 = ((size$131989) - (((long)(1L))));
            
            //#line 270 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            myReg$132742.x10$regionarray$RectRegion1D$$init$S(t$132723);
            
            //#line 271 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.regionarray.Region t$132724 = ((x10.regionarray.Region)
                                                      myReg$132742);
            
            //#line 271 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ((x10.regionarray.Array<x10.regionarray.VarMat>)nSum).region = ((x10.regionarray.Region)(t$132724));
            
            //#line 271 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ((x10.regionarray.Array<x10.regionarray.VarMat>)nSum).rank = 1L;
            
            //#line 271 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ((x10.regionarray.Array<x10.regionarray.VarMat>)nSum).rect = true;
            
            //#line 271 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ((x10.regionarray.Array<x10.regionarray.VarMat>)nSum).zeroBased = true;
            
            //#line 271 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ((x10.regionarray.Array<x10.regionarray.VarMat>)nSum).rail = true;
            
            //#line 271 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ((x10.regionarray.Array<x10.regionarray.VarMat>)nSum).size = size$131989;
            {
                
            }
            
            //#line 273 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$132743 = ((x10.regionarray.Array<x10.regionarray.VarMat>)nSum).layout_min1 = 0L;
            
            //#line 273 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$132744 = ((x10.regionarray.Array<x10.regionarray.VarMat>)nSum).layout_stride1 = t$132743;
            
            //#line 273 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ((x10.regionarray.Array<x10.regionarray.VarMat>)nSum).layout_min0 = t$132744;
            
            //#line 274 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ((x10.regionarray.Array<x10.regionarray.VarMat>)nSum).layout = null;
            
            //#line 275 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.core.Rail t$132745 = ((x10.core.Rail)(new x10.core.Rail<x10.regionarray.VarMat>(x10.regionarray.VarMat.$RTT, ((long)(size$131989)))));
            
            //#line 275 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ((x10.regionarray.Array<x10.regionarray.VarMat>)nSum).raw = ((x10.core.Rail)(t$132745));
            
            //#line 100 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            this.minSum = ((x10.regionarray.Array)(nSum));
            
            //#line 101 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            final x10.regionarray.Array xSum = ((x10.regionarray.Array)(new x10.regionarray.Array<x10.regionarray.VarMat>((java.lang.System[]) null, x10.regionarray.VarMat.$RTT)));
            
            //#line 268 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long size$131994 = r;
            
            //#line 270 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.regionarray.RectRegion1D myReg$132746 = ((x10.regionarray.RectRegion1D)(new x10.regionarray.RectRegion1D((java.lang.System[]) null)));
            
            //#line 270 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$132725 = ((size$131994) - (((long)(1L))));
            
            //#line 270 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            myReg$132746.x10$regionarray$RectRegion1D$$init$S(t$132725);
            
            //#line 271 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.regionarray.Region t$132726 = ((x10.regionarray.Region)
                                                      myReg$132746);
            
            //#line 271 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ((x10.regionarray.Array<x10.regionarray.VarMat>)xSum).region = ((x10.regionarray.Region)(t$132726));
            
            //#line 271 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ((x10.regionarray.Array<x10.regionarray.VarMat>)xSum).rank = 1L;
            
            //#line 271 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ((x10.regionarray.Array<x10.regionarray.VarMat>)xSum).rect = true;
            
            //#line 271 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ((x10.regionarray.Array<x10.regionarray.VarMat>)xSum).zeroBased = true;
            
            //#line 271 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ((x10.regionarray.Array<x10.regionarray.VarMat>)xSum).rail = true;
            
            //#line 271 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ((x10.regionarray.Array<x10.regionarray.VarMat>)xSum).size = size$131994;
            {
                
            }
            
            //#line 273 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$132747 = ((x10.regionarray.Array<x10.regionarray.VarMat>)xSum).layout_min1 = 0L;
            
            //#line 273 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$132748 = ((x10.regionarray.Array<x10.regionarray.VarMat>)xSum).layout_stride1 = t$132747;
            
            //#line 273 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ((x10.regionarray.Array<x10.regionarray.VarMat>)xSum).layout_min0 = t$132748;
            
            //#line 274 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ((x10.regionarray.Array<x10.regionarray.VarMat>)xSum).layout = null;
            
            //#line 275 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.core.Rail t$132749 = ((x10.core.Rail)(new x10.core.Rail<x10.regionarray.VarMat>(x10.regionarray.VarMat.$RTT, ((long)(size$131994)))));
            
            //#line 275 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ((x10.regionarray.Array<x10.regionarray.VarMat>)xSum).raw = ((x10.core.Rail)(t$132749));
            
            //#line 102 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            this.maxSum = ((x10.regionarray.Array)(xSum));
            
            //#line 103 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            final x10.regionarray.Array n2 = ((x10.regionarray.Array)(new x10.regionarray.Array<x10.regionarray.Array<x10.regionarray.PolyRow>>((java.lang.System[]) null, x10.rtt.ParameterizedType.make(x10.regionarray.Array.$RTT, x10.regionarray.PolyRow.$RTT))));
            
            //#line 268 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long size$131999 = r;
            
            //#line 270 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.regionarray.RectRegion1D myReg$132750 = ((x10.regionarray.RectRegion1D)(new x10.regionarray.RectRegion1D((java.lang.System[]) null)));
            
            //#line 270 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$132727 = ((size$131999) - (((long)(1L))));
            
            //#line 270 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            myReg$132750.x10$regionarray$RectRegion1D$$init$S(t$132727);
            
            //#line 271 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.regionarray.Region t$132728 = ((x10.regionarray.Region)
                                                      myReg$132750);
            
            //#line 271 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ((x10.regionarray.Array<x10.regionarray.Array<x10.regionarray.PolyRow>>)n2).region = ((x10.regionarray.Region)(t$132728));
            
            //#line 271 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ((x10.regionarray.Array<x10.regionarray.Array<x10.regionarray.PolyRow>>)n2).rank = 1L;
            
            //#line 271 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ((x10.regionarray.Array<x10.regionarray.Array<x10.regionarray.PolyRow>>)n2).rect = true;
            
            //#line 271 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ((x10.regionarray.Array<x10.regionarray.Array<x10.regionarray.PolyRow>>)n2).zeroBased = true;
            
            //#line 271 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ((x10.regionarray.Array<x10.regionarray.Array<x10.regionarray.PolyRow>>)n2).rail = true;
            
            //#line 271 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ((x10.regionarray.Array<x10.regionarray.Array<x10.regionarray.PolyRow>>)n2).size = size$131999;
            {
                
            }
            
            //#line 273 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$132751 = ((x10.regionarray.Array<x10.regionarray.Array<x10.regionarray.PolyRow>>)n2).layout_min1 = 0L;
            
            //#line 273 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$132752 = ((x10.regionarray.Array<x10.regionarray.Array<x10.regionarray.PolyRow>>)n2).layout_stride1 = t$132751;
            
            //#line 273 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ((x10.regionarray.Array<x10.regionarray.Array<x10.regionarray.PolyRow>>)n2).layout_min0 = t$132752;
            
            //#line 274 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ((x10.regionarray.Array<x10.regionarray.Array<x10.regionarray.PolyRow>>)n2).layout = null;
            
            //#line 275 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.core.Rail t$132753 = ((x10.core.Rail)(new x10.core.Rail<x10.regionarray.Array<x10.regionarray.PolyRow>>(x10.rtt.ParameterizedType.make(x10.regionarray.Array.$RTT, x10.regionarray.PolyRow.$RTT), ((long)(size$131999)))));
            
            //#line 275 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ((x10.regionarray.Array<x10.regionarray.Array<x10.regionarray.PolyRow>>)n2).raw = ((x10.core.Rail)(t$132753));
            
            //#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            this.min2 = ((x10.regionarray.Array)(n2));
            
            //#line 105 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            final x10.regionarray.Array x2 = ((x10.regionarray.Array)(new x10.regionarray.Array<x10.regionarray.Array<x10.regionarray.PolyRow>>((java.lang.System[]) null, x10.rtt.ParameterizedType.make(x10.regionarray.Array.$RTT, x10.regionarray.PolyRow.$RTT))));
            
            //#line 268 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long size$132004 = r;
            
            //#line 270 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.regionarray.RectRegion1D myReg$132754 = ((x10.regionarray.RectRegion1D)(new x10.regionarray.RectRegion1D((java.lang.System[]) null)));
            
            //#line 270 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$132729 = ((size$132004) - (((long)(1L))));
            
            //#line 270 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            myReg$132754.x10$regionarray$RectRegion1D$$init$S(t$132729);
            
            //#line 271 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.regionarray.Region t$132730 = ((x10.regionarray.Region)
                                                      myReg$132754);
            
            //#line 271 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ((x10.regionarray.Array<x10.regionarray.Array<x10.regionarray.PolyRow>>)x2).region = ((x10.regionarray.Region)(t$132730));
            
            //#line 271 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ((x10.regionarray.Array<x10.regionarray.Array<x10.regionarray.PolyRow>>)x2).rank = 1L;
            
            //#line 271 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ((x10.regionarray.Array<x10.regionarray.Array<x10.regionarray.PolyRow>>)x2).rect = true;
            
            //#line 271 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ((x10.regionarray.Array<x10.regionarray.Array<x10.regionarray.PolyRow>>)x2).zeroBased = true;
            
            //#line 271 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ((x10.regionarray.Array<x10.regionarray.Array<x10.regionarray.PolyRow>>)x2).rail = true;
            
            //#line 271 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ((x10.regionarray.Array<x10.regionarray.Array<x10.regionarray.PolyRow>>)x2).size = size$132004;
            {
                
            }
            
            //#line 273 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$132755 = ((x10.regionarray.Array<x10.regionarray.Array<x10.regionarray.PolyRow>>)x2).layout_min1 = 0L;
            
            //#line 273 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$132756 = ((x10.regionarray.Array<x10.regionarray.Array<x10.regionarray.PolyRow>>)x2).layout_stride1 = t$132755;
            
            //#line 273 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ((x10.regionarray.Array<x10.regionarray.Array<x10.regionarray.PolyRow>>)x2).layout_min0 = t$132756;
            
            //#line 274 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ((x10.regionarray.Array<x10.regionarray.Array<x10.regionarray.PolyRow>>)x2).layout = null;
            
            //#line 275 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.core.Rail t$132757 = ((x10.core.Rail)(new x10.core.Rail<x10.regionarray.Array<x10.regionarray.PolyRow>>(x10.rtt.ParameterizedType.make(x10.regionarray.Array.$RTT, x10.regionarray.PolyRow.$RTT), ((long)(size$132004)))));
            
            //#line 275 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ((x10.regionarray.Array<x10.regionarray.Array<x10.regionarray.PolyRow>>)x2).raw = ((x10.core.Rail)(t$132757));
            
            //#line 106 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            this.max2 = ((x10.regionarray.Array)(x2));
            
            //#line 109 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            final x10.regionarray.Array alloc$131267 = ((x10.regionarray.Array)(new x10.regionarray.Array<x10.core.Boolean>((java.lang.System[]) null, x10.rtt.Types.BOOLEAN)));
            
            //#line 268 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long size$132009 = r;
            
            //#line 270 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.regionarray.RectRegion1D myReg$132758 = ((x10.regionarray.RectRegion1D)(new x10.regionarray.RectRegion1D((java.lang.System[]) null)));
            
            //#line 270 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$132731 = ((size$132009) - (((long)(1L))));
            
            //#line 270 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            myReg$132758.x10$regionarray$RectRegion1D$$init$S(t$132731);
            
            //#line 271 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.regionarray.Region t$132732 = ((x10.regionarray.Region)
                                                      myReg$132758);
            
            //#line 271 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ((x10.regionarray.Array<x10.core.Boolean>)alloc$131267).region = ((x10.regionarray.Region)(t$132732));
            
            //#line 271 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ((x10.regionarray.Array<x10.core.Boolean>)alloc$131267).rank = 1L;
            
            //#line 271 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ((x10.regionarray.Array<x10.core.Boolean>)alloc$131267).rect = true;
            
            //#line 271 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ((x10.regionarray.Array<x10.core.Boolean>)alloc$131267).zeroBased = true;
            
            //#line 271 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ((x10.regionarray.Array<x10.core.Boolean>)alloc$131267).rail = true;
            
            //#line 271 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ((x10.regionarray.Array<x10.core.Boolean>)alloc$131267).size = size$132009;
            {
                
            }
            
            //#line 273 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$132759 = ((x10.regionarray.Array<x10.core.Boolean>)alloc$131267).layout_min1 = 0L;
            
            //#line 273 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$132760 = ((x10.regionarray.Array<x10.core.Boolean>)alloc$131267).layout_stride1 = t$132759;
            
            //#line 273 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ((x10.regionarray.Array<x10.core.Boolean>)alloc$131267).layout_min0 = t$132760;
            
            //#line 274 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ((x10.regionarray.Array<x10.core.Boolean>)alloc$131267).layout = null;
            
            //#line 275 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.core.Rail t$132761 = ((x10.core.Rail)(new x10.core.Rail<x10.core.Boolean>(x10.rtt.Types.BOOLEAN, ((long)(size$132009)))));
            
            //#line 275 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ((x10.regionarray.Array<x10.core.Boolean>)alloc$131267).raw = ((x10.core.Rail)(t$132761));
            
            //#line 109 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            this.parFlags = ((x10.regionarray.Array)(alloc$131267));
        }
        return this;
    }
    
    
    
    //#line 112 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
    private void init() {
        
        //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
        x10.regionarray.PolyMat pm = C;
        
        //#line 114 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
        final x10.regionarray.PolyMat t$132226 = ((x10.regionarray.PolyMat)(pm));
        
        //#line 114 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
        final long t$132224 = rank;
        
        //#line 114 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
        final int t$132225 = ((int)(long)(((long)(t$132224))));
        
        //#line 114 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
        final int t$132227 = ((t$132225) - (((int)(1))));
        
        //#line 114 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
        this.init(((x10.regionarray.PolyMat)(t$132226)), (int)(t$132227));
        
        //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
        final long t$132770 = rank;
        
        //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
        final int t$132771 = ((int)(long)(((long)(t$132770))));
        
        //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
        int k$132772 = ((t$132771) - (((int)(2))));
        
        //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
        for (;
             true;
             ) {
            
            //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            final int t$132773 = k$132772;
            
            //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            final boolean t$132774 = ((t$132773) >= (((int)(0))));
            
            //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            if (!(t$132774)) {
                
                //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                break;
            }
            
            //#line 116 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            final x10.regionarray.PolyMat t$132762 = ((x10.regionarray.PolyMat)(pm));
            
            //#line 116 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            final int t$132763 = k$132772;
            
            //#line 116 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            final int t$132764 = ((t$132763) + (((int)(1))));
            
            //#line 116 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            final x10.regionarray.PolyMat t$132765 = ((x10.regionarray.PolyMat)(t$132762.eliminate((int)(t$132764), (boolean)(true))));
            
            //#line 116 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            pm = ((x10.regionarray.PolyMat)(t$132765));
            
            //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            final x10.regionarray.PolyMat t$132766 = ((x10.regionarray.PolyMat)(pm));
            
            //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            final int t$132767 = k$132772;
            
            //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            this.init(((x10.regionarray.PolyMat)(t$132766)), (int)(t$132767));
            
            //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            final int t$132768 = k$132772;
            
            //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            final int t$132769 = ((t$132768) - (((int)(1))));
            
            //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            k$132772 = t$132769;
        }
    }
    
    public static void init$P(final x10.regionarray.PolyScanner PolyScanner) {
        PolyScanner.init();
    }
    
    
    //#line 121 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
    final private void init(final x10.regionarray.PolyMat pm, final int axis) {
        
        //#line 126 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
        int imin = 0;
        
        //#line 127 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
        int imax = 0;
        
        //#line 128 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
        final x10.lang.Iterator r$132879 = ((x10.regionarray.Mat<x10.regionarray.PolyRow>)pm).iterator();
        
        //#line 128 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
        for (;
             true;
             ) {
            
            //#line 128 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            final boolean t$132880 = ((x10.lang.Iterator<x10.regionarray.PolyRow>)r$132879).hasNext$O();
            
            //#line 128 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            if (!(t$132880)) {
                
                //#line 128 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                break;
            }
            
            //#line 128 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            final x10.regionarray.PolyRow r$132775 = ((x10.lang.Iterator<x10.regionarray.PolyRow>)r$132879).next$G();
            
            //#line 129 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            final int t$132776 = r$132775.$apply$O((int)(axis));
            
            //#line 129 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            final boolean t$132777 = ((t$132776) < (((int)(0))));
            
            //#line 129 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            if (t$132777) {
                
                //#line 129 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                final int t$132778 = imin;
                
                //#line 129 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                final int t$132779 = ((t$132778) + (((int)(1))));
                
                //#line 129 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                imin = t$132779;
            }
            
            //#line 130 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            final int t$132780 = r$132775.$apply$O((int)(axis));
            
            //#line 130 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            final boolean t$132781 = ((t$132780) > (((int)(0))));
            
            //#line 130 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            if (t$132781) {
                
                //#line 130 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                final int t$132782 = imax;
                
                //#line 130 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                final int t$132783 = ((t$132782) + (((int)(1))));
                
                //#line 130 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                imax = t$132783;
            }
        }
        
        //#line 134 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
        final int t$132251 = imin;
        
        //#line 134 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
        boolean t$132253 = ((int) t$132251) == ((int) 0);
        
        //#line 134 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
        if (!(t$132253)) {
            
            //#line 134 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            final int t$132252 = imax;
            
            //#line 134 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            t$132253 = ((int) t$132252) == ((int) 0);
        }
        
        //#line 134 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
        final boolean t$132260 = t$132253;
        
        //#line 134 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
        if (t$132260) {
            
            //#line 135 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            final int t$132254 = imin;
            
            //#line 135 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            final boolean t$132255 = ((int) t$132254) == ((int) 0);
            
            //#line 135 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            java.lang.String t$132256 =  null;
            
            //#line 135 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            if (t$132255) {
                
                //#line 135 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                t$132256 = "minimum";
            } else {
                
                //#line 135 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                t$132256 = "maximum";
            }
            
            //#line 135 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            final java.lang.String m = t$132256;
            
            //#line 136 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            final java.lang.String t$132257 = (("axis ") + ((x10.core.Int.$box(axis))));
            
            //#line 136 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            final java.lang.String t$132258 = ((t$132257) + (" has no "));
            
            //#line 136 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            final java.lang.String msg = ((t$132258) + (m));
            
            //#line 137 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            final x10.regionarray.UnboundedRegionException t$132259 = ((x10.regionarray.UnboundedRegionException)(new x10.regionarray.UnboundedRegionException(((java.lang.String)(msg)))));
            
            //#line 137 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            throw t$132259;
        }
        
        //#line 141 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
        final x10.regionarray.Array this$132018 = ((x10.regionarray.Array)(myMin));
        
        //#line 544 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long i$132016 = ((long)(((int)(axis))));
        
        //#line 141 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
        final x10.regionarray.VarMat alloc$131268 = ((x10.regionarray.VarMat)(new x10.regionarray.VarMat((java.lang.System[]) null)));
        
        //#line 141 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
        final int t$132881 = imin;
        
        //#line 141 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
        final int t$132882 = ((axis) + (((int)(1))));
        
        //#line 141 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
        alloc$131268.x10$regionarray$VarMat$$init$S(t$132881, t$132882);
        
        //#line 544 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final x10.regionarray.VarMat v$132017 = ((x10.regionarray.VarMat)(alloc$131268));
        
        //#line 543 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        x10.regionarray.VarMat ret$132019 =  null;
        
        //#line 547 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final x10.core.Rail t$132784 = ((x10.core.Rail)(((x10.regionarray.Array<x10.regionarray.VarMat>)this$132018).raw));
        
        //#line 547 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        ((x10.regionarray.VarMat[])t$132784.value)[(int)i$132016] = v$132017;
        
        //#line 554 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        ret$132019 = ((x10.regionarray.VarMat)(v$132017));
        
        //#line 142 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
        final x10.regionarray.Array this$132023 = ((x10.regionarray.Array)(myMax));
        
        //#line 544 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long i$132021 = ((long)(((int)(axis))));
        
        //#line 142 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
        final x10.regionarray.VarMat alloc$131269 = ((x10.regionarray.VarMat)(new x10.regionarray.VarMat((java.lang.System[]) null)));
        
        //#line 142 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
        final int t$132883 = imax;
        
        //#line 142 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
        final int t$132884 = ((axis) + (((int)(1))));
        
        //#line 142 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
        alloc$131269.x10$regionarray$VarMat$$init$S(t$132883, t$132884);
        
        //#line 544 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final x10.regionarray.VarMat v$132022 = ((x10.regionarray.VarMat)(alloc$131269));
        
        //#line 543 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        x10.regionarray.VarMat ret$132024 =  null;
        
        //#line 547 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final x10.core.Rail t$132785 = ((x10.core.Rail)(((x10.regionarray.Array<x10.regionarray.VarMat>)this$132023).raw));
        
        //#line 547 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        ((x10.regionarray.VarMat[])t$132785.value)[(int)i$132021] = v$132022;
        
        //#line 554 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        ret$132024 = ((x10.regionarray.VarMat)(v$132022));
        
        //#line 143 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
        final x10.regionarray.Array this$132028 = ((x10.regionarray.Array)(minSum));
        
        //#line 544 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long i$132026 = ((long)(((int)(axis))));
        
        //#line 143 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
        final x10.regionarray.VarMat alloc$131270 = ((x10.regionarray.VarMat)(new x10.regionarray.VarMat((java.lang.System[]) null)));
        
        //#line 143 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
        final int t$132885 = imin;
        
        //#line 143 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
        final int t$132886 = ((axis) + (((int)(1))));
        
        //#line 143 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
        alloc$131270.x10$regionarray$VarMat$$init$S(t$132885, t$132886);
        
        //#line 544 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final x10.regionarray.VarMat v$132027 = ((x10.regionarray.VarMat)(alloc$131270));
        
        //#line 543 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        x10.regionarray.VarMat ret$132029 =  null;
        
        //#line 547 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final x10.core.Rail t$132786 = ((x10.core.Rail)(((x10.regionarray.Array<x10.regionarray.VarMat>)this$132028).raw));
        
        //#line 547 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        ((x10.regionarray.VarMat[])t$132786.value)[(int)i$132026] = v$132027;
        
        //#line 554 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        ret$132029 = ((x10.regionarray.VarMat)(v$132027));
        
        //#line 144 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
        final x10.regionarray.Array this$132033 = ((x10.regionarray.Array)(maxSum));
        
        //#line 544 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long i$132031 = ((long)(((int)(axis))));
        
        //#line 144 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
        final x10.regionarray.VarMat alloc$131271 = ((x10.regionarray.VarMat)(new x10.regionarray.VarMat((java.lang.System[]) null)));
        
        //#line 144 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
        final int t$132887 = imax;
        
        //#line 144 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
        final int t$132888 = ((axis) + (((int)(1))));
        
        //#line 144 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
        alloc$131271.x10$regionarray$VarMat$$init$S(t$132887, t$132888);
        
        //#line 544 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final x10.regionarray.VarMat v$132032 = ((x10.regionarray.VarMat)(alloc$131271));
        
        //#line 543 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        x10.regionarray.VarMat ret$132034 =  null;
        
        //#line 547 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final x10.core.Rail t$132787 = ((x10.core.Rail)(((x10.regionarray.Array<x10.regionarray.VarMat>)this$132033).raw));
        
        //#line 547 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        ((x10.regionarray.VarMat[])t$132787.value)[(int)i$132031] = v$132032;
        
        //#line 554 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        ret$132034 = ((x10.regionarray.VarMat)(v$132032));
        
        //#line 145 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
        final x10.regionarray.Array this$132043 = ((x10.regionarray.Array)(min2));
        
        //#line 544 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long i$132041 = ((long)(((int)(axis))));
        
        //#line 145 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
        final x10.regionarray.Array alloc$131272 = ((x10.regionarray.Array)(new x10.regionarray.Array<x10.regionarray.PolyRow>((java.lang.System[]) null, x10.regionarray.PolyRow.$RTT)));
        
        //#line 145 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
        final int t$132273 = imin;
        
        //#line 268 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long size$132036 = ((long)(((int)(t$132273))));
        
        //#line 270 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final x10.regionarray.RectRegion1D myReg$132889 = ((x10.regionarray.RectRegion1D)(new x10.regionarray.RectRegion1D((java.lang.System[]) null)));
        
        //#line 270 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$132788 = ((size$132036) - (((long)(1L))));
        
        //#line 270 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        myReg$132889.x10$regionarray$RectRegion1D$$init$S(t$132788);
        
        //#line 271 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final x10.regionarray.Region t$132789 = ((x10.regionarray.Region)
                                                  myReg$132889);
        
        //#line 271 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        ((x10.regionarray.Array<x10.regionarray.PolyRow>)alloc$131272).region = ((x10.regionarray.Region)(t$132789));
        
        //#line 271 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        ((x10.regionarray.Array<x10.regionarray.PolyRow>)alloc$131272).rank = 1L;
        
        //#line 271 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        ((x10.regionarray.Array<x10.regionarray.PolyRow>)alloc$131272).rect = true;
        
        //#line 271 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        ((x10.regionarray.Array<x10.regionarray.PolyRow>)alloc$131272).zeroBased = true;
        
        //#line 271 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        ((x10.regionarray.Array<x10.regionarray.PolyRow>)alloc$131272).rail = true;
        
        //#line 271 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        ((x10.regionarray.Array<x10.regionarray.PolyRow>)alloc$131272).size = size$132036;
        {
            
        }
        
        //#line 273 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$132890 = ((x10.regionarray.Array<x10.regionarray.PolyRow>)alloc$131272).layout_min1 = 0L;
        
        //#line 273 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$132891 = ((x10.regionarray.Array<x10.regionarray.PolyRow>)alloc$131272).layout_stride1 = t$132890;
        
        //#line 273 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        ((x10.regionarray.Array<x10.regionarray.PolyRow>)alloc$131272).layout_min0 = t$132891;
        
        //#line 274 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        ((x10.regionarray.Array<x10.regionarray.PolyRow>)alloc$131272).layout = null;
        
        //#line 275 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final x10.core.Rail t$132892 = ((x10.core.Rail)(new x10.core.Rail<x10.regionarray.PolyRow>(x10.regionarray.PolyRow.$RTT, ((long)(size$132036)))));
        
        //#line 275 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        ((x10.regionarray.Array<x10.regionarray.PolyRow>)alloc$131272).raw = ((x10.core.Rail)(t$132892));
        
        //#line 544 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final x10.regionarray.Array v$132042 = ((x10.regionarray.Array)(alloc$131272));
        
        //#line 543 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        x10.regionarray.Array ret$132044 =  null;
        
        //#line 547 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final x10.core.Rail t$132790 = ((x10.core.Rail)(((x10.regionarray.Array<x10.regionarray.Array<x10.regionarray.PolyRow>>)this$132043).raw));
        
        //#line 547 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        ((x10.regionarray.Array[])t$132790.value)[(int)i$132041] = v$132042;
        
        //#line 554 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        ret$132044 = ((x10.regionarray.Array)(v$132042));
        
        //#line 146 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
        final x10.regionarray.Array this$132053 = ((x10.regionarray.Array)(max2));
        
        //#line 544 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long i$132051 = ((long)(((int)(axis))));
        
        //#line 146 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
        final x10.regionarray.Array alloc$131273 = ((x10.regionarray.Array)(new x10.regionarray.Array<x10.regionarray.PolyRow>((java.lang.System[]) null, x10.regionarray.PolyRow.$RTT)));
        
        //#line 146 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
        final int t$132280 = imax;
        
        //#line 268 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long size$132046 = ((long)(((int)(t$132280))));
        
        //#line 270 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final x10.regionarray.RectRegion1D myReg$132893 = ((x10.regionarray.RectRegion1D)(new x10.regionarray.RectRegion1D((java.lang.System[]) null)));
        
        //#line 270 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$132791 = ((size$132046) - (((long)(1L))));
        
        //#line 270 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        myReg$132893.x10$regionarray$RectRegion1D$$init$S(t$132791);
        
        //#line 271 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final x10.regionarray.Region t$132792 = ((x10.regionarray.Region)
                                                  myReg$132893);
        
        //#line 271 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        ((x10.regionarray.Array<x10.regionarray.PolyRow>)alloc$131273).region = ((x10.regionarray.Region)(t$132792));
        
        //#line 271 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        ((x10.regionarray.Array<x10.regionarray.PolyRow>)alloc$131273).rank = 1L;
        
        //#line 271 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        ((x10.regionarray.Array<x10.regionarray.PolyRow>)alloc$131273).rect = true;
        
        //#line 271 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        ((x10.regionarray.Array<x10.regionarray.PolyRow>)alloc$131273).zeroBased = true;
        
        //#line 271 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        ((x10.regionarray.Array<x10.regionarray.PolyRow>)alloc$131273).rail = true;
        
        //#line 271 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        ((x10.regionarray.Array<x10.regionarray.PolyRow>)alloc$131273).size = size$132046;
        {
            
        }
        
        //#line 273 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$132894 = ((x10.regionarray.Array<x10.regionarray.PolyRow>)alloc$131273).layout_min1 = 0L;
        
        //#line 273 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$132895 = ((x10.regionarray.Array<x10.regionarray.PolyRow>)alloc$131273).layout_stride1 = t$132894;
        
        //#line 273 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        ((x10.regionarray.Array<x10.regionarray.PolyRow>)alloc$131273).layout_min0 = t$132895;
        
        //#line 274 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        ((x10.regionarray.Array<x10.regionarray.PolyRow>)alloc$131273).layout = null;
        
        //#line 275 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final x10.core.Rail t$132896 = ((x10.core.Rail)(new x10.core.Rail<x10.regionarray.PolyRow>(x10.regionarray.PolyRow.$RTT, ((long)(size$132046)))));
        
        //#line 275 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        ((x10.regionarray.Array<x10.regionarray.PolyRow>)alloc$131273).raw = ((x10.core.Rail)(t$132896));
        
        //#line 544 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final x10.regionarray.Array v$132052 = ((x10.regionarray.Array)(alloc$131273));
        
        //#line 543 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        x10.regionarray.Array ret$132054 =  null;
        
        //#line 547 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final x10.core.Rail t$132793 = ((x10.core.Rail)(((x10.regionarray.Array<x10.regionarray.Array<x10.regionarray.PolyRow>>)this$132053).raw));
        
        //#line 547 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        ((x10.regionarray.Array[])t$132793.value)[(int)i$132051] = v$132052;
        
        //#line 554 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        ret$132054 = ((x10.regionarray.Array)(v$132052));
        
        //#line 149 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
        imin = 0;
        
        //#line 149 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
        imax = 0;
        
        //#line 150 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
        final x10.lang.Iterator r$132897 = ((x10.regionarray.Mat<x10.regionarray.PolyRow>)pm).iterator();
        
        //#line 150 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
        for (;
             true;
             ) {
            
            //#line 150 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            final boolean t$132898 = ((x10.lang.Iterator<x10.regionarray.PolyRow>)r$132897).hasNext$O();
            
            //#line 150 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            if (!(t$132898)) {
                
                //#line 150 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                break;
            }
            
            //#line 150 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            final x10.regionarray.PolyRow r$132836 = ((x10.lang.Iterator<x10.regionarray.PolyRow>)r$132897).next$G();
            
            //#line 151 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            final int t$132837 = r$132836.$apply$O((int)(axis));
            
            //#line 151 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            final boolean t$132838 = ((t$132837) < (((int)(0))));
            
            //#line 151 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            if (t$132838) {
                
                //#line 152 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                int i$132808 = 0;
                
                //#line 152 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                for (;
                     true;
                     ) {
                    
                    //#line 152 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                    final int t$132809 = i$132808;
                    
                    //#line 152 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                    final boolean t$132810 = ((t$132809) <= (((int)(axis))));
                    
                    //#line 152 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                    if (!(t$132810)) {
                        
                        //#line 152 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                        break;
                    }
                    
                    //#line 153 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                    final x10.regionarray.Array this$132796 = ((x10.regionarray.Array)(myMin));
                    
                    //#line 443 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long i$132797 = ((long)(((int)(axis))));
                    
                    //#line 442 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    x10.regionarray.VarMat ret$132798 =  null;
                    
                    //#line 446 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final x10.core.Rail t$132794 = ((x10.core.Rail)(((x10.regionarray.Array<x10.regionarray.VarMat>)this$132796).raw));
                    
                    //#line 446 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final x10.regionarray.VarMat t$132795 = ((x10.regionarray.VarMat[])t$132794.value)[(int)i$132797];
                    
                    //#line 446 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    ret$132798 = t$132795;
                    
                    //#line 442 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final x10.regionarray.VarMat t$132799 = ret$132798;
                    
                    //#line 153 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                    final int t$132800 = imin;
                    
                    //#line 153 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                    final x10.regionarray.VarRow t$132801 = ((x10.regionarray.Mat<x10.regionarray.VarRow>)t$132799).$apply$G((int)(t$132800));
                    
                    //#line 153 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                    final int t$132802 = i$132808;
                    
                    //#line 153 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                    final int t$132803 = i$132808;
                    
                    //#line 153 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                    final int t$132804 = r$132836.$apply$O((int)(t$132803));
                    
                    //#line 153 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                    t$132801.$set$O((int)(t$132802), (int)(t$132804));
                    
                    //#line 152 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                    final int t$132805 = i$132808;
                    
                    //#line 152 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                    final int t$132806 = ((t$132805) + (((int)(1))));
                    
                    //#line 152 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                    i$132808 = t$132806;
                }
                
                //#line 154 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                final x10.regionarray.Array this$132839 = ((x10.regionarray.Array)(minSum));
                
                //#line 443 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long i$132840 = ((long)(((int)(axis))));
                
                //#line 442 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                x10.regionarray.VarMat ret$132841 =  null;
                
                //#line 446 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final x10.core.Rail t$132811 = ((x10.core.Rail)(((x10.regionarray.Array<x10.regionarray.VarMat>)this$132839).raw));
                
                //#line 446 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final x10.regionarray.VarMat t$132812 = ((x10.regionarray.VarMat[])t$132811.value)[(int)i$132840];
                
                //#line 446 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                ret$132841 = t$132812;
                
                //#line 442 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final x10.regionarray.VarMat t$132842 = ret$132841;
                
                //#line 154 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                final int t$132843 = imin;
                
                //#line 154 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                final x10.regionarray.VarRow t$132844 = ((x10.regionarray.Mat<x10.regionarray.VarRow>)t$132842).$apply$G((int)(t$132843));
                
                //#line 154 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                final long t$132845 = rank;
                
                //#line 154 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                final int t$132846 = ((int)(long)(((long)(t$132845))));
                
                //#line 154 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                final int t$132847 = r$132836.$apply$O((int)(t$132846));
                
                //#line 154 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                t$132844.$set$O((int)(0), (int)(t$132847));
                
                //#line 155 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                final x10.regionarray.Array this$132848 = ((x10.regionarray.Array)(min2));
                
                //#line 443 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long i$132849 = ((long)(((int)(axis))));
                
                //#line 442 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                x10.regionarray.Array ret$132850 =  null;
                
                //#line 446 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final x10.core.Rail t$132813 = ((x10.core.Rail)(((x10.regionarray.Array<x10.regionarray.Array<x10.regionarray.PolyRow>>)this$132848).raw));
                
                //#line 446 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final x10.regionarray.Array t$132814 = ((x10.regionarray.Array)(((x10.regionarray.Array[])t$132813.value)[(int)i$132849]));
                
                //#line 446 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                ret$132850 = ((x10.regionarray.Array)(t$132814));
                
                //#line 155 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                final x10.regionarray.Array this$132851 = ((x10.regionarray.Array)(ret$132850));
                
                //#line 155 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                final int t$132852 = imin;
                
                //#line 544 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long i$132853 = ((long)(((int)(t$132852))));
                
                //#line 544 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final x10.regionarray.PolyRow v$132854 = ((x10.regionarray.PolyRow)(r$132836));
                
                //#line 543 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                x10.regionarray.PolyRow ret$132855 =  null;
                
                //#line 547 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final x10.core.Rail t$132807 = ((x10.core.Rail)(((x10.regionarray.Array<x10.regionarray.PolyRow>)this$132851).raw));
                
                //#line 547 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                ((x10.regionarray.PolyRow[])t$132807.value)[(int)i$132853] = v$132854;
                
                //#line 554 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                ret$132855 = ((x10.regionarray.PolyRow)(v$132854));
                
                //#line 156 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                final int t$132856 = imin;
                
                //#line 156 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                final int t$132857 = ((t$132856) + (((int)(1))));
                
                //#line 156 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                imin = t$132857;
            }
            
            //#line 158 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            final int t$132858 = r$132836.$apply$O((int)(axis));
            
            //#line 158 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            final boolean t$132859 = ((t$132858) > (((int)(0))));
            
            //#line 158 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            if (t$132859) {
                
                //#line 159 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                int i$132829 = 0;
                
                //#line 159 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                for (;
                     true;
                     ) {
                    
                    //#line 159 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                    final int t$132830 = i$132829;
                    
                    //#line 159 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                    final boolean t$132831 = ((t$132830) <= (((int)(axis))));
                    
                    //#line 159 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                    if (!(t$132831)) {
                        
                        //#line 159 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                        break;
                    }
                    
                    //#line 160 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                    final x10.regionarray.Array this$132817 = ((x10.regionarray.Array)(myMax));
                    
                    //#line 443 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long i$132818 = ((long)(((int)(axis))));
                    
                    //#line 442 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    x10.regionarray.VarMat ret$132819 =  null;
                    
                    //#line 446 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final x10.core.Rail t$132815 = ((x10.core.Rail)(((x10.regionarray.Array<x10.regionarray.VarMat>)this$132817).raw));
                    
                    //#line 446 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final x10.regionarray.VarMat t$132816 = ((x10.regionarray.VarMat[])t$132815.value)[(int)i$132818];
                    
                    //#line 446 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    ret$132819 = t$132816;
                    
                    //#line 442 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final x10.regionarray.VarMat t$132820 = ret$132819;
                    
                    //#line 160 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                    final int t$132821 = imax;
                    
                    //#line 160 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                    final x10.regionarray.VarRow t$132822 = ((x10.regionarray.Mat<x10.regionarray.VarRow>)t$132820).$apply$G((int)(t$132821));
                    
                    //#line 160 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                    final int t$132823 = i$132829;
                    
                    //#line 160 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                    final int t$132824 = i$132829;
                    
                    //#line 160 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                    final int t$132825 = r$132836.$apply$O((int)(t$132824));
                    
                    //#line 160 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                    t$132822.$set$O((int)(t$132823), (int)(t$132825));
                    
                    //#line 159 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                    final int t$132826 = i$132829;
                    
                    //#line 159 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                    final int t$132827 = ((t$132826) + (((int)(1))));
                    
                    //#line 159 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                    i$132829 = t$132827;
                }
                
                //#line 161 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                final x10.regionarray.Array this$132860 = ((x10.regionarray.Array)(maxSum));
                
                //#line 443 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long i$132861 = ((long)(((int)(axis))));
                
                //#line 442 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                x10.regionarray.VarMat ret$132862 =  null;
                
                //#line 446 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final x10.core.Rail t$132832 = ((x10.core.Rail)(((x10.regionarray.Array<x10.regionarray.VarMat>)this$132860).raw));
                
                //#line 446 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final x10.regionarray.VarMat t$132833 = ((x10.regionarray.VarMat[])t$132832.value)[(int)i$132861];
                
                //#line 446 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                ret$132862 = t$132833;
                
                //#line 442 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final x10.regionarray.VarMat t$132863 = ret$132862;
                
                //#line 161 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                final int t$132864 = imax;
                
                //#line 161 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                final x10.regionarray.VarRow t$132865 = ((x10.regionarray.Mat<x10.regionarray.VarRow>)t$132863).$apply$G((int)(t$132864));
                
                //#line 161 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                final long t$132866 = rank;
                
                //#line 161 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                final int t$132867 = ((int)(long)(((long)(t$132866))));
                
                //#line 161 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                final int t$132868 = r$132836.$apply$O((int)(t$132867));
                
                //#line 161 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                t$132865.$set$O((int)(0), (int)(t$132868));
                
                //#line 162 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                final x10.regionarray.Array this$132869 = ((x10.regionarray.Array)(max2));
                
                //#line 443 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long i$132870 = ((long)(((int)(axis))));
                
                //#line 442 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                x10.regionarray.Array ret$132871 =  null;
                
                //#line 446 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final x10.core.Rail t$132834 = ((x10.core.Rail)(((x10.regionarray.Array<x10.regionarray.Array<x10.regionarray.PolyRow>>)this$132869).raw));
                
                //#line 446 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final x10.regionarray.Array t$132835 = ((x10.regionarray.Array)(((x10.regionarray.Array[])t$132834.value)[(int)i$132870]));
                
                //#line 446 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                ret$132871 = ((x10.regionarray.Array)(t$132835));
                
                //#line 162 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                final x10.regionarray.Array this$132872 = ((x10.regionarray.Array)(ret$132871));
                
                //#line 162 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                final int t$132873 = imax;
                
                //#line 544 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long i$132874 = ((long)(((int)(t$132873))));
                
                //#line 544 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final x10.regionarray.PolyRow v$132875 = ((x10.regionarray.PolyRow)(r$132836));
                
                //#line 543 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                x10.regionarray.PolyRow ret$132876 =  null;
                
                //#line 547 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final x10.core.Rail t$132828 = ((x10.core.Rail)(((x10.regionarray.Array<x10.regionarray.PolyRow>)this$132872).raw));
                
                //#line 547 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                ((x10.regionarray.PolyRow[])t$132828.value)[(int)i$132874] = v$132875;
                
                //#line 554 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                ret$132876 = ((x10.regionarray.PolyRow)(v$132875));
                
                //#line 163 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                final int t$132877 = imax;
                
                //#line 163 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                final int t$132878 = ((t$132877) + (((int)(1))));
                
                //#line 163 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                imax = t$132878;
            }
        }
    }
    
    final public static void init$P(final x10.regionarray.PolyMat pm, final int axis, final x10.regionarray.PolyScanner PolyScanner) {
        PolyScanner.init(((x10.regionarray.PolyMat)(pm)), (int)(axis));
    }
    
    
    //#line 177 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
    final public void $set(final int v, final int axis) {
        
        //#line 177 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
        this.set((int)(axis), (int)(v));
    }
    
    
    //#line 179 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
    final public void set(final int axis, final int v) {
        
        //#line 180 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
        int k$132993 = ((axis) + (((int)(1))));
        
        //#line 180 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
        for (;
             true;
             ) {
            
            //#line 180 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            final int t$132994 = k$132993;
            
            //#line 180 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            final long t$132995 = ((long)(((int)(t$132994))));
            
            //#line 180 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            final long t$132996 = rank;
            
            //#line 180 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            final boolean t$132997 = ((t$132995) < (((long)(t$132996))));
            
            //#line 180 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            if (!(t$132997)) {
                
                //#line 180 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                break;
            }
            
            //#line 181 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            int l$132935 = 0;
            
            //#line 181 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            for (;
                 true;
                 ) {
                
                //#line 181 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                final int t$132936 = l$132935;
                
                //#line 181 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                final x10.regionarray.Array this$132937 = ((x10.regionarray.Array)(minSum));
                
                //#line 181 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                final int t$132938 = k$132993;
                
                //#line 443 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long i$132939 = ((long)(((int)(t$132938))));
                
                //#line 442 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                x10.regionarray.VarMat ret$132940 =  null;
                
                //#line 446 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final x10.core.Rail t$132905 = ((x10.core.Rail)(((x10.regionarray.Array<x10.regionarray.VarMat>)this$132937).raw));
                
                //#line 446 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final x10.regionarray.VarMat t$132906 = ((x10.regionarray.VarMat[])t$132905.value)[(int)i$132939];
                
                //#line 446 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                ret$132940 = t$132906;
                
                //#line 442 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final x10.regionarray.VarMat t$132941 = ret$132940;
                
                //#line 181 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                final int t$132942 = ((x10.regionarray.Mat<x10.regionarray.VarRow>)t$132941).rows;
                
                //#line 181 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                final boolean t$132943 = ((t$132936) < (((int)(t$132942))));
                
                //#line 181 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                if (!(t$132943)) {
                    
                    //#line 181 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                    break;
                }
                
                //#line 182 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                final x10.regionarray.Array this$132907 = ((x10.regionarray.Array)(minSum));
                
                //#line 182 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                final int t$132908 = k$132993;
                
                //#line 443 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long i$132909 = ((long)(((int)(t$132908))));
                
                //#line 442 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                x10.regionarray.VarMat ret$132910 =  null;
                
                //#line 446 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final x10.core.Rail t$132899 = ((x10.core.Rail)(((x10.regionarray.Array<x10.regionarray.VarMat>)this$132907).raw));
                
                //#line 446 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final x10.regionarray.VarMat t$132900 = ((x10.regionarray.VarMat[])t$132899.value)[(int)i$132909];
                
                //#line 446 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                ret$132910 = t$132900;
                
                //#line 442 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final x10.regionarray.VarMat t$132911 = ret$132910;
                
                //#line 182 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                final int t$132912 = l$132935;
                
                //#line 182 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                final x10.regionarray.VarRow t$132913 = ((x10.regionarray.Mat<x10.regionarray.VarRow>)t$132911).$apply$G((int)(t$132912));
                
                //#line 182 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                final int t$132914 = ((axis) + (((int)(1))));
                
                //#line 182 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                final x10.regionarray.Array this$132915 = ((x10.regionarray.Array)(myMin));
                
                //#line 182 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                final int t$132916 = k$132993;
                
                //#line 443 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long i$132917 = ((long)(((int)(t$132916))));
                
                //#line 442 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                x10.regionarray.VarMat ret$132918 =  null;
                
                //#line 446 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final x10.core.Rail t$132901 = ((x10.core.Rail)(((x10.regionarray.Array<x10.regionarray.VarMat>)this$132915).raw));
                
                //#line 446 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final x10.regionarray.VarMat t$132902 = ((x10.regionarray.VarMat[])t$132901.value)[(int)i$132917];
                
                //#line 446 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                ret$132918 = t$132902;
                
                //#line 442 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final x10.regionarray.VarMat t$132919 = ret$132918;
                
                //#line 182 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                final int t$132920 = l$132935;
                
                //#line 182 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                final x10.regionarray.VarRow t$132921 = ((x10.regionarray.Mat<x10.regionarray.VarRow>)t$132919).$apply$G((int)(t$132920));
                
                //#line 182 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                final int t$132922 = t$132921.$apply$O((int)(axis));
                
                //#line 182 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                final int t$132923 = ((t$132922) * (((int)(v))));
                
                //#line 182 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                final x10.regionarray.Array this$132924 = ((x10.regionarray.Array)(minSum));
                
                //#line 182 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                final int t$132925 = k$132993;
                
                //#line 443 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long i$132926 = ((long)(((int)(t$132925))));
                
                //#line 442 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                x10.regionarray.VarMat ret$132927 =  null;
                
                //#line 446 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final x10.core.Rail t$132903 = ((x10.core.Rail)(((x10.regionarray.Array<x10.regionarray.VarMat>)this$132924).raw));
                
                //#line 446 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final x10.regionarray.VarMat t$132904 = ((x10.regionarray.VarMat[])t$132903.value)[(int)i$132926];
                
                //#line 446 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                ret$132927 = t$132904;
                
                //#line 442 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final x10.regionarray.VarMat t$132928 = ret$132927;
                
                //#line 182 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                final int t$132929 = l$132935;
                
                //#line 182 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                final x10.regionarray.VarRow t$132930 = ((x10.regionarray.Mat<x10.regionarray.VarRow>)t$132928).$apply$G((int)(t$132929));
                
                //#line 182 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                final int t$132931 = t$132930.$apply$O((int)(axis));
                
                //#line 182 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                final int t$132932 = ((t$132923) + (((int)(t$132931))));
                
                //#line 182 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                t$132913.$set$O((int)(t$132914), (int)(t$132932));
                
                //#line 181 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                final int t$132933 = l$132935;
                
                //#line 181 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                final int t$132934 = ((t$132933) + (((int)(1))));
                
                //#line 181 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                l$132935 = t$132934;
            }
            
            //#line 180 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            final int t$132944 = k$132993;
            
            //#line 180 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            final int t$132945 = ((t$132944) + (((int)(1))));
            
            //#line 180 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            k$132993 = t$132945;
        }
        
        //#line 183 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
        int k$132998 = ((axis) + (((int)(1))));
        
        //#line 183 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
        for (;
             true;
             ) {
            
            //#line 183 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            final int t$132999 = k$132998;
            
            //#line 183 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            final long t$133000 = ((long)(((int)(t$132999))));
            
            //#line 183 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            final long t$133001 = rank;
            
            //#line 183 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            final boolean t$133002 = ((t$133000) < (((long)(t$133001))));
            
            //#line 183 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            if (!(t$133002)) {
                
                //#line 183 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                break;
            }
            
            //#line 184 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            int l$132982 = 0;
            
            //#line 184 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            for (;
                 true;
                 ) {
                
                //#line 184 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                final int t$132983 = l$132982;
                
                //#line 184 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                final x10.regionarray.Array this$132984 = ((x10.regionarray.Array)(maxSum));
                
                //#line 184 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                final int t$132985 = k$132998;
                
                //#line 443 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long i$132986 = ((long)(((int)(t$132985))));
                
                //#line 442 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                x10.regionarray.VarMat ret$132987 =  null;
                
                //#line 446 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final x10.core.Rail t$132952 = ((x10.core.Rail)(((x10.regionarray.Array<x10.regionarray.VarMat>)this$132984).raw));
                
                //#line 446 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final x10.regionarray.VarMat t$132953 = ((x10.regionarray.VarMat[])t$132952.value)[(int)i$132986];
                
                //#line 446 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                ret$132987 = t$132953;
                
                //#line 442 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final x10.regionarray.VarMat t$132988 = ret$132987;
                
                //#line 184 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                final int t$132989 = ((x10.regionarray.Mat<x10.regionarray.VarRow>)t$132988).rows;
                
                //#line 184 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                final boolean t$132990 = ((t$132983) < (((int)(t$132989))));
                
                //#line 184 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                if (!(t$132990)) {
                    
                    //#line 184 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                    break;
                }
                
                //#line 185 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                final x10.regionarray.Array this$132954 = ((x10.regionarray.Array)(maxSum));
                
                //#line 185 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                final int t$132955 = k$132998;
                
                //#line 443 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long i$132956 = ((long)(((int)(t$132955))));
                
                //#line 442 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                x10.regionarray.VarMat ret$132957 =  null;
                
                //#line 446 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final x10.core.Rail t$132946 = ((x10.core.Rail)(((x10.regionarray.Array<x10.regionarray.VarMat>)this$132954).raw));
                
                //#line 446 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final x10.regionarray.VarMat t$132947 = ((x10.regionarray.VarMat[])t$132946.value)[(int)i$132956];
                
                //#line 446 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                ret$132957 = t$132947;
                
                //#line 442 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final x10.regionarray.VarMat t$132958 = ret$132957;
                
                //#line 185 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                final int t$132959 = l$132982;
                
                //#line 185 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                final x10.regionarray.VarRow t$132960 = ((x10.regionarray.Mat<x10.regionarray.VarRow>)t$132958).$apply$G((int)(t$132959));
                
                //#line 185 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                final int t$132961 = ((axis) + (((int)(1))));
                
                //#line 185 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                final x10.regionarray.Array this$132962 = ((x10.regionarray.Array)(myMax));
                
                //#line 185 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                final int t$132963 = k$132998;
                
                //#line 443 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long i$132964 = ((long)(((int)(t$132963))));
                
                //#line 442 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                x10.regionarray.VarMat ret$132965 =  null;
                
                //#line 446 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final x10.core.Rail t$132948 = ((x10.core.Rail)(((x10.regionarray.Array<x10.regionarray.VarMat>)this$132962).raw));
                
                //#line 446 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final x10.regionarray.VarMat t$132949 = ((x10.regionarray.VarMat[])t$132948.value)[(int)i$132964];
                
                //#line 446 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                ret$132965 = t$132949;
                
                //#line 442 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final x10.regionarray.VarMat t$132966 = ret$132965;
                
                //#line 185 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                final int t$132967 = l$132982;
                
                //#line 185 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                final x10.regionarray.VarRow t$132968 = ((x10.regionarray.Mat<x10.regionarray.VarRow>)t$132966).$apply$G((int)(t$132967));
                
                //#line 185 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                final int t$132969 = t$132968.$apply$O((int)(axis));
                
                //#line 185 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                final int t$132970 = ((t$132969) * (((int)(v))));
                
                //#line 185 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                final x10.regionarray.Array this$132971 = ((x10.regionarray.Array)(maxSum));
                
                //#line 185 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                final int t$132972 = k$132998;
                
                //#line 443 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long i$132973 = ((long)(((int)(t$132972))));
                
                //#line 442 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                x10.regionarray.VarMat ret$132974 =  null;
                
                //#line 446 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final x10.core.Rail t$132950 = ((x10.core.Rail)(((x10.regionarray.Array<x10.regionarray.VarMat>)this$132971).raw));
                
                //#line 446 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final x10.regionarray.VarMat t$132951 = ((x10.regionarray.VarMat[])t$132950.value)[(int)i$132973];
                
                //#line 446 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                ret$132974 = t$132951;
                
                //#line 442 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final x10.regionarray.VarMat t$132975 = ret$132974;
                
                //#line 185 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                final int t$132976 = l$132982;
                
                //#line 185 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                final x10.regionarray.VarRow t$132977 = ((x10.regionarray.Mat<x10.regionarray.VarRow>)t$132975).$apply$G((int)(t$132976));
                
                //#line 185 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                final int t$132978 = t$132977.$apply$O((int)(axis));
                
                //#line 185 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                final int t$132979 = ((t$132970) + (((int)(t$132978))));
                
                //#line 185 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                t$132960.$set$O((int)(t$132961), (int)(t$132979));
                
                //#line 184 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                final int t$132980 = l$132982;
                
                //#line 184 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                final int t$132981 = ((t$132980) + (((int)(1))));
                
                //#line 184 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                l$132982 = t$132981;
            }
            
            //#line 183 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            final int t$132991 = k$132998;
            
            //#line 183 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            final int t$132992 = ((t$132991) + (((int)(1))));
            
            //#line 183 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            k$132998 = t$132992;
        }
    }
    
    
    //#line 188 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
    final public int min$O(final int axis) {
        
        //#line 189 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
        int result = java.lang.Integer.MIN_VALUE;
        
        //#line 190 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
        int k$133037 = 0;
        
        //#line 190 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
        for (;
             true;
             ) {
            
            //#line 190 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            final int t$133038 = k$133037;
            
            //#line 190 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            final x10.regionarray.Array this$133039 = ((x10.regionarray.Array)(myMin));
            
            //#line 443 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long i$133040 = ((long)(((int)(axis))));
            
            //#line 442 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            x10.regionarray.VarMat ret$133041 =  null;
            
            //#line 446 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.core.Rail t$133007 = ((x10.core.Rail)(((x10.regionarray.Array<x10.regionarray.VarMat>)this$133039).raw));
            
            //#line 446 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.regionarray.VarMat t$133008 = ((x10.regionarray.VarMat[])t$133007.value)[(int)i$133040];
            
            //#line 446 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ret$133041 = t$133008;
            
            //#line 442 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.regionarray.VarMat t$133042 = ret$133041;
            
            //#line 190 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            final int t$133043 = ((x10.regionarray.Mat<x10.regionarray.VarRow>)t$133042).rows;
            
            //#line 190 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            final boolean t$133044 = ((t$133038) < (((int)(t$133043))));
            
            //#line 190 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            if (!(t$133044)) {
                
                //#line 190 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                break;
            }
            
            //#line 191 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            final x10.regionarray.Array this$133009 = ((x10.regionarray.Array)(myMin));
            
            //#line 443 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long i$133010 = ((long)(((int)(axis))));
            
            //#line 442 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            x10.regionarray.VarMat ret$133011 =  null;
            
            //#line 446 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.core.Rail t$133003 = ((x10.core.Rail)(((x10.regionarray.Array<x10.regionarray.VarMat>)this$133009).raw));
            
            //#line 446 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.regionarray.VarMat t$133004 = ((x10.regionarray.VarMat[])t$133003.value)[(int)i$133010];
            
            //#line 446 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ret$133011 = t$133004;
            
            //#line 442 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.regionarray.VarMat t$133012 = ret$133011;
            
            //#line 191 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            final int t$133013 = k$133037;
            
            //#line 191 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            final x10.regionarray.VarRow t$133014 = ((x10.regionarray.Mat<x10.regionarray.VarRow>)t$133012).$apply$G((int)(t$133013));
            
            //#line 191 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            final int a$133015 = t$133014.$apply$O((int)(axis));
            
            //#line 192 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            final x10.regionarray.Array this$133016 = ((x10.regionarray.Array)(minSum));
            
            //#line 443 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long i$133017 = ((long)(((int)(axis))));
            
            //#line 442 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            x10.regionarray.VarMat ret$133018 =  null;
            
            //#line 446 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.core.Rail t$133005 = ((x10.core.Rail)(((x10.regionarray.Array<x10.regionarray.VarMat>)this$133016).raw));
            
            //#line 446 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.regionarray.VarMat t$133006 = ((x10.regionarray.VarMat[])t$133005.value)[(int)i$133017];
            
            //#line 446 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ret$133018 = t$133006;
            
            //#line 442 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.regionarray.VarMat t$133019 = ret$133018;
            
            //#line 192 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            final int t$133020 = k$133037;
            
            //#line 192 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            final x10.regionarray.VarRow t$133021 = ((x10.regionarray.Mat<x10.regionarray.VarRow>)t$133019).$apply$G((int)(t$133020));
            
            //#line 192 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            int b$133022 = t$133021.$apply$O((int)(axis));
            
            //#line 194 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            final int t$133023 = b$133022;
            
            //#line 194 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            final boolean t$133024 = ((t$133023) > (((int)(0))));
            
            //#line 194 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            int t$133025 =  0;
            
            //#line 194 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            if (t$133024) {
                
                //#line 194 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                final int t$133026 = b$133022;
                
                //#line 194 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                final int t$133027 = (-(t$133026));
                
                //#line 194 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                final int t$133028 = ((t$133027) + (((int)(a$133015))));
                
                //#line 194 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                final int t$133029 = ((t$133028) + (((int)(1))));
                
                //#line 194 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                t$133025 = ((t$133029) / (((int)(a$133015))));
            } else {
                
                //#line 194 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                final int t$133030 = b$133022;
                
                //#line 194 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                final int t$133031 = (-(t$133030));
                
                //#line 194 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                t$133025 = ((t$133031) / (((int)(a$133015))));
            }
            
            //#line 194 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            final int m$133032 = t$133025;
            
            //#line 195 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            final int t$133033 = result;
            
            //#line 195 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            final boolean t$133034 = ((m$133032) > (((int)(t$133033))));
            
            //#line 195 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            if (t$133034) {
                
                //#line 195 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                result = m$133032;
            }
            
            //#line 190 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            final int t$133035 = k$133037;
            
            //#line 190 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            final int t$133036 = ((t$133035) + (((int)(1))));
            
            //#line 190 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            k$133037 = t$133036;
        }
        
        //#line 197 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
        final int t$132457 = result;
        
        //#line 197 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
        return t$132457;
    }
    
    
    //#line 200 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
    final public int max$O(final int axis) {
        
        //#line 201 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
        int result = java.lang.Integer.MAX_VALUE;
        
        //#line 202 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
        int k$133076 = 0;
        
        //#line 202 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
        for (;
             true;
             ) {
            
            //#line 202 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            final int t$133077 = k$133076;
            
            //#line 202 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            final x10.regionarray.Array this$133078 = ((x10.regionarray.Array)(myMax));
            
            //#line 443 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long i$133079 = ((long)(((int)(axis))));
            
            //#line 442 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            x10.regionarray.VarMat ret$133080 =  null;
            
            //#line 446 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.core.Rail t$133049 = ((x10.core.Rail)(((x10.regionarray.Array<x10.regionarray.VarMat>)this$133078).raw));
            
            //#line 446 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.regionarray.VarMat t$133050 = ((x10.regionarray.VarMat[])t$133049.value)[(int)i$133079];
            
            //#line 446 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ret$133080 = t$133050;
            
            //#line 442 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.regionarray.VarMat t$133081 = ret$133080;
            
            //#line 202 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            final int t$133082 = ((x10.regionarray.Mat<x10.regionarray.VarRow>)t$133081).rows;
            
            //#line 202 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            final boolean t$133083 = ((t$133077) < (((int)(t$133082))));
            
            //#line 202 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            if (!(t$133083)) {
                
                //#line 202 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                break;
            }
            
            //#line 203 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            final x10.regionarray.Array this$133051 = ((x10.regionarray.Array)(myMax));
            
            //#line 443 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long i$133052 = ((long)(((int)(axis))));
            
            //#line 442 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            x10.regionarray.VarMat ret$133053 =  null;
            
            //#line 446 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.core.Rail t$133045 = ((x10.core.Rail)(((x10.regionarray.Array<x10.regionarray.VarMat>)this$133051).raw));
            
            //#line 446 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.regionarray.VarMat t$133046 = ((x10.regionarray.VarMat[])t$133045.value)[(int)i$133052];
            
            //#line 446 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ret$133053 = t$133046;
            
            //#line 442 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.regionarray.VarMat t$133054 = ret$133053;
            
            //#line 203 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            final int t$133055 = k$133076;
            
            //#line 203 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            final x10.regionarray.VarRow t$133056 = ((x10.regionarray.Mat<x10.regionarray.VarRow>)t$133054).$apply$G((int)(t$133055));
            
            //#line 203 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            final int a$133057 = t$133056.$apply$O((int)(axis));
            
            //#line 204 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            final x10.regionarray.Array this$133058 = ((x10.regionarray.Array)(maxSum));
            
            //#line 443 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long i$133059 = ((long)(((int)(axis))));
            
            //#line 442 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            x10.regionarray.VarMat ret$133060 =  null;
            
            //#line 446 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.core.Rail t$133047 = ((x10.core.Rail)(((x10.regionarray.Array<x10.regionarray.VarMat>)this$133058).raw));
            
            //#line 446 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.regionarray.VarMat t$133048 = ((x10.regionarray.VarMat[])t$133047.value)[(int)i$133059];
            
            //#line 446 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ret$133060 = t$133048;
            
            //#line 442 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.regionarray.VarMat t$133061 = ret$133060;
            
            //#line 204 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            final int t$133062 = k$133076;
            
            //#line 204 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            final x10.regionarray.VarRow t$133063 = ((x10.regionarray.Mat<x10.regionarray.VarRow>)t$133061).$apply$G((int)(t$133062));
            
            //#line 204 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            final int b$133064 = t$133063.$apply$O((int)(axis));
            
            //#line 206 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            final boolean t$133065 = ((b$133064) > (((int)(0))));
            
            //#line 206 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            int t$133066 =  0;
            
            //#line 206 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            if (t$133065) {
                
                //#line 206 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                final int t$133067 = (-(b$133064));
                
                //#line 206 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                final int t$133068 = ((t$133067) - (((int)(a$133057))));
                
                //#line 206 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                final int t$133069 = ((t$133068) + (((int)(1))));
                
                //#line 206 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                t$133066 = ((t$133069) / (((int)(a$133057))));
            } else {
                
                //#line 206 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                final int t$133070 = (-(b$133064));
                
                //#line 206 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                t$133066 = ((t$133070) / (((int)(a$133057))));
            }
            
            //#line 206 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            final int m$133071 = t$133066;
            
            //#line 207 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            final int t$133072 = result;
            
            //#line 207 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            final boolean t$133073 = ((m$133071) < (((int)(t$133072))));
            
            //#line 207 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            if (t$133073) {
                
                //#line 207 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                result = m$133071;
            }
            
            //#line 202 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            final int t$133074 = k$133076;
            
            //#line 202 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            final int t$133075 = ((t$133074) + (((int)(1))));
            
            //#line 202 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            k$133076 = t$133075;
        }
        
        //#line 209 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
        final int t$132485 = result;
        
        //#line 209 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
        return t$132485;
    }
    
    
    //#line 229 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
    @x10.runtime.impl.java.X10Generated
    final public static class RailIt extends x10.core.Ref implements x10.lang.Iterator, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<RailIt> $RTT = 
            x10.rtt.NamedType.<RailIt> make("x10.regionarray.PolyScanner.RailIt",
                                            RailIt.class,
                                            new x10.rtt.Type[] {
                                                x10.rtt.ParameterizedType.make(x10.lang.Iterator.$RTT, x10.rtt.ParameterizedType.make(x10.core.Rail.$RTT, x10.rtt.Types.INT))
                                            });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.regionarray.PolyScanner.RailIt $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.rank = $deserializer.readLong();
            $_obj.s = $deserializer.readObject();
            $_obj.x = $deserializer.readObject();
            $_obj.myMin = $deserializer.readObject();
            $_obj.myMax = $deserializer.readObject();
            $_obj.k = $deserializer.readInt();
            $_obj.doesHaveNext = $deserializer.readBoolean();
            $_obj.out$ = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.regionarray.PolyScanner.RailIt $_obj = new x10.regionarray.PolyScanner.RailIt((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.rank);
            $serializer.write(this.s);
            $serializer.write(this.x);
            $serializer.write(this.myMin);
            $serializer.write(this.myMax);
            $serializer.write(this.k);
            $serializer.write(this.doesHaveNext);
            $serializer.write(this.out$);
            
        }
        
        // constructor just for allocation
        public RailIt(final java.lang.System[] $dummy) {
            
        }
        
        // bridge for method abstract public x10.lang.Iterator[T].next(){}:T
        final public x10.core.Rail next$G() {
            return next();
        }
        
        
    
        
        //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
        public x10.regionarray.PolyScanner out$;
        
        //#line 230 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
        public long rank;
        
        //#line 231 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
        public x10.regionarray.PolyScanner s;
        
        //#line 233 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
        public x10.core.Rail<x10.core.Int> x;
        
        //#line 234 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
        public x10.core.Rail<x10.core.Int> myMin;
        
        //#line 235 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
        public x10.core.Rail<x10.core.Int> myMax;
        
        //#line 237 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
        public int k;
        
        //#line 238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
        public boolean doesHaveNext;
        
        
        //#line 239 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
        // creation method for java code (1-phase java constructor)
        public RailIt(final x10.regionarray.PolyScanner out$) {
            this((java.lang.System[]) null);
            x10$regionarray$PolyScanner$RailIt$$init$S(out$);
        }
        
        // constructor for non-virtual call
        final public x10.regionarray.PolyScanner.RailIt x10$regionarray$PolyScanner$RailIt$$init$S(final x10.regionarray.PolyScanner out$) {
             {
                
                //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                this.out$ = out$;
                
                //#line 239 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                
                
                //#line 229 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                this.__fieldInitializers_x10_regionarray_PolyScanner_RailIt();
                
                //#line 240 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                final x10.core.Rail t$132487 = ((x10.core.Rail)(myMin));
                
                //#line 240 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                final long t$132488 = ((long)(((int)(0))));
                
                //#line 240 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                final x10.regionarray.PolyScanner t$132486 = ((x10.regionarray.PolyScanner)(s));
                
                //#line 240 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                final int t$132489 = t$132486.min$O((int)(0));
                
                //#line 240 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                ((int[])t$132487.value)[(int)t$132488] = t$132489;
                
                //#line 241 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                final x10.core.Rail t$132491 = ((x10.core.Rail)(myMax));
                
                //#line 241 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                final long t$132492 = ((long)(((int)(0))));
                
                //#line 241 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                final x10.regionarray.PolyScanner t$132490 = ((x10.regionarray.PolyScanner)(s));
                
                //#line 241 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                final int t$132493 = t$132490.max$O((int)(0));
                
                //#line 241 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                ((int[])t$132491.value)[(int)t$132492] = t$132493;
                
                //#line 242 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                final x10.core.Rail t$132495 = ((x10.core.Rail)(x));
                
                //#line 242 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                final long t$132496 = ((long)(((int)(0))));
                
                //#line 242 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                final x10.regionarray.PolyScanner t$132494 = ((x10.regionarray.PolyScanner)(s));
                
                //#line 242 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                final int t$132497 = t$132494.min$O((int)(0));
                
                //#line 242 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                ((int[])t$132495.value)[(int)t$132496] = t$132497;
                
                //#line 243 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                this.k = 1;
                
                //#line 243 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                for (;
                     true;
                     ) {
                    
                    //#line 243 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                    final int t$133109 = k;
                    
                    //#line 243 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                    final long t$133110 = ((long)(((int)(t$133109))));
                    
                    //#line 243 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                    final long t$133111 = rank;
                    
                    //#line 243 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                    final boolean t$133112 = ((t$133110) < (((long)(t$133111))));
                    
                    //#line 243 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                    if (!(t$133112)) {
                        
                        //#line 243 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                        break;
                    }
                    
                    //#line 244 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                    final x10.regionarray.PolyScanner t$133084 = ((x10.regionarray.PolyScanner)(s));
                    
                    //#line 244 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                    final int t$133085 = k;
                    
                    //#line 244 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                    final int t$133086 = ((t$133085) - (((int)(1))));
                    
                    //#line 244 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                    final x10.core.Rail t$133087 = ((x10.core.Rail)(x));
                    
                    //#line 244 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                    final int t$133088 = k;
                    
                    //#line 244 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                    final int t$133089 = ((t$133088) - (((int)(1))));
                    
                    //#line 244 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                    final long t$133090 = ((long)(((int)(t$133089))));
                    
                    //#line 244 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                    final int t$133091 = ((int[])t$133087.value)[(int)t$133090];
                    
                    //#line 244 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                    t$133084.set((int)(t$133086), (int)(t$133091));
                    
                    //#line 245 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                    final x10.regionarray.PolyScanner t$133092 = ((x10.regionarray.PolyScanner)(s));
                    
                    //#line 245 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                    final int t$133093 = k;
                    
                    //#line 245 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                    final int m$133094 = t$133092.min$O((int)(t$133093));
                    
                    //#line 246 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                    final x10.core.Rail t$133095 = ((x10.core.Rail)(x));
                    
                    //#line 246 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                    final int t$133096 = k;
                    
                    //#line 246 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                    final long t$133097 = ((long)(((int)(t$133096))));
                    
                    //#line 246 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                    ((int[])t$133095.value)[(int)t$133097] = m$133094;
                    
                    //#line 247 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                    final x10.core.Rail t$133098 = ((x10.core.Rail)(myMin));
                    
                    //#line 247 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                    final int t$133099 = k;
                    
                    //#line 247 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                    final long t$133100 = ((long)(((int)(t$133099))));
                    
                    //#line 247 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                    ((int[])t$133098.value)[(int)t$133100] = m$133094;
                    
                    //#line 248 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                    final x10.core.Rail t$133101 = ((x10.core.Rail)(myMax));
                    
                    //#line 248 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                    final int t$133102 = k;
                    
                    //#line 248 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                    final long t$133103 = ((long)(((int)(t$133102))));
                    
                    //#line 248 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                    final x10.regionarray.PolyScanner t$133104 = ((x10.regionarray.PolyScanner)(s));
                    
                    //#line 248 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                    final int t$133105 = k;
                    
                    //#line 248 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                    final int t$133106 = t$133104.max$O((int)(t$133105));
                    
                    //#line 248 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                    ((int[])t$133101.value)[(int)t$133103] = t$133106;
                    
                    //#line 243 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                    final int t$133107 = this.k;
                    
                    //#line 243 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                    final int t$133108 = ((t$133107) + (((int)(1))));
                    
                    //#line 243 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                    this.k = t$133108;
                }
                
                //#line 250 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                final x10.core.Rail a$131057 = ((x10.core.Rail)(x));
                
                //#line 250 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                final long t$132527 = rank;
                
                //#line 250 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                final long i0$131058 = ((t$132527) - (((long)(1L))));
                
                //#line 250 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                final int t$132528 = ((int[])a$131057.value)[(int)i0$131058];
                
                //#line 250 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                final int r$131066 = ((t$132528) - (((int)(1))));
                
                //#line 250 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                ((int[])a$131057.value)[(int)i0$131058] = r$131066;
                
                //#line 251 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                this.checkHasNext();
            }
            return this;
        }
        
        
        
        //#line 254 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
        public boolean hasNext$O() {
            
            //#line 254 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            final boolean t$132529 = doesHaveNext;
            
            //#line 254 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            return t$132529;
        }
        
        
        //#line 256 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
        private void checkHasNext() {
            
            //#line 257 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            final long t$132530 = rank;
            
            //#line 257 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            final int t$132531 = ((int)(long)(((long)(t$132530))));
            
            //#line 257 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            final int t$132532 = ((t$132531) - (((int)(1))));
            
            //#line 257 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            this.k = t$132532;
            
            //#line 258 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            while (true) {
                
                //#line 258 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                final x10.core.Rail t$132534 = ((x10.core.Rail)(x));
                
                //#line 258 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                final int t$132533 = k;
                
                //#line 258 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                final long t$132535 = ((long)(((int)(t$132533))));
                
                //#line 258 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                final int t$132539 = ((int[])t$132534.value)[(int)t$132535];
                
                //#line 258 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                final x10.core.Rail t$132537 = ((x10.core.Rail)(myMax));
                
                //#line 258 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                final int t$132536 = k;
                
                //#line 258 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                final long t$132538 = ((long)(((int)(t$132536))));
                
                //#line 258 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                final int t$132540 = ((int[])t$132537.value)[(int)t$132538];
                
                //#line 258 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                final boolean t$132546 = ((t$132539) >= (((int)(t$132540))));
                
                //#line 258 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                if (!(t$132546)) {
                    
                    //#line 258 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                    break;
                }
                
                //#line 259 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                final int t$133113 = this.k;
                
                //#line 259 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                final int t$133114 = ((t$133113) - (((int)(1))));
                
                //#line 259 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                final int t$133115 = this.k = t$133114;
                
                //#line 259 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                final long t$133116 = ((long)(((int)(t$133115))));
                
                //#line 259 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                final boolean t$133117 = ((t$133116) < (((long)(0L))));
                
                //#line 259 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                if (t$133117) {
                    
                    //#line 260 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                    this.doesHaveNext = false;
                    
                    //#line 261 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                    return;
                }
            }
            
            //#line 264 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            this.doesHaveNext = true;
        }
        
        public static void checkHasNext$P(final x10.regionarray.PolyScanner.RailIt RailIt) {
            RailIt.checkHasNext();
        }
        
        
        //#line 267 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
        final public x10.core.Rail next() {
            
            //#line 268 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            final x10.core.Rail a$131097 = ((x10.core.Rail)(x));
            
            //#line 268 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            final int t$132547 = k;
            
            //#line 268 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            final long i0$131098 = ((long)(((int)(t$132547))));
            
            //#line 268 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            final int t$132548 = ((int[])a$131097.value)[(int)i0$131098];
            
            //#line 268 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            final int r$131106 = ((t$132548) + (((int)(1))));
            
            //#line 268 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            ((int[])a$131097.value)[(int)i0$131098] = r$131106;
            
            //#line 269 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            final int t$133143 = k;
            
            //#line 269 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            final int t$133144 = ((t$133143) + (((int)(1))));
            
            //#line 269 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            this.k = t$133144;
            
            //#line 269 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            for (;
                 true;
                 ) {
                
                //#line 269 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                final int t$133145 = k;
                
                //#line 269 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                final long t$133146 = ((long)(((int)(t$133145))));
                
                //#line 269 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                final long t$133147 = rank;
                
                //#line 269 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                final boolean t$133148 = ((t$133146) < (((long)(t$133147))));
                
                //#line 269 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                if (!(t$133148)) {
                    
                    //#line 269 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                    break;
                }
                
                //#line 270 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                final x10.regionarray.PolyScanner t$133118 = ((x10.regionarray.PolyScanner)(s));
                
                //#line 270 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                final int t$133119 = k;
                
                //#line 270 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                final int t$133120 = ((t$133119) - (((int)(1))));
                
                //#line 270 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                final x10.core.Rail t$133121 = ((x10.core.Rail)(x));
                
                //#line 270 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                final int t$133122 = k;
                
                //#line 270 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                final int t$133123 = ((t$133122) - (((int)(1))));
                
                //#line 270 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                final long t$133124 = ((long)(((int)(t$133123))));
                
                //#line 270 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                final int t$133125 = ((int[])t$133121.value)[(int)t$133124];
                
                //#line 270 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                t$133118.set((int)(t$133120), (int)(t$133125));
                
                //#line 271 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                final x10.regionarray.PolyScanner t$133126 = ((x10.regionarray.PolyScanner)(s));
                
                //#line 271 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                final int t$133127 = k;
                
                //#line 271 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                final int m$133128 = t$133126.min$O((int)(t$133127));
                
                //#line 272 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                final x10.core.Rail t$133129 = ((x10.core.Rail)(x));
                
                //#line 272 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                final int t$133130 = k;
                
                //#line 272 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                final long t$133131 = ((long)(((int)(t$133130))));
                
                //#line 272 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                ((int[])t$133129.value)[(int)t$133131] = m$133128;
                
                //#line 273 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                final x10.core.Rail t$133132 = ((x10.core.Rail)(myMin));
                
                //#line 273 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                final int t$133133 = k;
                
                //#line 273 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                final long t$133134 = ((long)(((int)(t$133133))));
                
                //#line 273 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                ((int[])t$133132.value)[(int)t$133134] = m$133128;
                
                //#line 274 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                final x10.core.Rail t$133135 = ((x10.core.Rail)(myMax));
                
                //#line 274 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                final int t$133136 = k;
                
                //#line 274 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                final long t$133137 = ((long)(((int)(t$133136))));
                
                //#line 274 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                final x10.regionarray.PolyScanner t$133138 = ((x10.regionarray.PolyScanner)(s));
                
                //#line 274 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                final int t$133139 = k;
                
                //#line 274 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                final int t$133140 = t$133138.max$O((int)(t$133139));
                
                //#line 274 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                ((int[])t$133135.value)[(int)t$133137] = t$133140;
                
                //#line 269 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                final int t$133141 = this.k;
                
                //#line 269 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                final int t$133142 = ((t$133141) + (((int)(1))));
                
                //#line 269 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                this.k = t$133142;
            }
            
            //#line 276 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            this.checkHasNext();
            
            //#line 277 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            final x10.core.Rail t$132580 = ((x10.core.Rail)(x));
            
            //#line 277 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            return t$132580;
        }
        
        
        //#line 280 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
        public void remove() {
            
        }
        
        
        //#line 229 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
        final public x10.regionarray.PolyScanner.RailIt x10$regionarray$PolyScanner$RailIt$$this$x10$regionarray$PolyScanner$RailIt() {
            
            //#line 229 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            return x10.regionarray.PolyScanner.RailIt.this;
        }
        
        
        //#line 229 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
        final public x10.regionarray.PolyScanner x10$regionarray$PolyScanner$RailIt$$this$x10$regionarray$PolyScanner() {
            
            //#line 229 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            final x10.regionarray.PolyScanner t$132581 = this.out$;
            
            //#line 229 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            return t$132581;
        }
        
        
        //#line 229 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
        final public void __fieldInitializers_x10_regionarray_PolyScanner_RailIt() {
            
            //#line 230 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            final x10.regionarray.PolyScanner t$132582 = this.out$;
            
            //#line 230 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            final long t$132583 = t$132582.rank;
            
            //#line 229 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            this.rank = t$132583;
            
            //#line 231 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            final x10.regionarray.PolyScanner t$132584 = this.out$;
            
            //#line 229 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            this.s = ((x10.regionarray.PolyScanner)(t$132584));
            
            //#line 233 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            final long t$132585 = rank;
            
            //#line 233 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            final x10.core.Rail t$132586 = ((x10.core.Rail)(new x10.core.Rail<x10.core.Int>(x10.rtt.Types.INT, ((long)(t$132585)))));
            
            //#line 229 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            this.x = ((x10.core.Rail)(t$132586));
            
            //#line 234 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            final long t$132587 = rank;
            
            //#line 234 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            final x10.core.Rail t$132588 = ((x10.core.Rail)(new x10.core.Rail<x10.core.Int>(x10.rtt.Types.INT, ((long)(t$132587)))));
            
            //#line 229 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            this.myMin = ((x10.core.Rail)(t$132588));
            
            //#line 235 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            final long t$132589 = rank;
            
            //#line 235 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            final x10.core.Rail t$132590 = ((x10.core.Rail)(new x10.core.Rail<x10.core.Int>(x10.rtt.Types.INT, ((long)(t$132589)))));
            
            //#line 229 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            this.myMax = ((x10.core.Rail)(t$132590));
            
            //#line 229 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            this.k = 0;
            
            //#line 229 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            this.doesHaveNext = false;
        }
    }
    
    
    
    //#line 289 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
    public x10.lang.Iterator iterator() {
        
        //#line 289 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
        final x10.regionarray.PolyScanner.Anonymous$10018 alloc$131274 = ((x10.regionarray.PolyScanner.Anonymous$10018)(new x10.regionarray.PolyScanner.Anonymous$10018((java.lang.System[]) null)));
        
        //#line 289 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
        alloc$131274.x10$regionarray$PolyScanner$Anonymous$10018$$init$S(this);
        
        //#line 289 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
        return alloc$131274;
    }
    
    
    //#line 304 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
    public void printInfo(final x10.io.Printer ps) {
        
        //#line 305 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
        ps.println(((java.lang.Object)("PolyScanner")));
        
        //#line 306 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
        final x10.regionarray.PolyMat t$132591 = ((x10.regionarray.PolyMat)(C));
        
        //#line 306 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
        ((x10.regionarray.Mat<x10.regionarray.PolyRow>)t$132591).printInfo(((x10.io.Printer)(ps)), ((java.lang.String)("  C")));
    }
    
    
    //#line 309 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
    public void printInfo2(final x10.io.Printer ps) {
        
        //#line 310 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
        int k = 0;
        
        //#line 310 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
        for (;
             true;
             ) {
            
            //#line 310 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            final int t$132593 = k;
            
            //#line 310 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            final long t$132595 = ((long)(((int)(t$132593))));
            
            //#line 310 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            final x10.regionarray.Array t$132594 = ((x10.regionarray.Array)(myMin));
            
            //#line 310 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            final long t$132596 = ((x10.regionarray.Array<x10.regionarray.VarMat>)t$132594).size;
            
            //#line 310 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            final boolean t$132705 = ((t$132595) < (((long)(t$132596))));
            
            //#line 310 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            if (!(t$132705)) {
                
                //#line 310 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                break;
            }
            
            //#line 311 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            final int t$133283 = k;
            
            //#line 311 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            final java.lang.String t$133284 = (("axis ") + ((x10.core.Int.$box(t$133283))));
            
            //#line 311 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            ps.println(((java.lang.Object)(t$133284)));
            
            //#line 312 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            ps.println(((java.lang.Object)("  min")));
            
            //#line 313 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            int l$133265 = 0;
            
            //#line 313 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            for (;
                 true;
                 ) {
                
                //#line 313 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                final int t$133266 = l$133265;
                
                //#line 313 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                final x10.regionarray.Array this$133267 = ((x10.regionarray.Array)(myMin));
                
                //#line 313 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                final int t$133268 = k;
                
                //#line 443 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long i$133269 = ((long)(((int)(t$133268))));
                
                //#line 442 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                x10.regionarray.VarMat ret$133270 =  null;
                
                //#line 446 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final x10.core.Rail t$133203 = ((x10.core.Rail)(((x10.regionarray.Array<x10.regionarray.VarMat>)this$133267).raw));
                
                //#line 446 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final x10.regionarray.VarMat t$133204 = ((x10.regionarray.VarMat[])t$133203.value)[(int)i$133269];
                
                //#line 446 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                ret$133270 = t$133204;
                
                //#line 442 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final x10.regionarray.VarMat t$133271 = ret$133270;
                
                //#line 313 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                final int t$133272 = ((x10.regionarray.Mat<x10.regionarray.VarRow>)t$133271).rows;
                
                //#line 313 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                final boolean t$133273 = ((t$133266) < (((int)(t$133272))));
                
                //#line 313 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                if (!(t$133273)) {
                    
                    //#line 313 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                    break;
                }
                
                //#line 314 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                ps.print(((java.lang.String)("  ")));
                
                //#line 315 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                int m$133181 = 0;
                
                //#line 315 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                for (;
                     true;
                     ) {
                    
                    //#line 315 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                    final int t$133182 = m$133181;
                    
                    //#line 315 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                    final x10.regionarray.Array this$133183 = ((x10.regionarray.Array)(myMin));
                    
                    //#line 315 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                    final int t$133184 = k;
                    
                    //#line 443 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long i$133185 = ((long)(((int)(t$133184))));
                    
                    //#line 442 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    x10.regionarray.VarMat ret$133186 =  null;
                    
                    //#line 446 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final x10.core.Rail t$133151 = ((x10.core.Rail)(((x10.regionarray.Array<x10.regionarray.VarMat>)this$133183).raw));
                    
                    //#line 446 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final x10.regionarray.VarMat t$133152 = ((x10.regionarray.VarMat[])t$133151.value)[(int)i$133185];
                    
                    //#line 446 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    ret$133186 = t$133152;
                    
                    //#line 442 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final x10.regionarray.VarMat t$133187 = ret$133186;
                    
                    //#line 315 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                    final int t$133188 = l$133265;
                    
                    //#line 315 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                    final x10.regionarray.VarRow t$133189 = ((x10.regionarray.Mat<x10.regionarray.VarRow>)t$133187).$apply$G((int)(t$133188));
                    
                    //#line 315 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                    final int t$133190 = t$133189.cols;
                    
                    //#line 315 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                    final boolean t$133191 = ((t$133182) < (((int)(t$133190))));
                    
                    //#line 315 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                    if (!(t$133191)) {
                        
                        //#line 315 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                        break;
                    }
                    
                    //#line 316 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                    final x10.regionarray.Array this$133153 = ((x10.regionarray.Array)(myMin));
                    
                    //#line 316 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                    final int t$133154 = k;
                    
                    //#line 443 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long i$133155 = ((long)(((int)(t$133154))));
                    
                    //#line 442 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    x10.regionarray.VarMat ret$133156 =  null;
                    
                    //#line 446 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final x10.core.Rail t$133149 = ((x10.core.Rail)(((x10.regionarray.Array<x10.regionarray.VarMat>)this$133153).raw));
                    
                    //#line 446 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final x10.regionarray.VarMat t$133150 = ((x10.regionarray.VarMat[])t$133149.value)[(int)i$133155];
                    
                    //#line 446 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    ret$133156 = t$133150;
                    
                    //#line 442 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final x10.regionarray.VarMat t$133157 = ret$133156;
                    
                    //#line 316 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                    final int t$133158 = l$133265;
                    
                    //#line 316 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                    final x10.regionarray.VarRow t$133159 = ((x10.regionarray.Mat<x10.regionarray.VarRow>)t$133157).$apply$G((int)(t$133158));
                    
                    //#line 316 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                    final int t$133160 = m$133181;
                    
                    //#line 316 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                    final int t$133161 = t$133159.$apply$O((int)(t$133160));
                    
                    //#line 316 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                    final java.lang.String t$133162 = ((" ") + ((x10.core.Int.$box(t$133161))));
                    
                    //#line 316 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                    ps.print(((java.lang.String)(t$133162)));
                    
                    //#line 315 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                    final int t$133163 = m$133181;
                    
                    //#line 315 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                    final int t$133164 = ((t$133163) + (((int)(1))));
                    
                    //#line 315 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                    m$133181 = t$133164;
                }
                
                //#line 317 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                ps.print(((java.lang.String)("  sum")));
                
                //#line 318 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                int m$133192 = 0;
                
                //#line 318 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                for (;
                     true;
                     ) {
                    
                    //#line 318 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                    final int t$133193 = m$133192;
                    
                    //#line 318 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                    final x10.regionarray.Array this$133194 = ((x10.regionarray.Array)(minSum));
                    
                    //#line 318 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                    final int t$133195 = k;
                    
                    //#line 443 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long i$133196 = ((long)(((int)(t$133195))));
                    
                    //#line 442 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    x10.regionarray.VarMat ret$133197 =  null;
                    
                    //#line 446 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final x10.core.Rail t$133167 = ((x10.core.Rail)(((x10.regionarray.Array<x10.regionarray.VarMat>)this$133194).raw));
                    
                    //#line 446 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final x10.regionarray.VarMat t$133168 = ((x10.regionarray.VarMat[])t$133167.value)[(int)i$133196];
                    
                    //#line 446 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    ret$133197 = t$133168;
                    
                    //#line 442 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final x10.regionarray.VarMat t$133198 = ret$133197;
                    
                    //#line 318 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                    final int t$133199 = l$133265;
                    
                    //#line 318 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                    final x10.regionarray.VarRow t$133200 = ((x10.regionarray.Mat<x10.regionarray.VarRow>)t$133198).$apply$G((int)(t$133199));
                    
                    //#line 318 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                    final int t$133201 = t$133200.cols;
                    
                    //#line 318 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                    final boolean t$133202 = ((t$133193) < (((int)(t$133201))));
                    
                    //#line 318 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                    if (!(t$133202)) {
                        
                        //#line 318 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                        break;
                    }
                    
                    //#line 319 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                    final x10.regionarray.Array this$133169 = ((x10.regionarray.Array)(minSum));
                    
                    //#line 319 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                    final int t$133170 = k;
                    
                    //#line 443 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long i$133171 = ((long)(((int)(t$133170))));
                    
                    //#line 442 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    x10.regionarray.VarMat ret$133172 =  null;
                    
                    //#line 446 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final x10.core.Rail t$133165 = ((x10.core.Rail)(((x10.regionarray.Array<x10.regionarray.VarMat>)this$133169).raw));
                    
                    //#line 446 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final x10.regionarray.VarMat t$133166 = ((x10.regionarray.VarMat[])t$133165.value)[(int)i$133171];
                    
                    //#line 446 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    ret$133172 = t$133166;
                    
                    //#line 442 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final x10.regionarray.VarMat t$133173 = ret$133172;
                    
                    //#line 319 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                    final int t$133174 = l$133265;
                    
                    //#line 319 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                    final x10.regionarray.VarRow t$133175 = ((x10.regionarray.Mat<x10.regionarray.VarRow>)t$133173).$apply$G((int)(t$133174));
                    
                    //#line 319 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                    final int t$133176 = m$133192;
                    
                    //#line 319 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                    final int t$133177 = t$133175.$apply$O((int)(t$133176));
                    
                    //#line 319 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                    final java.lang.String t$133178 = ((" ") + ((x10.core.Int.$box(t$133177))));
                    
                    //#line 319 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                    ps.print(((java.lang.String)(t$133178)));
                    
                    //#line 318 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                    final int t$133179 = m$133192;
                    
                    //#line 318 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                    final int t$133180 = ((t$133179) + (((int)(1))));
                    
                    //#line 318 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                    m$133192 = t$133180;
                }
                
                //#line 320 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                ps.print(((java.lang.String)("\n")));
                
                //#line 313 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                final int t$133205 = l$133265;
                
                //#line 313 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                final int t$133206 = ((t$133205) + (((int)(1))));
                
                //#line 313 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                l$133265 = t$133206;
            }
            
            //#line 322 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            ps.printf(((java.lang.String)("  max\n")));
            
            //#line 323 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            int l$133274 = 0;
            
            //#line 323 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            for (;
                 true;
                 ) {
                
                //#line 323 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                final int t$133275 = l$133274;
                
                //#line 323 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                final x10.regionarray.Array this$133276 = ((x10.regionarray.Array)(myMax));
                
                //#line 323 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                final int t$133277 = k;
                
                //#line 443 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long i$133278 = ((long)(((int)(t$133277))));
                
                //#line 442 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                x10.regionarray.VarMat ret$133279 =  null;
                
                //#line 446 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final x10.core.Rail t$133261 = ((x10.core.Rail)(((x10.regionarray.Array<x10.regionarray.VarMat>)this$133276).raw));
                
                //#line 446 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final x10.regionarray.VarMat t$133262 = ((x10.regionarray.VarMat[])t$133261.value)[(int)i$133278];
                
                //#line 446 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                ret$133279 = t$133262;
                
                //#line 442 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final x10.regionarray.VarMat t$133280 = ret$133279;
                
                //#line 323 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                final int t$133281 = ((x10.regionarray.Mat<x10.regionarray.VarRow>)t$133280).rows;
                
                //#line 323 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                final boolean t$133282 = ((t$133275) < (((int)(t$133281))));
                
                //#line 323 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                if (!(t$133282)) {
                    
                    //#line 323 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                    break;
                }
                
                //#line 324 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                ps.print(((java.lang.String)("  ")));
                
                //#line 325 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                int m$133239 = 0;
                
                //#line 325 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                for (;
                     true;
                     ) {
                    
                    //#line 325 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                    final int t$133240 = m$133239;
                    
                    //#line 325 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                    final x10.regionarray.Array this$133241 = ((x10.regionarray.Array)(myMax));
                    
                    //#line 325 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                    final int t$133242 = k;
                    
                    //#line 443 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long i$133243 = ((long)(((int)(t$133242))));
                    
                    //#line 442 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    x10.regionarray.VarMat ret$133244 =  null;
                    
                    //#line 446 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final x10.core.Rail t$133209 = ((x10.core.Rail)(((x10.regionarray.Array<x10.regionarray.VarMat>)this$133241).raw));
                    
                    //#line 446 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final x10.regionarray.VarMat t$133210 = ((x10.regionarray.VarMat[])t$133209.value)[(int)i$133243];
                    
                    //#line 446 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    ret$133244 = t$133210;
                    
                    //#line 442 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final x10.regionarray.VarMat t$133245 = ret$133244;
                    
                    //#line 325 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                    final int t$133246 = l$133274;
                    
                    //#line 325 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                    final x10.regionarray.VarRow t$133247 = ((x10.regionarray.Mat<x10.regionarray.VarRow>)t$133245).$apply$G((int)(t$133246));
                    
                    //#line 325 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                    final int t$133248 = t$133247.cols;
                    
                    //#line 325 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                    final boolean t$133249 = ((t$133240) < (((int)(t$133248))));
                    
                    //#line 325 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                    if (!(t$133249)) {
                        
                        //#line 325 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                        break;
                    }
                    
                    //#line 326 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                    final x10.regionarray.Array this$133211 = ((x10.regionarray.Array)(myMax));
                    
                    //#line 326 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                    final int t$133212 = k;
                    
                    //#line 443 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long i$133213 = ((long)(((int)(t$133212))));
                    
                    //#line 442 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    x10.regionarray.VarMat ret$133214 =  null;
                    
                    //#line 446 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final x10.core.Rail t$133207 = ((x10.core.Rail)(((x10.regionarray.Array<x10.regionarray.VarMat>)this$133211).raw));
                    
                    //#line 446 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final x10.regionarray.VarMat t$133208 = ((x10.regionarray.VarMat[])t$133207.value)[(int)i$133213];
                    
                    //#line 446 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    ret$133214 = t$133208;
                    
                    //#line 442 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final x10.regionarray.VarMat t$133215 = ret$133214;
                    
                    //#line 326 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                    final int t$133216 = l$133274;
                    
                    //#line 326 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                    final x10.regionarray.VarRow t$133217 = ((x10.regionarray.Mat<x10.regionarray.VarRow>)t$133215).$apply$G((int)(t$133216));
                    
                    //#line 326 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                    final int t$133218 = m$133239;
                    
                    //#line 326 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                    final int t$133219 = t$133217.$apply$O((int)(t$133218));
                    
                    //#line 326 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                    final java.lang.String t$133220 = ((" ") + ((x10.core.Int.$box(t$133219))));
                    
                    //#line 326 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                    ps.print(((java.lang.String)(t$133220)));
                    
                    //#line 325 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                    final int t$133221 = m$133239;
                    
                    //#line 325 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                    final int t$133222 = ((t$133221) + (((int)(1))));
                    
                    //#line 325 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                    m$133239 = t$133222;
                }
                
                //#line 327 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                ps.print(((java.lang.String)("  sum")));
                
                //#line 328 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                int m$133250 = 0;
                
                //#line 328 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                for (;
                     true;
                     ) {
                    
                    //#line 328 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                    final int t$133251 = m$133250;
                    
                    //#line 328 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                    final x10.regionarray.Array this$133252 = ((x10.regionarray.Array)(maxSum));
                    
                    //#line 328 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                    final int t$133253 = k;
                    
                    //#line 443 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long i$133254 = ((long)(((int)(t$133253))));
                    
                    //#line 442 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    x10.regionarray.VarMat ret$133255 =  null;
                    
                    //#line 446 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final x10.core.Rail t$133225 = ((x10.core.Rail)(((x10.regionarray.Array<x10.regionarray.VarMat>)this$133252).raw));
                    
                    //#line 446 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final x10.regionarray.VarMat t$133226 = ((x10.regionarray.VarMat[])t$133225.value)[(int)i$133254];
                    
                    //#line 446 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    ret$133255 = t$133226;
                    
                    //#line 442 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final x10.regionarray.VarMat t$133256 = ret$133255;
                    
                    //#line 328 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                    final int t$133257 = l$133274;
                    
                    //#line 328 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                    final x10.regionarray.VarRow t$133258 = ((x10.regionarray.Mat<x10.regionarray.VarRow>)t$133256).$apply$G((int)(t$133257));
                    
                    //#line 328 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                    final int t$133259 = t$133258.cols;
                    
                    //#line 328 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                    final boolean t$133260 = ((t$133251) < (((int)(t$133259))));
                    
                    //#line 328 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                    if (!(t$133260)) {
                        
                        //#line 328 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                        break;
                    }
                    
                    //#line 329 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                    final x10.regionarray.Array this$133227 = ((x10.regionarray.Array)(maxSum));
                    
                    //#line 329 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                    final int t$133228 = k;
                    
                    //#line 443 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long i$133229 = ((long)(((int)(t$133228))));
                    
                    //#line 442 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    x10.regionarray.VarMat ret$133230 =  null;
                    
                    //#line 446 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final x10.core.Rail t$133223 = ((x10.core.Rail)(((x10.regionarray.Array<x10.regionarray.VarMat>)this$133227).raw));
                    
                    //#line 446 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final x10.regionarray.VarMat t$133224 = ((x10.regionarray.VarMat[])t$133223.value)[(int)i$133229];
                    
                    //#line 446 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    ret$133230 = t$133224;
                    
                    //#line 442 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final x10.regionarray.VarMat t$133231 = ret$133230;
                    
                    //#line 329 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                    final int t$133232 = l$133274;
                    
                    //#line 329 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                    final x10.regionarray.VarRow t$133233 = ((x10.regionarray.Mat<x10.regionarray.VarRow>)t$133231).$apply$G((int)(t$133232));
                    
                    //#line 329 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                    final int t$133234 = m$133250;
                    
                    //#line 329 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                    final int t$133235 = t$133233.$apply$O((int)(t$133234));
                    
                    //#line 329 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                    final java.lang.String t$133236 = ((" ") + ((x10.core.Int.$box(t$133235))));
                    
                    //#line 329 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                    ps.print(((java.lang.String)(t$133236)));
                    
                    //#line 328 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                    final int t$133237 = m$133250;
                    
                    //#line 328 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                    final int t$133238 = ((t$133237) + (((int)(1))));
                    
                    //#line 328 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                    m$133250 = t$133238;
                }
                
                //#line 330 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                ps.println();
                
                //#line 323 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                final int t$133263 = l$133274;
                
                //#line 323 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                final int t$133264 = ((t$133263) + (((int)(1))));
                
                //#line 323 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                l$133274 = t$133264;
            }
            
            //#line 310 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            final int t$133285 = k;
            
            //#line 310 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            final int t$133286 = ((t$133285) + (((int)(1))));
            
            //#line 310 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            k = t$133286;
        }
    }
    
    
    //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
    final public x10.regionarray.PolyScanner x10$regionarray$PolyScanner$$this$x10$regionarray$PolyScanner() {
        
        //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
        return x10.regionarray.PolyScanner.this;
    }
    
    
    //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
    final public void __fieldInitializers_x10_regionarray_PolyScanner() {
        
    }
    
    
    //#line 289 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
    @x10.runtime.impl.java.X10Generated
    final public static class Anonymous$10018 extends x10.core.Ref implements x10.lang.Iterator, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<Anonymous$10018> $RTT = 
            x10.rtt.NamedType.<Anonymous$10018> make("x10.regionarray.PolyScanner.Anonymous$10018",
                                                     Anonymous$10018.class,
                                                     new x10.rtt.Type[] {
                                                         x10.rtt.ParameterizedType.make(x10.lang.Iterator.$RTT, x10.lang.Point.$RTT)
                                                     });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.regionarray.PolyScanner.Anonymous$10018 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.it = $deserializer.readObject();
            $_obj.out$ = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.regionarray.PolyScanner.Anonymous$10018 $_obj = new x10.regionarray.PolyScanner.Anonymous$10018((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.it);
            $serializer.write(this.out$);
            
        }
        
        // constructor just for allocation
        public Anonymous$10018(final java.lang.System[] $dummy) {
            
        }
        
        // bridge for method abstract public x10.lang.Iterator[T].next(){}:T
        final public x10.lang.Point next$G() {
            return next();
        }
        
        
    
        
        //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
        public x10.regionarray.PolyScanner out$;
        
        //#line 290 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
        public x10.regionarray.PolyScanner.RailIt it;
        
        
        //#line 291 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
        final public boolean hasNext$O() {
            
            //#line 291 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            final x10.regionarray.PolyScanner.RailIt this$132186 = ((x10.regionarray.PolyScanner.RailIt)(it));
            
            //#line 254 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            final boolean t$132706 = this$132186.doesHaveNext;
            
            //#line 291 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            return t$132706;
        }
        
        
        //#line 292 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
        final public x10.lang.Point next() {
            
            //#line 293 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            final x10.regionarray.PolyScanner.RailIt t$132707 = ((x10.regionarray.PolyScanner.RailIt)(it));
            
            //#line 293 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            final x10.core.Rail t = t$132707.next();
            
            //#line 294 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            final long t$132712 = ((x10.core.Rail<x10.core.Int>)t).size;
            
            //#line 294 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            final x10.core.fun.Fun_0_1 t$132713 = ((x10.core.fun.Fun_0_1)(new x10.regionarray.PolyScanner.Anonymous$10018.$Closure$233(t, (x10.regionarray.PolyScanner.Anonymous$10018.$Closure$233.__0$1x10$lang$Int$2) null)));
            
            //#line 294 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            final x10.core.Rail t$132714 = ((x10.core.Rail)(new x10.core.Rail<x10.core.Long>(x10.rtt.Types.LONG, ((long)(t$132712)), ((x10.core.fun.Fun_0_1)(t$132713)), (x10.core.Rail.__1$1x10$lang$Long$3x10$lang$Rail$$T$2) null)));
            
            //#line 294 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            final x10.lang.Point t$132715 = ((x10.lang.Point)(x10.lang.Point.make__0$1x10$lang$Long$2(((x10.core.Rail)(t$132714)))));
            
            //#line 294 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            final x10.lang.Point t$132716 = ((x10.lang.Point)(((x10.lang.Point)
                                                                t$132715)));
            
            //#line 294 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
            return t$132716;
        }
        
        
        //#line 289 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
        // creation method for java code (1-phase java constructor)
        public Anonymous$10018(final x10.regionarray.PolyScanner out$) {
            this((java.lang.System[]) null);
            x10$regionarray$PolyScanner$Anonymous$10018$$init$S(out$);
        }
        
        // constructor for non-virtual call
        final public x10.regionarray.PolyScanner.Anonymous$10018 x10$regionarray$PolyScanner$Anonymous$10018$$init$S(final x10.regionarray.PolyScanner out$) {
             {
                
                //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                this.out$ = out$;
                
                //#line 290 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                final x10.regionarray.PolyScanner.RailIt alloc$131275 = ((x10.regionarray.PolyScanner.RailIt)(new x10.regionarray.PolyScanner.RailIt((java.lang.System[]) null)));
                
                //#line 290 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                final x10.regionarray.PolyScanner t$133287 = this.out$;
                
                //#line 290 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                alloc$131275.x10$regionarray$PolyScanner$RailIt$$init$S(t$133287);
                
                //#line 290 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                this.it = ((x10.regionarray.PolyScanner.RailIt)(alloc$131275));
            }
            return this;
        }
        
        
        @x10.runtime.impl.java.X10Generated
        final public static class $Closure$233 extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.serialization.X10JavaSerializable
        {
            public static final x10.rtt.RuntimeType<$Closure$233> $RTT = 
                x10.rtt.StaticFunType.<$Closure$233> make($Closure$233.class,
                                                          new x10.rtt.Type[] {
                                                              x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.LONG, x10.rtt.Types.LONG)
                                                          });
            
            public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
            
            public x10.rtt.Type<?> $getParam(int i) { return null; }
            
            public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.regionarray.PolyScanner.Anonymous$10018.$Closure$233 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
                $_obj.t = $deserializer.readObject();
                return $_obj;
            }
            
            public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
                x10.regionarray.PolyScanner.Anonymous$10018.$Closure$233 $_obj = new x10.regionarray.PolyScanner.Anonymous$10018.$Closure$233((java.lang.System[]) null);
                $deserializer.record_reference($_obj);
                return $_deserialize_body($_obj, $deserializer);
            }
            
            public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
                $serializer.write(this.t);
                
            }
            
            // constructor just for allocation
            public $Closure$233(final java.lang.System[] $dummy) {
                
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
            public static final class __0$1x10$lang$Int$2 {}
            
        
            
            public long $apply$O(final long i) {
                
                //#line 294 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                final int t$132708 = ((int)(long)(((long)(i))));
                
                //#line 294 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                final long t$132709 = ((long)(((int)(t$132708))));
                
                //#line 294 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                final int t$132710 = ((int[])this.t.value)[(int)t$132709];
                
                //#line 294 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                final long t$132711 = ((long)(((int)(t$132710))));
                
                //#line 294 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
                return t$132711;
            }
            
            public x10.core.Rail<x10.core.Int> t;
            
            public $Closure$233(final x10.core.Rail<x10.core.Int> t, __0$1x10$lang$Int$2 $dummy) {
                 {
                    this.t = ((x10.core.Rail)(t));
                }
            }
            
        }
        
    }
    
}

