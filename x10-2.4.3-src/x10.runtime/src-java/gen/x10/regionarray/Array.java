package x10.regionarray;


@x10.runtime.impl.java.X10Generated
final public class Array<$T> extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.lang.Iterable, x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<Array> $RTT = 
        x10.rtt.NamedType.<Array> make("x10.regionarray.Array",
                                       Array.class,
                                       1,
                                       new x10.rtt.Type[] {
                                           x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_1.$RTT, x10.lang.Point.$RTT, x10.rtt.UnresolvedType.PARAM(0)),
                                           x10.rtt.ParameterizedType.make(x10.lang.Iterable.$RTT, x10.lang.Point.$RTT)
                                       });
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $T; return null; }
    
    public static <$T> x10.serialization.X10JavaSerializable $_deserialize_body(x10.regionarray.Array<$T> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        $_obj.$T = (x10.rtt.Type) $deserializer.readObject();
        $_obj.raw = $deserializer.readObject();
        $_obj.layout_min0 = $deserializer.readLong();
        $_obj.layout_stride1 = $deserializer.readLong();
        $_obj.layout_min1 = $deserializer.readLong();
        $_obj.layout = $deserializer.readObject();
        $_obj.region = $deserializer.readObject();
        $_obj.rank = $deserializer.readLong();
        $_obj.rect = $deserializer.readBoolean();
        $_obj.zeroBased = $deserializer.readBoolean();
        $_obj.rail = $deserializer.readBoolean();
        $_obj.size = $deserializer.readLong();
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.regionarray.Array $_obj = new x10.regionarray.Array((java.lang.System[]) null, (x10.rtt.Type) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        $serializer.write(this.$T);
        $serializer.write(this.raw);
        $serializer.write(this.layout_min0);
        $serializer.write(this.layout_stride1);
        $serializer.write(this.layout_min1);
        $serializer.write(this.layout);
        $serializer.write(this.region);
        $serializer.write(this.rank);
        $serializer.write(this.rect);
        $serializer.write(this.zeroBased);
        $serializer.write(this.rail);
        $serializer.write(this.size);
        
    }
    
    // constructor just for allocation
    public Array(final java.lang.System[] $dummy, final x10.rtt.Type $T) {
        x10.regionarray.Array.$initParams(this, $T);
        
    }
    
    // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1){}:U
    public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1) {
        return $apply$G((x10.lang.Point)a1);
        
    }
    
    private x10.rtt.Type $T;
    
    // initializer of type parameters
    public static void $initParams(final Array $this, final x10.rtt.Type $T) {
        $this.$T = $T;
        
    }
    // synthetic type for parameter mangling
    public static final class __1$1x10$lang$Point$3x10$regionarray$Array$$T$2 {}
    // synthetic type for parameter mangling
    public static final class __1x10$regionarray$Array$$T {}
    // synthetic type for parameter mangling
    public static final class __1$1x10$regionarray$Array$$T$2 {}
    // synthetic type for parameter mangling
    public static final class __0$1x10$regionarray$Array$$T$2 {}
    // synthetic type for parameter mangling
    public static final class __1$1x10$lang$Long$3x10$regionarray$Array$$T$2 {}
    
    // properties
    
    //#line 59 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    public x10.regionarray.Region region;
    
    //#line 64 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    public long rank;
    
    //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    public boolean rect;
    
    //#line 74 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    public boolean zeroBased;
    
    //#line 79 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    public boolean rail;
    
    //#line 85 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    public long size;
    

    
    //#line 97 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    /**
     * The backing storage for the array's elements
     */
    public x10.core.Rail<$T> raw;
    
    
    //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    public x10.core.Rail raw() {
        
        //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final x10.core.Rail t$117367 = ((x10.core.Rail)(raw));
        
        //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        return t$117367;
    }
    
    
    //#line 122 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    // creation method for java code (1-phase java constructor)
    public Array(final x10.rtt.Type $T, final x10.regionarray.Region reg) {
        this((java.lang.System[]) null, $T);
        x10$regionarray$Array$$init$S(reg);
    }
    
    // constructor for non-virtual call
    final public x10.regionarray.Array<$T> x10$regionarray$Array$$init$S(final x10.regionarray.Region reg) {
         {
            
            //#line 124 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.regionarray.Region t$118993 = ((x10.regionarray.Region)(((x10.regionarray.Region)
                                                                                reg)));
            
            //#line 124 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$118994 = reg.rank;
            
            //#line 124 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final boolean t$118995 = reg.rect;
            
            //#line 124 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final boolean t$118996 = reg.zeroBased;
            
            //#line 124 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final boolean t$118997 = reg.rail;
            
            //#line 124 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$118998 = reg.size$O();
            
            //#line 124 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            this.region = ((x10.regionarray.Region)(t$118993));
            this.rank = t$118994;
            this.rect = t$118995;
            this.zeroBased = t$118996;
            this.rail = t$118997;
            this.size = t$118998;
            
            
            //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.regionarray.Array this$118999 = this;
            
            //#line 125 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.regionarray.Array.LayoutHelper crh = new x10.regionarray.Array.LayoutHelper((java.lang.System[]) null);
            
            //#line 125 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            crh.x10$regionarray$Array$LayoutHelper$$init$S(((x10.regionarray.Region)(reg)));
            
            //#line 126 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$117374 = crh.min0;
            
            //#line 126 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ((x10.regionarray.Array<$T>)this).layout_min0 = t$117374;
            
            //#line 127 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$117375 = crh.stride1;
            
            //#line 127 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ((x10.regionarray.Array<$T>)this).layout_stride1 = t$117375;
            
            //#line 128 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$117376 = crh.min1;
            
            //#line 128 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ((x10.regionarray.Array<$T>)this).layout_min1 = t$117376;
            
            //#line 129 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.core.Rail t$117377 = ((x10.core.Rail)(crh.layout));
            
            //#line 129 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ((x10.regionarray.Array<$T>)this).layout = ((x10.core.Rail)(t$117377));
            
            //#line 130 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long n = crh.size;
            
            //#line 131 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.core.Rail t$117378 = ((x10.core.Rail)(new x10.core.Rail<$T>($T, ((long)(n)))));
            
            //#line 131 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ((x10.regionarray.Array<$T>)this).raw = ((x10.core.Rail)(t$117378));
        }
        return this;
    }
    
    
    
    //#line 140 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    // creation method for java code (1-phase java constructor)
    public Array(final x10.rtt.Type $T, final boolean zeroed, final x10.regionarray.Region reg) {
        this((java.lang.System[]) null, $T);
        x10$regionarray$Array$$init$S(zeroed, reg);
    }
    
    // constructor for non-virtual call
    final public x10.regionarray.Array<$T> x10$regionarray$Array$$init$S(final boolean zeroed, final x10.regionarray.Region reg) {
         {
            
            //#line 142 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.regionarray.Region t$119000 = ((x10.regionarray.Region)(((x10.regionarray.Region)
                                                                                reg)));
            
            //#line 142 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$119001 = reg.rank;
            
            //#line 142 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final boolean t$119002 = reg.rect;
            
            //#line 142 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final boolean t$119003 = reg.zeroBased;
            
            //#line 142 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final boolean t$119004 = reg.rail;
            
            //#line 142 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$119005 = reg.size$O();
            
            //#line 142 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            this.region = ((x10.regionarray.Region)(t$119000));
            this.rank = t$119001;
            this.rect = t$119002;
            this.zeroBased = t$119003;
            this.rail = t$119004;
            this.size = t$119005;
            
            
            //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.regionarray.Array this$119006 = this;
            
            //#line 143 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.regionarray.Array.LayoutHelper crh = new x10.regionarray.Array.LayoutHelper((java.lang.System[]) null);
            
            //#line 143 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            crh.x10$regionarray$Array$LayoutHelper$$init$S(((x10.regionarray.Region)(reg)));
            
            //#line 144 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$117385 = crh.min0;
            
            //#line 144 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ((x10.regionarray.Array<$T>)this).layout_min0 = t$117385;
            
            //#line 145 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$117386 = crh.stride1;
            
            //#line 145 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ((x10.regionarray.Array<$T>)this).layout_stride1 = t$117386;
            
            //#line 146 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$117387 = crh.min1;
            
            //#line 146 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ((x10.regionarray.Array<$T>)this).layout_min1 = t$117387;
            
            //#line 147 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.core.Rail t$117388 = ((x10.core.Rail)(crh.layout));
            
            //#line 147 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ((x10.regionarray.Array<$T>)this).layout = ((x10.core.Rail)(t$117388));
            
            //#line 148 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long n = crh.size;
            
            //#line 149 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            if (zeroed) {
                
                //#line 150 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final x10.core.Rail t$117389 = ((x10.core.Rail)(new x10.core.Rail<$T>($T, ((long)(n)))));
                
                //#line 150 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                ((x10.regionarray.Array<$T>)this).raw = ((x10.core.Rail)(t$117389));
            } else {
                
                //#line 152 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final x10.core.Rail t$117390 = ((x10.core.Rail)(x10.core.Rail.<$T>makeUnsafe($T, ((long)(n)), false)));
                
                //#line 152 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                ((x10.regionarray.Array<$T>)this).raw = ((x10.core.Rail)(t$117390));
            }
        }
        return this;
    }
    
    
    
    //#line 172 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    // creation method for java code (1-phase java constructor)
    public Array(final x10.rtt.Type $T, final x10.regionarray.Region reg, final x10.core.fun.Fun_0_1<x10.lang.Point,$T> init, __1$1x10$lang$Point$3x10$regionarray$Array$$T$2 $dummy) {
        this((java.lang.System[]) null, $T);
        x10$regionarray$Array$$init$S(reg, init, (x10.regionarray.Array.__1$1x10$lang$Point$3x10$regionarray$Array$$T$2) null);
    }
    
    // constructor for non-virtual call
    final public x10.regionarray.Array<$T> x10$regionarray$Array$$init$S(final x10.regionarray.Region reg, final x10.core.fun.Fun_0_1<x10.lang.Point,$T> init, __1$1x10$lang$Point$3x10$regionarray$Array$$T$2 $dummy) {
         {
            
            //#line 174 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.regionarray.Region t$119007 = ((x10.regionarray.Region)(((x10.regionarray.Region)
                                                                                reg)));
            
            //#line 174 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$119008 = reg.rank;
            
            //#line 174 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final boolean t$119009 = reg.rect;
            
            //#line 174 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final boolean t$119010 = reg.zeroBased;
            
            //#line 174 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final boolean t$119011 = reg.rail;
            
            //#line 174 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$119012 = reg.size$O();
            
            //#line 174 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            this.region = ((x10.regionarray.Region)(t$119007));
            this.rank = t$119008;
            this.rect = t$119009;
            this.zeroBased = t$119010;
            this.rail = t$119011;
            this.size = t$119012;
            
            
            //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.regionarray.Array this$119055 = this;
            
            //#line 175 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.regionarray.Array.LayoutHelper crh = new x10.regionarray.Array.LayoutHelper((java.lang.System[]) null);
            
            //#line 175 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            crh.x10$regionarray$Array$LayoutHelper$$init$S(((x10.regionarray.Region)(reg)));
            
            //#line 176 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$117397 = crh.min0;
            
            //#line 176 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ((x10.regionarray.Array<$T>)this).layout_min0 = t$117397;
            
            //#line 177 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$117398 = crh.stride1;
            
            //#line 177 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ((x10.regionarray.Array<$T>)this).layout_stride1 = t$117398;
            
            //#line 178 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$117399 = crh.min1;
            
            //#line 178 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ((x10.regionarray.Array<$T>)this).layout_min1 = t$117399;
            
            //#line 179 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.core.Rail t$117400 = ((x10.core.Rail)(crh.layout));
            
            //#line 179 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ((x10.regionarray.Array<$T>)this).layout = ((x10.core.Rail)(t$117400));
            
            //#line 180 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long n = crh.size;
            
            //#line 181 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.core.Rail r = ((x10.core.Rail)(x10.core.Rail.<$T>makeUnsafe($T, ((long)(n)), false)));
            
            //#line 182 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.lang.Iterator p$119056 = reg.iterator();
            
            //#line 182 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            for (;
                 true;
                 ) {
                
                //#line 182 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final boolean t$119057 = ((x10.lang.Iterator<x10.lang.Point>)p$119056).hasNext$O();
                
                //#line 182 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                if (!(t$119057)) {
                    
                    //#line 182 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    break;
                }
                
                //#line 182 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final x10.lang.Point p$119049 = ((x10.lang.Point)(((x10.lang.Iterator<x10.lang.Point>)p$119056).next$G()));
                
                //#line 183 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final x10.regionarray.Array this$119050 = ((x10.regionarray.Array)(this));
                
                //#line 1221 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final x10.lang.Point pt$119051 = ((x10.lang.Point)(p$119049));
                
                //#line 1221 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                long ret$119052 =  0;
                
                //#line 1222 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$119035 = ((long)(((int)(0))));
                
                //#line 1222 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$119036 = pt$119051.$apply$O((long)(t$119035));
                
                //#line 1222 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$119037 = ((x10.regionarray.Array<$T>)this$119050).layout_min0;
                
                //#line 1222 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                long offset$119038 = ((t$119036) - (((long)(t$119037))));
                
                //#line 1223 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$119039 = pt$119051.rank;
                
                //#line 1223 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final boolean t$119040 = ((t$119039) > (((long)(1L))));
                
                //#line 1223 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                if (t$119040) {
                    
                    //#line 1224 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119041 = offset$119038;
                    
                    //#line 1224 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119042 = ((x10.regionarray.Array<$T>)this$119050).layout_stride1;
                    
                    //#line 1224 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119043 = ((t$119041) * (((long)(t$119042))));
                    
                    //#line 1224 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119044 = pt$119051.$apply$O((long)(1L));
                    
                    //#line 1224 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119045 = ((t$119043) + (((long)(t$119044))));
                    
                    //#line 1224 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119046 = ((x10.regionarray.Array<$T>)this$119050).layout_min1;
                    
                    //#line 1224 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119047 = ((t$119045) - (((long)(t$119046))));
                    
                    //#line 1224 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    offset$119038 = t$119047;
                    
                    //#line 1225 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119033 = pt$119051.rank;
                    
                    //#line 1225 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long i$116322max$119034 = ((t$119033) - (((long)(1L))));
                    
                    //#line 1225 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    long i$119030 = 2L;
                    
                    //#line 1225 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    for (;
                         true;
                         ) {
                        
                        //#line 1225 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final long t$119031 = i$119030;
                        
                        //#line 1225 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final boolean t$119032 = ((t$119031) <= (((long)(i$116322max$119034))));
                        
                        //#line 1225 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        if (!(t$119032)) {
                            
                            //#line 1225 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                            break;
                        }
                        
                        //#line 1225 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final long i$119027 = i$119030;
                        
                        //#line 1226 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final long t$119013 = offset$119038;
                        
                        //#line 1226 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final x10.core.Rail t$119014 = ((x10.core.Rail)(((x10.regionarray.Array<$T>)this$119050).layout));
                        
                        //#line 1226 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final long t$119015 = ((i$119027) - (((long)(2L))));
                        
                        //#line 1226 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final long t$119016 = ((2L) * (((long)(t$119015))));
                        
                        //#line 1226 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final long t$119017 = ((long[])t$119014.value)[(int)t$119016];
                        
                        //#line 1226 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final long t$119018 = ((t$119013) * (((long)(t$119017))));
                        
                        //#line 1226 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final long t$119019 = pt$119051.$apply$O((long)(i$119027));
                        
                        //#line 1226 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final long t$119020 = ((t$119018) + (((long)(t$119019))));
                        
                        //#line 1226 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final x10.core.Rail t$119021 = ((x10.core.Rail)(((x10.regionarray.Array<$T>)this$119050).layout));
                        
                        //#line 1226 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final long t$119022 = ((i$119027) - (((long)(2L))));
                        
                        //#line 1226 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final long t$119023 = ((2L) * (((long)(t$119022))));
                        
                        //#line 1226 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final long t$119024 = ((t$119023) + (((long)(1L))));
                        
                        //#line 1226 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final long t$119025 = ((long[])t$119021.value)[(int)t$119024];
                        
                        //#line 1226 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final long t$119026 = ((t$119020) - (((long)(t$119025))));
                        
                        //#line 1226 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        offset$119038 = t$119026;
                        
                        //#line 1225 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final long t$119028 = i$119030;
                        
                        //#line 1225 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final long t$119029 = ((t$119028) + (((long)(1L))));
                        
                        //#line 1225 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        i$119030 = t$119029;
                    }
                }
                
                //#line 1229 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$119048 = offset$119038;
                
                //#line 1229 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                ret$119052 = t$119048;
                
                //#line 1221 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$119053 = ret$119052;
                
                //#line 183 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final $T t$119054 = (($T)((($T)
                                            ((x10.core.fun.Fun_0_1<x10.lang.Point,$T>)init).$apply(p$119049, x10.lang.Point.$RTT))));
                
                //#line 183 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                ((x10.core.Rail<$T>)r).$set__1x10$lang$Rail$$T$G((long)(t$119053), (($T)(t$119054)));
            }
            
            //#line 185 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ((x10.regionarray.Array<$T>)this).raw = ((x10.core.Rail)(r));
        }
        return this;
    }
    
    
    
    //#line 195 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    // creation method for java code (1-phase java constructor)
    public Array(final x10.rtt.Type $T, final x10.regionarray.Region reg, final $T init, __1x10$regionarray$Array$$T $dummy) {
        this((java.lang.System[]) null, $T);
        x10$regionarray$Array$$init$S(reg, init, (x10.regionarray.Array.__1x10$regionarray$Array$$T) null);
    }
    
    // constructor for non-virtual call
    final public x10.regionarray.Array<$T> x10$regionarray$Array$$init$S(final x10.regionarray.Region reg, final $T init, __1x10$regionarray$Array$$T $dummy) {
         {
            
            //#line 197 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.regionarray.Region t$119058 = ((x10.regionarray.Region)(((x10.regionarray.Region)
                                                                                reg)));
            
            //#line 197 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$119059 = reg.rank;
            
            //#line 197 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final boolean t$119060 = reg.rect;
            
            //#line 197 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final boolean t$119061 = reg.zeroBased;
            
            //#line 197 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final boolean t$119062 = reg.rail;
            
            //#line 197 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$119063 = reg.size$O();
            
            //#line 197 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            this.region = ((x10.regionarray.Region)(t$119058));
            this.rank = t$119059;
            this.rect = t$119060;
            this.zeroBased = t$119061;
            this.rail = t$119062;
            this.size = t$119063;
            
            
            //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.regionarray.Array this$119111 = this;
            
            //#line 199 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.regionarray.Array.LayoutHelper crh = new x10.regionarray.Array.LayoutHelper((java.lang.System[]) null);
            
            //#line 199 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            crh.x10$regionarray$Array$LayoutHelper$$init$S(((x10.regionarray.Region)(reg)));
            
            //#line 200 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$117444 = crh.min0;
            
            //#line 200 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ((x10.regionarray.Array<$T>)this).layout_min0 = t$117444;
            
            //#line 201 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$117445 = crh.stride1;
            
            //#line 201 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ((x10.regionarray.Array<$T>)this).layout_stride1 = t$117445;
            
            //#line 202 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$117446 = crh.min1;
            
            //#line 202 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ((x10.regionarray.Array<$T>)this).layout_min1 = t$117446;
            
            //#line 203 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.core.Rail t$117447 = ((x10.core.Rail)(crh.layout));
            
            //#line 203 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ((x10.regionarray.Array<$T>)this).layout = ((x10.core.Rail)(t$117447));
            
            //#line 204 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long n = crh.size;
            
            //#line 205 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.core.Rail r = ((x10.core.Rail)(x10.core.Rail.<$T>makeUnsafe($T, ((long)(n)), false)));
            
            //#line 206 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final boolean t$117489 = reg.rect;
            
            //#line 206 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            if (t$117489) {
                
                //#line 209 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final x10.core.Rail rail$116236 = ((x10.core.Rail)(r));
                
                //#line 209 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long i$116233max$116235 = ((x10.core.Rail<$T>)rail$116236).size;
                
                //#line 209 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                long i$119067 = 0L;
                
                //#line 209 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                for (;
                     true;
                     ) {
                    
                    //#line 209 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119068 = i$119067;
                    
                    //#line 209 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final boolean t$119069 = ((t$119068) < (((long)(i$116233max$116235))));
                    
                    //#line 209 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    if (!(t$119069)) {
                        
                        //#line 209 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        break;
                    }
                    
                    //#line 209 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long i$119064 = i$119067;
                    
                    //#line 210 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    ((x10.core.Rail<$T>)r).$set__1x10$lang$Rail$$T$G((long)(i$119064), (($T)(init)));
                    
                    //#line 209 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119065 = i$119067;
                    
                    //#line 209 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119066 = ((t$119065) + (((long)(1L))));
                    
                    //#line 209 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    i$119067 = t$119066;
                }
            } else {
                
                //#line 213 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final x10.lang.Iterator p$116252 = reg.iterator();
                
                //#line 213 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                for (;
                     true;
                     ) {
                    
                    //#line 213 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final boolean t$117488 = ((x10.lang.Iterator<x10.lang.Point>)p$116252).hasNext$O();
                    
                    //#line 213 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    if (!(t$117488)) {
                        
                        //#line 213 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        break;
                    }
                    
                    //#line 213 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final x10.lang.Point p$119106 = ((x10.lang.Point)(((x10.lang.Iterator<x10.lang.Point>)p$116252).next$G()));
                    
                    //#line 214 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final x10.regionarray.Array this$119107 = ((x10.regionarray.Array)(this));
                    
                    //#line 1221 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final x10.lang.Point pt$119108 = ((x10.lang.Point)(p$119106));
                    
                    //#line 1221 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    long ret$119109 =  0;
                    
                    //#line 1222 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119092 = ((long)(((int)(0))));
                    
                    //#line 1222 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119093 = pt$119108.$apply$O((long)(t$119092));
                    
                    //#line 1222 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119094 = ((x10.regionarray.Array<$T>)this$119107).layout_min0;
                    
                    //#line 1222 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    long offset$119095 = ((t$119093) - (((long)(t$119094))));
                    
                    //#line 1223 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119096 = pt$119108.rank;
                    
                    //#line 1223 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final boolean t$119097 = ((t$119096) > (((long)(1L))));
                    
                    //#line 1223 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    if (t$119097) {
                        
                        //#line 1224 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final long t$119098 = offset$119095;
                        
                        //#line 1224 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final long t$119099 = ((x10.regionarray.Array<$T>)this$119107).layout_stride1;
                        
                        //#line 1224 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final long t$119100 = ((t$119098) * (((long)(t$119099))));
                        
                        //#line 1224 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final long t$119101 = pt$119108.$apply$O((long)(1L));
                        
                        //#line 1224 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final long t$119102 = ((t$119100) + (((long)(t$119101))));
                        
                        //#line 1224 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final long t$119103 = ((x10.regionarray.Array<$T>)this$119107).layout_min1;
                        
                        //#line 1224 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final long t$119104 = ((t$119102) - (((long)(t$119103))));
                        
                        //#line 1224 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        offset$119095 = t$119104;
                        
                        //#line 1225 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final long t$119090 = pt$119108.rank;
                        
                        //#line 1225 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final long i$116322max$119091 = ((t$119090) - (((long)(1L))));
                        
                        //#line 1225 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        long i$119087 = 2L;
                        
                        //#line 1225 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        for (;
                             true;
                             ) {
                            
                            //#line 1225 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                            final long t$119088 = i$119087;
                            
                            //#line 1225 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                            final boolean t$119089 = ((t$119088) <= (((long)(i$116322max$119091))));
                            
                            //#line 1225 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                            if (!(t$119089)) {
                                
                                //#line 1225 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                break;
                            }
                            
                            //#line 1225 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                            final long i$119084 = i$119087;
                            
                            //#line 1226 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                            final long t$119070 = offset$119095;
                            
                            //#line 1226 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                            final x10.core.Rail t$119071 = ((x10.core.Rail)(((x10.regionarray.Array<$T>)this$119107).layout));
                            
                            //#line 1226 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                            final long t$119072 = ((i$119084) - (((long)(2L))));
                            
                            //#line 1226 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                            final long t$119073 = ((2L) * (((long)(t$119072))));
                            
                            //#line 1226 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                            final long t$119074 = ((long[])t$119071.value)[(int)t$119073];
                            
                            //#line 1226 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                            final long t$119075 = ((t$119070) * (((long)(t$119074))));
                            
                            //#line 1226 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                            final long t$119076 = pt$119108.$apply$O((long)(i$119084));
                            
                            //#line 1226 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                            final long t$119077 = ((t$119075) + (((long)(t$119076))));
                            
                            //#line 1226 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                            final x10.core.Rail t$119078 = ((x10.core.Rail)(((x10.regionarray.Array<$T>)this$119107).layout));
                            
                            //#line 1226 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                            final long t$119079 = ((i$119084) - (((long)(2L))));
                            
                            //#line 1226 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                            final long t$119080 = ((2L) * (((long)(t$119079))));
                            
                            //#line 1226 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                            final long t$119081 = ((t$119080) + (((long)(1L))));
                            
                            //#line 1226 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                            final long t$119082 = ((long[])t$119078.value)[(int)t$119081];
                            
                            //#line 1226 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                            final long t$119083 = ((t$119077) - (((long)(t$119082))));
                            
                            //#line 1226 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                            offset$119095 = t$119083;
                            
                            //#line 1225 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                            final long t$119085 = i$119087;
                            
                            //#line 1225 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                            final long t$119086 = ((t$119085) + (((long)(1L))));
                            
                            //#line 1225 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                            i$119087 = t$119086;
                        }
                    }
                    
                    //#line 1229 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119105 = offset$119095;
                    
                    //#line 1229 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    ret$119109 = t$119105;
                    
                    //#line 1221 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119110 = ret$119109;
                    
                    //#line 214 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    ((x10.core.Rail<$T>)r).$set__1x10$lang$Rail$$T$G((long)(t$119110), (($T)(init)));
                }
            }
            
            //#line 217 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ((x10.regionarray.Array<$T>)this).raw = ((x10.core.Rail)(r));
        }
        return this;
    }
    
    
    
    //#line 231 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    // creation method for java code (1-phase java constructor)
    public Array(final x10.rtt.Type $T, final x10.regionarray.Region reg, final x10.core.Rail<$T> backingStore, __1$1x10$regionarray$Array$$T$2 $dummy) {
        this((java.lang.System[]) null, $T);
        x10$regionarray$Array$$init$S(reg, backingStore, (x10.regionarray.Array.__1$1x10$regionarray$Array$$T$2) null);
    }
    
    // constructor for non-virtual call
    final public x10.regionarray.Array<$T> x10$regionarray$Array$$init$S(final x10.regionarray.Region reg, final x10.core.Rail<$T> backingStore, __1$1x10$regionarray$Array$$T$2 $dummy) {
         {
            
            //#line 233 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.regionarray.Region t$119112 = ((x10.regionarray.Region)(((x10.regionarray.Region)
                                                                                reg)));
            
            //#line 233 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$119113 = reg.rank;
            
            //#line 233 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final boolean t$119114 = reg.rect;
            
            //#line 233 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final boolean t$119115 = reg.zeroBased;
            
            //#line 233 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final boolean t$119116 = reg.rail;
            
            //#line 233 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$119117 = reg.size$O();
            
            //#line 233 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            this.region = ((x10.regionarray.Region)(t$119112));
            this.rank = t$119113;
            this.rect = t$119114;
            this.zeroBased = t$119115;
            this.rail = t$119116;
            this.size = t$119117;
            
            
            //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.regionarray.Array this$119118 = this;
            
            //#line 235 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.regionarray.Array.LayoutHelper crh = new x10.regionarray.Array.LayoutHelper((java.lang.System[]) null);
            
            //#line 235 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            crh.x10$regionarray$Array$LayoutHelper$$init$S(((x10.regionarray.Region)(reg)));
            
            //#line 236 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$117496 = crh.min0;
            
            //#line 236 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ((x10.regionarray.Array<$T>)this).layout_min0 = t$117496;
            
            //#line 237 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$117497 = crh.stride1;
            
            //#line 237 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ((x10.regionarray.Array<$T>)this).layout_stride1 = t$117497;
            
            //#line 238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$117498 = crh.min1;
            
            //#line 238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ((x10.regionarray.Array<$T>)this).layout_min1 = t$117498;
            
            //#line 239 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.core.Rail t$117499 = ((x10.core.Rail)(crh.layout));
            
            //#line 239 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ((x10.regionarray.Array<$T>)this).layout = ((x10.core.Rail)(t$117499));
            
            //#line 240 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long n = crh.size;
            
            //#line 241 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$117500 = ((x10.core.Rail<$T>)backingStore).size;
            
            //#line 241 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final boolean t$117502 = ((n) > (((long)(t$117500))));
            
            //#line 241 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            if (t$117502) {
                
                //#line 242 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final java.lang.IllegalArgumentException t$117501 = ((java.lang.IllegalArgumentException)(new java.lang.IllegalArgumentException("backingStore too small")));
                
                //#line 242 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                throw t$117501;
            }
            
            //#line 244 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.core.Rail t$117503 = ((x10.core.Rail)(((x10.core.Rail<$T>)
                                                              backingStore)));
            
            //#line 244 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ((x10.regionarray.Array<$T>)this).raw = ((x10.core.Rail)(t$117503));
        }
        return this;
    }
    
    
    
    //#line 253 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    // creation method for java code (1-phase java constructor)
    public Array(final x10.rtt.Type $T, final x10.core.Rail<$T> backingStore, __0$1x10$regionarray$Array$$T$2 $dummy) {
        this((java.lang.System[]) null, $T);
        x10$regionarray$Array$$init$S(backingStore, (x10.regionarray.Array.__0$1x10$regionarray$Array$$T$2) null);
    }
    
    // constructor for non-virtual call
    final public x10.regionarray.Array<$T> x10$regionarray$Array$$init$S(final x10.core.Rail<$T> backingStore, __0$1x10$regionarray$Array$$T$2 $dummy) {
         {
            
            //#line 255 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long s = ((x10.core.Rail<$T>)backingStore).size;
            
            //#line 256 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.regionarray.RectRegion1D myReg = ((x10.regionarray.RectRegion1D)(new x10.regionarray.RectRegion1D((java.lang.System[]) null)));
            
            //#line 256 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$119119 = ((s) - (((long)(1L))));
            
            //#line 256 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            myReg.x10$regionarray$RectRegion1D$$init$S(t$119119);
            
            //#line 257 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            this.region = ((x10.regionarray.Region)(myReg));
            this.rank = 1L;
            this.rect = true;
            this.zeroBased = true;
            this.rail = true;
            this.size = s;
            
            
            //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.regionarray.Array this$119120 = this;
            
            //#line 259 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$117505 = ((x10.regionarray.Array<$T>)this).layout_min1 = 0L;
            
            //#line 259 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$117506 = ((x10.regionarray.Array<$T>)this).layout_stride1 = t$117505;
            
            //#line 259 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ((x10.regionarray.Array<$T>)this).layout_min0 = t$117506;
            
            //#line 260 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ((x10.regionarray.Array<$T>)this).layout = null;
            
            //#line 261 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.core.Rail t$117507 = ((x10.core.Rail)(((x10.core.Rail<$T>)
                                                              backingStore)));
            
            //#line 261 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ((x10.regionarray.Array<$T>)this).raw = ((x10.core.Rail)(t$117507));
        }
        return this;
    }
    
    
    
    //#line 268 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    // creation method for java code (1-phase java constructor)
    public Array(final x10.rtt.Type $T, final long size) {
        this((java.lang.System[]) null, $T);
        x10$regionarray$Array$$init$S(size);
    }
    
    // constructor for non-virtual call
    final public x10.regionarray.Array<$T> x10$regionarray$Array$$init$S(final long size) {
         {
            
            //#line 270 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.regionarray.RectRegion1D myReg = ((x10.regionarray.RectRegion1D)(new x10.regionarray.RectRegion1D((java.lang.System[]) null)));
            
            //#line 270 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$119121 = ((size) - (((long)(1L))));
            
            //#line 270 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            myReg.x10$regionarray$RectRegion1D$$init$S(t$119121);
            
            //#line 271 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            this.region = ((x10.regionarray.Region)(myReg));
            this.rank = 1L;
            this.rect = true;
            this.zeroBased = true;
            this.rail = true;
            this.size = size;
            
            
            //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.regionarray.Array this$119122 = this;
            
            //#line 273 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$117509 = ((x10.regionarray.Array<$T>)this).layout_min1 = 0L;
            
            //#line 273 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$117510 = ((x10.regionarray.Array<$T>)this).layout_stride1 = t$117509;
            
            //#line 273 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ((x10.regionarray.Array<$T>)this).layout_min0 = t$117510;
            
            //#line 274 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ((x10.regionarray.Array<$T>)this).layout = null;
            
            //#line 275 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.core.Rail t$117511 = ((x10.core.Rail)(new x10.core.Rail<$T>($T, ((long)(size)))));
            
            //#line 275 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ((x10.regionarray.Array<$T>)this).raw = ((x10.core.Rail)(t$117511));
        }
        return this;
    }
    
    
    
    //#line 282 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    // creation method for java code (1-phase java constructor)
    public Array(final x10.rtt.Type $T, final boolean zeroed, final long size) {
        this((java.lang.System[]) null, $T);
        x10$regionarray$Array$$init$S(zeroed, size);
    }
    
    // constructor for non-virtual call
    final public x10.regionarray.Array<$T> x10$regionarray$Array$$init$S(final boolean zeroed, final long size) {
         {
            
            //#line 284 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.regionarray.RectRegion1D myReg = ((x10.regionarray.RectRegion1D)(new x10.regionarray.RectRegion1D((java.lang.System[]) null)));
            
            //#line 284 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$119123 = ((size) - (((long)(1L))));
            
            //#line 284 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            myReg.x10$regionarray$RectRegion1D$$init$S(t$119123);
            
            //#line 285 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            this.region = ((x10.regionarray.Region)(myReg));
            this.rank = 1L;
            this.rect = true;
            this.zeroBased = true;
            this.rail = true;
            this.size = size;
            
            
            //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.regionarray.Array this$119124 = this;
            
            //#line 287 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$117513 = ((x10.regionarray.Array<$T>)this).layout_min1 = 0L;
            
            //#line 287 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$117514 = ((x10.regionarray.Array<$T>)this).layout_stride1 = t$117513;
            
            //#line 287 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ((x10.regionarray.Array<$T>)this).layout_min0 = t$117514;
            
            //#line 288 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ((x10.regionarray.Array<$T>)this).layout = null;
            
            //#line 289 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            if (zeroed) {
                
                //#line 290 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final x10.core.Rail t$117515 = ((x10.core.Rail)(new x10.core.Rail<$T>($T, ((long)(size)))));
                
                //#line 290 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                ((x10.regionarray.Array<$T>)this).raw = ((x10.core.Rail)(t$117515));
            } else {
                
                //#line 292 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final x10.core.Rail t$117516 = ((x10.core.Rail)(x10.core.Rail.<$T>makeUnsafe($T, ((long)(size)), false)));
                
                //#line 292 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                ((x10.regionarray.Array<$T>)this).raw = ((x10.core.Rail)(t$117516));
            }
        }
        return this;
    }
    
    
    
    //#line 312 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    // creation method for java code (1-phase java constructor)
    public Array(final x10.rtt.Type $T, final long size, final x10.core.fun.Fun_0_1<x10.core.Long,$T> init, __1$1x10$lang$Long$3x10$regionarray$Array$$T$2 $dummy) {
        this((java.lang.System[]) null, $T);
        x10$regionarray$Array$$init$S(size, init, (x10.regionarray.Array.__1$1x10$lang$Long$3x10$regionarray$Array$$T$2) null);
    }
    
    // constructor for non-virtual call
    final public x10.regionarray.Array<$T> x10$regionarray$Array$$init$S(final long size, final x10.core.fun.Fun_0_1<x10.core.Long,$T> init, __1$1x10$lang$Long$3x10$regionarray$Array$$T$2 $dummy) {
         {
            
            //#line 314 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.regionarray.RectRegion1D myReg = ((x10.regionarray.RectRegion1D)(new x10.regionarray.RectRegion1D((java.lang.System[]) null)));
            
            //#line 314 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$119132 = ((size) - (((long)(1L))));
            
            //#line 314 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            myReg.x10$regionarray$RectRegion1D$$init$S(t$119132);
            
            //#line 315 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            this.region = ((x10.regionarray.Region)(myReg));
            this.rank = 1L;
            this.rect = true;
            this.zeroBased = true;
            this.rail = true;
            this.size = size;
            
            
            //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.regionarray.Array this$119133 = this;
            
            //#line 317 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$117518 = ((x10.regionarray.Array<$T>)this).layout_min1 = 0L;
            
            //#line 317 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$117519 = ((x10.regionarray.Array<$T>)this).layout_stride1 = t$117518;
            
            //#line 317 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ((x10.regionarray.Array<$T>)this).layout_min0 = t$117519;
            
            //#line 318 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ((x10.regionarray.Array<$T>)this).layout = null;
            
            //#line 319 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.core.Rail r = ((x10.core.Rail)(x10.core.Rail.<$T>makeUnsafe($T, ((long)(size)), false)));
            
            //#line 320 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long i$116254max$119134 = ((size) - (((long)(1L))));
            
            //#line 320 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            long i$119129 = 0L;
            
            //#line 320 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            for (;
                 true;
                 ) {
                
                //#line 320 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$119130 = i$119129;
                
                //#line 320 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final boolean t$119131 = ((t$119130) <= (((long)(i$116254max$119134))));
                
                //#line 320 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                if (!(t$119131)) {
                    
                    //#line 320 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    break;
                }
                
                //#line 320 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long i$119126 = i$119129;
                
                //#line 321 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final $T t$119125 = (($T)((($T)
                                            ((x10.core.fun.Fun_0_1<x10.core.Long,$T>)init).$apply(x10.core.Long.$box(i$119126), x10.rtt.Types.LONG))));
                
                //#line 321 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                ((x10.core.Rail<$T>)r).$set__1x10$lang$Rail$$T$G((long)(i$119126), (($T)(t$119125)));
                
                //#line 320 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$119127 = i$119129;
                
                //#line 320 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$119128 = ((t$119127) + (((long)(1L))));
                
                //#line 320 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                i$119129 = t$119128;
            }
            
            //#line 323 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ((x10.regionarray.Array<$T>)this).raw = ((x10.core.Rail)(r));
        }
        return this;
    }
    
    
    
    //#line 333 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    // creation method for java code (1-phase java constructor)
    public Array(final x10.rtt.Type $T, final long size, final $T init, __1x10$regionarray$Array$$T $dummy) {
        this((java.lang.System[]) null, $T);
        x10$regionarray$Array$$init$S(size, init, (x10.regionarray.Array.__1x10$regionarray$Array$$T) null);
    }
    
    // constructor for non-virtual call
    final public x10.regionarray.Array<$T> x10$regionarray$Array$$init$S(final long size, final $T init, __1x10$regionarray$Array$$T $dummy) {
         {
            
            //#line 335 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.regionarray.RectRegion1D myReg = ((x10.regionarray.RectRegion1D)(new x10.regionarray.RectRegion1D((java.lang.System[]) null)));
            
            //#line 335 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$119141 = ((size) - (((long)(1L))));
            
            //#line 335 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            myReg.x10$regionarray$RectRegion1D$$init$S(t$119141);
            
            //#line 336 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            this.region = ((x10.regionarray.Region)(myReg));
            this.rank = 1L;
            this.rect = true;
            this.zeroBased = true;
            this.rail = true;
            this.size = size;
            
            
            //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.regionarray.Array this$119142 = this;
            
            //#line 338 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$117527 = ((x10.regionarray.Array<$T>)this).layout_min1 = 0L;
            
            //#line 338 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$117528 = ((x10.regionarray.Array<$T>)this).layout_stride1 = t$117527;
            
            //#line 338 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ((x10.regionarray.Array<$T>)this).layout_min0 = t$117528;
            
            //#line 339 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ((x10.regionarray.Array<$T>)this).layout = null;
            
            //#line 340 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.core.Rail r = ((x10.core.Rail)(x10.core.Rail.<$T>makeUnsafe($T, ((long)(size)), false)));
            
            //#line 341 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long i$116272max$119143 = ((size) - (((long)(1L))));
            
            //#line 341 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            long i$119138 = 0L;
            
            //#line 341 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            for (;
                 true;
                 ) {
                
                //#line 341 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$119139 = i$119138;
                
                //#line 341 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final boolean t$119140 = ((t$119139) <= (((long)(i$116272max$119143))));
                
                //#line 341 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                if (!(t$119140)) {
                    
                    //#line 341 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    break;
                }
                
                //#line 341 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long i$119135 = i$119138;
                
                //#line 342 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                ((x10.core.Rail<$T>)r).$set__1x10$lang$Rail$$T$G((long)(i$119135), (($T)(init)));
                
                //#line 341 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$119136 = i$119138;
                
                //#line 341 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$119137 = ((t$119136) + (((long)(1L))));
                
                //#line 341 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                i$119138 = t$119137;
            }
            
            //#line 344 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ((x10.regionarray.Array<$T>)this).raw = ((x10.core.Rail)(r));
        }
        return this;
    }
    
    
    
    //#line 353 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    // creation method for java code (1-phase java constructor)
    public Array(final x10.rtt.Type $T, final x10.regionarray.Array<$T> init, __0$1x10$regionarray$Array$$T$2 $dummy) {
        this((java.lang.System[]) null, $T);
        x10$regionarray$Array$$init$S(init, (x10.regionarray.Array.__0$1x10$regionarray$Array$$T$2) null);
    }
    
    // constructor for non-virtual call
    final public x10.regionarray.Array<$T> x10$regionarray$Array$$init$S(final x10.regionarray.Array<$T> init, __0$1x10$regionarray$Array$$T$2 $dummy) {
         {
            
            //#line 355 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.regionarray.Region t$119144 = ((x10.regionarray.Region)(((x10.regionarray.Array<$T>)init).region));
            
            //#line 355 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$119145 = ((x10.regionarray.Array<$T>)init).rank;
            
            //#line 355 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final boolean t$119146 = ((x10.regionarray.Array<$T>)init).rect;
            
            //#line 355 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final boolean t$119147 = ((x10.regionarray.Array<$T>)init).zeroBased;
            
            //#line 355 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final boolean t$119148 = ((x10.regionarray.Array<$T>)init).rail;
            
            //#line 355 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$119149 = ((x10.regionarray.Array<$T>)init).size;
            
            //#line 355 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            this.region = ((x10.regionarray.Region)(t$119144));
            this.rank = t$119145;
            this.rect = t$119146;
            this.zeroBased = t$119147;
            this.rail = t$119148;
            this.size = t$119149;
            
            
            //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.regionarray.Array this$119150 = this;
            
            //#line 356 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$117540 = ((x10.regionarray.Array<$T>)init).layout_min0;
            
            //#line 356 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ((x10.regionarray.Array<$T>)this).layout_min0 = t$117540;
            
            //#line 357 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$117541 = ((x10.regionarray.Array<$T>)init).layout_stride1;
            
            //#line 357 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ((x10.regionarray.Array<$T>)this).layout_stride1 = t$117541;
            
            //#line 358 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$117542 = ((x10.regionarray.Array<$T>)init).layout_min1;
            
            //#line 358 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ((x10.regionarray.Array<$T>)this).layout_min1 = t$117542;
            
            //#line 359 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.core.Rail t$117543 = ((x10.core.Rail)(((x10.regionarray.Array<$T>)init).layout));
            
            //#line 359 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ((x10.regionarray.Array<$T>)this).layout = ((x10.core.Rail)(t$117543));
            
            //#line 360 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.core.Rail t$117544 = ((x10.core.Rail)(((x10.regionarray.Array<$T>)init).raw));
            
            //#line 360 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$117545 = ((x10.core.Rail<$T>)t$117544).size;
            
            //#line 360 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.core.Rail r = ((x10.core.Rail)(x10.core.Rail.<$T>makeUnsafe($T, ((long)(t$117545)), false)));
            
            //#line 361 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.core.Rail t$117546 = ((x10.core.Rail)(((x10.regionarray.Array<$T>)init).raw));
            
            //#line 361 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$117547 = ((x10.core.Rail<$T>)r).size;
            
            //#line 361 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            x10.core.Rail.<$T> copy__0$1x10$lang$Rail$$T$2__2$1x10$lang$Rail$$T$2($T, ((x10.core.Rail)(t$117546)), (long)(0L), ((x10.core.Rail)(r)), (long)(0L), (long)(t$117547));
            
            //#line 362 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ((x10.regionarray.Array<$T>)this).raw = ((x10.core.Rail)(r));
        }
        return this;
    }
    
    
    
    //#line 371 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    // creation method for java code (1-phase java constructor)
    public Array(final x10.rtt.Type $T, final x10.regionarray.RemoteArray<$T> init, __0$1x10$regionarray$Array$$T$2 $dummy) {
        this((java.lang.System[]) null, $T);
        x10$regionarray$Array$$init$S(init, (x10.regionarray.Array.__0$1x10$regionarray$Array$$T$2) null);
    }
    
    // constructor for non-virtual call
    final public x10.regionarray.Array<$T> x10$regionarray$Array$$init$S(final x10.regionarray.RemoteArray<$T> init, __0$1x10$regionarray$Array$$T$2 $dummy) {
         {
            
            //#line 373 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.regionarray.Array this$116921 = ((x10.regionarray.Array)(this));
            
            //#line 373 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.core.GlobalRef t$117548 = ((x10.core.GlobalRef)(((x10.regionarray.RemoteArray<$T>)init).array));
            
            //#line 353 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.regionarray.Array init$116919 = ((x10.regionarray.Array)((((x10.core.GlobalRef<x10.regionarray.Array<$T>>)(t$117548))).$apply$G()));
            
            //#line 355 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.regionarray.Region t$119151 = ((x10.regionarray.Region)(((x10.regionarray.Array<$T>)init$116919).region));
            
            //#line 355 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ((x10.regionarray.Array<$T>)this$116921).region = ((x10.regionarray.Region)(t$119151));
            
            //#line 355 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$119152 = ((x10.regionarray.Array<$T>)init$116919).rank;
            
            //#line 355 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ((x10.regionarray.Array<$T>)this$116921).rank = t$119152;
            
            //#line 355 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final boolean t$119153 = ((x10.regionarray.Array<$T>)init$116919).rect;
            
            //#line 355 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ((x10.regionarray.Array<$T>)this$116921).rect = t$119153;
            
            //#line 355 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final boolean t$119154 = ((x10.regionarray.Array<$T>)init$116919).zeroBased;
            
            //#line 355 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ((x10.regionarray.Array<$T>)this$116921).zeroBased = t$119154;
            
            //#line 355 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final boolean t$119155 = ((x10.regionarray.Array<$T>)init$116919).rail;
            
            //#line 355 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ((x10.regionarray.Array<$T>)this$116921).rail = t$119155;
            
            //#line 355 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$119156 = ((x10.regionarray.Array<$T>)init$116919).size;
            
            //#line 355 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ((x10.regionarray.Array<$T>)this$116921).size = t$119156;
            {
                
            }
            
            //#line 356 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$119157 = ((x10.regionarray.Array<$T>)init$116919).layout_min0;
            
            //#line 356 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ((x10.regionarray.Array<$T>)this$116921).layout_min0 = t$119157;
            
            //#line 357 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$119158 = ((x10.regionarray.Array<$T>)init$116919).layout_stride1;
            
            //#line 357 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ((x10.regionarray.Array<$T>)this$116921).layout_stride1 = t$119158;
            
            //#line 358 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$119159 = ((x10.regionarray.Array<$T>)init$116919).layout_min1;
            
            //#line 358 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ((x10.regionarray.Array<$T>)this$116921).layout_min1 = t$119159;
            
            //#line 359 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.core.Rail t$119160 = ((x10.core.Rail)(((x10.regionarray.Array<$T>)init$116919).layout));
            
            //#line 359 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ((x10.regionarray.Array<$T>)this$116921).layout = ((x10.core.Rail)(t$119160));
            
            //#line 360 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.core.Rail t$119161 = ((x10.core.Rail)(((x10.regionarray.Array<$T>)init$116919).raw));
            
            //#line 360 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$119162 = ((x10.core.Rail<$T>)t$119161).size;
            
            //#line 360 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.core.Rail r$119163 = ((x10.core.Rail)(x10.core.Rail.<$T>makeUnsafe($T, ((long)(t$119162)), false)));
            
            //#line 361 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.core.Rail t$119164 = ((x10.core.Rail)(((x10.regionarray.Array<$T>)init$116919).raw));
            
            //#line 361 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$119165 = ((x10.core.Rail<$T>)r$119163).size;
            
            //#line 361 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            x10.core.Rail.<$T> copy__0$1x10$lang$Rail$$T$2__2$1x10$lang$Rail$$T$2($T, ((x10.core.Rail)(t$119164)), (long)(0L), ((x10.core.Rail)(r$119163)), (long)(0L), (long)(t$119165));
            
            //#line 362 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ((x10.regionarray.Array<$T>)this$116921).raw = ((x10.core.Rail)(r$119163));
        }
        return this;
    }
    
    
    
    //#line 381 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    public java.lang.String toString() {
        
        //#line 382 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final boolean t$117583 = rail;
        
        //#line 382 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        if (t$117583) {
            
            //#line 383 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.util.StringBuilder sb = ((x10.util.StringBuilder)(new x10.util.StringBuilder((java.lang.System[]) null)));
            
            //#line 383 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            sb.x10$util$StringBuilder$$init$S();
            
            //#line 384 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            sb.add(((java.lang.String)("[")));
            
            //#line 385 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$117563 = size;
            
            //#line 385 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long sz = java.lang.Math.min(((long)(t$117563)),((long)(10L)));
            
            //#line 386 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long i$116290max$119176 = ((sz) - (((long)(1L))));
            
            //#line 386 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            long i$119173 = 0L;
            
            //#line 386 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            for (;
                 true;
                 ) {
                
                //#line 386 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$119174 = i$119173;
                
                //#line 386 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final boolean t$119175 = ((t$119174) <= (((long)(i$116290max$119176))));
                
                //#line 386 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                if (!(t$119175)) {
                    
                    //#line 386 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    break;
                }
                
                //#line 386 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long i$119170 = i$119173;
                
                //#line 387 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final boolean t$119166 = ((i$119170) > (((long)(0L))));
                
                //#line 387 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                if (t$119166) {
                    
                    //#line 387 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    sb.add(((java.lang.String)(",")));
                }
                
                //#line 388 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final x10.core.Rail t$119167 = ((x10.core.Rail)(raw));
                
                //#line 388 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final $T t$119168 = (($T)(((x10.core.Rail<$T>)t$119167).$apply$G((long)(i$119170))));
                
                //#line 388 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final java.lang.String t$119169 = (("") + (t$119168));
                
                //#line 388 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                sb.add(((java.lang.String)(t$119169)));
                
                //#line 386 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$119171 = i$119173;
                
                //#line 386 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$119172 = ((t$119171) + (((long)(1L))));
                
                //#line 386 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                i$119173 = t$119172;
            }
            
            //#line 390 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$117573 = size;
            
            //#line 390 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final boolean t$117578 = ((sz) < (((long)(t$117573))));
            
            //#line 390 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            if (t$117578) {
                
                //#line 390 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$117574 = size;
                
                //#line 390 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$117575 = ((t$117574) - (((long)(sz))));
                
                //#line 390 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final java.lang.String t$117576 = (("...(omitted ") + ((x10.core.Long.$box(t$117575))));
                
                //#line 390 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final java.lang.String t$117577 = ((t$117576) + (" elements)"));
                
                //#line 390 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                sb.add(((java.lang.String)(t$117577)));
            }
            
            //#line 391 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            sb.add(((java.lang.String)("]")));
            
            //#line 392 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final java.lang.String t$117579 = sb.toString();
            
            //#line 392 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            return t$117579;
        } else {
            
            //#line 394 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.regionarray.Region t$117580 = ((x10.regionarray.Region)(region));
            
            //#line 394 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final java.lang.String t$117581 = (("Array(") + (t$117580));
            
            //#line 394 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final java.lang.String t$117582 = ((t$117581) + (")"));
            
            //#line 394 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            return t$117582;
        }
    }
    
    
    //#line 404 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    public x10.lang.Iterator iterator() {
        
        //#line 404 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final x10.regionarray.Region t$117584 = ((x10.regionarray.Region)(region));
        
        //#line 404 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final x10.lang.Iterator t$117585 = t$117584.iterator();
        
        //#line 404 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        return t$117585;
    }
    
    
    //#line 412 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    public x10.lang.Iterable values() {
        
        //#line 413 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final boolean t$117586 = rect;
        
        //#line 413 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        if (t$117586) {
            
            //#line 414 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.regionarray.Array.Anonymous$14235 alloc$116223 = ((x10.regionarray.Array.Anonymous$14235)(new x10.regionarray.Array.Anonymous$14235<$T>((java.lang.System[]) null, $T)));
            
            //#line 55 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.regionarray.Array out$116925 = ((x10.regionarray.Array)(this));
            
            //#line 55 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ((x10.regionarray.Array.Anonymous$14235<$T>)alloc$116223).out$ = out$116925;
            
            //#line 414 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            return alloc$116223;
        } else {
            
            //#line 422 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.regionarray.Array.Anonymous$14520 alloc$116224 = ((x10.regionarray.Array.Anonymous$14520)(new x10.regionarray.Array.Anonymous$14520<$T>((java.lang.System[]) null, $T)));
            
            //#line 55 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.regionarray.Array out$116927 = ((x10.regionarray.Array)(this));
            
            //#line 55 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ((x10.regionarray.Array.Anonymous$14520<$T>)alloc$116224).out$ = out$116927;
            
            //#line 422 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            return alloc$116224;
        }
    }
    
    
    //#line 442 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    public $T $apply$G(final long i0) {
        
        //#line 444 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final boolean t$117593 = rail;
        
        //#line 444 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        if (t$117593) {
            
            //#line 446 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.core.Rail t$117587 = ((x10.core.Rail)(raw));
            
            //#line 446 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final $T t$117588 = (($T)(((x10.core.Rail<$T>)t$117587).$apply$G((long)(i0))));
            
            //#line 446 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            return t$117588;
        } else {
            
            //#line 451 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.core.Rail t$117590 = ((x10.core.Rail)(raw));
            
            //#line 451 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$117589 = layout_min0;
            
            //#line 451 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$117591 = ((i0) - (((long)(t$117589))));
            
            //#line 451 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final $T t$117592 = (($T)(((x10.core.Rail<$T>)t$117590).$apply$G((long)(t$117591))));
            
            //#line 451 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            return t$117592;
        }
    }
    
    
    //#line 466 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    public $T $apply$G(final long i0, final long i1) {
        
        //#line 470 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$117594 = layout_min0;
        
        //#line 470 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        long offset = ((i0) - (((long)(t$117594))));
        
        //#line 471 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$117595 = offset;
        
        //#line 471 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$117596 = layout_stride1;
        
        //#line 471 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$117597 = ((t$117595) * (((long)(t$117596))));
        
        //#line 471 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$117598 = ((t$117597) + (((long)(i1))));
        
        //#line 471 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$117599 = layout_min1;
        
        //#line 471 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$117600 = ((t$117598) - (((long)(t$117599))));
        
        //#line 471 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        offset = t$117600;
        
        //#line 472 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final x10.core.Rail t$117601 = ((x10.core.Rail)(raw));
        
        //#line 472 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$117602 = offset;
        
        //#line 472 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final $T t$117603 = (($T)(((x10.core.Rail<$T>)t$117601).$apply$G((long)(t$117602))));
        
        //#line 472 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        return t$117603;
    }
    
    
    //#line 487 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    public $T $apply$G(final long i0, final long i1, final long i2) {
        
        //#line 491 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final x10.core.Rail t$117620 = ((x10.core.Rail)(raw));
        
        //#line 491 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final x10.regionarray.Array this$116933 = ((x10.regionarray.Array)(this));
        
        //#line 1206 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long i$116929 = i0;
        
        //#line 1206 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long i$116930 = i1;
        
        //#line 1206 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long i$116931 = i2;
        
        //#line 1206 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        long ret$116934 =  0;
        
        //#line 1207 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$119177 = ((x10.regionarray.Array<$T>)this$116933).layout_min0;
        
        //#line 1207 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        long offset$119178 = ((i$116929) - (((long)(t$119177))));
        
        //#line 1208 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$119179 = offset$119178;
        
        //#line 1208 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$119180 = ((x10.regionarray.Array<$T>)this$116933).layout_stride1;
        
        //#line 1208 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$119181 = ((t$119179) * (((long)(t$119180))));
        
        //#line 1208 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$119182 = ((t$119181) + (((long)(i$116930))));
        
        //#line 1208 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$119183 = ((x10.regionarray.Array<$T>)this$116933).layout_min1;
        
        //#line 1208 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$119184 = ((t$119182) - (((long)(t$119183))));
        
        //#line 1208 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        offset$119178 = t$119184;
        
        //#line 1209 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$119185 = offset$119178;
        
        //#line 1209 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final x10.core.Rail t$119186 = ((x10.core.Rail)(((x10.regionarray.Array<$T>)this$116933).layout));
        
        //#line 1209 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$119187 = ((long[])t$119186.value)[(int)0L];
        
        //#line 1209 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$119188 = ((t$119185) * (((long)(t$119187))));
        
        //#line 1209 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$119189 = ((t$119188) + (((long)(i$116931))));
        
        //#line 1209 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final x10.core.Rail t$119190 = ((x10.core.Rail)(((x10.regionarray.Array<$T>)this$116933).layout));
        
        //#line 1209 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$119191 = ((long[])t$119190.value)[(int)1L];
        
        //#line 1209 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$119192 = ((t$119189) - (((long)(t$119191))));
        
        //#line 1209 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        offset$119178 = t$119192;
        
        //#line 1210 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$119193 = offset$119178;
        
        //#line 1210 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        ret$116934 = t$119193;
        
        //#line 1206 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$117621 = ret$116934;
        
        //#line 491 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final $T t$117622 = (($T)(((x10.core.Rail<$T>)t$117620).$apply$G((long)(t$117621))));
        
        //#line 491 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        return t$117622;
    }
    
    
    //#line 507 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    public $T $apply$G(final long i0, final long i1, final long i2, final long i3) {
        
        //#line 511 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final x10.core.Rail t$117647 = ((x10.core.Rail)(raw));
        
        //#line 511 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final x10.regionarray.Array this$116941 = ((x10.regionarray.Array)(this));
        
        //#line 1213 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long i$116936 = i0;
        
        //#line 1213 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long i$116937 = i1;
        
        //#line 1213 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long i$116938 = i2;
        
        //#line 1213 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long i$116939 = i3;
        
        //#line 1213 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        long ret$116942 =  0;
        
        //#line 1214 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$119194 = ((x10.regionarray.Array<$T>)this$116941).layout_min0;
        
        //#line 1214 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        long offset$119195 = ((i$116936) - (((long)(t$119194))));
        
        //#line 1215 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$119196 = offset$119195;
        
        //#line 1215 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$119197 = ((x10.regionarray.Array<$T>)this$116941).layout_stride1;
        
        //#line 1215 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$119198 = ((t$119196) * (((long)(t$119197))));
        
        //#line 1215 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$119199 = ((t$119198) + (((long)(i$116937))));
        
        //#line 1215 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$119200 = ((x10.regionarray.Array<$T>)this$116941).layout_min1;
        
        //#line 1215 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$119201 = ((t$119199) - (((long)(t$119200))));
        
        //#line 1215 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        offset$119195 = t$119201;
        
        //#line 1216 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$119202 = offset$119195;
        
        //#line 1216 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final x10.core.Rail t$119203 = ((x10.core.Rail)(((x10.regionarray.Array<$T>)this$116941).layout));
        
        //#line 1216 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$119204 = ((long[])t$119203.value)[(int)0L];
        
        //#line 1216 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$119205 = ((t$119202) * (((long)(t$119204))));
        
        //#line 1216 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$119206 = ((t$119205) + (((long)(i$116938))));
        
        //#line 1216 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final x10.core.Rail t$119207 = ((x10.core.Rail)(((x10.regionarray.Array<$T>)this$116941).layout));
        
        //#line 1216 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$119208 = ((long[])t$119207.value)[(int)1L];
        
        //#line 1216 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$119209 = ((t$119206) - (((long)(t$119208))));
        
        //#line 1216 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        offset$119195 = t$119209;
        
        //#line 1217 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$119210 = offset$119195;
        
        //#line 1217 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final x10.core.Rail t$119211 = ((x10.core.Rail)(((x10.regionarray.Array<$T>)this$116941).layout));
        
        //#line 1217 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$119212 = ((long[])t$119211.value)[(int)2L];
        
        //#line 1217 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$119213 = ((t$119210) * (((long)(t$119212))));
        
        //#line 1217 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$119214 = ((t$119213) + (((long)(i$116939))));
        
        //#line 1217 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final x10.core.Rail t$119215 = ((x10.core.Rail)(((x10.regionarray.Array<$T>)this$116941).layout));
        
        //#line 1217 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$119216 = ((long[])t$119215.value)[(int)3L];
        
        //#line 1217 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$119217 = ((t$119214) - (((long)(t$119216))));
        
        //#line 1217 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        offset$119195 = t$119217;
        
        //#line 1218 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$119218 = offset$119195;
        
        //#line 1218 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        ret$116942 = t$119218;
        
        //#line 1213 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$117648 = ret$116942;
        
        //#line 511 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final $T t$117649 = (($T)(((x10.core.Rail<$T>)t$117647).$apply$G((long)(t$117648))));
        
        //#line 511 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        return t$117649;
    }
    
    
    //#line 523 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    public $T $apply$G(final x10.lang.Point pt) {
        
        //#line 527 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final x10.core.Rail t$117683 = ((x10.core.Rail)(raw));
        
        //#line 527 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final x10.regionarray.Array this$116950 = ((x10.regionarray.Array)(this));
        
        //#line 1221 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final x10.lang.Point pt$116944 = ((x10.lang.Point)(pt));
        
        //#line 1221 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        long ret$116951 =  0;
        
        //#line 1222 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$119241 = ((long)(((int)(0))));
        
        //#line 1222 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$119242 = pt$116944.$apply$O((long)(t$119241));
        
        //#line 1222 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$119243 = ((x10.regionarray.Array<$T>)this$116950).layout_min0;
        
        //#line 1222 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        long offset$119244 = ((t$119242) - (((long)(t$119243))));
        
        //#line 1223 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$119245 = pt$116944.rank;
        
        //#line 1223 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final boolean t$119246 = ((t$119245) > (((long)(1L))));
        
        //#line 1223 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        if (t$119246) {
            
            //#line 1224 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$119247 = offset$119244;
            
            //#line 1224 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$119248 = ((x10.regionarray.Array<$T>)this$116950).layout_stride1;
            
            //#line 1224 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$119249 = ((t$119247) * (((long)(t$119248))));
            
            //#line 1224 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$119250 = pt$116944.$apply$O((long)(1L));
            
            //#line 1224 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$119251 = ((t$119249) + (((long)(t$119250))));
            
            //#line 1224 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$119252 = ((x10.regionarray.Array<$T>)this$116950).layout_min1;
            
            //#line 1224 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$119253 = ((t$119251) - (((long)(t$119252))));
            
            //#line 1224 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            offset$119244 = t$119253;
            
            //#line 1225 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$119239 = pt$116944.rank;
            
            //#line 1225 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long i$116322max$119240 = ((t$119239) - (((long)(1L))));
            
            //#line 1225 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            long i$119236 = 2L;
            
            //#line 1225 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            for (;
                 true;
                 ) {
                
                //#line 1225 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$119237 = i$119236;
                
                //#line 1225 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final boolean t$119238 = ((t$119237) <= (((long)(i$116322max$119240))));
                
                //#line 1225 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                if (!(t$119238)) {
                    
                    //#line 1225 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    break;
                }
                
                //#line 1225 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long i$119233 = i$119236;
                
                //#line 1226 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$119219 = offset$119244;
                
                //#line 1226 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final x10.core.Rail t$119220 = ((x10.core.Rail)(((x10.regionarray.Array<$T>)this$116950).layout));
                
                //#line 1226 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$119221 = ((i$119233) - (((long)(2L))));
                
                //#line 1226 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$119222 = ((2L) * (((long)(t$119221))));
                
                //#line 1226 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$119223 = ((long[])t$119220.value)[(int)t$119222];
                
                //#line 1226 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$119224 = ((t$119219) * (((long)(t$119223))));
                
                //#line 1226 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$119225 = pt$116944.$apply$O((long)(i$119233));
                
                //#line 1226 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$119226 = ((t$119224) + (((long)(t$119225))));
                
                //#line 1226 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final x10.core.Rail t$119227 = ((x10.core.Rail)(((x10.regionarray.Array<$T>)this$116950).layout));
                
                //#line 1226 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$119228 = ((i$119233) - (((long)(2L))));
                
                //#line 1226 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$119229 = ((2L) * (((long)(t$119228))));
                
                //#line 1226 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$119230 = ((t$119229) + (((long)(1L))));
                
                //#line 1226 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$119231 = ((long[])t$119227.value)[(int)t$119230];
                
                //#line 1226 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$119232 = ((t$119226) - (((long)(t$119231))));
                
                //#line 1226 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                offset$119244 = t$119232;
                
                //#line 1225 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$119234 = i$119236;
                
                //#line 1225 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$119235 = ((t$119234) + (((long)(1L))));
                
                //#line 1225 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                i$119236 = t$119235;
            }
        }
        
        //#line 1229 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$119254 = offset$119244;
        
        //#line 1229 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        ret$116951 = t$119254;
        
        //#line 1221 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$117684 = ret$116951;
        
        //#line 527 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final $T t$117685 = (($T)(((x10.core.Rail<$T>)t$117683).$apply$G((long)(t$117684))));
        
        //#line 527 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        return t$117685;
    }
    
    
    //#line 543 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    public $T $set__1x10$regionarray$Array$$T$G(final long i0, final $T v) {
        
        //#line 545 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final boolean t$117690 = rail;
        
        //#line 545 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        if (t$117690) {
            
            //#line 547 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.core.Rail t$117686 = ((x10.core.Rail)(raw));
            
            //#line 547 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ((x10.core.Rail<$T>)t$117686).$set__1x10$lang$Rail$$T$G((long)(i0), (($T)(v)));
        } else {
            
            //#line 552 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.core.Rail t$117688 = ((x10.core.Rail)(raw));
            
            //#line 552 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$117687 = layout_min0;
            
            //#line 552 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$117689 = ((i0) - (((long)(t$117687))));
            
            //#line 552 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ((x10.core.Rail<$T>)t$117688).$set__1x10$lang$Rail$$T$G((long)(t$117689), (($T)(v)));
        }
        
        //#line 554 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        return v;
    }
    
    
    //#line 570 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    public $T $set__2x10$regionarray$Array$$T$G(final long i0, final long i1, final $T v) {
        
        //#line 574 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$117691 = layout_min0;
        
        //#line 574 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        long offset = ((i0) - (((long)(t$117691))));
        
        //#line 575 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$117692 = offset;
        
        //#line 575 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$117693 = layout_stride1;
        
        //#line 575 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$117694 = ((t$117692) * (((long)(t$117693))));
        
        //#line 575 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$117695 = ((t$117694) + (((long)(i1))));
        
        //#line 575 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$117696 = layout_min1;
        
        //#line 575 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$117697 = ((t$117695) - (((long)(t$117696))));
        
        //#line 575 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        offset = t$117697;
        
        //#line 576 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final x10.core.Rail t$117698 = ((x10.core.Rail)(raw));
        
        //#line 576 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$117699 = offset;
        
        //#line 576 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        ((x10.core.Rail<$T>)t$117698).$set__1x10$lang$Rail$$T$G((long)(t$117699), (($T)(v)));
        
        //#line 577 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        return v;
    }
    
    
    //#line 594 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    public $T $set__3x10$regionarray$Array$$T$G(final long i0, final long i1, final long i2, final $T v) {
        
        //#line 598 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final x10.core.Rail t$117716 = ((x10.core.Rail)(raw));
        
        //#line 598 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final x10.regionarray.Array this$116957 = ((x10.regionarray.Array)(this));
        
        //#line 1206 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long i$116953 = i0;
        
        //#line 1206 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long i$116954 = i1;
        
        //#line 1206 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long i$116955 = i2;
        
        //#line 1206 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        long ret$116958 =  0;
        
        //#line 1207 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$119255 = ((x10.regionarray.Array<$T>)this$116957).layout_min0;
        
        //#line 1207 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        long offset$119256 = ((i$116953) - (((long)(t$119255))));
        
        //#line 1208 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$119257 = offset$119256;
        
        //#line 1208 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$119258 = ((x10.regionarray.Array<$T>)this$116957).layout_stride1;
        
        //#line 1208 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$119259 = ((t$119257) * (((long)(t$119258))));
        
        //#line 1208 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$119260 = ((t$119259) + (((long)(i$116954))));
        
        //#line 1208 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$119261 = ((x10.regionarray.Array<$T>)this$116957).layout_min1;
        
        //#line 1208 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$119262 = ((t$119260) - (((long)(t$119261))));
        
        //#line 1208 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        offset$119256 = t$119262;
        
        //#line 1209 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$119263 = offset$119256;
        
        //#line 1209 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final x10.core.Rail t$119264 = ((x10.core.Rail)(((x10.regionarray.Array<$T>)this$116957).layout));
        
        //#line 1209 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$119265 = ((long[])t$119264.value)[(int)0L];
        
        //#line 1209 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$119266 = ((t$119263) * (((long)(t$119265))));
        
        //#line 1209 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$119267 = ((t$119266) + (((long)(i$116955))));
        
        //#line 1209 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final x10.core.Rail t$119268 = ((x10.core.Rail)(((x10.regionarray.Array<$T>)this$116957).layout));
        
        //#line 1209 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$119269 = ((long[])t$119268.value)[(int)1L];
        
        //#line 1209 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$119270 = ((t$119267) - (((long)(t$119269))));
        
        //#line 1209 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        offset$119256 = t$119270;
        
        //#line 1210 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$119271 = offset$119256;
        
        //#line 1210 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        ret$116958 = t$119271;
        
        //#line 1206 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$117717 = ret$116958;
        
        //#line 598 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        ((x10.core.Rail<$T>)t$117716).$set__1x10$lang$Rail$$T$G((long)(t$117717), (($T)(v)));
        
        //#line 599 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        return v;
    }
    
    
    //#line 617 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    public $T $set__4x10$regionarray$Array$$T$G(final long i0, final long i1, final long i2, final long i3, final $T v) {
        
        //#line 621 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final x10.core.Rail t$117742 = ((x10.core.Rail)(raw));
        
        //#line 621 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final x10.regionarray.Array this$116965 = ((x10.regionarray.Array)(this));
        
        //#line 1213 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long i$116960 = i0;
        
        //#line 1213 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long i$116961 = i1;
        
        //#line 1213 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long i$116962 = i2;
        
        //#line 1213 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long i$116963 = i3;
        
        //#line 1213 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        long ret$116966 =  0;
        
        //#line 1214 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$119272 = ((x10.regionarray.Array<$T>)this$116965).layout_min0;
        
        //#line 1214 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        long offset$119273 = ((i$116960) - (((long)(t$119272))));
        
        //#line 1215 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$119274 = offset$119273;
        
        //#line 1215 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$119275 = ((x10.regionarray.Array<$T>)this$116965).layout_stride1;
        
        //#line 1215 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$119276 = ((t$119274) * (((long)(t$119275))));
        
        //#line 1215 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$119277 = ((t$119276) + (((long)(i$116961))));
        
        //#line 1215 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$119278 = ((x10.regionarray.Array<$T>)this$116965).layout_min1;
        
        //#line 1215 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$119279 = ((t$119277) - (((long)(t$119278))));
        
        //#line 1215 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        offset$119273 = t$119279;
        
        //#line 1216 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$119280 = offset$119273;
        
        //#line 1216 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final x10.core.Rail t$119281 = ((x10.core.Rail)(((x10.regionarray.Array<$T>)this$116965).layout));
        
        //#line 1216 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$119282 = ((long[])t$119281.value)[(int)0L];
        
        //#line 1216 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$119283 = ((t$119280) * (((long)(t$119282))));
        
        //#line 1216 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$119284 = ((t$119283) + (((long)(i$116962))));
        
        //#line 1216 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final x10.core.Rail t$119285 = ((x10.core.Rail)(((x10.regionarray.Array<$T>)this$116965).layout));
        
        //#line 1216 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$119286 = ((long[])t$119285.value)[(int)1L];
        
        //#line 1216 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$119287 = ((t$119284) - (((long)(t$119286))));
        
        //#line 1216 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        offset$119273 = t$119287;
        
        //#line 1217 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$119288 = offset$119273;
        
        //#line 1217 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final x10.core.Rail t$119289 = ((x10.core.Rail)(((x10.regionarray.Array<$T>)this$116965).layout));
        
        //#line 1217 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$119290 = ((long[])t$119289.value)[(int)2L];
        
        //#line 1217 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$119291 = ((t$119288) * (((long)(t$119290))));
        
        //#line 1217 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$119292 = ((t$119291) + (((long)(i$116963))));
        
        //#line 1217 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final x10.core.Rail t$119293 = ((x10.core.Rail)(((x10.regionarray.Array<$T>)this$116965).layout));
        
        //#line 1217 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$119294 = ((long[])t$119293.value)[(int)3L];
        
        //#line 1217 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$119295 = ((t$119292) - (((long)(t$119294))));
        
        //#line 1217 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        offset$119273 = t$119295;
        
        //#line 1218 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$119296 = offset$119273;
        
        //#line 1218 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        ret$116966 = t$119296;
        
        //#line 1213 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$117743 = ret$116966;
        
        //#line 621 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        ((x10.core.Rail<$T>)t$117742).$set__1x10$lang$Rail$$T$G((long)(t$117743), (($T)(v)));
        
        //#line 622 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        return v;
    }
    
    
    //#line 636 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    public $T $set__1x10$regionarray$Array$$T$G(final x10.lang.Point p, final $T v) {
        
        //#line 640 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final x10.core.Rail t$117777 = ((x10.core.Rail)(raw));
        
        //#line 640 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final x10.regionarray.Array this$116974 = ((x10.regionarray.Array)(this));
        
        //#line 1221 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final x10.lang.Point pt$116968 = ((x10.lang.Point)(p));
        
        //#line 1221 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        long ret$116975 =  0;
        
        //#line 1222 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$119319 = ((long)(((int)(0))));
        
        //#line 1222 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$119320 = pt$116968.$apply$O((long)(t$119319));
        
        //#line 1222 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$119321 = ((x10.regionarray.Array<$T>)this$116974).layout_min0;
        
        //#line 1222 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        long offset$119322 = ((t$119320) - (((long)(t$119321))));
        
        //#line 1223 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$119323 = pt$116968.rank;
        
        //#line 1223 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final boolean t$119324 = ((t$119323) > (((long)(1L))));
        
        //#line 1223 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        if (t$119324) {
            
            //#line 1224 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$119325 = offset$119322;
            
            //#line 1224 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$119326 = ((x10.regionarray.Array<$T>)this$116974).layout_stride1;
            
            //#line 1224 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$119327 = ((t$119325) * (((long)(t$119326))));
            
            //#line 1224 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$119328 = pt$116968.$apply$O((long)(1L));
            
            //#line 1224 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$119329 = ((t$119327) + (((long)(t$119328))));
            
            //#line 1224 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$119330 = ((x10.regionarray.Array<$T>)this$116974).layout_min1;
            
            //#line 1224 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$119331 = ((t$119329) - (((long)(t$119330))));
            
            //#line 1224 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            offset$119322 = t$119331;
            
            //#line 1225 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$119317 = pt$116968.rank;
            
            //#line 1225 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long i$116322max$119318 = ((t$119317) - (((long)(1L))));
            
            //#line 1225 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            long i$119314 = 2L;
            
            //#line 1225 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            for (;
                 true;
                 ) {
                
                //#line 1225 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$119315 = i$119314;
                
                //#line 1225 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final boolean t$119316 = ((t$119315) <= (((long)(i$116322max$119318))));
                
                //#line 1225 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                if (!(t$119316)) {
                    
                    //#line 1225 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    break;
                }
                
                //#line 1225 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long i$119311 = i$119314;
                
                //#line 1226 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$119297 = offset$119322;
                
                //#line 1226 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final x10.core.Rail t$119298 = ((x10.core.Rail)(((x10.regionarray.Array<$T>)this$116974).layout));
                
                //#line 1226 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$119299 = ((i$119311) - (((long)(2L))));
                
                //#line 1226 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$119300 = ((2L) * (((long)(t$119299))));
                
                //#line 1226 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$119301 = ((long[])t$119298.value)[(int)t$119300];
                
                //#line 1226 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$119302 = ((t$119297) * (((long)(t$119301))));
                
                //#line 1226 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$119303 = pt$116968.$apply$O((long)(i$119311));
                
                //#line 1226 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$119304 = ((t$119302) + (((long)(t$119303))));
                
                //#line 1226 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final x10.core.Rail t$119305 = ((x10.core.Rail)(((x10.regionarray.Array<$T>)this$116974).layout));
                
                //#line 1226 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$119306 = ((i$119311) - (((long)(2L))));
                
                //#line 1226 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$119307 = ((2L) * (((long)(t$119306))));
                
                //#line 1226 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$119308 = ((t$119307) + (((long)(1L))));
                
                //#line 1226 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$119309 = ((long[])t$119305.value)[(int)t$119308];
                
                //#line 1226 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$119310 = ((t$119304) - (((long)(t$119309))));
                
                //#line 1226 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                offset$119322 = t$119310;
                
                //#line 1225 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$119312 = i$119314;
                
                //#line 1225 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$119313 = ((t$119312) + (((long)(1L))));
                
                //#line 1225 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                i$119314 = t$119313;
            }
        }
        
        //#line 1229 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$119332 = offset$119322;
        
        //#line 1229 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        ret$116975 = t$119332;
        
        //#line 1221 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$117778 = ret$116975;
        
        //#line 640 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        ((x10.core.Rail<$T>)t$117777).$set__1x10$lang$Rail$$T$G((long)(t$117778), (($T)(v)));
        
        //#line 641 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        return v;
    }
    
    
    //#line 650 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    public void fill__0x10$regionarray$Array$$T(final $T v) {
        
        //#line 651 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final boolean t$117818 = rect;
        
        //#line 651 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        if (t$117818) {
            
            //#line 654 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.core.Rail t$117779 = ((x10.core.Rail)(raw));
            
            //#line 654 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ((x10.core.Rail<$T>)t$117779).fill__0x10$lang$Rail$$T((($T)(v)));
        } else {
            
            //#line 656 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.regionarray.Region t$117781 = ((x10.regionarray.Region)(region));
            
            //#line 656 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.lang.Iterator p$116308 = t$117781.iterator();
            
            //#line 656 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            for (;
                 true;
                 ) {
                
                //#line 656 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final boolean t$117817 = ((x10.lang.Iterator<x10.lang.Point>)p$116308).hasNext$O();
                
                //#line 656 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                if (!(t$117817)) {
                    
                    //#line 656 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    break;
                }
                
                //#line 656 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final x10.lang.Point p$119369 = ((x10.lang.Point)(((x10.lang.Iterator<x10.lang.Point>)p$116308).next$G()));
                
                //#line 657 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final x10.core.Rail t$119370 = ((x10.core.Rail)(raw));
                
                //#line 657 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final x10.regionarray.Array this$119371 = ((x10.regionarray.Array)(this));
                
                //#line 1221 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final x10.lang.Point pt$119372 = ((x10.lang.Point)(p$119369));
                
                //#line 1221 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                long ret$119373 =  0;
                
                //#line 1222 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$119355 = ((long)(((int)(0))));
                
                //#line 1222 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$119356 = pt$119372.$apply$O((long)(t$119355));
                
                //#line 1222 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$119357 = ((x10.regionarray.Array<$T>)this$119371).layout_min0;
                
                //#line 1222 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                long offset$119358 = ((t$119356) - (((long)(t$119357))));
                
                //#line 1223 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$119359 = pt$119372.rank;
                
                //#line 1223 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final boolean t$119360 = ((t$119359) > (((long)(1L))));
                
                //#line 1223 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                if (t$119360) {
                    
                    //#line 1224 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119361 = offset$119358;
                    
                    //#line 1224 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119362 = ((x10.regionarray.Array<$T>)this$119371).layout_stride1;
                    
                    //#line 1224 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119363 = ((t$119361) * (((long)(t$119362))));
                    
                    //#line 1224 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119364 = pt$119372.$apply$O((long)(1L));
                    
                    //#line 1224 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119365 = ((t$119363) + (((long)(t$119364))));
                    
                    //#line 1224 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119366 = ((x10.regionarray.Array<$T>)this$119371).layout_min1;
                    
                    //#line 1224 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119367 = ((t$119365) - (((long)(t$119366))));
                    
                    //#line 1224 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    offset$119358 = t$119367;
                    
                    //#line 1225 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119353 = pt$119372.rank;
                    
                    //#line 1225 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long i$116322max$119354 = ((t$119353) - (((long)(1L))));
                    
                    //#line 1225 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    long i$119350 = 2L;
                    
                    //#line 1225 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    for (;
                         true;
                         ) {
                        
                        //#line 1225 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final long t$119351 = i$119350;
                        
                        //#line 1225 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final boolean t$119352 = ((t$119351) <= (((long)(i$116322max$119354))));
                        
                        //#line 1225 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        if (!(t$119352)) {
                            
                            //#line 1225 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                            break;
                        }
                        
                        //#line 1225 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final long i$119347 = i$119350;
                        
                        //#line 1226 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final long t$119333 = offset$119358;
                        
                        //#line 1226 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final x10.core.Rail t$119334 = ((x10.core.Rail)(((x10.regionarray.Array<$T>)this$119371).layout));
                        
                        //#line 1226 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final long t$119335 = ((i$119347) - (((long)(2L))));
                        
                        //#line 1226 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final long t$119336 = ((2L) * (((long)(t$119335))));
                        
                        //#line 1226 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final long t$119337 = ((long[])t$119334.value)[(int)t$119336];
                        
                        //#line 1226 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final long t$119338 = ((t$119333) * (((long)(t$119337))));
                        
                        //#line 1226 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final long t$119339 = pt$119372.$apply$O((long)(i$119347));
                        
                        //#line 1226 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final long t$119340 = ((t$119338) + (((long)(t$119339))));
                        
                        //#line 1226 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final x10.core.Rail t$119341 = ((x10.core.Rail)(((x10.regionarray.Array<$T>)this$119371).layout));
                        
                        //#line 1226 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final long t$119342 = ((i$119347) - (((long)(2L))));
                        
                        //#line 1226 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final long t$119343 = ((2L) * (((long)(t$119342))));
                        
                        //#line 1226 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final long t$119344 = ((t$119343) + (((long)(1L))));
                        
                        //#line 1226 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final long t$119345 = ((long[])t$119341.value)[(int)t$119344];
                        
                        //#line 1226 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final long t$119346 = ((t$119340) - (((long)(t$119345))));
                        
                        //#line 1226 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        offset$119358 = t$119346;
                        
                        //#line 1225 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final long t$119348 = i$119350;
                        
                        //#line 1225 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final long t$119349 = ((t$119348) + (((long)(1L))));
                        
                        //#line 1225 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        i$119350 = t$119349;
                    }
                }
                
                //#line 1229 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$119368 = offset$119358;
                
                //#line 1229 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                ret$119373 = t$119368;
                
                //#line 1221 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$119374 = ret$119373;
                
                //#line 657 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                ((x10.core.Rail<$T>)t$119370).$set__1x10$lang$Rail$$T$G((long)(t$119374), (($T)(v)));
            }
        }
    }
    
    
    //#line 667 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    public void clear() {
        
        //#line 668 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final x10.core.Rail t$117820 = ((x10.core.Rail)(raw));
        
        //#line 668 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final x10.core.Rail t$117819 = ((x10.core.Rail)(raw));
        
        //#line 668 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$117821 = ((x10.core.Rail<$T>)t$117819).size;
        
        //#line 668 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        ((x10.core.Rail<$T>)t$117820).clear((long)(0L), (long)(t$117821));
    }
    
    
    //#line 684 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    public <$U>x10.regionarray.Array map__0$1x10$regionarray$Array$$T$3x10$regionarray$Array$$U$2(final x10.rtt.Type $U, final x10.core.fun.Fun_0_1 op) {
        
        //#line 685 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final x10.regionarray.Array alloc$116225 = ((x10.regionarray.Array)(new x10.regionarray.Array<$U>((java.lang.System[]) null, $U)));
        
        //#line 172 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final x10.regionarray.Region reg$116998 = ((x10.regionarray.Region)(region));
        
        //#line 174 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final x10.regionarray.Region t$119462 = ((x10.regionarray.Region)(((x10.regionarray.Region)
                                                                            reg$116998)));
        
        //#line 174 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        ((x10.regionarray.Array<$U>)alloc$116225).region = ((x10.regionarray.Region)(t$119462));
        
        //#line 174 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$119463 = reg$116998.rank;
        
        //#line 174 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        ((x10.regionarray.Array<$U>)alloc$116225).rank = t$119463;
        
        //#line 174 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final boolean t$119464 = reg$116998.rect;
        
        //#line 174 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        ((x10.regionarray.Array<$U>)alloc$116225).rect = t$119464;
        
        //#line 174 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final boolean t$119465 = reg$116998.zeroBased;
        
        //#line 174 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        ((x10.regionarray.Array<$U>)alloc$116225).zeroBased = t$119465;
        
        //#line 174 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final boolean t$119466 = reg$116998.rail;
        
        //#line 174 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        ((x10.regionarray.Array<$U>)alloc$116225).rail = t$119466;
        
        //#line 174 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$119467 = reg$116998.size$O();
        
        //#line 174 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        ((x10.regionarray.Array<$U>)alloc$116225).size = t$119467;
        {
            
        }
        
        //#line 175 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final x10.regionarray.Array.LayoutHelper crh$119470 = new x10.regionarray.Array.LayoutHelper((java.lang.System[]) null);
        
        //#line 175 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        crh$119470.x10$regionarray$Array$LayoutHelper$$init$S(((x10.regionarray.Region)(reg$116998)));
        
        //#line 176 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$119471 = crh$119470.min0;
        
        //#line 176 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        ((x10.regionarray.Array<$U>)alloc$116225).layout_min0 = t$119471;
        
        //#line 177 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$119472 = crh$119470.stride1;
        
        //#line 177 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        ((x10.regionarray.Array<$U>)alloc$116225).layout_stride1 = t$119472;
        
        //#line 178 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$119473 = crh$119470.min1;
        
        //#line 178 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        ((x10.regionarray.Array<$U>)alloc$116225).layout_min1 = t$119473;
        
        //#line 179 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final x10.core.Rail t$119474 = ((x10.core.Rail)(crh$119470.layout));
        
        //#line 179 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        ((x10.regionarray.Array<$U>)alloc$116225).layout = ((x10.core.Rail)(t$119474));
        
        //#line 180 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long n$119475 = crh$119470.size;
        
        //#line 181 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final x10.core.Rail r$119476 = ((x10.core.Rail)(x10.core.Rail.<$U>makeUnsafe($U, ((long)(n$119475)), false)));
        
        //#line 182 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final x10.lang.Iterator p$119468 = reg$116998.iterator();
        
        //#line 182 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        for (;
             true;
             ) {
            
            //#line 182 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final boolean t$119469 = ((x10.lang.Iterator<x10.lang.Point>)p$119468).hasNext$O();
            
            //#line 182 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            if (!(t$119469)) {
                
                //#line 182 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                break;
            }
            
            //#line 182 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.lang.Point p$119452 = ((x10.lang.Point)(((x10.lang.Iterator<x10.lang.Point>)p$119468).next$G()));
            
            //#line 1221 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.lang.Point pt$119453 = ((x10.lang.Point)(p$119452));
            
            //#line 1221 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            long ret$119454 =  0;
            
            //#line 1222 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$119433 = ((long)(((int)(0))));
            
            //#line 1222 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$119434 = pt$119453.$apply$O((long)(t$119433));
            
            //#line 1222 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$119435 = ((x10.regionarray.Array<$U>)alloc$116225).layout_min0;
            
            //#line 1222 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            long offset$119436 = ((t$119434) - (((long)(t$119435))));
            
            //#line 1223 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$119437 = pt$119453.rank;
            
            //#line 1223 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final boolean t$119438 = ((t$119437) > (((long)(1L))));
            
            //#line 1223 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            if (t$119438) {
                
                //#line 1224 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$119439 = offset$119436;
                
                //#line 1224 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$119440 = ((x10.regionarray.Array<$U>)alloc$116225).layout_stride1;
                
                //#line 1224 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$119441 = ((t$119439) * (((long)(t$119440))));
                
                //#line 1224 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$119442 = pt$119453.$apply$O((long)(1L));
                
                //#line 1224 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$119443 = ((t$119441) + (((long)(t$119442))));
                
                //#line 1224 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$119444 = ((x10.regionarray.Array<$U>)alloc$116225).layout_min1;
                
                //#line 1224 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$119445 = ((t$119443) - (((long)(t$119444))));
                
                //#line 1224 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                offset$119436 = t$119445;
                
                //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$119395 = pt$119453.rank;
                
                //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long i$116322max$119396 = ((t$119395) - (((long)(1L))));
                
                //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                long i$119392 = 2L;
                
                //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                for (;
                     true;
                     ) {
                    
                    //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119393 = i$119392;
                    
                    //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final boolean t$119394 = ((t$119393) <= (((long)(i$116322max$119396))));
                    
                    //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    if (!(t$119394)) {
                        
                        //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        break;
                    }
                    
                    //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long i$119389 = i$119392;
                    
                    //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119375 = offset$119436;
                    
                    //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final x10.core.Rail t$119376 = ((x10.core.Rail)(((x10.regionarray.Array<$U>)alloc$116225).layout));
                    
                    //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119377 = ((i$119389) - (((long)(2L))));
                    
                    //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119378 = ((2L) * (((long)(t$119377))));
                    
                    //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119379 = ((long[])t$119376.value)[(int)t$119378];
                    
                    //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119380 = ((t$119375) * (((long)(t$119379))));
                    
                    //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119381 = pt$119453.$apply$O((long)(i$119389));
                    
                    //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119382 = ((t$119380) + (((long)(t$119381))));
                    
                    //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final x10.core.Rail t$119383 = ((x10.core.Rail)(((x10.regionarray.Array<$U>)alloc$116225).layout));
                    
                    //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119384 = ((i$119389) - (((long)(2L))));
                    
                    //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119385 = ((2L) * (((long)(t$119384))));
                    
                    //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119386 = ((t$119385) + (((long)(1L))));
                    
                    //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119387 = ((long[])t$119383.value)[(int)t$119386];
                    
                    //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119388 = ((t$119382) - (((long)(t$119387))));
                    
                    //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    offset$119436 = t$119388;
                    
                    //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119390 = i$119392;
                    
                    //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119391 = ((t$119390) + (((long)(1L))));
                    
                    //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    i$119392 = t$119391;
                }
            }
            
            //#line 1229 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$119446 = offset$119436;
            
            //#line 1229 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ret$119454 = t$119446;
            
            //#line 1221 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$119455 = ret$119454;
            
            //#line 685 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.lang.Point p$119456 = ((x10.lang.Point)(p$119452));
            
            //#line 685 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.regionarray.Array this$119457 = ((x10.regionarray.Array)(this));
            
            //#line 523 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.lang.Point pt$119458 = ((x10.lang.Point)(p$119456));
            
            //#line 523 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            $T ret$119459 =  null;
            
            //#line 527 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.core.Rail t$119447 = ((x10.core.Rail)(((x10.regionarray.Array<$T>)this$119457).raw));
            
            //#line 1221 .... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.lang.Point pt$119448 = ((x10.lang.Point)(pt$119458));
            
            //#line 1221 .... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            long ret$119449 =  0;
            
            //#line 1222 .... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$119419 = ((long)(((int)(0))));
            
            //#line 1222 .... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$119420 = pt$119448.$apply$O((long)(t$119419));
            
            //#line 1222 .... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$119421 = ((x10.regionarray.Array<$T>)this$119457).layout_min0;
            
            //#line 1222 .... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            long offset$119422 = ((t$119420) - (((long)(t$119421))));
            
            //#line 1223 .... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$119423 = pt$119448.rank;
            
            //#line 1223 .... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final boolean t$119424 = ((t$119423) > (((long)(1L))));
            
            //#line 1223 .... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            if (t$119424) {
                
                //#line 1224 .... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$119425 = offset$119422;
                
                //#line 1224 .... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$119426 = ((x10.regionarray.Array<$T>)this$119457).layout_stride1;
                
                //#line 1224 .... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$119427 = ((t$119425) * (((long)(t$119426))));
                
                //#line 1224 .... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$119428 = pt$119448.$apply$O((long)(1L));
                
                //#line 1224 .... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$119429 = ((t$119427) + (((long)(t$119428))));
                
                //#line 1224 .... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$119430 = ((x10.regionarray.Array<$T>)this$119457).layout_min1;
                
                //#line 1224 .... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$119431 = ((t$119429) - (((long)(t$119430))));
                
                //#line 1224 .... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                offset$119422 = t$119431;
                
                //#line 1225 .... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$119417 = pt$119448.rank;
                
                //#line 1225 .... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long i$116322max$119418 = ((t$119417) - (((long)(1L))));
                
                //#line 1225 .... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                long i$119414 = 2L;
                
                //#line 1225 .... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                for (;
                     true;
                     ) {
                    
                    //#line 1225 .... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119415 = i$119414;
                    
                    //#line 1225 .... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final boolean t$119416 = ((t$119415) <= (((long)(i$116322max$119418))));
                    
                    //#line 1225 .... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    if (!(t$119416)) {
                        
                        //#line 1225 .... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        break;
                    }
                    
                    //#line 1225 .... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long i$119411 = i$119414;
                    
                    //#line 1226 .... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119397 = offset$119422;
                    
                    //#line 1226 .... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final x10.core.Rail t$119398 = ((x10.core.Rail)(((x10.regionarray.Array<$T>)this$119457).layout));
                    
                    //#line 1226 .... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119399 = ((i$119411) - (((long)(2L))));
                    
                    //#line 1226 .... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119400 = ((2L) * (((long)(t$119399))));
                    
                    //#line 1226 .... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119401 = ((long[])t$119398.value)[(int)t$119400];
                    
                    //#line 1226 .... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119402 = ((t$119397) * (((long)(t$119401))));
                    
                    //#line 1226 .... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119403 = pt$119448.$apply$O((long)(i$119411));
                    
                    //#line 1226 .... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119404 = ((t$119402) + (((long)(t$119403))));
                    
                    //#line 1226 .... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final x10.core.Rail t$119405 = ((x10.core.Rail)(((x10.regionarray.Array<$T>)this$119457).layout));
                    
                    //#line 1226 .... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119406 = ((i$119411) - (((long)(2L))));
                    
                    //#line 1226 .... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119407 = ((2L) * (((long)(t$119406))));
                    
                    //#line 1226 .... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119408 = ((t$119407) + (((long)(1L))));
                    
                    //#line 1226 .... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119409 = ((long[])t$119405.value)[(int)t$119408];
                    
                    //#line 1226 .... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119410 = ((t$119404) - (((long)(t$119409))));
                    
                    //#line 1226 .... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    offset$119422 = t$119410;
                    
                    //#line 1225 .... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119412 = i$119414;
                    
                    //#line 1225 .... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119413 = ((t$119412) + (((long)(1L))));
                    
                    //#line 1225 .... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    i$119414 = t$119413;
                }
            }
            
            //#line 1229 .... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$119432 = offset$119422;
            
            //#line 1229 .... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ret$119449 = t$119432;
            
            //#line 1221 .... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$119450 = ret$119449;
            
            //#line 527 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final $T t$119451 = (($T)(((x10.core.Rail<$T>)t$119447).$apply$G((long)(t$119450))));
            
            //#line 527 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ret$119459 = (($T)(t$119451));
            
            //#line 523 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final $T t$119460 = (($T)(ret$119459));
            
            //#line 685 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final $U t$119461 = (($U)((($U)
                                        ((x10.core.fun.Fun_0_1<$T,$U>)op).$apply(t$119460, $T))));
            
            //#line 183 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ((x10.core.Rail<$U>)r$119476).$set__1x10$lang$Rail$$T$G((long)(t$119455), (($U)(t$119461)));
        }
        
        //#line 185 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        ((x10.regionarray.Array<$U>)alloc$116225).raw = ((x10.core.Rail)(r$119476));
        
        //#line 685 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        return alloc$116225;
    }
    
    
    //#line 702 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    public <$U>x10.regionarray.Array map__0$1x10$regionarray$Array$$U$2__1$1x10$regionarray$Array$$T$3x10$regionarray$Array$$U$2(final x10.rtt.Type $U, final x10.regionarray.Array dst, final x10.core.fun.Fun_0_1 op) {
        
        //#line 704 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final boolean t$117988 = rect;
        
        //#line 704 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        if (t$117988) {
            
            //#line 150 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
            final x10.core.Rail src$117028 = ((x10.core.Rail)(raw));
            
            //#line 150 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
            final x10.core.Rail dst$117029 = ((x10.core.Rail)(((x10.regionarray.Array<$U>)dst).raw));
            
            //#line 151 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
            final x10.core.fun.Fun_0_1 op$117030 = ((x10.core.fun.Fun_0_1)(op));
            
            //#line 150 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
            x10.core.Rail ret$117036 =  null;
            
            //#line 155 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
            final x10.core.Rail rail$119485 = ((x10.core.Rail)(src$117028));
            
            //#line 155 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
            final long i$70697max$119486 = ((x10.core.Rail<$T>)rail$119485).size;
            
            //#line 155 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
            long i$119482 = 0L;
            
            //#line 155 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
            for (;
                 true;
                 ) {
                
                //#line 155 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
                final long t$119483 = i$119482;
                
                //#line 155 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
                final boolean t$119484 = ((t$119483) < (((long)(i$70697max$119486))));
                
                //#line 155 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
                if (!(t$119484)) {
                    
                    //#line 155 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
                    break;
                }
                
                //#line 155 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
                final long i$119479 = i$119482;
                
                //#line 156 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
                final $T t$119477 = (($T)(((x10.core.Rail<$T>)src$117028).$apply$G((long)(i$119479))));
                
                //#line 156 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
                final $U t$119478 = (($U)((($U)
                                            ((x10.core.fun.Fun_0_1<$T,$U>)op$117030).$apply(t$119477, $T))));
                
                //#line 156 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
                ((x10.core.Rail<$U>)dst$117029).$set__1x10$lang$Rail$$T$G((long)(i$119479), (($U)(t$119478)));
                
                //#line 155 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
                final long t$119480 = i$119482;
                
                //#line 155 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
                final long t$119481 = ((t$119480) + (((long)(1L))));
                
                //#line 155 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
                i$119482 = t$119481;
            }
            
            //#line 158 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
            ret$117036 = ((x10.core.Rail)(dst$117029));
            
            //#line 709 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            return dst;
        } else {
            
            //#line 711 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.regionarray.Region t$117914 = ((x10.regionarray.Region)(region));
            
            //#line 711 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.lang.Iterator p$116310 = t$117914.iterator();
            
            //#line 711 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            for (;
                 true;
                 ) {
                
                //#line 711 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final boolean t$117987 = ((x10.lang.Iterator<x10.lang.Point>)p$116310).hasNext$O();
                
                //#line 711 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                if (!(t$117987)) {
                    
                    //#line 711 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    break;
                }
                
                //#line 711 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final x10.lang.Point p$119568 = ((x10.lang.Point)(((x10.lang.Iterator<x10.lang.Point>)p$116310).next$G()));
                
                //#line 636 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final x10.lang.Point p$119569 = ((x10.lang.Point)(p$119568));
                
                //#line 712 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final x10.regionarray.Array this$119570 = ((x10.regionarray.Array)(this));
                
                //#line 523 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final x10.lang.Point pt$119571 = ((x10.lang.Point)(p$119568));
                
                //#line 523 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                $T ret$119572 =  null;
                
                //#line 527 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final x10.core.Rail t$119559 = ((x10.core.Rail)(((x10.regionarray.Array<$T>)this$119570).raw));
                
                //#line 1221 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final x10.lang.Point pt$119560 = ((x10.lang.Point)(pt$119571));
                
                //#line 1221 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                long ret$119561 =  0;
                
                //#line 1222 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$119509 = ((long)(((int)(0))));
                
                //#line 1222 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$119510 = pt$119560.$apply$O((long)(t$119509));
                
                //#line 1222 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$119511 = ((x10.regionarray.Array<$T>)this$119570).layout_min0;
                
                //#line 1222 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                long offset$119512 = ((t$119510) - (((long)(t$119511))));
                
                //#line 1223 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$119513 = pt$119560.rank;
                
                //#line 1223 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final boolean t$119514 = ((t$119513) > (((long)(1L))));
                
                //#line 1223 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                if (t$119514) {
                    
                    //#line 1224 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119515 = offset$119512;
                    
                    //#line 1224 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119516 = ((x10.regionarray.Array<$T>)this$119570).layout_stride1;
                    
                    //#line 1224 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119517 = ((t$119515) * (((long)(t$119516))));
                    
                    //#line 1224 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119518 = pt$119560.$apply$O((long)(1L));
                    
                    //#line 1224 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119519 = ((t$119517) + (((long)(t$119518))));
                    
                    //#line 1224 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119520 = ((x10.regionarray.Array<$T>)this$119570).layout_min1;
                    
                    //#line 1224 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119521 = ((t$119519) - (((long)(t$119520))));
                    
                    //#line 1224 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    offset$119512 = t$119521;
                    
                    //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119507 = pt$119560.rank;
                    
                    //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long i$116322max$119508 = ((t$119507) - (((long)(1L))));
                    
                    //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    long i$119504 = 2L;
                    
                    //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    for (;
                         true;
                         ) {
                        
                        //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final long t$119505 = i$119504;
                        
                        //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final boolean t$119506 = ((t$119505) <= (((long)(i$116322max$119508))));
                        
                        //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        if (!(t$119506)) {
                            
                            //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                            break;
                        }
                        
                        //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final long i$119501 = i$119504;
                        
                        //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final long t$119487 = offset$119512;
                        
                        //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final x10.core.Rail t$119488 = ((x10.core.Rail)(((x10.regionarray.Array<$T>)this$119570).layout));
                        
                        //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final long t$119489 = ((i$119501) - (((long)(2L))));
                        
                        //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final long t$119490 = ((2L) * (((long)(t$119489))));
                        
                        //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final long t$119491 = ((long[])t$119488.value)[(int)t$119490];
                        
                        //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final long t$119492 = ((t$119487) * (((long)(t$119491))));
                        
                        //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final long t$119493 = pt$119560.$apply$O((long)(i$119501));
                        
                        //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final long t$119494 = ((t$119492) + (((long)(t$119493))));
                        
                        //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final x10.core.Rail t$119495 = ((x10.core.Rail)(((x10.regionarray.Array<$T>)this$119570).layout));
                        
                        //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final long t$119496 = ((i$119501) - (((long)(2L))));
                        
                        //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final long t$119497 = ((2L) * (((long)(t$119496))));
                        
                        //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final long t$119498 = ((t$119497) + (((long)(1L))));
                        
                        //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final long t$119499 = ((long[])t$119495.value)[(int)t$119498];
                        
                        //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final long t$119500 = ((t$119494) - (((long)(t$119499))));
                        
                        //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        offset$119512 = t$119500;
                        
                        //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final long t$119502 = i$119504;
                        
                        //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final long t$119503 = ((t$119502) + (((long)(1L))));
                        
                        //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        i$119504 = t$119503;
                    }
                }
                
                //#line 1229 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$119522 = offset$119512;
                
                //#line 1229 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                ret$119561 = t$119522;
                
                //#line 1221 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$119562 = ret$119561;
                
                //#line 527 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final $T t$119563 = (($T)(((x10.core.Rail<$T>)t$119559).$apply$G((long)(t$119562))));
                
                //#line 527 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                ret$119572 = (($T)(t$119563));
                
                //#line 523 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final $T t$119573 = (($T)(ret$119572));
                
                //#line 636 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final $U v$119574 = (($U)((($U)
                                            ((x10.core.fun.Fun_0_1<$T,$U>)op).$apply(t$119573, $T))));
                
                //#line 636 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                $U ret$119575 =  null;
                
                //#line 640 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final x10.core.Rail t$119564 = ((x10.core.Rail)(((x10.regionarray.Array<$U>)dst).raw));
                
                //#line 1221 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final x10.lang.Point pt$119565 = ((x10.lang.Point)(p$119569));
                
                //#line 1221 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                long ret$119566 =  0;
                
                //#line 1222 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$119545 = ((long)(((int)(0))));
                
                //#line 1222 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$119546 = pt$119565.$apply$O((long)(t$119545));
                
                //#line 1222 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$119547 = ((x10.regionarray.Array<$U>)dst).layout_min0;
                
                //#line 1222 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                long offset$119548 = ((t$119546) - (((long)(t$119547))));
                
                //#line 1223 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$119549 = pt$119565.rank;
                
                //#line 1223 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final boolean t$119550 = ((t$119549) > (((long)(1L))));
                
                //#line 1223 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                if (t$119550) {
                    
                    //#line 1224 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119551 = offset$119548;
                    
                    //#line 1224 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119552 = ((x10.regionarray.Array<$U>)dst).layout_stride1;
                    
                    //#line 1224 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119553 = ((t$119551) * (((long)(t$119552))));
                    
                    //#line 1224 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119554 = pt$119565.$apply$O((long)(1L));
                    
                    //#line 1224 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119555 = ((t$119553) + (((long)(t$119554))));
                    
                    //#line 1224 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119556 = ((x10.regionarray.Array<$U>)dst).layout_min1;
                    
                    //#line 1224 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119557 = ((t$119555) - (((long)(t$119556))));
                    
                    //#line 1224 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    offset$119548 = t$119557;
                    
                    //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119543 = pt$119565.rank;
                    
                    //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long i$116322max$119544 = ((t$119543) - (((long)(1L))));
                    
                    //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    long i$119540 = 2L;
                    
                    //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    for (;
                         true;
                         ) {
                        
                        //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final long t$119541 = i$119540;
                        
                        //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final boolean t$119542 = ((t$119541) <= (((long)(i$116322max$119544))));
                        
                        //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        if (!(t$119542)) {
                            
                            //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                            break;
                        }
                        
                        //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final long i$119537 = i$119540;
                        
                        //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final long t$119523 = offset$119548;
                        
                        //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final x10.core.Rail t$119524 = ((x10.core.Rail)(((x10.regionarray.Array<$U>)dst).layout));
                        
                        //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final long t$119525 = ((i$119537) - (((long)(2L))));
                        
                        //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final long t$119526 = ((2L) * (((long)(t$119525))));
                        
                        //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final long t$119527 = ((long[])t$119524.value)[(int)t$119526];
                        
                        //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final long t$119528 = ((t$119523) * (((long)(t$119527))));
                        
                        //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final long t$119529 = pt$119565.$apply$O((long)(i$119537));
                        
                        //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final long t$119530 = ((t$119528) + (((long)(t$119529))));
                        
                        //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final x10.core.Rail t$119531 = ((x10.core.Rail)(((x10.regionarray.Array<$U>)dst).layout));
                        
                        //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final long t$119532 = ((i$119537) - (((long)(2L))));
                        
                        //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final long t$119533 = ((2L) * (((long)(t$119532))));
                        
                        //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final long t$119534 = ((t$119533) + (((long)(1L))));
                        
                        //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final long t$119535 = ((long[])t$119531.value)[(int)t$119534];
                        
                        //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final long t$119536 = ((t$119530) - (((long)(t$119535))));
                        
                        //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        offset$119548 = t$119536;
                        
                        //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final long t$119538 = i$119540;
                        
                        //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final long t$119539 = ((t$119538) + (((long)(1L))));
                        
                        //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        i$119540 = t$119539;
                    }
                }
                
                //#line 1229 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$119558 = offset$119548;
                
                //#line 1229 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                ret$119566 = t$119558;
                
                //#line 1221 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$119567 = ret$119566;
                
                //#line 640 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                ((x10.core.Rail<$U>)t$119564).$set__1x10$lang$Rail$$T$G((long)(t$119567), (($U)(v$119574)));
                
                //#line 641 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                ret$119575 = (($U)(v$119574));
            }
        }
        
        //#line 715 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        return dst;
    }
    
    
    //#line 733 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    public <$U>x10.regionarray.Array map__0$1x10$regionarray$Array$$U$2__2$1x10$regionarray$Array$$T$3x10$regionarray$Array$$U$2(final x10.rtt.Type $U, final x10.regionarray.Array dst, final x10.regionarray.Region filter, final x10.core.fun.Fun_0_1 op) {
        
        //#line 734 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final x10.regionarray.Region t$117989 = ((x10.regionarray.Region)(region));
        
        //#line 734 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final x10.regionarray.Region fregion = ((x10.regionarray.Region)(t$117989.$and(((x10.regionarray.Region)(filter)))));
        
        //#line 735 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final x10.lang.Iterator p$119665 = fregion.iterator();
        
        //#line 735 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        for (;
             true;
             ) {
            
            //#line 735 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final boolean t$119666 = ((x10.lang.Iterator<x10.lang.Point>)p$119665).hasNext$O();
            
            //#line 735 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            if (!(t$119666)) {
                
                //#line 735 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                break;
            }
            
            //#line 735 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.lang.Point p$119657 = ((x10.lang.Point)(((x10.lang.Iterator<x10.lang.Point>)p$119665).next$G()));
            
            //#line 636 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.lang.Point p$119658 = ((x10.lang.Point)(p$119657));
            
            //#line 736 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.regionarray.Array this$119659 = ((x10.regionarray.Array)(this));
            
            //#line 523 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.lang.Point pt$119660 = ((x10.lang.Point)(p$119657));
            
            //#line 523 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            $T ret$119661 =  null;
            
            //#line 527 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.core.Rail t$119648 = ((x10.core.Rail)(((x10.regionarray.Array<$T>)this$119659).raw));
            
            //#line 1221 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.lang.Point pt$119649 = ((x10.lang.Point)(pt$119660));
            
            //#line 1221 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            long ret$119650 =  0;
            
            //#line 1222 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$119598 = ((long)(((int)(0))));
            
            //#line 1222 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$119599 = pt$119649.$apply$O((long)(t$119598));
            
            //#line 1222 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$119600 = ((x10.regionarray.Array<$T>)this$119659).layout_min0;
            
            //#line 1222 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            long offset$119601 = ((t$119599) - (((long)(t$119600))));
            
            //#line 1223 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$119602 = pt$119649.rank;
            
            //#line 1223 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final boolean t$119603 = ((t$119602) > (((long)(1L))));
            
            //#line 1223 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            if (t$119603) {
                
                //#line 1224 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$119604 = offset$119601;
                
                //#line 1224 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$119605 = ((x10.regionarray.Array<$T>)this$119659).layout_stride1;
                
                //#line 1224 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$119606 = ((t$119604) * (((long)(t$119605))));
                
                //#line 1224 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$119607 = pt$119649.$apply$O((long)(1L));
                
                //#line 1224 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$119608 = ((t$119606) + (((long)(t$119607))));
                
                //#line 1224 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$119609 = ((x10.regionarray.Array<$T>)this$119659).layout_min1;
                
                //#line 1224 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$119610 = ((t$119608) - (((long)(t$119609))));
                
                //#line 1224 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                offset$119601 = t$119610;
                
                //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$119596 = pt$119649.rank;
                
                //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long i$116322max$119597 = ((t$119596) - (((long)(1L))));
                
                //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                long i$119593 = 2L;
                
                //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                for (;
                     true;
                     ) {
                    
                    //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119594 = i$119593;
                    
                    //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final boolean t$119595 = ((t$119594) <= (((long)(i$116322max$119597))));
                    
                    //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    if (!(t$119595)) {
                        
                        //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        break;
                    }
                    
                    //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long i$119590 = i$119593;
                    
                    //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119576 = offset$119601;
                    
                    //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final x10.core.Rail t$119577 = ((x10.core.Rail)(((x10.regionarray.Array<$T>)this$119659).layout));
                    
                    //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119578 = ((i$119590) - (((long)(2L))));
                    
                    //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119579 = ((2L) * (((long)(t$119578))));
                    
                    //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119580 = ((long[])t$119577.value)[(int)t$119579];
                    
                    //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119581 = ((t$119576) * (((long)(t$119580))));
                    
                    //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119582 = pt$119649.$apply$O((long)(i$119590));
                    
                    //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119583 = ((t$119581) + (((long)(t$119582))));
                    
                    //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final x10.core.Rail t$119584 = ((x10.core.Rail)(((x10.regionarray.Array<$T>)this$119659).layout));
                    
                    //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119585 = ((i$119590) - (((long)(2L))));
                    
                    //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119586 = ((2L) * (((long)(t$119585))));
                    
                    //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119587 = ((t$119586) + (((long)(1L))));
                    
                    //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119588 = ((long[])t$119584.value)[(int)t$119587];
                    
                    //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119589 = ((t$119583) - (((long)(t$119588))));
                    
                    //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    offset$119601 = t$119589;
                    
                    //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119591 = i$119593;
                    
                    //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119592 = ((t$119591) + (((long)(1L))));
                    
                    //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    i$119593 = t$119592;
                }
            }
            
            //#line 1229 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$119611 = offset$119601;
            
            //#line 1229 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ret$119650 = t$119611;
            
            //#line 1221 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$119651 = ret$119650;
            
            //#line 527 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final $T t$119652 = (($T)(((x10.core.Rail<$T>)t$119648).$apply$G((long)(t$119651))));
            
            //#line 527 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ret$119661 = (($T)(t$119652));
            
            //#line 523 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final $T t$119662 = (($T)(ret$119661));
            
            //#line 636 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final $U v$119663 = (($U)((($U)
                                        ((x10.core.fun.Fun_0_1<$T,$U>)op).$apply(t$119662, $T))));
            
            //#line 636 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            $U ret$119664 =  null;
            
            //#line 640 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.core.Rail t$119653 = ((x10.core.Rail)(((x10.regionarray.Array<$U>)dst).raw));
            
            //#line 1221 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.lang.Point pt$119654 = ((x10.lang.Point)(p$119658));
            
            //#line 1221 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            long ret$119655 =  0;
            
            //#line 1222 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$119634 = ((long)(((int)(0))));
            
            //#line 1222 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$119635 = pt$119654.$apply$O((long)(t$119634));
            
            //#line 1222 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$119636 = ((x10.regionarray.Array<$U>)dst).layout_min0;
            
            //#line 1222 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            long offset$119637 = ((t$119635) - (((long)(t$119636))));
            
            //#line 1223 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$119638 = pt$119654.rank;
            
            //#line 1223 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final boolean t$119639 = ((t$119638) > (((long)(1L))));
            
            //#line 1223 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            if (t$119639) {
                
                //#line 1224 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$119640 = offset$119637;
                
                //#line 1224 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$119641 = ((x10.regionarray.Array<$U>)dst).layout_stride1;
                
                //#line 1224 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$119642 = ((t$119640) * (((long)(t$119641))));
                
                //#line 1224 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$119643 = pt$119654.$apply$O((long)(1L));
                
                //#line 1224 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$119644 = ((t$119642) + (((long)(t$119643))));
                
                //#line 1224 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$119645 = ((x10.regionarray.Array<$U>)dst).layout_min1;
                
                //#line 1224 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$119646 = ((t$119644) - (((long)(t$119645))));
                
                //#line 1224 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                offset$119637 = t$119646;
                
                //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$119632 = pt$119654.rank;
                
                //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long i$116322max$119633 = ((t$119632) - (((long)(1L))));
                
                //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                long i$119629 = 2L;
                
                //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                for (;
                     true;
                     ) {
                    
                    //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119630 = i$119629;
                    
                    //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final boolean t$119631 = ((t$119630) <= (((long)(i$116322max$119633))));
                    
                    //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    if (!(t$119631)) {
                        
                        //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        break;
                    }
                    
                    //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long i$119626 = i$119629;
                    
                    //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119612 = offset$119637;
                    
                    //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final x10.core.Rail t$119613 = ((x10.core.Rail)(((x10.regionarray.Array<$U>)dst).layout));
                    
                    //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119614 = ((i$119626) - (((long)(2L))));
                    
                    //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119615 = ((2L) * (((long)(t$119614))));
                    
                    //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119616 = ((long[])t$119613.value)[(int)t$119615];
                    
                    //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119617 = ((t$119612) * (((long)(t$119616))));
                    
                    //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119618 = pt$119654.$apply$O((long)(i$119626));
                    
                    //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119619 = ((t$119617) + (((long)(t$119618))));
                    
                    //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final x10.core.Rail t$119620 = ((x10.core.Rail)(((x10.regionarray.Array<$U>)dst).layout));
                    
                    //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119621 = ((i$119626) - (((long)(2L))));
                    
                    //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119622 = ((2L) * (((long)(t$119621))));
                    
                    //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119623 = ((t$119622) + (((long)(1L))));
                    
                    //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119624 = ((long[])t$119620.value)[(int)t$119623];
                    
                    //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119625 = ((t$119619) - (((long)(t$119624))));
                    
                    //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    offset$119637 = t$119625;
                    
                    //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119627 = i$119629;
                    
                    //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119628 = ((t$119627) + (((long)(1L))));
                    
                    //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    i$119629 = t$119628;
                }
            }
            
            //#line 1229 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$119647 = offset$119637;
            
            //#line 1229 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ret$119655 = t$119647;
            
            //#line 1221 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$119656 = ret$119655;
            
            //#line 640 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ((x10.core.Rail<$U>)t$119653).$set__1x10$lang$Rail$$T$G((long)(t$119656), (($U)(v$119663)));
            
            //#line 641 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ret$119664 = (($U)(v$119663));
        }
        
        //#line 738 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        return dst;
    }
    
    
    //#line 754 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    public <$S, $U>x10.regionarray.Array map__0$1x10$regionarray$Array$$U$2__1$1x10$regionarray$Array$$T$3x10$regionarray$Array$$U$3x10$regionarray$Array$$S$2(final x10.rtt.Type $S, final x10.rtt.Type $U, final x10.regionarray.Array src, final x10.core.fun.Fun_0_2 op) {
        
        //#line 755 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final x10.regionarray.Array alloc$116226 = ((x10.regionarray.Array)(new x10.regionarray.Array<$S>((java.lang.System[]) null, $S)));
        
        //#line 172 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final x10.regionarray.Region reg$117109 = ((x10.regionarray.Region)(region));
        
        //#line 174 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final x10.regionarray.Region t$119798 = ((x10.regionarray.Region)(((x10.regionarray.Region)
                                                                            reg$117109)));
        
        //#line 174 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        ((x10.regionarray.Array<$S>)alloc$116226).region = ((x10.regionarray.Region)(t$119798));
        
        //#line 174 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$119799 = reg$117109.rank;
        
        //#line 174 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        ((x10.regionarray.Array<$S>)alloc$116226).rank = t$119799;
        
        //#line 174 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final boolean t$119800 = reg$117109.rect;
        
        //#line 174 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        ((x10.regionarray.Array<$S>)alloc$116226).rect = t$119800;
        
        //#line 174 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final boolean t$119801 = reg$117109.zeroBased;
        
        //#line 174 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        ((x10.regionarray.Array<$S>)alloc$116226).zeroBased = t$119801;
        
        //#line 174 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final boolean t$119802 = reg$117109.rail;
        
        //#line 174 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        ((x10.regionarray.Array<$S>)alloc$116226).rail = t$119802;
        
        //#line 174 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$119803 = reg$117109.size$O();
        
        //#line 174 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        ((x10.regionarray.Array<$S>)alloc$116226).size = t$119803;
        {
            
        }
        
        //#line 175 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final x10.regionarray.Array.LayoutHelper crh$119806 = new x10.regionarray.Array.LayoutHelper((java.lang.System[]) null);
        
        //#line 175 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        crh$119806.x10$regionarray$Array$LayoutHelper$$init$S(((x10.regionarray.Region)(reg$117109)));
        
        //#line 176 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$119807 = crh$119806.min0;
        
        //#line 176 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        ((x10.regionarray.Array<$S>)alloc$116226).layout_min0 = t$119807;
        
        //#line 177 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$119808 = crh$119806.stride1;
        
        //#line 177 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        ((x10.regionarray.Array<$S>)alloc$116226).layout_stride1 = t$119808;
        
        //#line 178 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$119809 = crh$119806.min1;
        
        //#line 178 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        ((x10.regionarray.Array<$S>)alloc$116226).layout_min1 = t$119809;
        
        //#line 179 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final x10.core.Rail t$119810 = ((x10.core.Rail)(crh$119806.layout));
        
        //#line 179 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        ((x10.regionarray.Array<$S>)alloc$116226).layout = ((x10.core.Rail)(t$119810));
        
        //#line 180 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long n$119811 = crh$119806.size;
        
        //#line 181 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final x10.core.Rail r$119812 = ((x10.core.Rail)(x10.core.Rail.<$S>makeUnsafe($S, ((long)(n$119811)), false)));
        
        //#line 182 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final x10.lang.Iterator p$119804 = reg$117109.iterator();
        
        //#line 182 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        for (;
             true;
             ) {
            
            //#line 182 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final boolean t$119805 = ((x10.lang.Iterator<x10.lang.Point>)p$119804).hasNext$O();
            
            //#line 182 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            if (!(t$119805)) {
                
                //#line 182 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                break;
            }
            
            //#line 182 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.lang.Point p$119785 = ((x10.lang.Point)(((x10.lang.Iterator<x10.lang.Point>)p$119804).next$G()));
            
            //#line 1221 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.lang.Point pt$119786 = ((x10.lang.Point)(p$119785));
            
            //#line 1221 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            long ret$119787 =  0;
            
            //#line 1222 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$119761 = ((long)(((int)(0))));
            
            //#line 1222 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$119762 = pt$119786.$apply$O((long)(t$119761));
            
            //#line 1222 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$119763 = ((x10.regionarray.Array<$S>)alloc$116226).layout_min0;
            
            //#line 1222 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            long offset$119764 = ((t$119762) - (((long)(t$119763))));
            
            //#line 1223 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$119765 = pt$119786.rank;
            
            //#line 1223 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final boolean t$119766 = ((t$119765) > (((long)(1L))));
            
            //#line 1223 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            if (t$119766) {
                
                //#line 1224 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$119767 = offset$119764;
                
                //#line 1224 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$119768 = ((x10.regionarray.Array<$S>)alloc$116226).layout_stride1;
                
                //#line 1224 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$119769 = ((t$119767) * (((long)(t$119768))));
                
                //#line 1224 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$119770 = pt$119786.$apply$O((long)(1L));
                
                //#line 1224 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$119771 = ((t$119769) + (((long)(t$119770))));
                
                //#line 1224 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$119772 = ((x10.regionarray.Array<$S>)alloc$116226).layout_min1;
                
                //#line 1224 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$119773 = ((t$119771) - (((long)(t$119772))));
                
                //#line 1224 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                offset$119764 = t$119773;
                
                //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$119687 = pt$119786.rank;
                
                //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long i$116322max$119688 = ((t$119687) - (((long)(1L))));
                
                //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                long i$119684 = 2L;
                
                //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                for (;
                     true;
                     ) {
                    
                    //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119685 = i$119684;
                    
                    //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final boolean t$119686 = ((t$119685) <= (((long)(i$116322max$119688))));
                    
                    //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    if (!(t$119686)) {
                        
                        //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        break;
                    }
                    
                    //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long i$119681 = i$119684;
                    
                    //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119667 = offset$119764;
                    
                    //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final x10.core.Rail t$119668 = ((x10.core.Rail)(((x10.regionarray.Array<$S>)alloc$116226).layout));
                    
                    //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119669 = ((i$119681) - (((long)(2L))));
                    
                    //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119670 = ((2L) * (((long)(t$119669))));
                    
                    //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119671 = ((long[])t$119668.value)[(int)t$119670];
                    
                    //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119672 = ((t$119667) * (((long)(t$119671))));
                    
                    //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119673 = pt$119786.$apply$O((long)(i$119681));
                    
                    //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119674 = ((t$119672) + (((long)(t$119673))));
                    
                    //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final x10.core.Rail t$119675 = ((x10.core.Rail)(((x10.regionarray.Array<$S>)alloc$116226).layout));
                    
                    //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119676 = ((i$119681) - (((long)(2L))));
                    
                    //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119677 = ((2L) * (((long)(t$119676))));
                    
                    //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119678 = ((t$119677) + (((long)(1L))));
                    
                    //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119679 = ((long[])t$119675.value)[(int)t$119678];
                    
                    //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119680 = ((t$119674) - (((long)(t$119679))));
                    
                    //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    offset$119764 = t$119680;
                    
                    //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119682 = i$119684;
                    
                    //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119683 = ((t$119682) + (((long)(1L))));
                    
                    //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    i$119684 = t$119683;
                }
            }
            
            //#line 1229 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$119774 = offset$119764;
            
            //#line 1229 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ret$119787 = t$119774;
            
            //#line 1221 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$119788 = ret$119787;
            
            //#line 755 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.lang.Point p$119789 = ((x10.lang.Point)(p$119785));
            
            //#line 755 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.regionarray.Array this$119790 = ((x10.regionarray.Array)(this));
            
            //#line 523 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.lang.Point pt$119791 = ((x10.lang.Point)(p$119789));
            
            //#line 523 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            $T ret$119792 =  null;
            
            //#line 527 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.core.Rail t$119775 = ((x10.core.Rail)(((x10.regionarray.Array<$T>)this$119790).raw));
            
            //#line 1221 .... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.lang.Point pt$119776 = ((x10.lang.Point)(pt$119791));
            
            //#line 1221 .... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            long ret$119777 =  0;
            
            //#line 1222 .... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$119711 = ((long)(((int)(0))));
            
            //#line 1222 .... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$119712 = pt$119776.$apply$O((long)(t$119711));
            
            //#line 1222 .... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$119713 = ((x10.regionarray.Array<$T>)this$119790).layout_min0;
            
            //#line 1222 .... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            long offset$119714 = ((t$119712) - (((long)(t$119713))));
            
            //#line 1223 .... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$119715 = pt$119776.rank;
            
            //#line 1223 .... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final boolean t$119716 = ((t$119715) > (((long)(1L))));
            
            //#line 1223 .... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            if (t$119716) {
                
                //#line 1224 .... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$119717 = offset$119714;
                
                //#line 1224 .... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$119718 = ((x10.regionarray.Array<$T>)this$119790).layout_stride1;
                
                //#line 1224 .... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$119719 = ((t$119717) * (((long)(t$119718))));
                
                //#line 1224 .... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$119720 = pt$119776.$apply$O((long)(1L));
                
                //#line 1224 .... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$119721 = ((t$119719) + (((long)(t$119720))));
                
                //#line 1224 .... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$119722 = ((x10.regionarray.Array<$T>)this$119790).layout_min1;
                
                //#line 1224 .... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$119723 = ((t$119721) - (((long)(t$119722))));
                
                //#line 1224 .... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                offset$119714 = t$119723;
                
                //#line 1225 .... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$119709 = pt$119776.rank;
                
                //#line 1225 .... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long i$116322max$119710 = ((t$119709) - (((long)(1L))));
                
                //#line 1225 .... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                long i$119706 = 2L;
                
                //#line 1225 .... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                for (;
                     true;
                     ) {
                    
                    //#line 1225 .... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119707 = i$119706;
                    
                    //#line 1225 .... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final boolean t$119708 = ((t$119707) <= (((long)(i$116322max$119710))));
                    
                    //#line 1225 .... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    if (!(t$119708)) {
                        
                        //#line 1225 .... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        break;
                    }
                    
                    //#line 1225 .... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long i$119703 = i$119706;
                    
                    //#line 1226 .... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119689 = offset$119714;
                    
                    //#line 1226 .... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final x10.core.Rail t$119690 = ((x10.core.Rail)(((x10.regionarray.Array<$T>)this$119790).layout));
                    
                    //#line 1226 .... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119691 = ((i$119703) - (((long)(2L))));
                    
                    //#line 1226 .... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119692 = ((2L) * (((long)(t$119691))));
                    
                    //#line 1226 .... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119693 = ((long[])t$119690.value)[(int)t$119692];
                    
                    //#line 1226 .... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119694 = ((t$119689) * (((long)(t$119693))));
                    
                    //#line 1226 .... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119695 = pt$119776.$apply$O((long)(i$119703));
                    
                    //#line 1226 .... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119696 = ((t$119694) + (((long)(t$119695))));
                    
                    //#line 1226 .... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final x10.core.Rail t$119697 = ((x10.core.Rail)(((x10.regionarray.Array<$T>)this$119790).layout));
                    
                    //#line 1226 .... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119698 = ((i$119703) - (((long)(2L))));
                    
                    //#line 1226 .... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119699 = ((2L) * (((long)(t$119698))));
                    
                    //#line 1226 .... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119700 = ((t$119699) + (((long)(1L))));
                    
                    //#line 1226 .... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119701 = ((long[])t$119697.value)[(int)t$119700];
                    
                    //#line 1226 .... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119702 = ((t$119696) - (((long)(t$119701))));
                    
                    //#line 1226 .... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    offset$119714 = t$119702;
                    
                    //#line 1225 .... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119704 = i$119706;
                    
                    //#line 1225 .... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119705 = ((t$119704) + (((long)(1L))));
                    
                    //#line 1225 .... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    i$119706 = t$119705;
                }
            }
            
            //#line 1229 .... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$119724 = offset$119714;
            
            //#line 1229 .... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ret$119777 = t$119724;
            
            //#line 1221 .... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$119778 = ret$119777;
            
            //#line 527 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final $T t$119779 = (($T)(((x10.core.Rail<$T>)t$119775).$apply$G((long)(t$119778))));
            
            //#line 527 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ret$119792 = (($T)(t$119779));
            
            //#line 523 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final $T t$119793 = (($T)(ret$119792));
            
            //#line 523 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.lang.Point pt$119794 = ((x10.lang.Point)(p$119789));
            
            //#line 523 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            $U ret$119795 =  null;
            
            //#line 527 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.core.Rail t$119780 = ((x10.core.Rail)(((x10.regionarray.Array<$U>)src).raw));
            
            //#line 1221 .... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.lang.Point pt$119781 = ((x10.lang.Point)(pt$119794));
            
            //#line 1221 .... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            long ret$119782 =  0;
            
            //#line 1222 .... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$119747 = ((long)(((int)(0))));
            
            //#line 1222 .... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$119748 = pt$119781.$apply$O((long)(t$119747));
            
            //#line 1222 .... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$119749 = ((x10.regionarray.Array<$U>)src).layout_min0;
            
            //#line 1222 .... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            long offset$119750 = ((t$119748) - (((long)(t$119749))));
            
            //#line 1223 .... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$119751 = pt$119781.rank;
            
            //#line 1223 .... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final boolean t$119752 = ((t$119751) > (((long)(1L))));
            
            //#line 1223 .... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            if (t$119752) {
                
                //#line 1224 .... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$119753 = offset$119750;
                
                //#line 1224 .... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$119754 = ((x10.regionarray.Array<$U>)src).layout_stride1;
                
                //#line 1224 .... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$119755 = ((t$119753) * (((long)(t$119754))));
                
                //#line 1224 .... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$119756 = pt$119781.$apply$O((long)(1L));
                
                //#line 1224 .... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$119757 = ((t$119755) + (((long)(t$119756))));
                
                //#line 1224 .... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$119758 = ((x10.regionarray.Array<$U>)src).layout_min1;
                
                //#line 1224 .... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$119759 = ((t$119757) - (((long)(t$119758))));
                
                //#line 1224 .... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                offset$119750 = t$119759;
                
                //#line 1225 .... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$119745 = pt$119781.rank;
                
                //#line 1225 .... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long i$116322max$119746 = ((t$119745) - (((long)(1L))));
                
                //#line 1225 .... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                long i$119742 = 2L;
                
                //#line 1225 .... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                for (;
                     true;
                     ) {
                    
                    //#line 1225 .... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119743 = i$119742;
                    
                    //#line 1225 .... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final boolean t$119744 = ((t$119743) <= (((long)(i$116322max$119746))));
                    
                    //#line 1225 .... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    if (!(t$119744)) {
                        
                        //#line 1225 .... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        break;
                    }
                    
                    //#line 1225 .... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long i$119739 = i$119742;
                    
                    //#line 1226 .... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119725 = offset$119750;
                    
                    //#line 1226 .... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final x10.core.Rail t$119726 = ((x10.core.Rail)(((x10.regionarray.Array<$U>)src).layout));
                    
                    //#line 1226 .... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119727 = ((i$119739) - (((long)(2L))));
                    
                    //#line 1226 .... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119728 = ((2L) * (((long)(t$119727))));
                    
                    //#line 1226 .... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119729 = ((long[])t$119726.value)[(int)t$119728];
                    
                    //#line 1226 .... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119730 = ((t$119725) * (((long)(t$119729))));
                    
                    //#line 1226 .... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119731 = pt$119781.$apply$O((long)(i$119739));
                    
                    //#line 1226 .... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119732 = ((t$119730) + (((long)(t$119731))));
                    
                    //#line 1226 .... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final x10.core.Rail t$119733 = ((x10.core.Rail)(((x10.regionarray.Array<$U>)src).layout));
                    
                    //#line 1226 .... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119734 = ((i$119739) - (((long)(2L))));
                    
                    //#line 1226 .... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119735 = ((2L) * (((long)(t$119734))));
                    
                    //#line 1226 .... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119736 = ((t$119735) + (((long)(1L))));
                    
                    //#line 1226 .... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119737 = ((long[])t$119733.value)[(int)t$119736];
                    
                    //#line 1226 .... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119738 = ((t$119732) - (((long)(t$119737))));
                    
                    //#line 1226 .... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    offset$119750 = t$119738;
                    
                    //#line 1225 .... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119740 = i$119742;
                    
                    //#line 1225 .... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119741 = ((t$119740) + (((long)(1L))));
                    
                    //#line 1225 .... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    i$119742 = t$119741;
                }
            }
            
            //#line 1229 .... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$119760 = offset$119750;
            
            //#line 1229 .... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ret$119782 = t$119760;
            
            //#line 1221 .... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$119783 = ret$119782;
            
            //#line 527 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final $U t$119784 = (($U)(((x10.core.Rail<$U>)t$119780).$apply$G((long)(t$119783))));
            
            //#line 527 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ret$119795 = (($U)(t$119784));
            
            //#line 523 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final $U t$119796 = (($U)(ret$119795));
            
            //#line 755 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final $S t$119797 = (($S)((($S)
                                        ((x10.core.fun.Fun_0_2<$T,$U,$S>)op).$apply(t$119793, $T, t$119796, $U))));
            
            //#line 183 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ((x10.core.Rail<$S>)r$119812).$set__1x10$lang$Rail$$T$G((long)(t$119788), (($S)(t$119797)));
        }
        
        //#line 185 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        ((x10.regionarray.Array<$S>)alloc$116226).raw = ((x10.core.Rail)(r$119812));
        
        //#line 755 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        return alloc$116226;
    }
    
    
    //#line 772 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    public <$S, $U>x10.regionarray.Array map__0$1x10$regionarray$Array$$S$2__1$1x10$regionarray$Array$$U$2__2$1x10$regionarray$Array$$T$3x10$regionarray$Array$$U$3x10$regionarray$Array$$S$2(final x10.rtt.Type $S, final x10.rtt.Type $U, final x10.regionarray.Array dst, final x10.regionarray.Array src, final x10.core.fun.Fun_0_2 op) {
        
        //#line 774 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        boolean t$118187 = rect;
        
        //#line 774 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        if (t$118187) {
            
            //#line 774 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$118185 = this.size;
            
            //#line 774 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$118186 = ((x10.regionarray.Array<$U>)src).size;
            
            //#line 774 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            t$118187 = ((long) t$118185) == ((long) t$118186);
        }
        
        //#line 774 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final boolean t$118309 = t$118187;
        
        //#line 774 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        if (t$118309) {
            
            //#line 173 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
            final x10.core.Rail src$117149 = ((x10.core.Rail)(this.raw));
            
            //#line 778 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.core.Rail t$118188 = ((x10.core.Rail)(((x10.regionarray.Array<$U>)src).raw));
            
            //#line 173 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
            final x10.core.Rail src$117150 = ((x10.core.Rail)(((x10.core.Rail<$U>)
                                                                t$118188)));
            
            //#line 173 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
            final x10.core.Rail dst$117151 = ((x10.core.Rail)(((x10.regionarray.Array<$S>)dst).raw));
            
            //#line 173 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
            final x10.core.fun.Fun_0_2 op$117152 = ((x10.core.fun.Fun_0_2)(op));
            
            //#line 173 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
            x10.core.Rail ret$117158 =  null;
            
            //#line 178 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
            final x10.core.Rail rail$119822 = ((x10.core.Rail)(src$117149));
            
            //#line 178 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
            final long i$70716max$119823 = ((x10.core.Rail<$T>)rail$119822).size;
            
            //#line 178 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
            long i$119819 = 0L;
            
            //#line 178 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
            for (;
                 true;
                 ) {
                
                //#line 178 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
                final long t$119820 = i$119819;
                
                //#line 178 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
                final boolean t$119821 = ((t$119820) < (((long)(i$70716max$119823))));
                
                //#line 178 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
                if (!(t$119821)) {
                    
                    //#line 178 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
                    break;
                }
                
                //#line 178 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
                final long i$119816 = i$119819;
                
                //#line 179 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
                final $T t$119813 = (($T)(((x10.core.Rail<$T>)src$117149).$apply$G((long)(i$119816))));
                
                //#line 179 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
                final $U t$119814 = (($U)(((x10.core.Rail<$U>)src$117150).$apply$G((long)(i$119816))));
                
                //#line 179 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
                final $S t$119815 = (($S)((($S)
                                            ((x10.core.fun.Fun_0_2<$T,$U,$S>)op$117152).$apply(t$119813, $T, t$119814, $U))));
                
                //#line 179 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
                ((x10.core.Rail<$S>)dst$117151).$set__1x10$lang$Rail$$T$G((long)(i$119816), (($S)(t$119815)));
                
                //#line 178 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
                final long t$119817 = i$119819;
                
                //#line 178 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
                final long t$119818 = ((t$119817) + (((long)(1L))));
                
                //#line 178 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
                i$119819 = t$119818;
            }
            
            //#line 181 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
            ret$117158 = ((x10.core.Rail)(dst$117151));
            
            //#line 779 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            return dst;
        } else {
            
            //#line 781 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.regionarray.Region t$118198 = ((x10.regionarray.Region)(region));
            
            //#line 781 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.lang.Iterator p$116314 = t$118198.iterator();
            
            //#line 781 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            for (;
                 true;
                 ) {
                
                //#line 781 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final boolean t$118308 = ((x10.lang.Iterator<x10.lang.Point>)p$116314).hasNext$O();
                
                //#line 781 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                if (!(t$118308)) {
                    
                    //#line 781 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    break;
                }
                
                //#line 781 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final x10.lang.Point p$119946 = ((x10.lang.Point)(((x10.lang.Iterator<x10.lang.Point>)p$116314).next$G()));
                
                //#line 636 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final x10.lang.Point p$119947 = ((x10.lang.Point)(p$119946));
                
                //#line 782 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final x10.regionarray.Array this$119948 = ((x10.regionarray.Array)(this));
                
                //#line 523 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final x10.lang.Point pt$119949 = ((x10.lang.Point)(p$119946));
                
                //#line 523 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                $T ret$119950 =  null;
                
                //#line 527 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final x10.core.Rail t$119932 = ((x10.core.Rail)(((x10.regionarray.Array<$T>)this$119948).raw));
                
                //#line 1221 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final x10.lang.Point pt$119933 = ((x10.lang.Point)(pt$119949));
                
                //#line 1221 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                long ret$119934 =  0;
                
                //#line 1222 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$119846 = ((long)(((int)(0))));
                
                //#line 1222 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$119847 = pt$119933.$apply$O((long)(t$119846));
                
                //#line 1222 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$119848 = ((x10.regionarray.Array<$T>)this$119948).layout_min0;
                
                //#line 1222 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                long offset$119849 = ((t$119847) - (((long)(t$119848))));
                
                //#line 1223 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$119850 = pt$119933.rank;
                
                //#line 1223 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final boolean t$119851 = ((t$119850) > (((long)(1L))));
                
                //#line 1223 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                if (t$119851) {
                    
                    //#line 1224 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119852 = offset$119849;
                    
                    //#line 1224 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119853 = ((x10.regionarray.Array<$T>)this$119948).layout_stride1;
                    
                    //#line 1224 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119854 = ((t$119852) * (((long)(t$119853))));
                    
                    //#line 1224 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119855 = pt$119933.$apply$O((long)(1L));
                    
                    //#line 1224 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119856 = ((t$119854) + (((long)(t$119855))));
                    
                    //#line 1224 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119857 = ((x10.regionarray.Array<$T>)this$119948).layout_min1;
                    
                    //#line 1224 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119858 = ((t$119856) - (((long)(t$119857))));
                    
                    //#line 1224 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    offset$119849 = t$119858;
                    
                    //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119844 = pt$119933.rank;
                    
                    //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long i$116322max$119845 = ((t$119844) - (((long)(1L))));
                    
                    //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    long i$119841 = 2L;
                    
                    //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    for (;
                         true;
                         ) {
                        
                        //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final long t$119842 = i$119841;
                        
                        //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final boolean t$119843 = ((t$119842) <= (((long)(i$116322max$119845))));
                        
                        //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        if (!(t$119843)) {
                            
                            //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                            break;
                        }
                        
                        //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final long i$119838 = i$119841;
                        
                        //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final long t$119824 = offset$119849;
                        
                        //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final x10.core.Rail t$119825 = ((x10.core.Rail)(((x10.regionarray.Array<$T>)this$119948).layout));
                        
                        //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final long t$119826 = ((i$119838) - (((long)(2L))));
                        
                        //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final long t$119827 = ((2L) * (((long)(t$119826))));
                        
                        //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final long t$119828 = ((long[])t$119825.value)[(int)t$119827];
                        
                        //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final long t$119829 = ((t$119824) * (((long)(t$119828))));
                        
                        //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final long t$119830 = pt$119933.$apply$O((long)(i$119838));
                        
                        //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final long t$119831 = ((t$119829) + (((long)(t$119830))));
                        
                        //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final x10.core.Rail t$119832 = ((x10.core.Rail)(((x10.regionarray.Array<$T>)this$119948).layout));
                        
                        //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final long t$119833 = ((i$119838) - (((long)(2L))));
                        
                        //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final long t$119834 = ((2L) * (((long)(t$119833))));
                        
                        //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final long t$119835 = ((t$119834) + (((long)(1L))));
                        
                        //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final long t$119836 = ((long[])t$119832.value)[(int)t$119835];
                        
                        //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final long t$119837 = ((t$119831) - (((long)(t$119836))));
                        
                        //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        offset$119849 = t$119837;
                        
                        //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final long t$119839 = i$119841;
                        
                        //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final long t$119840 = ((t$119839) + (((long)(1L))));
                        
                        //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        i$119841 = t$119840;
                    }
                }
                
                //#line 1229 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$119859 = offset$119849;
                
                //#line 1229 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                ret$119934 = t$119859;
                
                //#line 1221 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$119935 = ret$119934;
                
                //#line 527 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final $T t$119936 = (($T)(((x10.core.Rail<$T>)t$119932).$apply$G((long)(t$119935))));
                
                //#line 527 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                ret$119950 = (($T)(t$119936));
                
                //#line 523 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final $T t$119951 = (($T)(ret$119950));
                
                //#line 523 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final x10.lang.Point pt$119952 = ((x10.lang.Point)(p$119946));
                
                //#line 523 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                $U ret$119953 =  null;
                
                //#line 527 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final x10.core.Rail t$119937 = ((x10.core.Rail)(((x10.regionarray.Array<$U>)src).raw));
                
                //#line 1221 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final x10.lang.Point pt$119938 = ((x10.lang.Point)(pt$119952));
                
                //#line 1221 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                long ret$119939 =  0;
                
                //#line 1222 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$119882 = ((long)(((int)(0))));
                
                //#line 1222 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$119883 = pt$119938.$apply$O((long)(t$119882));
                
                //#line 1222 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$119884 = ((x10.regionarray.Array<$U>)src).layout_min0;
                
                //#line 1222 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                long offset$119885 = ((t$119883) - (((long)(t$119884))));
                
                //#line 1223 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$119886 = pt$119938.rank;
                
                //#line 1223 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final boolean t$119887 = ((t$119886) > (((long)(1L))));
                
                //#line 1223 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                if (t$119887) {
                    
                    //#line 1224 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119888 = offset$119885;
                    
                    //#line 1224 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119889 = ((x10.regionarray.Array<$U>)src).layout_stride1;
                    
                    //#line 1224 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119890 = ((t$119888) * (((long)(t$119889))));
                    
                    //#line 1224 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119891 = pt$119938.$apply$O((long)(1L));
                    
                    //#line 1224 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119892 = ((t$119890) + (((long)(t$119891))));
                    
                    //#line 1224 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119893 = ((x10.regionarray.Array<$U>)src).layout_min1;
                    
                    //#line 1224 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119894 = ((t$119892) - (((long)(t$119893))));
                    
                    //#line 1224 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    offset$119885 = t$119894;
                    
                    //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119880 = pt$119938.rank;
                    
                    //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long i$116322max$119881 = ((t$119880) - (((long)(1L))));
                    
                    //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    long i$119877 = 2L;
                    
                    //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    for (;
                         true;
                         ) {
                        
                        //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final long t$119878 = i$119877;
                        
                        //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final boolean t$119879 = ((t$119878) <= (((long)(i$116322max$119881))));
                        
                        //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        if (!(t$119879)) {
                            
                            //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                            break;
                        }
                        
                        //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final long i$119874 = i$119877;
                        
                        //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final long t$119860 = offset$119885;
                        
                        //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final x10.core.Rail t$119861 = ((x10.core.Rail)(((x10.regionarray.Array<$U>)src).layout));
                        
                        //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final long t$119862 = ((i$119874) - (((long)(2L))));
                        
                        //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final long t$119863 = ((2L) * (((long)(t$119862))));
                        
                        //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final long t$119864 = ((long[])t$119861.value)[(int)t$119863];
                        
                        //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final long t$119865 = ((t$119860) * (((long)(t$119864))));
                        
                        //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final long t$119866 = pt$119938.$apply$O((long)(i$119874));
                        
                        //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final long t$119867 = ((t$119865) + (((long)(t$119866))));
                        
                        //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final x10.core.Rail t$119868 = ((x10.core.Rail)(((x10.regionarray.Array<$U>)src).layout));
                        
                        //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final long t$119869 = ((i$119874) - (((long)(2L))));
                        
                        //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final long t$119870 = ((2L) * (((long)(t$119869))));
                        
                        //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final long t$119871 = ((t$119870) + (((long)(1L))));
                        
                        //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final long t$119872 = ((long[])t$119868.value)[(int)t$119871];
                        
                        //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final long t$119873 = ((t$119867) - (((long)(t$119872))));
                        
                        //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        offset$119885 = t$119873;
                        
                        //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final long t$119875 = i$119877;
                        
                        //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final long t$119876 = ((t$119875) + (((long)(1L))));
                        
                        //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        i$119877 = t$119876;
                    }
                }
                
                //#line 1229 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$119895 = offset$119885;
                
                //#line 1229 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                ret$119939 = t$119895;
                
                //#line 1221 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$119940 = ret$119939;
                
                //#line 527 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final $U t$119941 = (($U)(((x10.core.Rail<$U>)t$119937).$apply$G((long)(t$119940))));
                
                //#line 527 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                ret$119953 = (($U)(t$119941));
                
                //#line 523 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final $U t$119954 = (($U)(ret$119953));
                
                //#line 636 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final $S v$119955 = (($S)((($S)
                                            ((x10.core.fun.Fun_0_2<$T,$U,$S>)op).$apply(t$119951, $T, t$119954, $U))));
                
                //#line 636 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                $S ret$119956 =  null;
                
                //#line 640 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final x10.core.Rail t$119942 = ((x10.core.Rail)(((x10.regionarray.Array<$S>)dst).raw));
                
                //#line 1221 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final x10.lang.Point pt$119943 = ((x10.lang.Point)(p$119947));
                
                //#line 1221 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                long ret$119944 =  0;
                
                //#line 1222 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$119918 = ((long)(((int)(0))));
                
                //#line 1222 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$119919 = pt$119943.$apply$O((long)(t$119918));
                
                //#line 1222 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$119920 = ((x10.regionarray.Array<$S>)dst).layout_min0;
                
                //#line 1222 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                long offset$119921 = ((t$119919) - (((long)(t$119920))));
                
                //#line 1223 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$119922 = pt$119943.rank;
                
                //#line 1223 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final boolean t$119923 = ((t$119922) > (((long)(1L))));
                
                //#line 1223 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                if (t$119923) {
                    
                    //#line 1224 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119924 = offset$119921;
                    
                    //#line 1224 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119925 = ((x10.regionarray.Array<$S>)dst).layout_stride1;
                    
                    //#line 1224 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119926 = ((t$119924) * (((long)(t$119925))));
                    
                    //#line 1224 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119927 = pt$119943.$apply$O((long)(1L));
                    
                    //#line 1224 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119928 = ((t$119926) + (((long)(t$119927))));
                    
                    //#line 1224 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119929 = ((x10.regionarray.Array<$S>)dst).layout_min1;
                    
                    //#line 1224 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119930 = ((t$119928) - (((long)(t$119929))));
                    
                    //#line 1224 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    offset$119921 = t$119930;
                    
                    //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119916 = pt$119943.rank;
                    
                    //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long i$116322max$119917 = ((t$119916) - (((long)(1L))));
                    
                    //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    long i$119913 = 2L;
                    
                    //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    for (;
                         true;
                         ) {
                        
                        //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final long t$119914 = i$119913;
                        
                        //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final boolean t$119915 = ((t$119914) <= (((long)(i$116322max$119917))));
                        
                        //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        if (!(t$119915)) {
                            
                            //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                            break;
                        }
                        
                        //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final long i$119910 = i$119913;
                        
                        //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final long t$119896 = offset$119921;
                        
                        //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final x10.core.Rail t$119897 = ((x10.core.Rail)(((x10.regionarray.Array<$S>)dst).layout));
                        
                        //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final long t$119898 = ((i$119910) - (((long)(2L))));
                        
                        //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final long t$119899 = ((2L) * (((long)(t$119898))));
                        
                        //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final long t$119900 = ((long[])t$119897.value)[(int)t$119899];
                        
                        //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final long t$119901 = ((t$119896) * (((long)(t$119900))));
                        
                        //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final long t$119902 = pt$119943.$apply$O((long)(i$119910));
                        
                        //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final long t$119903 = ((t$119901) + (((long)(t$119902))));
                        
                        //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final x10.core.Rail t$119904 = ((x10.core.Rail)(((x10.regionarray.Array<$S>)dst).layout));
                        
                        //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final long t$119905 = ((i$119910) - (((long)(2L))));
                        
                        //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final long t$119906 = ((2L) * (((long)(t$119905))));
                        
                        //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final long t$119907 = ((t$119906) + (((long)(1L))));
                        
                        //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final long t$119908 = ((long[])t$119904.value)[(int)t$119907];
                        
                        //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final long t$119909 = ((t$119903) - (((long)(t$119908))));
                        
                        //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        offset$119921 = t$119909;
                        
                        //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final long t$119911 = i$119913;
                        
                        //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final long t$119912 = ((t$119911) + (((long)(1L))));
                        
                        //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        i$119913 = t$119912;
                    }
                }
                
                //#line 1229 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$119931 = offset$119921;
                
                //#line 1229 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                ret$119944 = t$119931;
                
                //#line 1221 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$119945 = ret$119944;
                
                //#line 640 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                ((x10.core.Rail<$S>)t$119942).$set__1x10$lang$Rail$$T$G((long)(t$119945), (($S)(v$119955)));
                
                //#line 641 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                ret$119956 = (($S)(v$119955));
            }
        }
        
        //#line 785 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        return dst;
    }
    
    
    //#line 804 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    public <$S, $U>x10.regionarray.Array map__0$1x10$regionarray$Array$$S$2__1$1x10$regionarray$Array$$U$2__3$1x10$regionarray$Array$$T$3x10$regionarray$Array$$U$3x10$regionarray$Array$$S$2(final x10.rtt.Type $S, final x10.rtt.Type $U, final x10.regionarray.Array dst, final x10.regionarray.Array src, final x10.regionarray.Region filter, final x10.core.fun.Fun_0_2 op) {
        
        //#line 805 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final x10.regionarray.Region t$118310 = ((x10.regionarray.Region)(region));
        
        //#line 805 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final x10.regionarray.Region fregion = ((x10.regionarray.Region)(t$118310.$and(((x10.regionarray.Region)(filter)))));
        
        //#line 806 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final x10.lang.Iterator p$120090 = fregion.iterator();
        
        //#line 806 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        for (;
             true;
             ) {
            
            //#line 806 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final boolean t$120091 = ((x10.lang.Iterator<x10.lang.Point>)p$120090).hasNext$O();
            
            //#line 806 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            if (!(t$120091)) {
                
                //#line 806 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                break;
            }
            
            //#line 806 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.lang.Point p$120079 = ((x10.lang.Point)(((x10.lang.Iterator<x10.lang.Point>)p$120090).next$G()));
            
            //#line 636 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.lang.Point p$120080 = ((x10.lang.Point)(p$120079));
            
            //#line 807 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.regionarray.Array this$120081 = ((x10.regionarray.Array)(this));
            
            //#line 523 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.lang.Point pt$120082 = ((x10.lang.Point)(p$120079));
            
            //#line 523 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            $T ret$120083 =  null;
            
            //#line 527 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.core.Rail t$120065 = ((x10.core.Rail)(((x10.regionarray.Array<$T>)this$120081).raw));
            
            //#line 1221 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.lang.Point pt$120066 = ((x10.lang.Point)(pt$120082));
            
            //#line 1221 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            long ret$120067 =  0;
            
            //#line 1222 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$119979 = ((long)(((int)(0))));
            
            //#line 1222 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$119980 = pt$120066.$apply$O((long)(t$119979));
            
            //#line 1222 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$119981 = ((x10.regionarray.Array<$T>)this$120081).layout_min0;
            
            //#line 1222 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            long offset$119982 = ((t$119980) - (((long)(t$119981))));
            
            //#line 1223 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$119983 = pt$120066.rank;
            
            //#line 1223 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final boolean t$119984 = ((t$119983) > (((long)(1L))));
            
            //#line 1223 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            if (t$119984) {
                
                //#line 1224 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$119985 = offset$119982;
                
                //#line 1224 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$119986 = ((x10.regionarray.Array<$T>)this$120081).layout_stride1;
                
                //#line 1224 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$119987 = ((t$119985) * (((long)(t$119986))));
                
                //#line 1224 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$119988 = pt$120066.$apply$O((long)(1L));
                
                //#line 1224 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$119989 = ((t$119987) + (((long)(t$119988))));
                
                //#line 1224 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$119990 = ((x10.regionarray.Array<$T>)this$120081).layout_min1;
                
                //#line 1224 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$119991 = ((t$119989) - (((long)(t$119990))));
                
                //#line 1224 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                offset$119982 = t$119991;
                
                //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$119977 = pt$120066.rank;
                
                //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long i$116322max$119978 = ((t$119977) - (((long)(1L))));
                
                //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                long i$119974 = 2L;
                
                //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                for (;
                     true;
                     ) {
                    
                    //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119975 = i$119974;
                    
                    //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final boolean t$119976 = ((t$119975) <= (((long)(i$116322max$119978))));
                    
                    //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    if (!(t$119976)) {
                        
                        //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        break;
                    }
                    
                    //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long i$119971 = i$119974;
                    
                    //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119957 = offset$119982;
                    
                    //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final x10.core.Rail t$119958 = ((x10.core.Rail)(((x10.regionarray.Array<$T>)this$120081).layout));
                    
                    //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119959 = ((i$119971) - (((long)(2L))));
                    
                    //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119960 = ((2L) * (((long)(t$119959))));
                    
                    //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119961 = ((long[])t$119958.value)[(int)t$119960];
                    
                    //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119962 = ((t$119957) * (((long)(t$119961))));
                    
                    //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119963 = pt$120066.$apply$O((long)(i$119971));
                    
                    //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119964 = ((t$119962) + (((long)(t$119963))));
                    
                    //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final x10.core.Rail t$119965 = ((x10.core.Rail)(((x10.regionarray.Array<$T>)this$120081).layout));
                    
                    //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119966 = ((i$119971) - (((long)(2L))));
                    
                    //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119967 = ((2L) * (((long)(t$119966))));
                    
                    //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119968 = ((t$119967) + (((long)(1L))));
                    
                    //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119969 = ((long[])t$119965.value)[(int)t$119968];
                    
                    //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119970 = ((t$119964) - (((long)(t$119969))));
                    
                    //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    offset$119982 = t$119970;
                    
                    //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119972 = i$119974;
                    
                    //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119973 = ((t$119972) + (((long)(1L))));
                    
                    //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    i$119974 = t$119973;
                }
            }
            
            //#line 1229 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$119992 = offset$119982;
            
            //#line 1229 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ret$120067 = t$119992;
            
            //#line 1221 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$120068 = ret$120067;
            
            //#line 527 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final $T t$120069 = (($T)(((x10.core.Rail<$T>)t$120065).$apply$G((long)(t$120068))));
            
            //#line 527 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ret$120083 = (($T)(t$120069));
            
            //#line 523 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final $T t$120084 = (($T)(ret$120083));
            
            //#line 523 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.lang.Point pt$120085 = ((x10.lang.Point)(p$120079));
            
            //#line 523 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            $U ret$120086 =  null;
            
            //#line 527 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.core.Rail t$120070 = ((x10.core.Rail)(((x10.regionarray.Array<$U>)src).raw));
            
            //#line 1221 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.lang.Point pt$120071 = ((x10.lang.Point)(pt$120085));
            
            //#line 1221 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            long ret$120072 =  0;
            
            //#line 1222 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$120015 = ((long)(((int)(0))));
            
            //#line 1222 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$120016 = pt$120071.$apply$O((long)(t$120015));
            
            //#line 1222 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$120017 = ((x10.regionarray.Array<$U>)src).layout_min0;
            
            //#line 1222 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            long offset$120018 = ((t$120016) - (((long)(t$120017))));
            
            //#line 1223 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$120019 = pt$120071.rank;
            
            //#line 1223 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final boolean t$120020 = ((t$120019) > (((long)(1L))));
            
            //#line 1223 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            if (t$120020) {
                
                //#line 1224 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$120021 = offset$120018;
                
                //#line 1224 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$120022 = ((x10.regionarray.Array<$U>)src).layout_stride1;
                
                //#line 1224 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$120023 = ((t$120021) * (((long)(t$120022))));
                
                //#line 1224 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$120024 = pt$120071.$apply$O((long)(1L));
                
                //#line 1224 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$120025 = ((t$120023) + (((long)(t$120024))));
                
                //#line 1224 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$120026 = ((x10.regionarray.Array<$U>)src).layout_min1;
                
                //#line 1224 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$120027 = ((t$120025) - (((long)(t$120026))));
                
                //#line 1224 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                offset$120018 = t$120027;
                
                //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$120013 = pt$120071.rank;
                
                //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long i$116322max$120014 = ((t$120013) - (((long)(1L))));
                
                //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                long i$120010 = 2L;
                
                //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                for (;
                     true;
                     ) {
                    
                    //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$120011 = i$120010;
                    
                    //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final boolean t$120012 = ((t$120011) <= (((long)(i$116322max$120014))));
                    
                    //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    if (!(t$120012)) {
                        
                        //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        break;
                    }
                    
                    //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long i$120007 = i$120010;
                    
                    //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119993 = offset$120018;
                    
                    //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final x10.core.Rail t$119994 = ((x10.core.Rail)(((x10.regionarray.Array<$U>)src).layout));
                    
                    //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119995 = ((i$120007) - (((long)(2L))));
                    
                    //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119996 = ((2L) * (((long)(t$119995))));
                    
                    //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119997 = ((long[])t$119994.value)[(int)t$119996];
                    
                    //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119998 = ((t$119993) * (((long)(t$119997))));
                    
                    //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$119999 = pt$120071.$apply$O((long)(i$120007));
                    
                    //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$120000 = ((t$119998) + (((long)(t$119999))));
                    
                    //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final x10.core.Rail t$120001 = ((x10.core.Rail)(((x10.regionarray.Array<$U>)src).layout));
                    
                    //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$120002 = ((i$120007) - (((long)(2L))));
                    
                    //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$120003 = ((2L) * (((long)(t$120002))));
                    
                    //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$120004 = ((t$120003) + (((long)(1L))));
                    
                    //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$120005 = ((long[])t$120001.value)[(int)t$120004];
                    
                    //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$120006 = ((t$120000) - (((long)(t$120005))));
                    
                    //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    offset$120018 = t$120006;
                    
                    //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$120008 = i$120010;
                    
                    //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$120009 = ((t$120008) + (((long)(1L))));
                    
                    //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    i$120010 = t$120009;
                }
            }
            
            //#line 1229 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$120028 = offset$120018;
            
            //#line 1229 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ret$120072 = t$120028;
            
            //#line 1221 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$120073 = ret$120072;
            
            //#line 527 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final $U t$120074 = (($U)(((x10.core.Rail<$U>)t$120070).$apply$G((long)(t$120073))));
            
            //#line 527 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ret$120086 = (($U)(t$120074));
            
            //#line 523 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final $U t$120087 = (($U)(ret$120086));
            
            //#line 636 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final $S v$120088 = (($S)((($S)
                                        ((x10.core.fun.Fun_0_2<$T,$U,$S>)op).$apply(t$120084, $T, t$120087, $U))));
            
            //#line 636 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            $S ret$120089 =  null;
            
            //#line 640 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.core.Rail t$120075 = ((x10.core.Rail)(((x10.regionarray.Array<$S>)dst).raw));
            
            //#line 1221 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.lang.Point pt$120076 = ((x10.lang.Point)(p$120080));
            
            //#line 1221 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            long ret$120077 =  0;
            
            //#line 1222 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$120051 = ((long)(((int)(0))));
            
            //#line 1222 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$120052 = pt$120076.$apply$O((long)(t$120051));
            
            //#line 1222 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$120053 = ((x10.regionarray.Array<$S>)dst).layout_min0;
            
            //#line 1222 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            long offset$120054 = ((t$120052) - (((long)(t$120053))));
            
            //#line 1223 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$120055 = pt$120076.rank;
            
            //#line 1223 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final boolean t$120056 = ((t$120055) > (((long)(1L))));
            
            //#line 1223 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            if (t$120056) {
                
                //#line 1224 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$120057 = offset$120054;
                
                //#line 1224 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$120058 = ((x10.regionarray.Array<$S>)dst).layout_stride1;
                
                //#line 1224 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$120059 = ((t$120057) * (((long)(t$120058))));
                
                //#line 1224 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$120060 = pt$120076.$apply$O((long)(1L));
                
                //#line 1224 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$120061 = ((t$120059) + (((long)(t$120060))));
                
                //#line 1224 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$120062 = ((x10.regionarray.Array<$S>)dst).layout_min1;
                
                //#line 1224 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$120063 = ((t$120061) - (((long)(t$120062))));
                
                //#line 1224 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                offset$120054 = t$120063;
                
                //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$120049 = pt$120076.rank;
                
                //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long i$116322max$120050 = ((t$120049) - (((long)(1L))));
                
                //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                long i$120046 = 2L;
                
                //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                for (;
                     true;
                     ) {
                    
                    //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$120047 = i$120046;
                    
                    //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final boolean t$120048 = ((t$120047) <= (((long)(i$116322max$120050))));
                    
                    //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    if (!(t$120048)) {
                        
                        //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        break;
                    }
                    
                    //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long i$120043 = i$120046;
                    
                    //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$120029 = offset$120054;
                    
                    //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final x10.core.Rail t$120030 = ((x10.core.Rail)(((x10.regionarray.Array<$S>)dst).layout));
                    
                    //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$120031 = ((i$120043) - (((long)(2L))));
                    
                    //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$120032 = ((2L) * (((long)(t$120031))));
                    
                    //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$120033 = ((long[])t$120030.value)[(int)t$120032];
                    
                    //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$120034 = ((t$120029) * (((long)(t$120033))));
                    
                    //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$120035 = pt$120076.$apply$O((long)(i$120043));
                    
                    //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$120036 = ((t$120034) + (((long)(t$120035))));
                    
                    //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final x10.core.Rail t$120037 = ((x10.core.Rail)(((x10.regionarray.Array<$S>)dst).layout));
                    
                    //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$120038 = ((i$120043) - (((long)(2L))));
                    
                    //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$120039 = ((2L) * (((long)(t$120038))));
                    
                    //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$120040 = ((t$120039) + (((long)(1L))));
                    
                    //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$120041 = ((long[])t$120037.value)[(int)t$120040];
                    
                    //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$120042 = ((t$120036) - (((long)(t$120041))));
                    
                    //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    offset$120054 = t$120042;
                    
                    //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$120044 = i$120046;
                    
                    //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$120045 = ((t$120044) + (((long)(1L))));
                    
                    //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    i$120046 = t$120045;
                }
            }
            
            //#line 1229 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$120064 = offset$120054;
            
            //#line 1229 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ret$120077 = t$120064;
            
            //#line 1221 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$120078 = ret$120077;
            
            //#line 640 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ((x10.core.Rail<$S>)t$120075).$set__1x10$lang$Rail$$T$G((long)(t$120078), (($S)(v$120088)));
            
            //#line 641 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ret$120089 = (($S)(v$120088));
        }
        
        //#line 809 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        return dst;
    }
    
    
    //#line 825 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    public <$U>$U reduce__0$1x10$regionarray$Array$$U$3x10$regionarray$Array$$T$3x10$regionarray$Array$$U$2__1x10$regionarray$Array$$U$G(final x10.rtt.Type $U, final x10.core.fun.Fun_0_2 op, final $U unit) {
        
        //#line 826 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final boolean t$118475 = rect;
        
        //#line 826 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        if (t$118475) {
            
            //#line 128 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
            final x10.core.Rail src$117230 = ((x10.core.Rail)(raw));
            
            //#line 128 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
            final x10.core.fun.Fun_0_2 op$117231 = ((x10.core.fun.Fun_0_2)(op));
            
            //#line 128 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
            final $U unit$117232 = (($U)(unit));
            
            //#line 128 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
            $U ret$117239 =  null;
            
            //#line 132 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
            $U accum$120103 = (($U)(unit$117232));
            
            //#line 133 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
            final x10.core.Rail rail$120101 = ((x10.core.Rail)(src$117230));
            
            //#line 133 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
            final long i$70678max$120102 = ((x10.core.Rail<$T>)rail$120101).size;
            
            //#line 133 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
            long i$120098 = 0L;
            
            //#line 133 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
            for (;
                 true;
                 ) {
                
                //#line 133 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
                final long t$120099 = i$120098;
                
                //#line 133 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
                final boolean t$120100 = ((t$120099) < (((long)(i$70678max$120102))));
                
                //#line 133 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
                if (!(t$120100)) {
                    
                    //#line 133 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
                    break;
                }
                
                //#line 133 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
                final long i$120095 = i$120098;
                
                //#line 134 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
                final $U t$120092 = (($U)(accum$120103));
                
                //#line 134 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
                final $T t$120093 = (($T)(((x10.core.Rail<$T>)src$117230).$apply$G((long)(i$120095))));
                
                //#line 134 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
                final $U t$120094 = (($U)((($U)
                                            ((x10.core.fun.Fun_0_2<$U,$T,$U>)op$117231).$apply(t$120092, $U, t$120093, $T))));
                
                //#line 134 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
                accum$120103 = (($U)(t$120094));
                
                //#line 133 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
                final long t$120096 = i$120098;
                
                //#line 133 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
                final long t$120097 = ((t$120096) + (((long)(1L))));
                
                //#line 133 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
                i$120098 = t$120097;
            }
            
            //#line 136 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
            final $U t$120104 = (($U)(accum$120103));
            
            //#line 136 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
            ret$117239 = (($U)(t$120104));
            
            //#line 128 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
            final $U t$118431 = (($U)(ret$117239));
            
            //#line 830 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            return t$118431;
        } else {
            
            //#line 832 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            $U accum = (($U)(unit));
            
            //#line 833 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.regionarray.Region t$120153 = ((x10.regionarray.Region)(region));
            
            //#line 833 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.lang.Iterator p$120154 = t$120153.iterator();
            
            //#line 833 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            for (;
                 true;
                 ) {
                
                //#line 833 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final boolean t$120155 = ((x10.lang.Iterator<x10.lang.Point>)p$120154).hasNext$O();
                
                //#line 833 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                if (!(t$120155)) {
                    
                    //#line 833 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    break;
                }
                
                //#line 833 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final x10.lang.Point p$120146 = ((x10.lang.Point)(((x10.lang.Iterator<x10.lang.Point>)p$120154).next$G()));
                
                //#line 834 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final $U t$120147 = (($U)(accum));
                
                //#line 834 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final x10.regionarray.Array this$120148 = ((x10.regionarray.Array)(this));
                
                //#line 523 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final x10.lang.Point pt$120149 = ((x10.lang.Point)(p$120146));
                
                //#line 523 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                $T ret$120150 =  null;
                
                //#line 527 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final x10.core.Rail t$120141 = ((x10.core.Rail)(((x10.regionarray.Array<$T>)this$120148).raw));
                
                //#line 1221 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final x10.lang.Point pt$120142 = ((x10.lang.Point)(pt$120149));
                
                //#line 1221 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                long ret$120143 =  0;
                
                //#line 1222 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$120127 = ((long)(((int)(0))));
                
                //#line 1222 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$120128 = pt$120142.$apply$O((long)(t$120127));
                
                //#line 1222 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$120129 = ((x10.regionarray.Array<$T>)this$120148).layout_min0;
                
                //#line 1222 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                long offset$120130 = ((t$120128) - (((long)(t$120129))));
                
                //#line 1223 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$120131 = pt$120142.rank;
                
                //#line 1223 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final boolean t$120132 = ((t$120131) > (((long)(1L))));
                
                //#line 1223 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                if (t$120132) {
                    
                    //#line 1224 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$120133 = offset$120130;
                    
                    //#line 1224 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$120134 = ((x10.regionarray.Array<$T>)this$120148).layout_stride1;
                    
                    //#line 1224 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$120135 = ((t$120133) * (((long)(t$120134))));
                    
                    //#line 1224 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$120136 = pt$120142.$apply$O((long)(1L));
                    
                    //#line 1224 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$120137 = ((t$120135) + (((long)(t$120136))));
                    
                    //#line 1224 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$120138 = ((x10.regionarray.Array<$T>)this$120148).layout_min1;
                    
                    //#line 1224 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$120139 = ((t$120137) - (((long)(t$120138))));
                    
                    //#line 1224 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    offset$120130 = t$120139;
                    
                    //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$120125 = pt$120142.rank;
                    
                    //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long i$116322max$120126 = ((t$120125) - (((long)(1L))));
                    
                    //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    long i$120122 = 2L;
                    
                    //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    for (;
                         true;
                         ) {
                        
                        //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final long t$120123 = i$120122;
                        
                        //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final boolean t$120124 = ((t$120123) <= (((long)(i$116322max$120126))));
                        
                        //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        if (!(t$120124)) {
                            
                            //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                            break;
                        }
                        
                        //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final long i$120119 = i$120122;
                        
                        //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final long t$120105 = offset$120130;
                        
                        //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final x10.core.Rail t$120106 = ((x10.core.Rail)(((x10.regionarray.Array<$T>)this$120148).layout));
                        
                        //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final long t$120107 = ((i$120119) - (((long)(2L))));
                        
                        //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final long t$120108 = ((2L) * (((long)(t$120107))));
                        
                        //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final long t$120109 = ((long[])t$120106.value)[(int)t$120108];
                        
                        //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final long t$120110 = ((t$120105) * (((long)(t$120109))));
                        
                        //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final long t$120111 = pt$120142.$apply$O((long)(i$120119));
                        
                        //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final long t$120112 = ((t$120110) + (((long)(t$120111))));
                        
                        //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final x10.core.Rail t$120113 = ((x10.core.Rail)(((x10.regionarray.Array<$T>)this$120148).layout));
                        
                        //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final long t$120114 = ((i$120119) - (((long)(2L))));
                        
                        //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final long t$120115 = ((2L) * (((long)(t$120114))));
                        
                        //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final long t$120116 = ((t$120115) + (((long)(1L))));
                        
                        //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final long t$120117 = ((long[])t$120113.value)[(int)t$120116];
                        
                        //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final long t$120118 = ((t$120112) - (((long)(t$120117))));
                        
                        //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        offset$120130 = t$120118;
                        
                        //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final long t$120120 = i$120122;
                        
                        //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final long t$120121 = ((t$120120) + (((long)(1L))));
                        
                        //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        i$120122 = t$120121;
                    }
                }
                
                //#line 1229 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$120140 = offset$120130;
                
                //#line 1229 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                ret$120143 = t$120140;
                
                //#line 1221 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$120144 = ret$120143;
                
                //#line 527 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final $T t$120145 = (($T)(((x10.core.Rail<$T>)t$120141).$apply$G((long)(t$120144))));
                
                //#line 527 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                ret$120150 = (($T)(t$120145));
                
                //#line 523 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final $T t$120151 = (($T)(ret$120150));
                
                //#line 834 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final $U t$120152 = (($U)((($U)
                                            ((x10.core.fun.Fun_0_2<$U,$T,$U>)op).$apply(t$120147, $U, t$120151, $T))));
                
                //#line 834 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                accum = (($U)(t$120152));
            }
            
            //#line 836 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final $U t$118474 = (($U)(accum));
            
            //#line 836 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            return t$118474;
        }
    }
    
    
    //#line 854 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    public <$U>x10.regionarray.Array scan__0$1x10$regionarray$Array$$U$3x10$regionarray$Array$$T$3x10$regionarray$Array$$U$2__1x10$regionarray$Array$$U(final x10.rtt.Type $U, final x10.core.fun.Fun_0_2 op, final $U unit) {
        
        //#line 855 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final x10.regionarray.Array this$117266 = ((x10.regionarray.Array)(this));
        
        //#line 855 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final x10.regionarray.Array alloc$116227 = ((x10.regionarray.Array)(new x10.regionarray.Array<$U>((java.lang.System[]) null, $U)));
        
        //#line 140 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final x10.regionarray.Region reg$117254 = ((x10.regionarray.Region)(region));
        
        //#line 142 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final x10.regionarray.Region t$120156 = ((x10.regionarray.Region)(((x10.regionarray.Region)
                                                                            reg$117254)));
        
        //#line 142 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        ((x10.regionarray.Array<$U>)alloc$116227).region = ((x10.regionarray.Region)(t$120156));
        
        //#line 142 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$120157 = reg$117254.rank;
        
        //#line 142 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        ((x10.regionarray.Array<$U>)alloc$116227).rank = t$120157;
        
        //#line 142 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final boolean t$120158 = reg$117254.rect;
        
        //#line 142 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        ((x10.regionarray.Array<$U>)alloc$116227).rect = t$120158;
        
        //#line 142 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final boolean t$120159 = reg$117254.zeroBased;
        
        //#line 142 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        ((x10.regionarray.Array<$U>)alloc$116227).zeroBased = t$120159;
        
        //#line 142 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final boolean t$120160 = reg$117254.rail;
        
        //#line 142 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        ((x10.regionarray.Array<$U>)alloc$116227).rail = t$120160;
        
        //#line 142 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$120161 = reg$117254.size$O();
        
        //#line 142 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        ((x10.regionarray.Array<$U>)alloc$116227).size = t$120161;
        {
            
        }
        
        //#line 143 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final x10.regionarray.Array.LayoutHelper crh$120256 = new x10.regionarray.Array.LayoutHelper((java.lang.System[]) null);
        
        //#line 143 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        crh$120256.x10$regionarray$Array$LayoutHelper$$init$S(((x10.regionarray.Region)(reg$117254)));
        
        //#line 144 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$120257 = crh$120256.min0;
        
        //#line 144 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        ((x10.regionarray.Array<$U>)alloc$116227).layout_min0 = t$120257;
        
        //#line 145 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$120258 = crh$120256.stride1;
        
        //#line 145 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        ((x10.regionarray.Array<$U>)alloc$116227).layout_stride1 = t$120258;
        
        //#line 146 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$120259 = crh$120256.min1;
        
        //#line 146 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        ((x10.regionarray.Array<$U>)alloc$116227).layout_min1 = t$120259;
        
        //#line 147 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final x10.core.Rail t$120260 = ((x10.core.Rail)(crh$120256.layout));
        
        //#line 147 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        ((x10.regionarray.Array<$U>)alloc$116227).layout = ((x10.core.Rail)(t$120260));
        
        //#line 148 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long n$120261 = crh$120256.size;
        
        //#line 152 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final x10.core.Rail t$120162 = ((x10.core.Rail)(x10.core.Rail.<$U>makeUnsafe($U, ((long)(n$120261)), false)));
        
        //#line 152 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        ((x10.regionarray.Array<$U>)alloc$116227).raw = ((x10.core.Rail)(t$120162));
        
        //#line 872 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final x10.regionarray.Array dst$117260 = ((x10.regionarray.Array)(alloc$116227));
        
        //#line 872 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final x10.core.fun.Fun_0_2 op$117261 = ((x10.core.fun.Fun_0_2)(op));
        
        //#line 872 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final $U unit$117262 = (($U)(unit));
        
        //#line 872 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        x10.regionarray.Array ret$117267 =  null;
        
        //#line 873 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        $U accum$120262 = (($U)(unit$117262));
        
        //#line 874 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final x10.regionarray.Region t$120253 = ((x10.regionarray.Region)(((x10.regionarray.Array<$T>)this$117266).region));
        
        //#line 874 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final x10.lang.Iterator p$120254 = t$120253.iterator();
        
        //#line 874 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        for (;
             true;
             ) {
            
            //#line 874 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final boolean t$120255 = ((x10.lang.Iterator<x10.lang.Point>)p$120254).hasNext$O();
            
            //#line 874 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            if (!(t$120255)) {
                
                //#line 874 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                break;
            }
            
            //#line 874 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.lang.Point p$120244 = ((x10.lang.Point)(((x10.lang.Iterator<x10.lang.Point>)p$120254).next$G()));
            
            //#line 875 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final $U t$120245 = (($U)(accum$120262));
            
            //#line 523 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.lang.Point pt$120246 = ((x10.lang.Point)(p$120244));
            
            //#line 523 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            $T ret$120247 =  null;
            
            //#line 527 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.core.Rail t$120235 = ((x10.core.Rail)(((x10.regionarray.Array<$T>)this$117266).raw));
            
            //#line 1221 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.lang.Point pt$120236 = ((x10.lang.Point)(pt$120246));
            
            //#line 1221 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            long ret$120237 =  0;
            
            //#line 1222 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$120185 = ((long)(((int)(0))));
            
            //#line 1222 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$120186 = pt$120236.$apply$O((long)(t$120185));
            
            //#line 1222 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$120187 = ((x10.regionarray.Array<$T>)this$117266).layout_min0;
            
            //#line 1222 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            long offset$120188 = ((t$120186) - (((long)(t$120187))));
            
            //#line 1223 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$120189 = pt$120236.rank;
            
            //#line 1223 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final boolean t$120190 = ((t$120189) > (((long)(1L))));
            
            //#line 1223 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            if (t$120190) {
                
                //#line 1224 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$120191 = offset$120188;
                
                //#line 1224 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$120192 = ((x10.regionarray.Array<$T>)this$117266).layout_stride1;
                
                //#line 1224 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$120193 = ((t$120191) * (((long)(t$120192))));
                
                //#line 1224 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$120194 = pt$120236.$apply$O((long)(1L));
                
                //#line 1224 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$120195 = ((t$120193) + (((long)(t$120194))));
                
                //#line 1224 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$120196 = ((x10.regionarray.Array<$T>)this$117266).layout_min1;
                
                //#line 1224 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$120197 = ((t$120195) - (((long)(t$120196))));
                
                //#line 1224 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                offset$120188 = t$120197;
                
                //#line 1225 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$120183 = pt$120236.rank;
                
                //#line 1225 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long i$116322max$120184 = ((t$120183) - (((long)(1L))));
                
                //#line 1225 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                long i$120180 = 2L;
                
                //#line 1225 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                for (;
                     true;
                     ) {
                    
                    //#line 1225 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$120181 = i$120180;
                    
                    //#line 1225 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final boolean t$120182 = ((t$120181) <= (((long)(i$116322max$120184))));
                    
                    //#line 1225 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    if (!(t$120182)) {
                        
                        //#line 1225 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        break;
                    }
                    
                    //#line 1225 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long i$120177 = i$120180;
                    
                    //#line 1226 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$120163 = offset$120188;
                    
                    //#line 1226 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final x10.core.Rail t$120164 = ((x10.core.Rail)(((x10.regionarray.Array<$T>)this$117266).layout));
                    
                    //#line 1226 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$120165 = ((i$120177) - (((long)(2L))));
                    
                    //#line 1226 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$120166 = ((2L) * (((long)(t$120165))));
                    
                    //#line 1226 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$120167 = ((long[])t$120164.value)[(int)t$120166];
                    
                    //#line 1226 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$120168 = ((t$120163) * (((long)(t$120167))));
                    
                    //#line 1226 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$120169 = pt$120236.$apply$O((long)(i$120177));
                    
                    //#line 1226 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$120170 = ((t$120168) + (((long)(t$120169))));
                    
                    //#line 1226 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final x10.core.Rail t$120171 = ((x10.core.Rail)(((x10.regionarray.Array<$T>)this$117266).layout));
                    
                    //#line 1226 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$120172 = ((i$120177) - (((long)(2L))));
                    
                    //#line 1226 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$120173 = ((2L) * (((long)(t$120172))));
                    
                    //#line 1226 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$120174 = ((t$120173) + (((long)(1L))));
                    
                    //#line 1226 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$120175 = ((long[])t$120171.value)[(int)t$120174];
                    
                    //#line 1226 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$120176 = ((t$120170) - (((long)(t$120175))));
                    
                    //#line 1226 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    offset$120188 = t$120176;
                    
                    //#line 1225 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$120178 = i$120180;
                    
                    //#line 1225 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$120179 = ((t$120178) + (((long)(1L))));
                    
                    //#line 1225 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    i$120180 = t$120179;
                }
            }
            
            //#line 1229 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$120198 = offset$120188;
            
            //#line 1229 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ret$120237 = t$120198;
            
            //#line 1221 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$120238 = ret$120237;
            
            //#line 527 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final $T t$120239 = (($T)(((x10.core.Rail<$T>)t$120235).$apply$G((long)(t$120238))));
            
            //#line 527 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ret$120247 = (($T)(t$120239));
            
            //#line 523 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final $T t$120248 = (($T)(ret$120247));
            
            //#line 875 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final $U t$120249 = (($U)((($U)
                                        ((x10.core.fun.Fun_0_2<$U,$T,$U>)op$117261).$apply(t$120245, $U, t$120248, $T))));
            
            //#line 875 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            accum$120262 = (($U)(t$120249));
            
            //#line 636 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.lang.Point p$120250 = ((x10.lang.Point)(p$120244));
            
            //#line 636 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final $U v$120251 = (($U)(accum$120262));
            
            //#line 636 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            $U ret$120252 =  null;
            
            //#line 640 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.core.Rail t$120240 = ((x10.core.Rail)(((x10.regionarray.Array<$U>)dst$117260).raw));
            
            //#line 1221 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.lang.Point pt$120241 = ((x10.lang.Point)(p$120250));
            
            //#line 1221 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            long ret$120242 =  0;
            
            //#line 1222 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$120221 = ((long)(((int)(0))));
            
            //#line 1222 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$120222 = pt$120241.$apply$O((long)(t$120221));
            
            //#line 1222 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$120223 = ((x10.regionarray.Array<$U>)dst$117260).layout_min0;
            
            //#line 1222 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            long offset$120224 = ((t$120222) - (((long)(t$120223))));
            
            //#line 1223 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$120225 = pt$120241.rank;
            
            //#line 1223 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final boolean t$120226 = ((t$120225) > (((long)(1L))));
            
            //#line 1223 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            if (t$120226) {
                
                //#line 1224 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$120227 = offset$120224;
                
                //#line 1224 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$120228 = ((x10.regionarray.Array<$U>)dst$117260).layout_stride1;
                
                //#line 1224 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$120229 = ((t$120227) * (((long)(t$120228))));
                
                //#line 1224 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$120230 = pt$120241.$apply$O((long)(1L));
                
                //#line 1224 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$120231 = ((t$120229) + (((long)(t$120230))));
                
                //#line 1224 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$120232 = ((x10.regionarray.Array<$U>)dst$117260).layout_min1;
                
                //#line 1224 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$120233 = ((t$120231) - (((long)(t$120232))));
                
                //#line 1224 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                offset$120224 = t$120233;
                
                //#line 1225 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$120219 = pt$120241.rank;
                
                //#line 1225 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long i$116322max$120220 = ((t$120219) - (((long)(1L))));
                
                //#line 1225 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                long i$120216 = 2L;
                
                //#line 1225 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                for (;
                     true;
                     ) {
                    
                    //#line 1225 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$120217 = i$120216;
                    
                    //#line 1225 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final boolean t$120218 = ((t$120217) <= (((long)(i$116322max$120220))));
                    
                    //#line 1225 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    if (!(t$120218)) {
                        
                        //#line 1225 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        break;
                    }
                    
                    //#line 1225 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long i$120213 = i$120216;
                    
                    //#line 1226 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$120199 = offset$120224;
                    
                    //#line 1226 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final x10.core.Rail t$120200 = ((x10.core.Rail)(((x10.regionarray.Array<$U>)dst$117260).layout));
                    
                    //#line 1226 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$120201 = ((i$120213) - (((long)(2L))));
                    
                    //#line 1226 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$120202 = ((2L) * (((long)(t$120201))));
                    
                    //#line 1226 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$120203 = ((long[])t$120200.value)[(int)t$120202];
                    
                    //#line 1226 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$120204 = ((t$120199) * (((long)(t$120203))));
                    
                    //#line 1226 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$120205 = pt$120241.$apply$O((long)(i$120213));
                    
                    //#line 1226 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$120206 = ((t$120204) + (((long)(t$120205))));
                    
                    //#line 1226 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final x10.core.Rail t$120207 = ((x10.core.Rail)(((x10.regionarray.Array<$U>)dst$117260).layout));
                    
                    //#line 1226 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$120208 = ((i$120213) - (((long)(2L))));
                    
                    //#line 1226 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$120209 = ((2L) * (((long)(t$120208))));
                    
                    //#line 1226 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$120210 = ((t$120209) + (((long)(1L))));
                    
                    //#line 1226 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$120211 = ((long[])t$120207.value)[(int)t$120210];
                    
                    //#line 1226 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$120212 = ((t$120206) - (((long)(t$120211))));
                    
                    //#line 1226 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    offset$120224 = t$120212;
                    
                    //#line 1225 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$120214 = i$120216;
                    
                    //#line 1225 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$120215 = ((t$120214) + (((long)(1L))));
                    
                    //#line 1225 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    i$120216 = t$120215;
                }
            }
            
            //#line 1229 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$120234 = offset$120224;
            
            //#line 1229 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ret$120242 = t$120234;
            
            //#line 1221 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$120243 = ret$120242;
            
            //#line 640 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ((x10.core.Rail<$U>)t$120240).$set__1x10$lang$Rail$$T$G((long)(t$120243), (($U)(v$120251)));
            
            //#line 641 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ret$120252 = (($U)(v$120251));
        }
        
        //#line 878 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        ret$117267 = ((x10.regionarray.Array)(dst$117260));
        
        //#line 872 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final x10.regionarray.Array t$118564 = ((x10.regionarray.Array)(ret$117267));
        
        //#line 855 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        return t$118564;
    }
    
    
    //#line 872 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    public <$U>x10.regionarray.Array scan__0$1x10$regionarray$Array$$U$2__1$1x10$regionarray$Array$$U$3x10$regionarray$Array$$T$3x10$regionarray$Array$$U$2__2x10$regionarray$Array$$U(final x10.rtt.Type $U, final x10.regionarray.Array dst, final x10.core.fun.Fun_0_2 op, final $U unit) {
        
        //#line 873 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        $U accum = (($U)(unit));
        
        //#line 874 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final x10.regionarray.Region t$120354 = ((x10.regionarray.Region)(region));
        
        //#line 874 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final x10.lang.Iterator p$120355 = t$120354.iterator();
        
        //#line 874 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        for (;
             true;
             ) {
            
            //#line 874 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final boolean t$120356 = ((x10.lang.Iterator<x10.lang.Point>)p$120355).hasNext$O();
            
            //#line 874 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            if (!(t$120356)) {
                
                //#line 874 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                break;
            }
            
            //#line 874 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.lang.Point p$120344 = ((x10.lang.Point)(((x10.lang.Iterator<x10.lang.Point>)p$120355).next$G()));
            
            //#line 875 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final $U t$120345 = (($U)(accum));
            
            //#line 875 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.regionarray.Array this$120346 = ((x10.regionarray.Array)(this));
            
            //#line 523 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.lang.Point pt$120347 = ((x10.lang.Point)(p$120344));
            
            //#line 523 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            $T ret$120348 =  null;
            
            //#line 527 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.core.Rail t$120335 = ((x10.core.Rail)(((x10.regionarray.Array<$T>)this$120346).raw));
            
            //#line 1221 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.lang.Point pt$120336 = ((x10.lang.Point)(pt$120347));
            
            //#line 1221 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            long ret$120337 =  0;
            
            //#line 1222 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$120285 = ((long)(((int)(0))));
            
            //#line 1222 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$120286 = pt$120336.$apply$O((long)(t$120285));
            
            //#line 1222 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$120287 = ((x10.regionarray.Array<$T>)this$120346).layout_min0;
            
            //#line 1222 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            long offset$120288 = ((t$120286) - (((long)(t$120287))));
            
            //#line 1223 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$120289 = pt$120336.rank;
            
            //#line 1223 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final boolean t$120290 = ((t$120289) > (((long)(1L))));
            
            //#line 1223 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            if (t$120290) {
                
                //#line 1224 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$120291 = offset$120288;
                
                //#line 1224 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$120292 = ((x10.regionarray.Array<$T>)this$120346).layout_stride1;
                
                //#line 1224 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$120293 = ((t$120291) * (((long)(t$120292))));
                
                //#line 1224 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$120294 = pt$120336.$apply$O((long)(1L));
                
                //#line 1224 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$120295 = ((t$120293) + (((long)(t$120294))));
                
                //#line 1224 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$120296 = ((x10.regionarray.Array<$T>)this$120346).layout_min1;
                
                //#line 1224 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$120297 = ((t$120295) - (((long)(t$120296))));
                
                //#line 1224 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                offset$120288 = t$120297;
                
                //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$120283 = pt$120336.rank;
                
                //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long i$116322max$120284 = ((t$120283) - (((long)(1L))));
                
                //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                long i$120280 = 2L;
                
                //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                for (;
                     true;
                     ) {
                    
                    //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$120281 = i$120280;
                    
                    //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final boolean t$120282 = ((t$120281) <= (((long)(i$116322max$120284))));
                    
                    //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    if (!(t$120282)) {
                        
                        //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        break;
                    }
                    
                    //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long i$120277 = i$120280;
                    
                    //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$120263 = offset$120288;
                    
                    //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final x10.core.Rail t$120264 = ((x10.core.Rail)(((x10.regionarray.Array<$T>)this$120346).layout));
                    
                    //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$120265 = ((i$120277) - (((long)(2L))));
                    
                    //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$120266 = ((2L) * (((long)(t$120265))));
                    
                    //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$120267 = ((long[])t$120264.value)[(int)t$120266];
                    
                    //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$120268 = ((t$120263) * (((long)(t$120267))));
                    
                    //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$120269 = pt$120336.$apply$O((long)(i$120277));
                    
                    //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$120270 = ((t$120268) + (((long)(t$120269))));
                    
                    //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final x10.core.Rail t$120271 = ((x10.core.Rail)(((x10.regionarray.Array<$T>)this$120346).layout));
                    
                    //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$120272 = ((i$120277) - (((long)(2L))));
                    
                    //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$120273 = ((2L) * (((long)(t$120272))));
                    
                    //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$120274 = ((t$120273) + (((long)(1L))));
                    
                    //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$120275 = ((long[])t$120271.value)[(int)t$120274];
                    
                    //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$120276 = ((t$120270) - (((long)(t$120275))));
                    
                    //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    offset$120288 = t$120276;
                    
                    //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$120278 = i$120280;
                    
                    //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$120279 = ((t$120278) + (((long)(1L))));
                    
                    //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    i$120280 = t$120279;
                }
            }
            
            //#line 1229 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$120298 = offset$120288;
            
            //#line 1229 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ret$120337 = t$120298;
            
            //#line 1221 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$120338 = ret$120337;
            
            //#line 527 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final $T t$120339 = (($T)(((x10.core.Rail<$T>)t$120335).$apply$G((long)(t$120338))));
            
            //#line 527 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ret$120348 = (($T)(t$120339));
            
            //#line 523 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final $T t$120349 = (($T)(ret$120348));
            
            //#line 875 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final $U t$120350 = (($U)((($U)
                                        ((x10.core.fun.Fun_0_2<$U,$T,$U>)op).$apply(t$120345, $U, t$120349, $T))));
            
            //#line 875 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            accum = (($U)(t$120350));
            
            //#line 636 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.lang.Point p$120351 = ((x10.lang.Point)(p$120344));
            
            //#line 636 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final $U v$120352 = (($U)(accum));
            
            //#line 636 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            $U ret$120353 =  null;
            
            //#line 640 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.core.Rail t$120340 = ((x10.core.Rail)(((x10.regionarray.Array<$U>)dst).raw));
            
            //#line 1221 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.lang.Point pt$120341 = ((x10.lang.Point)(p$120351));
            
            //#line 1221 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            long ret$120342 =  0;
            
            //#line 1222 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$120321 = ((long)(((int)(0))));
            
            //#line 1222 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$120322 = pt$120341.$apply$O((long)(t$120321));
            
            //#line 1222 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$120323 = ((x10.regionarray.Array<$U>)dst).layout_min0;
            
            //#line 1222 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            long offset$120324 = ((t$120322) - (((long)(t$120323))));
            
            //#line 1223 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$120325 = pt$120341.rank;
            
            //#line 1223 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final boolean t$120326 = ((t$120325) > (((long)(1L))));
            
            //#line 1223 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            if (t$120326) {
                
                //#line 1224 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$120327 = offset$120324;
                
                //#line 1224 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$120328 = ((x10.regionarray.Array<$U>)dst).layout_stride1;
                
                //#line 1224 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$120329 = ((t$120327) * (((long)(t$120328))));
                
                //#line 1224 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$120330 = pt$120341.$apply$O((long)(1L));
                
                //#line 1224 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$120331 = ((t$120329) + (((long)(t$120330))));
                
                //#line 1224 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$120332 = ((x10.regionarray.Array<$U>)dst).layout_min1;
                
                //#line 1224 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$120333 = ((t$120331) - (((long)(t$120332))));
                
                //#line 1224 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                offset$120324 = t$120333;
                
                //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$120319 = pt$120341.rank;
                
                //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long i$116322max$120320 = ((t$120319) - (((long)(1L))));
                
                //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                long i$120316 = 2L;
                
                //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                for (;
                     true;
                     ) {
                    
                    //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$120317 = i$120316;
                    
                    //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final boolean t$120318 = ((t$120317) <= (((long)(i$116322max$120320))));
                    
                    //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    if (!(t$120318)) {
                        
                        //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        break;
                    }
                    
                    //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long i$120313 = i$120316;
                    
                    //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$120299 = offset$120324;
                    
                    //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final x10.core.Rail t$120300 = ((x10.core.Rail)(((x10.regionarray.Array<$U>)dst).layout));
                    
                    //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$120301 = ((i$120313) - (((long)(2L))));
                    
                    //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$120302 = ((2L) * (((long)(t$120301))));
                    
                    //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$120303 = ((long[])t$120300.value)[(int)t$120302];
                    
                    //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$120304 = ((t$120299) * (((long)(t$120303))));
                    
                    //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$120305 = pt$120341.$apply$O((long)(i$120313));
                    
                    //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$120306 = ((t$120304) + (((long)(t$120305))));
                    
                    //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final x10.core.Rail t$120307 = ((x10.core.Rail)(((x10.regionarray.Array<$U>)dst).layout));
                    
                    //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$120308 = ((i$120313) - (((long)(2L))));
                    
                    //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$120309 = ((2L) * (((long)(t$120308))));
                    
                    //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$120310 = ((t$120309) + (((long)(1L))));
                    
                    //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$120311 = ((long[])t$120307.value)[(int)t$120310];
                    
                    //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$120312 = ((t$120306) - (((long)(t$120311))));
                    
                    //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    offset$120324 = t$120312;
                    
                    //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$120314 = i$120316;
                    
                    //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$120315 = ((t$120314) + (((long)(1L))));
                    
                    //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    i$120316 = t$120315;
                }
            }
            
            //#line 1229 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$120334 = offset$120324;
            
            //#line 1229 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ret$120342 = t$120334;
            
            //#line 1221 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$120343 = ret$120342;
            
            //#line 640 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ((x10.core.Rail<$U>)t$120340).$set__1x10$lang$Rail$$T$G((long)(t$120343), (($U)(v$120352)));
            
            //#line 641 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ret$120353 = (($U)(v$120352));
        }
        
        //#line 878 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        return dst;
    }
    
    
    //#line 903 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    public static <$T>void asyncCopy__0$1x10$regionarray$Array$$T$2__1$1x10$regionarray$Array$$T$2(final x10.rtt.Type $T, final x10.regionarray.Array<$T> src, final x10.regionarray.RemoteArray<$T> dst) {
        
        //#line 904 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final x10.core.Rail t$118643 = ((x10.core.Rail)(((x10.regionarray.Array<$T>)src).raw));
        
        //#line 904 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final x10.lang.GlobalRail t$118644 = ((x10.lang.GlobalRail)(((x10.regionarray.RemoteArray<$T>)dst).rawData));
        
        //#line 904 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final x10.core.Rail t$118642 = ((x10.core.Rail)(((x10.regionarray.Array<$T>)src).raw));
        
        //#line 904 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$118645 = ((x10.core.Rail<$T>)t$118642).size;
        
        //#line 904 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        x10.core.Rail.<$T> asyncCopy__0$1x10$lang$Rail$$T$2__2$1x10$lang$Rail$$T$2($T, ((x10.core.Rail)(t$118643)), (long)(0L), ((x10.lang.GlobalRail)(t$118644)), (long)(0L), (long)(t$118645));
    }
    
    
    //#line 934 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    public static <$T>void asyncCopy__0$1x10$regionarray$Array$$T$2__2$1x10$regionarray$Array$$T$2(final x10.rtt.Type $T, final x10.regionarray.Array<$T> src, final x10.lang.Point srcPoint, final x10.regionarray.RemoteArray<$T> dst, final x10.lang.Point dstPoint, final long numElems) {
        
        //#line 937 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final x10.core.GlobalRef gra = ((x10.core.GlobalRef)(((x10.regionarray.RemoteArray<$T>)dst).array));
        
        //#line 938 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final x10.lang.Place t$114709 = ((x10.lang.Place)((gra).home));
        
        //#line 938 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long dstIndex = x10.core.Long.$unbox(x10.lang.Runtime.<x10.core.Long> evalAt__1$1x10$lang$Runtime$$T$2$G(x10.rtt.Types.LONG, ((x10.lang.Place)(t$114709)), ((x10.core.fun.Fun_0_0)(new x10.regionarray.Array.$Closure$191<$T>($T, gra, dstPoint, (x10.regionarray.Array.$Closure$191.__0$1x10$regionarray$Array$1x10$regionarray$Array$$Closure$191$$T$2$2) null))), ((x10.lang.Runtime.Profile)(null))));
        
        //#line 978 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final x10.regionarray.Array src$117316 = ((x10.regionarray.Array)(src));
        
        //#line 939 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final x10.regionarray.Region t$118646 = ((x10.regionarray.Region)(((x10.regionarray.Array<$T>)src).region));
        
        //#line 978 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long srcIndex$117317 = t$118646.indexOf$O(((x10.lang.Point)(srcPoint)));
        
        //#line 979 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final x10.regionarray.RemoteArray dst$117318 = ((x10.regionarray.RemoteArray)(dst));
        
        //#line 979 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long dstIndex$117319 = dstIndex;
        
        //#line 980 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long numElems$117320 = numElems;
        
        //#line 981 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final x10.core.Rail t$120357 = ((x10.core.Rail)(((x10.regionarray.Array<$T>)src$117316).raw));
        
        //#line 981 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final x10.lang.GlobalRail t$120358 = ((x10.lang.GlobalRail)(((x10.regionarray.RemoteArray<$T>)dst$117318).rawData));
        
        //#line 981 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        x10.core.Rail.<$T> asyncCopy__0$1x10$lang$Rail$$T$2__2$1x10$lang$Rail$$T$2($T, ((x10.core.Rail)(t$120357)), (long)(srcIndex$117317), ((x10.lang.GlobalRail)(t$120358)), (long)(dstIndex$117319), (long)(numElems$117320));
    }
    
    
    //#line 978 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    public static <$T>void asyncCopy__0$1x10$regionarray$Array$$T$2__2$1x10$regionarray$Array$$T$2(final x10.rtt.Type $T, final x10.regionarray.Array<$T> src, final long srcIndex, final x10.regionarray.RemoteArray<$T> dst, final long dstIndex, final long numElems) {
        
        //#line 981 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final x10.core.Rail t$118649 = ((x10.core.Rail)(((x10.regionarray.Array<$T>)src).raw));
        
        //#line 981 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final x10.lang.GlobalRail t$118650 = ((x10.lang.GlobalRail)(((x10.regionarray.RemoteArray<$T>)dst).rawData));
        
        //#line 981 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        x10.core.Rail.<$T> asyncCopy__0$1x10$lang$Rail$$T$2__2$1x10$lang$Rail$$T$2($T, ((x10.core.Rail)(t$118649)), (long)(srcIndex), ((x10.lang.GlobalRail)(t$118650)), (long)(dstIndex), (long)(numElems));
    }
    
    
    //#line 1006 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    public static <$T>void asyncCopy__0$1x10$regionarray$Array$$T$2__1$1x10$regionarray$Array$$T$2(final x10.rtt.Type $T, final x10.regionarray.RemoteArray<$T> src, final x10.regionarray.Array<$T> dst) {
        
        //#line 1007 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final x10.lang.GlobalRail t$118652 = ((x10.lang.GlobalRail)(((x10.regionarray.RemoteArray<$T>)src).rawData));
        
        //#line 1007 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final x10.core.Rail t$118653 = ((x10.core.Rail)(((x10.regionarray.Array<$T>)dst).raw));
        
        //#line 1007 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final x10.core.Rail t$118651 = ((x10.core.Rail)(((x10.regionarray.Array<$T>)dst).raw));
        
        //#line 1007 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$118654 = ((x10.core.Rail<$T>)t$118651).size;
        
        //#line 1007 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        x10.core.Rail.<$T> asyncCopy__0$1x10$lang$Rail$$T$2__2$1x10$lang$Rail$$T$2($T, ((x10.lang.GlobalRail)(t$118652)), (long)(0L), ((x10.core.Rail)(t$118653)), (long)(0L), (long)(t$118654));
    }
    
    
    //#line 1037 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    public static <$T>void asyncCopy__0$1x10$regionarray$Array$$T$2__2$1x10$regionarray$Array$$T$2(final x10.rtt.Type $T, final x10.regionarray.RemoteArray<$T> src, final x10.lang.Point srcPoint, final x10.regionarray.Array<$T> dst, final x10.lang.Point dstPoint, final long numElems) {
        
        //#line 1040 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final x10.core.GlobalRef gra = ((x10.core.GlobalRef)(((x10.regionarray.RemoteArray<$T>)src).array));
        
        //#line 1041 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final x10.lang.Place t$114713 = ((x10.lang.Place)((gra).home));
        
        //#line 1041 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long srcIndex = x10.core.Long.$unbox(x10.lang.Runtime.<x10.core.Long> evalAt__1$1x10$lang$Runtime$$T$2$G(x10.rtt.Types.LONG, ((x10.lang.Place)(t$114713)), ((x10.core.fun.Fun_0_0)(new x10.regionarray.Array.$Closure$192<$T>($T, gra, srcPoint, (x10.regionarray.Array.$Closure$192.__0$1x10$regionarray$Array$1x10$regionarray$Array$$Closure$192$$T$2$2) null))), ((x10.lang.Runtime.Profile)(null))));
        
        //#line 1081 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final x10.regionarray.RemoteArray src$117323 = ((x10.regionarray.RemoteArray)(src));
        
        //#line 1081 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long srcIndex$117324 = srcIndex;
        
        //#line 1082 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final x10.regionarray.Array dst$117325 = ((x10.regionarray.Array)(dst));
        
        //#line 1042 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final x10.regionarray.Region t$118655 = ((x10.regionarray.Region)(((x10.regionarray.Array<$T>)dst).region));
        
        //#line 1082 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long dstIndex$117326 = t$118655.indexOf$O(((x10.lang.Point)(dstPoint)));
        
        //#line 1083 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long numElems$117327 = numElems;
        
        //#line 1084 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final x10.lang.GlobalRail t$120359 = ((x10.lang.GlobalRail)(((x10.regionarray.RemoteArray<$T>)src$117323).rawData));
        
        //#line 1084 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final x10.core.Rail t$120360 = ((x10.core.Rail)(((x10.regionarray.Array<$T>)dst$117325).raw));
        
        //#line 1084 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        x10.core.Rail.<$T> asyncCopy__0$1x10$lang$Rail$$T$2__2$1x10$lang$Rail$$T$2($T, ((x10.lang.GlobalRail)(t$120359)), (long)(srcIndex$117324), ((x10.core.Rail)(t$120360)), (long)(dstIndex$117326), (long)(numElems$117327));
    }
    
    
    //#line 1081 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    public static <$T>void asyncCopy__0$1x10$regionarray$Array$$T$2__2$1x10$regionarray$Array$$T$2(final x10.rtt.Type $T, final x10.regionarray.RemoteArray<$T> src, final long srcIndex, final x10.regionarray.Array<$T> dst, final long dstIndex, final long numElems) {
        
        //#line 1084 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final x10.lang.GlobalRail t$118658 = ((x10.lang.GlobalRail)(((x10.regionarray.RemoteArray<$T>)src).rawData));
        
        //#line 1084 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final x10.core.Rail t$118659 = ((x10.core.Rail)(((x10.regionarray.Array<$T>)dst).raw));
        
        //#line 1084 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        x10.core.Rail.<$T> asyncCopy__0$1x10$lang$Rail$$T$2__2$1x10$lang$Rail$$T$2($T, ((x10.lang.GlobalRail)(t$118658)), (long)(srcIndex), ((x10.core.Rail)(t$118659)), (long)(dstIndex), (long)(numElems));
    }
    
    
    //#line 1099 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    public static <$T>void copy__0$1x10$regionarray$Array$$T$2__1$1x10$regionarray$Array$$T$2(final x10.rtt.Type $T, final x10.regionarray.Array<$T> src, final x10.regionarray.Array<$T> dst) {
        
        //#line 1100 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final x10.core.Rail t$118661 = ((x10.core.Rail)(((x10.regionarray.Array<$T>)src).raw));
        
        //#line 1100 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final x10.core.Rail t$118662 = ((x10.core.Rail)(((x10.regionarray.Array<$T>)dst).raw));
        
        //#line 1100 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final x10.core.Rail t$118660 = ((x10.core.Rail)(((x10.regionarray.Array<$T>)src).raw));
        
        //#line 1100 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$118663 = ((x10.core.Rail<$T>)t$118660).size;
        
        //#line 1100 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        x10.core.Rail.<$T> copy__0$1x10$lang$Rail$$T$2__2$1x10$lang$Rail$$T$2($T, ((x10.core.Rail)(t$118661)), (long)(0L), ((x10.core.Rail)(t$118662)), (long)(0L), (long)(t$118663));
    }
    
    
    //#line 1121 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    public static <$T>void copy__0$1x10$regionarray$Array$$T$2__2$1x10$regionarray$Array$$T$2(final x10.rtt.Type $T, final x10.regionarray.Array<$T> src, final x10.lang.Point srcPoint, final x10.regionarray.Array<$T> dst, final x10.lang.Point dstPoint, final long numElems) {
        
        //#line 1154 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final x10.regionarray.Array src$117330 = ((x10.regionarray.Array)(src));
        
        //#line 1124 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final x10.regionarray.Region t$118664 = ((x10.regionarray.Region)(((x10.regionarray.Array<$T>)src).region));
        
        //#line 1154 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long srcIndex$117331 = t$118664.indexOf$O(((x10.lang.Point)(srcPoint)));
        
        //#line 1155 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final x10.regionarray.Array dst$117332 = ((x10.regionarray.Array)(dst));
        
        //#line 1124 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final x10.regionarray.Region t$118665 = ((x10.regionarray.Region)(((x10.regionarray.Array<$T>)dst).region));
        
        //#line 1155 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long dstIndex$117333 = t$118665.indexOf$O(((x10.lang.Point)(dstPoint)));
        
        //#line 1156 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long numElems$117334 = numElems;
        
        //#line 1157 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final x10.core.Rail t$120361 = ((x10.core.Rail)(((x10.regionarray.Array<$T>)src$117330).raw));
        
        //#line 1157 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final x10.core.Rail t$120362 = ((x10.core.Rail)(((x10.regionarray.Array<$T>)dst$117332).raw));
        
        //#line 1157 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        x10.core.Rail.<$T> copy__0$1x10$lang$Rail$$T$2__2$1x10$lang$Rail$$T$2($T, ((x10.core.Rail)(t$120361)), (long)(srcIndex$117331), ((x10.core.Rail)(t$120362)), (long)(dstIndex$117333), (long)(numElems$117334));
    }
    
    
    //#line 1154 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    public static <$T>void copy__0$1x10$regionarray$Array$$T$2__2$1x10$regionarray$Array$$T$2(final x10.rtt.Type $T, final x10.regionarray.Array<$T> src, final long srcIndex, final x10.regionarray.Array<$T> dst, final long dstIndex, final long numElems) {
        
        //#line 1157 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final x10.core.Rail t$118668 = ((x10.core.Rail)(((x10.regionarray.Array<$T>)src).raw));
        
        //#line 1157 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final x10.core.Rail t$118669 = ((x10.core.Rail)(((x10.regionarray.Array<$T>)dst).raw));
        
        //#line 1157 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        x10.core.Rail.<$T> copy__0$1x10$lang$Rail$$T$2__2$1x10$lang$Rail$$T$2($T, ((x10.core.Rail)(t$118668)), (long)(srcIndex), ((x10.core.Rail)(t$118669)), (long)(dstIndex), (long)(numElems));
    }
    
    
    //#line 1161 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    private static void raiseBoundsError(final long i0) {
        
        //#line 1162 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final java.lang.String t$118670 = (("point (") + ((x10.core.Long.$box(i0))));
        
        //#line 1162 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final java.lang.String t$118671 = ((t$118670) + (") not contained in array"));
        
        //#line 1162 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final java.lang.ArrayIndexOutOfBoundsException t$118672 = ((java.lang.ArrayIndexOutOfBoundsException)(new java.lang.ArrayIndexOutOfBoundsException(t$118671)));
        
        //#line 1162 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        throw t$118672;
    }
    
    public static void raiseBoundsError$P(final long i0) {
        x10.regionarray.Array.raiseBoundsError((long)(i0));
    }
    
    
    //#line 1164 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    private static void raiseBoundsError(final long i0, final long i1) {
        
        //#line 1165 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final java.lang.String t$118673 = (("point (") + ((x10.core.Long.$box(i0))));
        
        //#line 1165 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final java.lang.String t$118674 = ((t$118673) + (", "));
        
        //#line 1165 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final java.lang.String t$118675 = ((t$118674) + ((x10.core.Long.$box(i1))));
        
        //#line 1165 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final java.lang.String t$118676 = ((t$118675) + (") not contained in array"));
        
        //#line 1165 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final java.lang.ArrayIndexOutOfBoundsException t$118677 = ((java.lang.ArrayIndexOutOfBoundsException)(new java.lang.ArrayIndexOutOfBoundsException(t$118676)));
        
        //#line 1165 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        throw t$118677;
    }
    
    public static void raiseBoundsError$P(final long i0, final long i1) {
        x10.regionarray.Array.raiseBoundsError((long)(i0), (long)(i1));
    }
    
    
    //#line 1167 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    private static void raiseBoundsError(final long i0, final long i1, final long i2) {
        
        //#line 1168 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final java.lang.String t$118678 = (("point (") + ((x10.core.Long.$box(i0))));
        
        //#line 1168 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final java.lang.String t$118679 = ((t$118678) + (", "));
        
        //#line 1168 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final java.lang.String t$118680 = ((t$118679) + ((x10.core.Long.$box(i1))));
        
        //#line 1168 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final java.lang.String t$118681 = ((t$118680) + (", "));
        
        //#line 1168 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final java.lang.String t$118682 = ((t$118681) + ((x10.core.Long.$box(i2))));
        
        //#line 1168 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final java.lang.String t$118683 = ((t$118682) + (") not contained in array"));
        
        //#line 1168 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final java.lang.ArrayIndexOutOfBoundsException t$118684 = ((java.lang.ArrayIndexOutOfBoundsException)(new java.lang.ArrayIndexOutOfBoundsException(t$118683)));
        
        //#line 1168 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        throw t$118684;
    }
    
    public static void raiseBoundsError$P(final long i0, final long i1, final long i2) {
        x10.regionarray.Array.raiseBoundsError((long)(i0), (long)(i1), (long)(i2));
    }
    
    
    //#line 1170 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    private static void raiseBoundsError(final long i0, final long i1, final long i2, final long i3) {
        
        //#line 1171 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final java.lang.String t$118685 = (("point (") + ((x10.core.Long.$box(i0))));
        
        //#line 1171 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final java.lang.String t$118686 = ((t$118685) + (", "));
        
        //#line 1171 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final java.lang.String t$118687 = ((t$118686) + ((x10.core.Long.$box(i1))));
        
        //#line 1171 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final java.lang.String t$118688 = ((t$118687) + (", "));
        
        //#line 1171 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final java.lang.String t$118689 = ((t$118688) + ((x10.core.Long.$box(i2))));
        
        //#line 1171 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final java.lang.String t$118690 = ((t$118689) + (", "));
        
        //#line 1171 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final java.lang.String t$118691 = ((t$118690) + ((x10.core.Long.$box(i3))));
        
        //#line 1171 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final java.lang.String t$118692 = ((t$118691) + (") not contained in array"));
        
        //#line 1171 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final java.lang.ArrayIndexOutOfBoundsException t$118693 = ((java.lang.ArrayIndexOutOfBoundsException)(new java.lang.ArrayIndexOutOfBoundsException(t$118692)));
        
        //#line 1171 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        throw t$118693;
    }
    
    public static void raiseBoundsError$P(final long i0, final long i1, final long i2, final long i3) {
        x10.regionarray.Array.raiseBoundsError((long)(i0), (long)(i1), (long)(i2), (long)(i3));
    }
    
    
    //#line 1173 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    private static void raiseBoundsError(final x10.lang.Point pt) {
        
        //#line 1174 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final java.lang.String t$118694 = (("point ") + (pt));
        
        //#line 1174 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final java.lang.String t$118695 = ((t$118694) + (" not contained in array"));
        
        //#line 1174 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final java.lang.ArrayIndexOutOfBoundsException t$118696 = ((java.lang.ArrayIndexOutOfBoundsException)(new java.lang.ArrayIndexOutOfBoundsException(t$118695)));
        
        //#line 1174 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        throw t$118696;
    }
    
    public static void raiseBoundsError$P(final x10.lang.Point pt) {
        x10.regionarray.Array.raiseBoundsError(((x10.lang.Point)(pt)));
    }
    
    
    //#line 1184 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    public long layout_min0;
    
    //#line 1185 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    public long layout_stride1;
    
    //#line 1186 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    public long layout_min1;
    
    //#line 1194 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    public x10.core.Rail<x10.core.Long> layout;
    
    
    //#line 1197 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    private long offset$O(final long i0) {
        
        //#line 1197 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$118697 = layout_min0;
        
        //#line 1197 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$118698 = ((i0) - (((long)(t$118697))));
        
        //#line 1197 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        return t$118698;
    }
    
    public static <$T>long offset$P__1$1x10$regionarray$Array$$T$2$O(final x10.rtt.Type $T, final long i0, final x10.regionarray.Array<$T> Array) {
        return ((x10.regionarray.Array<$T>)Array).offset$O((long)(i0));
    }
    
    
    //#line 1200 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    private long offset$O(final long i0, final long i1) {
        
        //#line 1201 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$118699 = layout_min0;
        
        //#line 1201 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        long offset = ((i0) - (((long)(t$118699))));
        
        //#line 1202 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$118700 = offset;
        
        //#line 1202 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$118701 = layout_stride1;
        
        //#line 1202 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$118702 = ((t$118700) * (((long)(t$118701))));
        
        //#line 1202 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$118703 = ((t$118702) + (((long)(i1))));
        
        //#line 1202 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$118704 = layout_min1;
        
        //#line 1202 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$118705 = ((t$118703) - (((long)(t$118704))));
        
        //#line 1202 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        offset = t$118705;
        
        //#line 1203 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$118706 = offset;
        
        //#line 1203 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        return t$118706;
    }
    
    public static <$T>long offset$P__2$1x10$regionarray$Array$$T$2$O(final x10.rtt.Type $T, final long i0, final long i1, final x10.regionarray.Array<$T> Array) {
        return ((x10.regionarray.Array<$T>)Array).offset$O((long)(i0), (long)(i1));
    }
    
    
    //#line 1206 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    private long offset$O(final long i0, final long i1, final long i2) {
        
        //#line 1207 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$118707 = layout_min0;
        
        //#line 1207 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        long offset = ((i0) - (((long)(t$118707))));
        
        //#line 1208 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$118708 = offset;
        
        //#line 1208 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$118709 = layout_stride1;
        
        //#line 1208 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$118710 = ((t$118708) * (((long)(t$118709))));
        
        //#line 1208 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$118711 = ((t$118710) + (((long)(i1))));
        
        //#line 1208 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$118712 = layout_min1;
        
        //#line 1208 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$118713 = ((t$118711) - (((long)(t$118712))));
        
        //#line 1208 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        offset = t$118713;
        
        //#line 1209 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$118715 = offset;
        
        //#line 1209 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final x10.core.Rail t$118714 = ((x10.core.Rail)(layout));
        
        //#line 1209 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$118716 = ((long[])t$118714.value)[(int)0L];
        
        //#line 1209 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$118717 = ((t$118715) * (((long)(t$118716))));
        
        //#line 1209 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$118719 = ((t$118717) + (((long)(i2))));
        
        //#line 1209 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final x10.core.Rail t$118718 = ((x10.core.Rail)(layout));
        
        //#line 1209 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$118720 = ((long[])t$118718.value)[(int)1L];
        
        //#line 1209 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$118721 = ((t$118719) - (((long)(t$118720))));
        
        //#line 1209 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        offset = t$118721;
        
        //#line 1210 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$118722 = offset;
        
        //#line 1210 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        return t$118722;
    }
    
    public static <$T>long offset$P__3$1x10$regionarray$Array$$T$2$O(final x10.rtt.Type $T, final long i0, final long i1, final long i2, final x10.regionarray.Array<$T> Array) {
        return ((x10.regionarray.Array<$T>)Array).offset$O((long)(i0), (long)(i1), (long)(i2));
    }
    
    
    //#line 1213 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    private long offset$O(final long i0, final long i1, final long i2, final long i3) {
        
        //#line 1214 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$118723 = layout_min0;
        
        //#line 1214 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        long offset = ((i0) - (((long)(t$118723))));
        
        //#line 1215 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$118724 = offset;
        
        //#line 1215 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$118725 = layout_stride1;
        
        //#line 1215 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$118726 = ((t$118724) * (((long)(t$118725))));
        
        //#line 1215 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$118727 = ((t$118726) + (((long)(i1))));
        
        //#line 1215 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$118728 = layout_min1;
        
        //#line 1215 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$118729 = ((t$118727) - (((long)(t$118728))));
        
        //#line 1215 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        offset = t$118729;
        
        //#line 1216 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$118731 = offset;
        
        //#line 1216 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final x10.core.Rail t$118730 = ((x10.core.Rail)(layout));
        
        //#line 1216 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$118732 = ((long[])t$118730.value)[(int)0L];
        
        //#line 1216 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$118733 = ((t$118731) * (((long)(t$118732))));
        
        //#line 1216 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$118735 = ((t$118733) + (((long)(i2))));
        
        //#line 1216 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final x10.core.Rail t$118734 = ((x10.core.Rail)(layout));
        
        //#line 1216 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$118736 = ((long[])t$118734.value)[(int)1L];
        
        //#line 1216 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$118737 = ((t$118735) - (((long)(t$118736))));
        
        //#line 1216 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        offset = t$118737;
        
        //#line 1217 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$118739 = offset;
        
        //#line 1217 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final x10.core.Rail t$118738 = ((x10.core.Rail)(layout));
        
        //#line 1217 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$118740 = ((long[])t$118738.value)[(int)2L];
        
        //#line 1217 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$118741 = ((t$118739) * (((long)(t$118740))));
        
        //#line 1217 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$118743 = ((t$118741) + (((long)(i3))));
        
        //#line 1217 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final x10.core.Rail t$118742 = ((x10.core.Rail)(layout));
        
        //#line 1217 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$118744 = ((long[])t$118742.value)[(int)3L];
        
        //#line 1217 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$118745 = ((t$118743) - (((long)(t$118744))));
        
        //#line 1217 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        offset = t$118745;
        
        //#line 1218 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$118746 = offset;
        
        //#line 1218 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        return t$118746;
    }
    
    public static <$T>long offset$P__4$1x10$regionarray$Array$$T$2$O(final x10.rtt.Type $T, final long i0, final long i1, final long i2, final long i3, final x10.regionarray.Array<$T> Array) {
        return ((x10.regionarray.Array<$T>)Array).offset$O((long)(i0), (long)(i1), (long)(i2), (long)(i3));
    }
    
    
    //#line 1221 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    private long offset$O(final x10.lang.Point pt) {
        
        //#line 1222 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$118747 = ((long)(((int)(0))));
        
        //#line 1222 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$118748 = pt.$apply$O((long)(t$118747));
        
        //#line 1222 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$118749 = layout_min0;
        
        //#line 1222 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        long offset = ((t$118748) - (((long)(t$118749))));
        
        //#line 1223 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$118750 = pt.rank;
        
        //#line 1223 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final boolean t$118778 = ((t$118750) > (((long)(1L))));
        
        //#line 1223 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        if (t$118778) {
            
            //#line 1224 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$118751 = offset;
            
            //#line 1224 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$118752 = layout_stride1;
            
            //#line 1224 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$118753 = ((t$118751) * (((long)(t$118752))));
            
            //#line 1224 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$118754 = pt.$apply$O((long)(1L));
            
            //#line 1224 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$118755 = ((t$118753) + (((long)(t$118754))));
            
            //#line 1224 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$118756 = layout_min1;
            
            //#line 1224 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$118757 = ((t$118755) - (((long)(t$118756))));
            
            //#line 1224 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            offset = t$118757;
            
            //#line 1225 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$120383 = pt.rank;
            
            //#line 1225 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long i$116322max$120384 = ((t$120383) - (((long)(1L))));
            
            //#line 1225 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            long i$120380 = 2L;
            
            //#line 1225 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            for (;
                 true;
                 ) {
                
                //#line 1225 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$120381 = i$120380;
                
                //#line 1225 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final boolean t$120382 = ((t$120381) <= (((long)(i$116322max$120384))));
                
                //#line 1225 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                if (!(t$120382)) {
                    
                    //#line 1225 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    break;
                }
                
                //#line 1225 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long i$120377 = i$120380;
                
                //#line 1226 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$120363 = offset;
                
                //#line 1226 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final x10.core.Rail t$120364 = ((x10.core.Rail)(layout));
                
                //#line 1226 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$120365 = ((i$120377) - (((long)(2L))));
                
                //#line 1226 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$120366 = ((2L) * (((long)(t$120365))));
                
                //#line 1226 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$120367 = ((long[])t$120364.value)[(int)t$120366];
                
                //#line 1226 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$120368 = ((t$120363) * (((long)(t$120367))));
                
                //#line 1226 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$120369 = pt.$apply$O((long)(i$120377));
                
                //#line 1226 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$120370 = ((t$120368) + (((long)(t$120369))));
                
                //#line 1226 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final x10.core.Rail t$120371 = ((x10.core.Rail)(layout));
                
                //#line 1226 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$120372 = ((i$120377) - (((long)(2L))));
                
                //#line 1226 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$120373 = ((2L) * (((long)(t$120372))));
                
                //#line 1226 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$120374 = ((t$120373) + (((long)(1L))));
                
                //#line 1226 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$120375 = ((long[])t$120371.value)[(int)t$120374];
                
                //#line 1226 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$120376 = ((t$120370) - (((long)(t$120375))));
                
                //#line 1226 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                offset = t$120376;
                
                //#line 1225 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$120378 = i$120380;
                
                //#line 1225 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$120379 = ((t$120378) + (((long)(1L))));
                
                //#line 1225 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                i$120380 = t$120379;
            }
        }
        
        //#line 1229 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final long t$118779 = offset;
        
        //#line 1229 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        return t$118779;
    }
    
    public static <$T>long offset$P__1$1x10$regionarray$Array$$T$2$O(final x10.rtt.Type $T, final x10.lang.Point pt, final x10.regionarray.Array<$T> Array) {
        return ((x10.regionarray.Array<$T>)Array).offset$O(((x10.lang.Point)(pt)));
    }
    
    
    //#line 1238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    @x10.runtime.impl.java.X10Generated
    public static class LayoutHelper extends x10.core.Struct implements x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<LayoutHelper> $RTT = 
            x10.rtt.NamedStructType.<LayoutHelper> make("x10.regionarray.Array.LayoutHelper",
                                                        LayoutHelper.class,
                                                        new x10.rtt.Type[] {
                                                            x10.rtt.Types.STRUCT
                                                        });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.regionarray.Array.LayoutHelper $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.min0 = $deserializer.readLong();
            $_obj.stride1 = $deserializer.readLong();
            $_obj.min1 = $deserializer.readLong();
            $_obj.size = $deserializer.readLong();
            $_obj.layout = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.regionarray.Array.LayoutHelper $_obj = new x10.regionarray.Array.LayoutHelper((java.lang.System[]) null);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.min0);
            $serializer.write(this.stride1);
            $serializer.write(this.min1);
            $serializer.write(this.size);
            $serializer.write(this.layout);
            
        }
        
        // zero value constructor
        public LayoutHelper(final java.lang.System $dummy) { this.min0 = 0L; this.stride1 = 0L; this.min1 = 0L; this.size = 0L; this.layout = null; }
        
        // constructor just for allocation
        public LayoutHelper(final java.lang.System[] $dummy) {
            
        }
        
        
    
        
        //#line 1239 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        public long min0;
        
        //#line 1240 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        public long stride1;
        
        //#line 1241 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        public long min1;
        
        //#line 1242 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        public long size;
        
        //#line 1243 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        public x10.core.Rail<x10.core.Long> layout;
        
        
        //#line 1245 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        // creation method for java code (1-phase java constructor)
        public LayoutHelper(final x10.regionarray.Region reg) {
            this((java.lang.System[]) null);
            x10$regionarray$Array$LayoutHelper$$init$S(reg);
        }
        
        // constructor for non-virtual call
        final public x10.regionarray.Array.LayoutHelper x10$regionarray$Array$LayoutHelper$$init$S(final x10.regionarray.Region reg) {
             {
                
                //#line 1245 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                
                
                //#line 1238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final x10.regionarray.Array.LayoutHelper this$120407 = this;
                
                //#line 1246 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final boolean t$118841 = reg.isEmpty$O();
                
                //#line 1246 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                if (t$118841) {
                    
                    //#line 1247 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$118780 = this.min1 = 0L;
                    
                    //#line 1247 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$118781 = this.stride1 = t$118780;
                    
                    //#line 1247 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    this.min0 = t$118781;
                    
                    //#line 1248 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    this.size = 0L;
                    
                    //#line 1249 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    this.layout = null;
                } else {
                    
                    //#line 1251 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$118782 = reg.rank;
                    
                    //#line 1251 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final boolean t$118840 = ((long) t$118782) == ((long) 1L);
                    
                    //#line 1251 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    if (t$118840) {
                        
                        //#line 1252 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final long t$118783 = ((long)(((int)(0))));
                        
                        //#line 1252 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final long t$118784 = reg.min$O((long)(t$118783));
                        
                        //#line 1252 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        this.min0 = t$118784;
                        
                        //#line 1253 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        this.stride1 = 0L;
                        
                        //#line 1254 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        this.min1 = 0L;
                        
                        //#line 1255 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final long t$118785 = reg.max$O((long)(0L));
                        
                        //#line 1255 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final long t$118786 = reg.min$O((long)(0L));
                        
                        //#line 1255 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final long t$118787 = ((t$118785) - (((long)(t$118786))));
                        
                        //#line 1255 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final long t$118788 = ((t$118787) + (((long)(1L))));
                        
                        //#line 1255 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        this.size = t$118788;
                        
                        //#line 1256 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        this.layout = null;
                    } else {
                        
                        //#line 1257 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final long t$118789 = reg.rank;
                        
                        //#line 1257 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final boolean t$118839 = ((long) t$118789) == ((long) 2L);
                        
                        //#line 1257 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        if (t$118839) {
                            
                            //#line 1258 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                            final long t$118790 = reg.min$O((long)(0L));
                            
                            //#line 1258 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                            this.min0 = t$118790;
                            
                            //#line 1259 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                            final long t$118791 = reg.min$O((long)(1L));
                            
                            //#line 1259 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                            this.min1 = t$118791;
                            
                            //#line 1260 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                            final long t$118792 = reg.max$O((long)(1L));
                            
                            //#line 1260 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                            final long t$118793 = reg.min$O((long)(1L));
                            
                            //#line 1260 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                            final long t$118794 = ((t$118792) - (((long)(t$118793))));
                            
                            //#line 1260 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                            final long t$118795 = ((t$118794) + (((long)(1L))));
                            
                            //#line 1260 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                            this.stride1 = t$118795;
                            
                            //#line 1261 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                            final long t$118799 = stride1;
                            
                            //#line 1261 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                            final long t$118796 = reg.max$O((long)(0L));
                            
                            //#line 1261 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                            final long t$118797 = reg.min$O((long)(0L));
                            
                            //#line 1261 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                            final long t$118798 = ((t$118796) - (((long)(t$118797))));
                            
                            //#line 1261 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                            final long t$118800 = ((t$118798) + (((long)(1L))));
                            
                            //#line 1261 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                            final long t$118801 = ((t$118799) * (((long)(t$118800))));
                            
                            //#line 1261 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                            this.size = t$118801;
                            
                            //#line 1262 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                            this.layout = null;
                        } else {
                            
                            //#line 1264 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                            final long t$118802 = reg.rank;
                            
                            //#line 1264 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                            final long t$118803 = ((t$118802) - (((long)(2L))));
                            
                            //#line 1264 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                            final long t$118804 = ((2L) * (((long)(t$118803))));
                            
                            //#line 1264 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                            final x10.core.Rail t$118805 = ((x10.core.Rail)(new x10.core.Rail<x10.core.Long>(x10.rtt.Types.LONG, t$118804)));
                            
                            //#line 1264 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                            this.layout = ((x10.core.Rail)(t$118805));
                            
                            //#line 1265 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                            final long t$118806 = reg.min$O((long)(0L));
                            
                            //#line 1265 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                            this.min0 = t$118806;
                            
                            //#line 1266 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                            final long t$118807 = reg.min$O((long)(1L));
                            
                            //#line 1266 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                            this.min1 = t$118807;
                            
                            //#line 1267 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                            final long t$118808 = reg.max$O((long)(1L));
                            
                            //#line 1267 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                            final long t$118809 = reg.min$O((long)(1L));
                            
                            //#line 1267 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                            final long t$118810 = ((t$118808) - (((long)(t$118809))));
                            
                            //#line 1267 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                            final long t$118811 = ((t$118810) + (((long)(1L))));
                            
                            //#line 1267 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                            this.stride1 = t$118811;
                            
                            //#line 1268 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                            final long t$118817 = stride1;
                            
                            //#line 1268 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                            final long t$118812 = ((long)(((int)(0))));
                            
                            //#line 1268 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                            final long t$118814 = reg.max$O((long)(t$118812));
                            
                            //#line 1268 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                            final long t$118813 = ((long)(((int)(0))));
                            
                            //#line 1268 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                            final long t$118815 = reg.min$O((long)(t$118813));
                            
                            //#line 1268 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                            final long t$118816 = ((t$118814) - (((long)(t$118815))));
                            
                            //#line 1268 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                            final long t$118818 = ((t$118816) + (((long)(1L))));
                            
                            //#line 1268 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                            long sz = ((t$118817) * (((long)(t$118818))));
                            
                            //#line 1269 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                            final long t$120405 = reg.rank;
                            
                            //#line 1269 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                            final long i$116340max$120406 = ((t$120405) - (((long)(1L))));
                            
                            //#line 1269 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                            long i$120402 = 2L;
                            
                            //#line 1269 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                            for (;
                                 true;
                                 ) {
                                
                                //#line 1269 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                final long t$120403 = i$120402;
                                
                                //#line 1269 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                final boolean t$120404 = ((t$120403) <= (((long)(i$116340max$120406))));
                                
                                //#line 1269 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                if (!(t$120404)) {
                                    
                                    //#line 1269 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                    break;
                                }
                                
                                //#line 1269 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                final long i$120399 = i$120402;
                                
                                //#line 1270 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                final long t$120385 = reg.max$O((long)(i$120399));
                                
                                //#line 1270 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                final long t$120386 = reg.min$O((long)(i$120399));
                                
                                //#line 1270 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                final long t$120387 = ((t$120385) - (((long)(t$120386))));
                                
                                //#line 1270 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                final long stride$120388 = ((t$120387) + (((long)(1L))));
                                
                                //#line 1271 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                final long t$120389 = sz;
                                
                                //#line 1271 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                final long t$120390 = ((t$120389) * (((long)(stride$120388))));
                                
                                //#line 1271 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                sz = t$120390;
                                
                                //#line 1272 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                final x10.core.Rail t$120391 = ((x10.core.Rail)(layout));
                                
                                //#line 1272 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                final long t$120392 = ((i$120399) - (((long)(2L))));
                                
                                //#line 1272 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                final long t$120393 = ((2L) * (((long)(t$120392))));
                                
                                //#line 1272 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                ((long[])t$120391.value)[(int)t$120393] = stride$120388;
                                
                                //#line 1273 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                final x10.core.Rail t$120394 = ((x10.core.Rail)(layout));
                                
                                //#line 1273 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                final long t$120395 = ((i$120399) - (((long)(2L))));
                                
                                //#line 1273 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                final long t$120396 = ((2L) * (((long)(t$120395))));
                                
                                //#line 1273 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                final long t$120397 = ((t$120396) + (((long)(1L))));
                                
                                //#line 1273 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                final long t$120398 = reg.min$O((long)(i$120399));
                                
                                //#line 1273 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                ((long[])t$120394.value)[(int)t$120397] = t$120398;
                                
                                //#line 1269 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                final long t$120400 = i$120402;
                                
                                //#line 1269 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                final long t$120401 = ((t$120400) + (((long)(1L))));
                                
                                //#line 1269 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                i$120402 = t$120401;
                            }
                            
                            //#line 1275 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                            final long t$118838 = sz;
                            
                            //#line 1275 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                            this.size = t$118838;
                        }
                    }
                }
            }
            return this;
        }
        
        
        
        //#line 1238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final public java.lang.String typeName() {
            try {
                return x10.rtt.Types.typeName(this);
            }
            catch (java.lang.Throwable exc$146445) {
                throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$146445);
            }
            
        }
        
        
        
        //#line 1238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final public java.lang.String toString() {
            
            //#line 1238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final java.lang.String t$118842 = "struct x10.regionarray.Array.LayoutHelper: min0=";
            
            //#line 1238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$118843 = this.min0;
            
            //#line 1238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final java.lang.String t$118844 = ((t$118842) + ((x10.core.Long.$box(t$118843))));
            
            //#line 1238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final java.lang.String t$118845 = ((t$118844) + (" stride1="));
            
            //#line 1238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$118846 = this.stride1;
            
            //#line 1238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final java.lang.String t$118847 = ((t$118845) + ((x10.core.Long.$box(t$118846))));
            
            //#line 1238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final java.lang.String t$118848 = ((t$118847) + (" min1="));
            
            //#line 1238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$118849 = this.min1;
            
            //#line 1238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final java.lang.String t$118850 = ((t$118848) + ((x10.core.Long.$box(t$118849))));
            
            //#line 1238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final java.lang.String t$118851 = ((t$118850) + (" size="));
            
            //#line 1238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$118852 = this.size;
            
            //#line 1238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final java.lang.String t$118853 = ((t$118851) + ((x10.core.Long.$box(t$118852))));
            
            //#line 1238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final java.lang.String t$118854 = ((t$118853) + (" layout="));
            
            //#line 1238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.core.Rail t$118855 = ((x10.core.Rail)(this.layout));
            
            //#line 1238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final java.lang.String t$118856 = ((t$118854) + (t$118855));
            
            //#line 1238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            return t$118856;
        }
        
        
        //#line 1238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final public int hashCode() {
            
            //#line 1238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            int result = 1;
            
            //#line 1238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final int t$118857 = result;
            
            //#line 1238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final int t$118859 = ((8191) * (((int)(t$118857))));
            
            //#line 1238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$118858 = this.min0;
            
            //#line 1238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final int t$118860 = x10.rtt.Types.hashCode(t$118858);
            
            //#line 1238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final int t$118861 = ((t$118859) + (((int)(t$118860))));
            
            //#line 1238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            result = t$118861;
            
            //#line 1238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final int t$118862 = result;
            
            //#line 1238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final int t$118864 = ((8191) * (((int)(t$118862))));
            
            //#line 1238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$118863 = this.stride1;
            
            //#line 1238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final int t$118865 = x10.rtt.Types.hashCode(t$118863);
            
            //#line 1238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final int t$118866 = ((t$118864) + (((int)(t$118865))));
            
            //#line 1238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            result = t$118866;
            
            //#line 1238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final int t$118867 = result;
            
            //#line 1238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final int t$118869 = ((8191) * (((int)(t$118867))));
            
            //#line 1238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$118868 = this.min1;
            
            //#line 1238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final int t$118870 = x10.rtt.Types.hashCode(t$118868);
            
            //#line 1238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final int t$118871 = ((t$118869) + (((int)(t$118870))));
            
            //#line 1238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            result = t$118871;
            
            //#line 1238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final int t$118872 = result;
            
            //#line 1238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final int t$118874 = ((8191) * (((int)(t$118872))));
            
            //#line 1238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$118873 = this.size;
            
            //#line 1238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final int t$118875 = x10.rtt.Types.hashCode(t$118873);
            
            //#line 1238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final int t$118876 = ((t$118874) + (((int)(t$118875))));
            
            //#line 1238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            result = t$118876;
            
            //#line 1238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final int t$118877 = result;
            
            //#line 1238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final int t$118879 = ((8191) * (((int)(t$118877))));
            
            //#line 1238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.core.Rail t$118878 = ((x10.core.Rail)(this.layout));
            
            //#line 1238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final int t$118880 = x10.rtt.Types.hashCode(((java.lang.Object)(t$118878)));
            
            //#line 1238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final int t$118881 = ((t$118879) + (((int)(t$118880))));
            
            //#line 1238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            result = t$118881;
            
            //#line 1238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final int t$118882 = result;
            
            //#line 1238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            return t$118882;
        }
        
        
        //#line 1238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final public boolean equals(java.lang.Object other) {
            
            //#line 1238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final java.lang.Object t$118883 = ((java.lang.Object)(other));
            
            //#line 1238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final boolean t$118884 = x10.regionarray.Array.LayoutHelper.$RTT.isInstance(t$118883);
            
            //#line 1238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final boolean t$118885 = !(t$118884);
            
            //#line 1238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            if (t$118885) {
                
                //#line 1238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                return false;
            }
            
            //#line 1238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final java.lang.Object t$118886 = ((java.lang.Object)(other));
            
            //#line 1238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.regionarray.Array.LayoutHelper t$118887 = ((x10.regionarray.Array.LayoutHelper)x10.rtt.Types.asStruct(x10.regionarray.Array.LayoutHelper.$RTT,t$118886));
            
            //#line 1238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final boolean t$118888 = this.equals$O(((x10.regionarray.Array.LayoutHelper)(t$118887)));
            
            //#line 1238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            return t$118888;
        }
        
        
        //#line 1238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final public boolean equals$O(x10.regionarray.Array.LayoutHelper other) {
            
            //#line 1238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$118890 = this.min0;
            
            //#line 1238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.regionarray.Array.LayoutHelper t$118889 = ((x10.regionarray.Array.LayoutHelper)(other));
            
            //#line 1238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$118891 = t$118889.min0;
            
            //#line 1238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            boolean t$118895 = ((long) t$118890) == ((long) t$118891);
            
            //#line 1238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            if (t$118895) {
                
                //#line 1238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$118893 = this.stride1;
                
                //#line 1238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final x10.regionarray.Array.LayoutHelper t$118892 = ((x10.regionarray.Array.LayoutHelper)(other));
                
                //#line 1238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$118894 = t$118892.stride1;
                
                //#line 1238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                t$118895 = ((long) t$118893) == ((long) t$118894);
            }
            
            //#line 1238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            boolean t$118899 = t$118895;
            
            //#line 1238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            if (t$118899) {
                
                //#line 1238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$118897 = this.min1;
                
                //#line 1238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final x10.regionarray.Array.LayoutHelper t$118896 = ((x10.regionarray.Array.LayoutHelper)(other));
                
                //#line 1238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$118898 = t$118896.min1;
                
                //#line 1238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                t$118899 = ((long) t$118897) == ((long) t$118898);
            }
            
            //#line 1238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            boolean t$118903 = t$118899;
            
            //#line 1238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            if (t$118903) {
                
                //#line 1238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$118901 = this.size;
                
                //#line 1238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final x10.regionarray.Array.LayoutHelper t$118900 = ((x10.regionarray.Array.LayoutHelper)(other));
                
                //#line 1238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$118902 = t$118900.size;
                
                //#line 1238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                t$118903 = ((long) t$118901) == ((long) t$118902);
            }
            
            //#line 1238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            boolean t$118907 = t$118903;
            
            //#line 1238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            if (t$118907) {
                
                //#line 1238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final x10.core.Rail t$118905 = ((x10.core.Rail)(this.layout));
                
                //#line 1238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final x10.regionarray.Array.LayoutHelper t$118904 = ((x10.regionarray.Array.LayoutHelper)(other));
                
                //#line 1238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final x10.core.Rail t$118906 = ((x10.core.Rail)(t$118904.layout));
                
                //#line 1238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                t$118907 = x10.rtt.Equality.equalsequals((t$118905),(t$118906));
            }
            
            //#line 1238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final boolean t$118908 = t$118907;
            
            //#line 1238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            return t$118908;
        }
        
        
        //#line 1238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final public boolean _struct_equals$O(java.lang.Object other) {
            
            //#line 1238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final java.lang.Object t$118909 = ((java.lang.Object)(other));
            
            //#line 1238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final boolean t$118910 = x10.regionarray.Array.LayoutHelper.$RTT.isInstance(t$118909);
            
            //#line 1238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final boolean t$118911 = !(t$118910);
            
            //#line 1238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            if (t$118911) {
                
                //#line 1238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                return false;
            }
            
            //#line 1238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final java.lang.Object t$118912 = ((java.lang.Object)(other));
            
            //#line 1238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.regionarray.Array.LayoutHelper t$118913 = ((x10.regionarray.Array.LayoutHelper)x10.rtt.Types.asStruct(x10.regionarray.Array.LayoutHelper.$RTT,t$118912));
            
            //#line 1238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final boolean t$118914 = this._struct_equals$O(((x10.regionarray.Array.LayoutHelper)(t$118913)));
            
            //#line 1238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            return t$118914;
        }
        
        
        //#line 1238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final public boolean _struct_equals$O(x10.regionarray.Array.LayoutHelper other) {
            
            //#line 1238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$118916 = this.min0;
            
            //#line 1238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.regionarray.Array.LayoutHelper t$118915 = ((x10.regionarray.Array.LayoutHelper)(other));
            
            //#line 1238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final long t$118917 = t$118915.min0;
            
            //#line 1238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            boolean t$118921 = ((long) t$118916) == ((long) t$118917);
            
            //#line 1238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            if (t$118921) {
                
                //#line 1238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$118919 = this.stride1;
                
                //#line 1238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final x10.regionarray.Array.LayoutHelper t$118918 = ((x10.regionarray.Array.LayoutHelper)(other));
                
                //#line 1238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$118920 = t$118918.stride1;
                
                //#line 1238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                t$118921 = ((long) t$118919) == ((long) t$118920);
            }
            
            //#line 1238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            boolean t$118925 = t$118921;
            
            //#line 1238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            if (t$118925) {
                
                //#line 1238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$118923 = this.min1;
                
                //#line 1238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final x10.regionarray.Array.LayoutHelper t$118922 = ((x10.regionarray.Array.LayoutHelper)(other));
                
                //#line 1238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$118924 = t$118922.min1;
                
                //#line 1238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                t$118925 = ((long) t$118923) == ((long) t$118924);
            }
            
            //#line 1238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            boolean t$118929 = t$118925;
            
            //#line 1238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            if (t$118929) {
                
                //#line 1238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$118927 = this.size;
                
                //#line 1238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final x10.regionarray.Array.LayoutHelper t$118926 = ((x10.regionarray.Array.LayoutHelper)(other));
                
                //#line 1238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$118928 = t$118926.size;
                
                //#line 1238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                t$118929 = ((long) t$118927) == ((long) t$118928);
            }
            
            //#line 1238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            boolean t$118933 = t$118929;
            
            //#line 1238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            if (t$118933) {
                
                //#line 1238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final x10.core.Rail t$118931 = ((x10.core.Rail)(this.layout));
                
                //#line 1238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final x10.regionarray.Array.LayoutHelper t$118930 = ((x10.regionarray.Array.LayoutHelper)(other));
                
                //#line 1238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final x10.core.Rail t$118932 = ((x10.core.Rail)(t$118930.layout));
                
                //#line 1238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                t$118933 = x10.rtt.Equality.equalsequals((t$118931),(t$118932));
            }
            
            //#line 1238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final boolean t$118934 = t$118933;
            
            //#line 1238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            return t$118934;
        }
        
        
        //#line 1238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final public x10.regionarray.Array.LayoutHelper x10$regionarray$Array$LayoutHelper$$this$x10$regionarray$Array$LayoutHelper() {
            
            //#line 1238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            return x10.regionarray.Array.LayoutHelper.this;
        }
        
        
        //#line 1238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        final public void __fieldInitializers_x10_regionarray_Array_LayoutHelper() {
            
        }
    }
    
    
    
    //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    final public x10.regionarray.Array x10$regionarray$Array$$this$x10$regionarray$Array() {
        
        //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        return x10.regionarray.Array.this;
    }
    
    
    //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    final public void __fieldInitializers_x10_regionarray_Array() {
        
    }
    
    
    //#line 414 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    @x10.runtime.impl.java.X10Generated
    final public static class Anonymous$14235<$T> extends x10.core.Ref implements x10.lang.Iterable, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<Anonymous$14235> $RTT = 
            x10.rtt.NamedType.<Anonymous$14235> make("x10.regionarray.Array.Anonymous$14235",
                                                     Anonymous$14235.class,
                                                     1,
                                                     new x10.rtt.Type[] {
                                                         x10.rtt.ParameterizedType.make(x10.lang.Iterable.$RTT, x10.rtt.UnresolvedType.PARAM(0))
                                                     });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $T; return null; }
        
        public static <$T> x10.serialization.X10JavaSerializable $_deserialize_body(x10.regionarray.Array.Anonymous$14235<$T> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.$T = (x10.rtt.Type) $deserializer.readObject();
            $_obj.out$ = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.regionarray.Array.Anonymous$14235 $_obj = new x10.regionarray.Array.Anonymous$14235((java.lang.System[]) null, (x10.rtt.Type) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.$T);
            $serializer.write(this.out$);
            
        }
        
        // constructor just for allocation
        public Anonymous$14235(final java.lang.System[] $dummy, final x10.rtt.Type $T) {
            x10.regionarray.Array.Anonymous$14235.$initParams(this, $T);
            
        }
        
        private x10.rtt.Type $T;
        
        // initializer of type parameters
        public static void $initParams(final Anonymous$14235 $this, final x10.rtt.Type $T) {
            $this.$T = $T;
            
        }
        // synthetic type for parameter mangling
        public static final class __0$1x10$regionarray$Array$Anonymous$14235$$T$2 {}
        
    
        
        //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        public x10.regionarray.Array<$T> out$;
        
        
        //#line 415 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        public x10.regionarray.Array.Anonymous$14235.Anonymous$14292 iterator() {
            
            //#line 415 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.regionarray.Array.Anonymous$14235.Anonymous$14292 alloc$116228 = ((x10.regionarray.Array.Anonymous$14235.Anonymous$14292)(new x10.regionarray.Array.Anonymous$14235.Anonymous$14292<$T>((java.lang.System[]) null, $T)));
            
            //#line 414 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.regionarray.Array.Anonymous$14235 out$117340 = ((x10.regionarray.Array.Anonymous$14235)(this));
            
            //#line 414 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ((x10.regionarray.Array.Anonymous$14235.Anonymous$14292<$T>)alloc$116228).out$ = out$117340;
            
            //#line 415 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            return alloc$116228;
        }
        
        
        //#line 414 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        // creation method for java code (1-phase java constructor)
        public Anonymous$14235(final x10.rtt.Type $T, final x10.regionarray.Array<$T> out$, __0$1x10$regionarray$Array$Anonymous$14235$$T$2 $dummy) {
            this((java.lang.System[]) null, $T);
            x10$regionarray$Array$Anonymous$14235$$init$S(out$, (x10.regionarray.Array.Anonymous$14235.__0$1x10$regionarray$Array$Anonymous$14235$$T$2) null);
        }
        
        // constructor for non-virtual call
        final public x10.regionarray.Array.Anonymous$14235<$T> x10$regionarray$Array$Anonymous$14235$$init$S(final x10.regionarray.Array<$T> out$, __0$1x10$regionarray$Array$Anonymous$14235$$T$2 $dummy) {
             {
                
                //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                ((x10.regionarray.Array.Anonymous$14235<$T>)this).out$ = out$;
            }
            return this;
        }
        
        
        
        //#line 415 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        @x10.runtime.impl.java.X10Generated
        final public static class Anonymous$14292<$T> extends x10.core.Ref implements x10.lang.Iterator, x10.serialization.X10JavaSerializable
        {
            public static final x10.rtt.RuntimeType<Anonymous$14292> $RTT = 
                x10.rtt.NamedType.<Anonymous$14292> make("x10.regionarray.Array.Anonymous$14235.Anonymous$14292",
                                                         Anonymous$14292.class,
                                                         1,
                                                         new x10.rtt.Type[] {
                                                             x10.rtt.ParameterizedType.make(x10.lang.Iterator.$RTT, x10.rtt.UnresolvedType.PARAM(0))
                                                         });
            
            public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
            
            public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $T; return null; }
            
            public static <$T> x10.serialization.X10JavaSerializable $_deserialize_body(x10.regionarray.Array.Anonymous$14235.Anonymous$14292<$T> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
                $_obj.$T = (x10.rtt.Type) $deserializer.readObject();
                $_obj.cur = $deserializer.readLong();
                $_obj.out$ = $deserializer.readObject();
                return $_obj;
            }
            
            public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
                x10.regionarray.Array.Anonymous$14235.Anonymous$14292 $_obj = new x10.regionarray.Array.Anonymous$14235.Anonymous$14292((java.lang.System[]) null, (x10.rtt.Type) null);
                $deserializer.record_reference($_obj);
                return $_deserialize_body($_obj, $deserializer);
            }
            
            public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
                $serializer.write(this.$T);
                $serializer.write(this.cur);
                $serializer.write(this.out$);
                
            }
            
            // constructor just for allocation
            public Anonymous$14292(final java.lang.System[] $dummy, final x10.rtt.Type $T) {
                x10.regionarray.Array.Anonymous$14235.Anonymous$14292.$initParams(this, $T);
                
            }
            
            private x10.rtt.Type $T;
            
            // initializer of type parameters
            public static void $initParams(final Anonymous$14292 $this, final x10.rtt.Type $T) {
                $this.$T = $T;
                
            }
            // synthetic type for parameter mangling
            public static final class __0$1x10$regionarray$Array$Anonymous$14235$Anonymous$14292$$T$2 {}
            
        
            
            //#line 414 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            public x10.regionarray.Array.Anonymous$14235<$T> out$;
            
            //#line 416 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            public long cur = 0L;
            
            
            //#line 417 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            public $T next$G() {
                
                //#line 417 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final x10.regionarray.Array.Anonymous$14235 t$118935 = this.out$;
                
                //#line 417 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final x10.regionarray.Array t$118936 = ((x10.regionarray.Array.Anonymous$14235<$T>)t$118935).out$;
                
                //#line 417 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final x10.core.Rail t$118940 = ((x10.core.Rail)(((x10.regionarray.Array<$T>)t$118936).raw));
                
                //#line 417 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$118937 = this.cur;
                
                //#line 417 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$118938 = ((t$118937) + (((long)(1L))));
                
                //#line 417 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$118939 = ((x10.regionarray.Array.Anonymous$14235.Anonymous$14292<$T>)this).cur = t$118938;
                
                //#line 417 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$118941 = ((t$118939) - (((long)(1L))));
                
                //#line 417 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final $T t$118942 = (($T)(((x10.core.Rail<$T>)t$118940).$apply$G((long)(t$118941))));
                
                //#line 417 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                return t$118942;
            }
            
            
            //#line 418 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            public boolean hasNext$O() {
                
                //#line 418 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$118946 = cur;
                
                //#line 418 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final x10.regionarray.Array.Anonymous$14235 t$118943 = this.out$;
                
                //#line 418 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final x10.regionarray.Array t$118944 = ((x10.regionarray.Array.Anonymous$14235<$T>)t$118943).out$;
                
                //#line 418 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final x10.core.Rail t$118945 = ((x10.core.Rail)(((x10.regionarray.Array<$T>)t$118944).raw));
                
                //#line 418 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$118947 = ((x10.core.Rail<$T>)t$118945).size;
                
                //#line 418 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final boolean t$118948 = ((t$118946) < (((long)(t$118947))));
                
                //#line 418 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                return t$118948;
            }
            
            
            //#line 415 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            // creation method for java code (1-phase java constructor)
            public Anonymous$14292(final x10.rtt.Type $T, final x10.regionarray.Array.Anonymous$14235<$T> out$, __0$1x10$regionarray$Array$Anonymous$14235$Anonymous$14292$$T$2 $dummy) {
                this((java.lang.System[]) null, $T);
                x10$regionarray$Array$Anonymous$14235$Anonymous$14292$$init$S(out$, (x10.regionarray.Array.Anonymous$14235.Anonymous$14292.__0$1x10$regionarray$Array$Anonymous$14235$Anonymous$14292$$T$2) null);
            }
            
            // constructor for non-virtual call
            final public x10.regionarray.Array.Anonymous$14235.Anonymous$14292<$T> x10$regionarray$Array$Anonymous$14235$Anonymous$14292$$init$S(final x10.regionarray.Array.Anonymous$14235<$T> out$, __0$1x10$regionarray$Array$Anonymous$14235$Anonymous$14292$$T$2 $dummy) {
                 {
                    
                    //#line 414 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    ((x10.regionarray.Array.Anonymous$14235.Anonymous$14292<$T>)this).out$ = out$;
                }
                return this;
            }
            
        }
        
    }
    
    
    //#line 422 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    @x10.runtime.impl.java.X10Generated
    final public static class Anonymous$14520<$T> extends x10.core.Ref implements x10.lang.Iterable, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<Anonymous$14520> $RTT = 
            x10.rtt.NamedType.<Anonymous$14520> make("x10.regionarray.Array.Anonymous$14520",
                                                     Anonymous$14520.class,
                                                     1,
                                                     new x10.rtt.Type[] {
                                                         x10.rtt.ParameterizedType.make(x10.lang.Iterable.$RTT, x10.rtt.UnresolvedType.PARAM(0))
                                                     });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $T; return null; }
        
        public static <$T> x10.serialization.X10JavaSerializable $_deserialize_body(x10.regionarray.Array.Anonymous$14520<$T> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.$T = (x10.rtt.Type) $deserializer.readObject();
            $_obj.out$ = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.regionarray.Array.Anonymous$14520 $_obj = new x10.regionarray.Array.Anonymous$14520((java.lang.System[]) null, (x10.rtt.Type) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.$T);
            $serializer.write(this.out$);
            
        }
        
        // constructor just for allocation
        public Anonymous$14520(final java.lang.System[] $dummy, final x10.rtt.Type $T) {
            x10.regionarray.Array.Anonymous$14520.$initParams(this, $T);
            
        }
        
        private x10.rtt.Type $T;
        
        // initializer of type parameters
        public static void $initParams(final Anonymous$14520 $this, final x10.rtt.Type $T) {
            $this.$T = $T;
            
        }
        // synthetic type for parameter mangling
        public static final class __0$1x10$regionarray$Array$Anonymous$14520$$T$2 {}
        
    
        
        //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        public x10.regionarray.Array<$T> out$;
        
        
        //#line 423 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        public x10.regionarray.Array.Anonymous$14520.Anonymous$14577 iterator() {
            
            //#line 423 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            final x10.regionarray.Array.Anonymous$14520.Anonymous$14577 alloc$116229 = ((x10.regionarray.Array.Anonymous$14520.Anonymous$14577)(new x10.regionarray.Array.Anonymous$14520.Anonymous$14577<$T>((java.lang.System[]) null, $T)));
            
            //#line 423 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            alloc$116229.x10$regionarray$Array$Anonymous$14520$Anonymous$14577$$init$S(this, (x10.regionarray.Array.Anonymous$14520.Anonymous$14577.__0$1x10$regionarray$Array$Anonymous$14520$Anonymous$14577$$T$2) null);
            
            //#line 423 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            return alloc$116229;
        }
        
        
        //#line 422 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        // creation method for java code (1-phase java constructor)
        public Anonymous$14520(final x10.rtt.Type $T, final x10.regionarray.Array<$T> out$, __0$1x10$regionarray$Array$Anonymous$14520$$T$2 $dummy) {
            this((java.lang.System[]) null, $T);
            x10$regionarray$Array$Anonymous$14520$$init$S(out$, (x10.regionarray.Array.Anonymous$14520.__0$1x10$regionarray$Array$Anonymous$14520$$T$2) null);
        }
        
        // constructor for non-virtual call
        final public x10.regionarray.Array.Anonymous$14520<$T> x10$regionarray$Array$Anonymous$14520$$init$S(final x10.regionarray.Array<$T> out$, __0$1x10$regionarray$Array$Anonymous$14520$$T$2 $dummy) {
             {
                
                //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                ((x10.regionarray.Array.Anonymous$14520<$T>)this).out$ = out$;
            }
            return this;
        }
        
        
        
        //#line 423 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        @x10.runtime.impl.java.X10Generated
        final public static class Anonymous$14577<$T> extends x10.core.Ref implements x10.lang.Iterator, x10.serialization.X10JavaSerializable
        {
            public static final x10.rtt.RuntimeType<Anonymous$14577> $RTT = 
                x10.rtt.NamedType.<Anonymous$14577> make("x10.regionarray.Array.Anonymous$14520.Anonymous$14577",
                                                         Anonymous$14577.class,
                                                         1,
                                                         new x10.rtt.Type[] {
                                                             x10.rtt.ParameterizedType.make(x10.lang.Iterator.$RTT, x10.rtt.UnresolvedType.PARAM(0))
                                                         });
            
            public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
            
            public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $T; return null; }
            
            public static <$T> x10.serialization.X10JavaSerializable $_deserialize_body(x10.regionarray.Array.Anonymous$14520.Anonymous$14577<$T> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
                $_obj.$T = (x10.rtt.Type) $deserializer.readObject();
                $_obj.regIt = $deserializer.readObject();
                $_obj.out$ = $deserializer.readObject();
                return $_obj;
            }
            
            public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
                x10.regionarray.Array.Anonymous$14520.Anonymous$14577 $_obj = new x10.regionarray.Array.Anonymous$14520.Anonymous$14577((java.lang.System[]) null, (x10.rtt.Type) null);
                $deserializer.record_reference($_obj);
                return $_deserialize_body($_obj, $deserializer);
            }
            
            public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
                $serializer.write(this.$T);
                $serializer.write(this.regIt);
                $serializer.write(this.out$);
                
            }
            
            // constructor just for allocation
            public Anonymous$14577(final java.lang.System[] $dummy, final x10.rtt.Type $T) {
                x10.regionarray.Array.Anonymous$14520.Anonymous$14577.$initParams(this, $T);
                
            }
            
            private x10.rtt.Type $T;
            
            // initializer of type parameters
            public static void $initParams(final Anonymous$14577 $this, final x10.rtt.Type $T) {
                $this.$T = $T;
                
            }
            // synthetic type for parameter mangling
            public static final class __0$1x10$regionarray$Array$Anonymous$14520$Anonymous$14577$$T$2 {}
            
        
            
            //#line 422 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            public x10.regionarray.Array.Anonymous$14520<$T> out$;
            
            //#line 424 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            public x10.lang.Iterator<x10.lang.Point> regIt;
            
            
            //#line 425 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            public $T next$G() {
                
                //#line 425 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final x10.regionarray.Array.Anonymous$14520 t$118949 = this.out$;
                
                //#line 425 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final x10.regionarray.Array this$117343 = ((x10.regionarray.Array.Anonymous$14520<$T>)t$118949).out$;
                
                //#line 425 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final x10.lang.Iterator t$118950 = ((x10.lang.Iterator)(regIt));
                
                //#line 523 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final x10.lang.Point pt$117342 = ((x10.lang.Point)(((x10.lang.Iterator<x10.lang.Point>)t$118950).next$G()));
                
                //#line 523 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                $T ret$117344 =  null;
                
                //#line 527 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final x10.core.Rail t$120444 = ((x10.core.Rail)(((x10.regionarray.Array<$T>)this$117343).raw));
                
                //#line 1221 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final x10.lang.Point pt$120445 = ((x10.lang.Point)(pt$117342));
                
                //#line 1221 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                long ret$120446 =  0;
                
                //#line 1222 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$120430 = ((long)(((int)(0))));
                
                //#line 1222 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$120431 = pt$120445.$apply$O((long)(t$120430));
                
                //#line 1222 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$120432 = ((x10.regionarray.Array<$T>)this$117343).layout_min0;
                
                //#line 1222 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                long offset$120433 = ((t$120431) - (((long)(t$120432))));
                
                //#line 1223 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$120434 = pt$120445.rank;
                
                //#line 1223 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final boolean t$120435 = ((t$120434) > (((long)(1L))));
                
                //#line 1223 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                if (t$120435) {
                    
                    //#line 1224 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$120436 = offset$120433;
                    
                    //#line 1224 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$120437 = ((x10.regionarray.Array<$T>)this$117343).layout_stride1;
                    
                    //#line 1224 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$120438 = ((t$120436) * (((long)(t$120437))));
                    
                    //#line 1224 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$120439 = pt$120445.$apply$O((long)(1L));
                    
                    //#line 1224 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$120440 = ((t$120438) + (((long)(t$120439))));
                    
                    //#line 1224 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$120441 = ((x10.regionarray.Array<$T>)this$117343).layout_min1;
                    
                    //#line 1224 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$120442 = ((t$120440) - (((long)(t$120441))));
                    
                    //#line 1224 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    offset$120433 = t$120442;
                    
                    //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long t$120428 = pt$120445.rank;
                    
                    //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final long i$116322max$120429 = ((t$120428) - (((long)(1L))));
                    
                    //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    long i$120425 = 2L;
                    
                    //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    for (;
                         true;
                         ) {
                        
                        //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final long t$120426 = i$120425;
                        
                        //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final boolean t$120427 = ((t$120426) <= (((long)(i$116322max$120429))));
                        
                        //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        if (!(t$120427)) {
                            
                            //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                            break;
                        }
                        
                        //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final long i$120422 = i$120425;
                        
                        //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final long t$120408 = offset$120433;
                        
                        //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final x10.core.Rail t$120409 = ((x10.core.Rail)(((x10.regionarray.Array<$T>)this$117343).layout));
                        
                        //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final long t$120410 = ((i$120422) - (((long)(2L))));
                        
                        //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final long t$120411 = ((2L) * (((long)(t$120410))));
                        
                        //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final long t$120412 = ((long[])t$120409.value)[(int)t$120411];
                        
                        //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final long t$120413 = ((t$120408) * (((long)(t$120412))));
                        
                        //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final long t$120414 = pt$120445.$apply$O((long)(i$120422));
                        
                        //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final long t$120415 = ((t$120413) + (((long)(t$120414))));
                        
                        //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final x10.core.Rail t$120416 = ((x10.core.Rail)(((x10.regionarray.Array<$T>)this$117343).layout));
                        
                        //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final long t$120417 = ((i$120422) - (((long)(2L))));
                        
                        //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final long t$120418 = ((2L) * (((long)(t$120417))));
                        
                        //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final long t$120419 = ((t$120418) + (((long)(1L))));
                        
                        //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final long t$120420 = ((long[])t$120416.value)[(int)t$120419];
                        
                        //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final long t$120421 = ((t$120415) - (((long)(t$120420))));
                        
                        //#line 1226 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        offset$120433 = t$120421;
                        
                        //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final long t$120423 = i$120425;
                        
                        //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        final long t$120424 = ((t$120423) + (((long)(1L))));
                        
                        //#line 1225 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        i$120425 = t$120424;
                    }
                }
                
                //#line 1229 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$120443 = offset$120433;
                
                //#line 1229 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                ret$120446 = t$120443;
                
                //#line 1221 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$120447 = ret$120446;
                
                //#line 527 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final $T t$120448 = (($T)(((x10.core.Rail<$T>)t$120444).$apply$G((long)(t$120447))));
                
                //#line 527 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                ret$117344 = (($T)(t$120448));
                
                //#line 523 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final $T t$118987 = (($T)(ret$117344));
                
                //#line 425 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                return t$118987;
            }
            
            
            //#line 426 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            public boolean hasNext$O() {
                
                //#line 426 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final x10.lang.Iterator t$118988 = ((x10.lang.Iterator)(regIt));
                
                //#line 426 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final boolean t$118989 = ((x10.lang.Iterator<x10.lang.Point>)t$118988).hasNext$O();
                
                //#line 426 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                return t$118989;
            }
            
            
            //#line 423 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            // creation method for java code (1-phase java constructor)
            public Anonymous$14577(final x10.rtt.Type $T, final x10.regionarray.Array.Anonymous$14520<$T> out$, __0$1x10$regionarray$Array$Anonymous$14520$Anonymous$14577$$T$2 $dummy) {
                this((java.lang.System[]) null, $T);
                x10$regionarray$Array$Anonymous$14520$Anonymous$14577$$init$S(out$, (x10.regionarray.Array.Anonymous$14520.Anonymous$14577.__0$1x10$regionarray$Array$Anonymous$14520$Anonymous$14577$$T$2) null);
            }
            
            // constructor for non-virtual call
            final public x10.regionarray.Array.Anonymous$14520.Anonymous$14577<$T> x10$regionarray$Array$Anonymous$14520$Anonymous$14577$$init$S(final x10.regionarray.Array.Anonymous$14520<$T> out$, __0$1x10$regionarray$Array$Anonymous$14520$Anonymous$14577$$T$2 $dummy) {
                 {
                    
                    //#line 422 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    ((x10.regionarray.Array.Anonymous$14520.Anonymous$14577<$T>)this).out$ = out$;
                    
                    //#line 424 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final x10.regionarray.Array.Anonymous$14520 t$118990 = this.out$;
                    
                    //#line 424 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final x10.regionarray.Array this$117354 = ((x10.regionarray.Array.Anonymous$14520<$T>)t$118990).out$;
                    
                    //#line 404 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final x10.regionarray.Region t$118991 = ((x10.regionarray.Region)(((x10.regionarray.Array<$T>)this$117354).region));
                    
                    //#line 404 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    final x10.lang.Iterator t$118992 = t$118991.iterator();
                    
                    //#line 424 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                    ((x10.regionarray.Array.Anonymous$14520.Anonymous$14577<$T>)this).regIt = ((x10.lang.Iterator)(t$118992));
                }
                return this;
            }
            
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$191<$T> extends x10.core.Ref implements x10.core.fun.Fun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$191> $RTT = 
            x10.rtt.StaticFunType.<$Closure$191> make($Closure$191.class,
                                                      1,
                                                      new x10.rtt.Type[] {
                                                          x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_0.$RTT, x10.rtt.Types.LONG)
                                                      });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $T; return null; }
        
        public static <$T> x10.serialization.X10JavaSerializable $_deserialize_body(x10.regionarray.Array.$Closure$191<$T> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.$T = (x10.rtt.Type) $deserializer.readObject();
            $_obj.gra = $deserializer.readObject();
            $_obj.dstPoint = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.regionarray.Array.$Closure$191 $_obj = new x10.regionarray.Array.$Closure$191((java.lang.System[]) null, (x10.rtt.Type) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.$T);
            $serializer.write(this.gra);
            $serializer.write(this.dstPoint);
            
        }
        
        // constructor just for allocation
        public $Closure$191(final java.lang.System[] $dummy, final x10.rtt.Type $T) {
            x10.regionarray.Array.$Closure$191.$initParams(this, $T);
            
        }
        
        // bridge for method abstract public ()=>U.operator()():U
        public x10.core.Long $apply$G() {
            return x10.core.Long.$box($apply$O());
        }
        
        private x10.rtt.Type $T;
        
        // initializer of type parameters
        public static void $initParams(final $Closure$191 $this, final x10.rtt.Type $T) {
            $this.$T = $T;
            
        }
        // synthetic type for parameter mangling
        public static final class __0$1x10$regionarray$Array$1x10$regionarray$Array$$Closure$191$$T$2$2 {}
        
    
        
        public long $apply$O() {
            
            //#line 938 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            try {{
                
                //#line 938 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final x10.regionarray.Array t$114706 = (((x10.core.GlobalRef<x10.regionarray.Array<$T>>)(this.gra))).$apply$G();
                
                //#line 938 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final x10.regionarray.Region t$114707 = ((x10.regionarray.Region)(((x10.regionarray.Array<$T>)t$114706).region));
                
                //#line 938 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$114708 = t$114707.indexOf$O(((x10.lang.Point)(this.dstPoint)));
                
                //#line 938 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                return t$114708;
            }}catch (java.lang.Throwable __lowerer__var__0__) {
                
                //#line 938 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                long __lowerer__var__1__ = (x10.core.Long.$unbox(x10.lang.Runtime.<x10.core.Long> wrapAtChecked$G(x10.rtt.Types.LONG, ((java.lang.Throwable)(__lowerer__var__0__)))));
                
                //#line 938 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                return __lowerer__var__1__;
            }
        }
        
        public x10.core.GlobalRef<x10.regionarray.Array<$T>> gra;
        public x10.lang.Point dstPoint;
        
        public $Closure$191(final x10.rtt.Type $T, final x10.core.GlobalRef<x10.regionarray.Array<$T>> gra, final x10.lang.Point dstPoint, __0$1x10$regionarray$Array$1x10$regionarray$Array$$Closure$191$$T$2$2 $dummy) {
            x10.regionarray.Array.$Closure$191.$initParams(this, $T);
             {
                ((x10.regionarray.Array.$Closure$191<$T>)this).gra = ((x10.core.GlobalRef)(gra));
                ((x10.regionarray.Array.$Closure$191<$T>)this).dstPoint = ((x10.lang.Point)(dstPoint));
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$192<$T> extends x10.core.Ref implements x10.core.fun.Fun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$192> $RTT = 
            x10.rtt.StaticFunType.<$Closure$192> make($Closure$192.class,
                                                      1,
                                                      new x10.rtt.Type[] {
                                                          x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_0.$RTT, x10.rtt.Types.LONG)
                                                      });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $T; return null; }
        
        public static <$T> x10.serialization.X10JavaSerializable $_deserialize_body(x10.regionarray.Array.$Closure$192<$T> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.$T = (x10.rtt.Type) $deserializer.readObject();
            $_obj.gra = $deserializer.readObject();
            $_obj.srcPoint = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.regionarray.Array.$Closure$192 $_obj = new x10.regionarray.Array.$Closure$192((java.lang.System[]) null, (x10.rtt.Type) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.$T);
            $serializer.write(this.gra);
            $serializer.write(this.srcPoint);
            
        }
        
        // constructor just for allocation
        public $Closure$192(final java.lang.System[] $dummy, final x10.rtt.Type $T) {
            x10.regionarray.Array.$Closure$192.$initParams(this, $T);
            
        }
        
        // bridge for method abstract public ()=>U.operator()():U
        public x10.core.Long $apply$G() {
            return x10.core.Long.$box($apply$O());
        }
        
        private x10.rtt.Type $T;
        
        // initializer of type parameters
        public static void $initParams(final $Closure$192 $this, final x10.rtt.Type $T) {
            $this.$T = $T;
            
        }
        // synthetic type for parameter mangling
        public static final class __0$1x10$regionarray$Array$1x10$regionarray$Array$$Closure$192$$T$2$2 {}
        
    
        
        public long $apply$O() {
            
            //#line 1041 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            try {{
                
                //#line 1041 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final x10.regionarray.Array t$114710 = (((x10.core.GlobalRef<x10.regionarray.Array<$T>>)(this.gra))).$apply$G();
                
                //#line 1041 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final x10.regionarray.Region t$114711 = ((x10.regionarray.Region)(((x10.regionarray.Array<$T>)t$114710).region));
                
                //#line 1041 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                final long t$114712 = t$114711.indexOf$O(((x10.lang.Point)(this.srcPoint)));
                
                //#line 1041 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                return t$114712;
            }}catch (java.lang.Throwable __lowerer__var__0__) {
                
                //#line 1041 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                long __lowerer__var__1__ = (x10.core.Long.$unbox(x10.lang.Runtime.<x10.core.Long> wrapAtChecked$G(x10.rtt.Types.LONG, ((java.lang.Throwable)(__lowerer__var__0__)))));
                
                //#line 1041 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                return __lowerer__var__1__;
            }
        }
        
        public x10.core.GlobalRef<x10.regionarray.Array<$T>> gra;
        public x10.lang.Point srcPoint;
        
        public $Closure$192(final x10.rtt.Type $T, final x10.core.GlobalRef<x10.regionarray.Array<$T>> gra, final x10.lang.Point srcPoint, __0$1x10$regionarray$Array$1x10$regionarray$Array$$Closure$192$$T$2$2 $dummy) {
            x10.regionarray.Array.$Closure$192.$initParams(this, $T);
             {
                ((x10.regionarray.Array.$Closure$192<$T>)this).gra = ((x10.core.GlobalRef)(gra));
                ((x10.regionarray.Array.$Closure$192<$T>)this).srcPoint = ((x10.lang.Point)(srcPoint));
            }
        }
        
    }
    
}




