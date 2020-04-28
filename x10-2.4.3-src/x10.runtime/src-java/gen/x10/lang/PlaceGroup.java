package x10.lang;


@x10.runtime.impl.java.X10Generated
abstract public class PlaceGroup extends x10.core.Ref implements x10.lang.Iterable, x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<PlaceGroup> $RTT = 
        x10.rtt.NamedType.<PlaceGroup> make("x10.lang.PlaceGroup",
                                            PlaceGroup.class,
                                            new x10.rtt.Type[] {
                                                x10.rtt.ParameterizedType.make(x10.lang.Iterable.$RTT, x10.lang.Place.$RTT)
                                            });
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.PlaceGroup $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        return null;
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        
    }
    
    // constructor just for allocation
    public PlaceGroup(final java.lang.System[] $dummy) {
        
    }
    
    

    
    //#line 36 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
    private static x10.lang.PlaceGroup.SimplePlaceGroup WORLD;
    
    
    //#line 41 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
    final public long size$O() {
        
        //#line 41 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
        final long t$110798 = this.numPlaces$O();
        
        //#line 41 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
        return t$110798;
    }
    
    
    //#line 46 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
    abstract public long numPlaces$O();
    
    
    //#line 51 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
    public boolean contains$O(final x10.lang.Place place) {
        
        //#line 51 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
        final long t$110799 = place.id;
        
        //#line 51 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
        final boolean t$110800 = this.contains$O((long)(t$110799));
        
        //#line 51 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
        return t$110800;
    }
    
    
    //#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
    abstract public boolean contains$O(final long id);
    
    
    //#line 71 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
    public long indexOf$O(final x10.lang.Place place) {
        
        //#line 71 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
        final long t$110801 = place.id;
        
        //#line 71 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
        final long t$110802 = this.indexOf$O((long)(t$110801));
        
        //#line 71 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
        return t$110802;
    }
    
    
    //#line 86 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
    abstract public long indexOf$O(final long id);
    
    
    //#line 94 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
    abstract public x10.lang.Place $apply(final long i);
    
    
    //#line 100 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
    public boolean equals(final java.lang.Object thatObj) {
        
        //#line 101 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
        final boolean t$110803 = x10.rtt.Equality.equalsequals((this),(thatObj));
        
        //#line 101 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
        if (t$110803) {
            
            //#line 101 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
            return true;
        }
        
        //#line 102 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
        final boolean t$110804 = x10.lang.PlaceGroup.$RTT.isInstance(thatObj);
        
        //#line 102 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
        final boolean t$110805 = !(t$110804);
        
        //#line 102 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
        if (t$110805) {
            
            //#line 102 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
            return false;
        }
        
        //#line 103 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
        final x10.lang.PlaceGroup that = ((x10.lang.PlaceGroup)(x10.rtt.Types.<x10.lang.PlaceGroup> cast(thatObj,x10.lang.PlaceGroup.$RTT)));
        
        //#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
        final long t$110806 = this.numPlaces$O();
        
        //#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
        final long t$110807 = that.numPlaces$O();
        
        //#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
        final boolean t$110808 = ((long) t$110806) != ((long) t$110807);
        
        //#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
        if (t$110808) {
            
            //#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
            return false;
        }
        
        //#line 105 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
        long i$110898 = 0L;
        
        //#line 105 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
        for (;
             true;
             ) {
            
            //#line 105 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
            final long t$110899 = i$110898;
            
            //#line 105 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
            final long t$110900 = this.numPlaces$O();
            
            //#line 105 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
            final boolean t$110901 = ((t$110899) < (((long)(t$110900))));
            
            //#line 105 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
            if (!(t$110901)) {
                
                //#line 105 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
                break;
            }
            
            //#line 106 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
            final long t$110888 = i$110898;
            
            //#line 106 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
            final x10.lang.Place this$110889 = this.$apply((long)(t$110888));
            
            //#line 106 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
            final long t$110890 = i$110898;
            
            //#line 216 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
            final x10.lang.Place p$110891 = ((x10.lang.Place)(that.$apply((long)(t$110890))));
            
            //#line 216 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
            final long t$110892 = p$110891.id;
            
            //#line 216 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
            final long t$110893 = this$110889.id;
            
            //#line 216 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
            final boolean t$110894 = ((long) t$110892) == ((long) t$110893);
            
            //#line 106 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
            final boolean t$110895 = !(t$110894);
            
            //#line 106 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
            if (t$110895) {
                
                //#line 106 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
                return false;
            }
            
            //#line 105 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
            final long t$110896 = i$110898;
            
            //#line 105 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
            final long t$110897 = ((t$110896) + (((long)(1L))));
            
            //#line 105 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
            i$110898 = t$110897;
        }
        
        //#line 108 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
        return true;
    }
    
    
    //#line 116 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
    public void broadcastFlat(final x10.core.fun.VoidFun_0_0 cl) {
        
        //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
        final x10.io.Serializer ser = ((x10.io.Serializer)(new x10.io.Serializer()));
        
        //#line 118 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
        ser.writeAny(((java.lang.Object)(cl)));
        
        //#line 119 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
        final x10.lang.PlaceGroup this$110783 = ((x10.lang.PlaceGroup)(this));
        
        //#line 41 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
        final long t$110821 = this$110783.numPlaces$O();
        
        //#line 119 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
        final long t$110822 = ((t$110821) - (((long)(1L))));
        
        //#line 119 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
        ser.addDeserializeCount((long)(t$110822));
        
        //#line 120 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
        final x10.core.Rail message = ser.toRail();
        {
            
            //#line 121 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
            x10.lang.Runtime.ensureNotInAtomic();
            
            //#line 121 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
            final x10.lang.FinishState x10$__var4 = x10.lang.Runtime.startFinish((int)(x10.compiler.Pragma.FINISH_SPMD));
            
            //#line 121 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
            try {{
                {
                    
                    //#line 121 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
                    final x10.lang.Iterator p$76158 = this.iterator();
                    
                    //#line 121 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
                    for (;
                         true;
                         ) {
                        
                        //#line 121 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
                        final boolean t$110825 = ((x10.lang.Iterator<x10.lang.Place>)p$76158).hasNext$O();
                        
                        //#line 121 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
                        if (!(t$110825)) {
                            
                            //#line 121 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
                            break;
                        }
                        
                        //#line 121 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
                        final x10.lang.Place p$110902 = ((x10.lang.Place)(((x10.lang.Iterator<x10.lang.Place>)p$76158).next$G()));
                        
                        //#line 122 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
                        x10.lang.Runtime.runAsync(((x10.lang.Place)(p$110902)), ((x10.core.fun.VoidFun_0_0)(new x10.lang.PlaceGroup.$Closure$129(message, (x10.lang.PlaceGroup.$Closure$129.__0$1x10$lang$Byte$2) null))), ((x10.lang.Runtime.Profile)(null)));
                    }
                }
            }}catch (java.lang.Throwable __lowerer__var__0__) {
                
                //#line 121 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
                x10.lang.Runtime.pushException(((java.lang.Throwable)(__lowerer__var__0__)));
                
                //#line 121 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
                throw new java.lang.RuntimeException();
            }finally {{
                 
                 //#line 121 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
                 x10.lang.Runtime.stopFinish(((x10.lang.FinishState)(x10$__var4)));
             }}
            }
        }
    
    
    //#line 135 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
    public void broadcastFlat__1$1x10$lang$Place$3x10$lang$Boolean$2(final x10.core.fun.VoidFun_0_0 cl, final x10.core.fun.Fun_0_1 ignoreIfDead) {
        
        //#line 136 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
        final x10.io.Serializer ser = ((x10.io.Serializer)(new x10.io.Serializer()));
        
        //#line 137 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
        ser.writeAny(((java.lang.Object)(cl)));
        
        //#line 138 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
        final x10.lang.PlaceGroup this$110784 = ((x10.lang.PlaceGroup)(this));
        
        //#line 41 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
        final long t$110826 = this$110784.numPlaces$O();
        
        //#line 138 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
        final long t$110827 = ((t$110826) - (((long)(1L))));
        
        //#line 138 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
        ser.addDeserializeCount((long)(t$110827));
        
        //#line 139 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
        final x10.core.Rail message = ser.toRail();
        
        //#line 140 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
        long numSkipped = 0L;
        {
            
            //#line 141 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
            x10.lang.Runtime.ensureNotInAtomic();
            
            //#line 141 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
            final x10.lang.FinishState x10$__var5 = x10.lang.Runtime.startFinish((int)(x10.compiler.Pragma.FINISH_SPMD));
            
            //#line 141 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
            try {{
                {
                    
                    //#line 141 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
                    final x10.lang.Iterator p$76160 = this.iterator();
                    
                    //#line 141 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
                    for (;
                         true;
                         ) {
                        
                        //#line 141 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
                        final boolean t$110837 = ((x10.lang.Iterator<x10.lang.Place>)p$76160).hasNext$O();
                        
                        //#line 141 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
                        if (!(t$110837)) {
                            
                            //#line 141 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
                            break;
                        }
                        
                        //#line 141 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
                        final x10.lang.Place p$110906 = ((x10.lang.Place)(((x10.lang.Iterator<x10.lang.Place>)p$76160).next$G()));
                        
                        //#line 186 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
                        final long t$110907 = p$110906.id;
                        
                        //#line 186 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
                        final boolean t$110908 = x10.x10rt.X10RT.isPlaceDead((int)((long)(t$110907)));
                        
                        //#line 142 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
                        boolean t$110909 = !(t$110908);
                        
                        //#line 142 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
                        if (!(t$110909)) {
                            
                            //#line 142 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
                            final boolean t$110910 = x10.core.Boolean.$unbox(((x10.core.fun.Fun_0_1<x10.lang.Place,x10.core.Boolean>)ignoreIfDead).$apply(p$110906, x10.lang.Place.$RTT));
                            
                            //#line 142 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
                            t$110909 = !(t$110910);
                        }
                        
                        //#line 142 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
                        final boolean t$110911 = t$110909;
                        
                        //#line 142 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
                        if (t$110911) {
                            
                            //#line 143 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
                            x10.lang.Runtime.runAsync(((x10.lang.Place)(p$110906)), ((x10.core.fun.VoidFun_0_0)(new x10.lang.PlaceGroup.$Closure$130(message, (x10.lang.PlaceGroup.$Closure$130.__0$1x10$lang$Byte$2) null))), ((x10.lang.Runtime.Profile)(null)));
                        } else {
                            
                            //#line 149 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
                            final long t$110915 = numSkipped;
                            
                            //#line 149 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
                            final long t$110916 = ((t$110915) + (((long)(1L))));
                            
                            //#line 149 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
                            numSkipped = t$110916;
                        }
                    }
                }
            }}catch (java.lang.Throwable __lowerer__var__0__) {
                
                //#line 141 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
                x10.lang.Runtime.pushException(((java.lang.Throwable)(__lowerer__var__0__)));
                
                //#line 141 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
                throw new java.lang.RuntimeException();
            }finally {{
                 
                 //#line 141 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
                 x10.lang.Runtime.stopFinish(((x10.lang.FinishState)(x10$__var5)));
             }}
            }
        
        //#line 152 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
        final long t$110838 = numSkipped;
        
        //#line 152 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
        final boolean t$110845 = ((t$110838) > (((long)(0L))));
        
        //#line 152 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
        if (t$110845) {
            
            //#line 153 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
            final long i$76162max$76164 = numSkipped;
            
            //#line 153 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
            long i$110922 = 1L;
            
            //#line 153 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
            for (;
                 true;
                 ) {
                
                //#line 153 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
                final long t$110923 = i$110922;
                
                //#line 153 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
                final boolean t$110924 = ((t$110923) <= (((long)(i$76162max$76164))));
                
                //#line 153 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
                if (!(t$110924)) {
                    
                    //#line 153 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
                    break;
                }
                
                //#line 161 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
                final x10.io.Deserializer dser$110917 = ((x10.io.Deserializer)(new x10.io.Deserializer(((x10.core.Rail)(message)), (x10.io.Deserializer.__0$1x10$lang$Byte$2) null)));
                
                //#line 162 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
                final java.lang.Object t$110918 = dser$110917.readAny();
                
                //#line 162 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
                final x10.core.fun.VoidFun_0_0 cls$110919 = x10.rtt.Types.<x10.core.fun.VoidFun_0_0> cast(t$110918,x10.core.fun.VoidFun_0_0.$RTT);
                
                //#line 153 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
                final long t$110920 = i$110922;
                
                //#line 153 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
                final long t$110921 = ((t$110920) + (((long)(1L))));
                
                //#line 153 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
                i$110922 = t$110921;
            }
        }
        }
    
    
    //#line 167 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
    @x10.runtime.impl.java.X10Generated
    public static class SimplePlaceGroup extends x10.lang.PlaceGroup implements x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<SimplePlaceGroup> $RTT = 
            x10.rtt.NamedType.<SimplePlaceGroup> make("x10.lang.PlaceGroup.SimplePlaceGroup",
                                                      SimplePlaceGroup.class,
                                                      new x10.rtt.Type[] {
                                                          x10.lang.PlaceGroup.$RTT
                                                      });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.PlaceGroup.SimplePlaceGroup $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.lang.PlaceGroup.$_deserialize_body($_obj, $deserializer);
            $_obj.numPlaces = $deserializer.readLong();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.lang.PlaceGroup.SimplePlaceGroup $_obj = new x10.lang.PlaceGroup.SimplePlaceGroup((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            super.$_serialize($serializer);
            $serializer.write(this.numPlaces);
            
        }
        
        // constructor just for allocation
        public SimplePlaceGroup(final java.lang.System[] $dummy) {
            super($dummy);
            
        }
        
        
    
        
        //#line 168 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
        public long numPlaces;
        
        
        //#line 169 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
        // creation method for java code (1-phase java constructor)
        public SimplePlaceGroup(final long numPlaces) {
            this((java.lang.System[]) null);
            x10$lang$PlaceGroup$SimplePlaceGroup$$init$S(numPlaces);
        }
        
        // constructor for non-virtual call
        final public x10.lang.PlaceGroup.SimplePlaceGroup x10$lang$PlaceGroup$SimplePlaceGroup$$init$S(final long numPlaces) {
             {
                
                //#line 169 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
                final x10.lang.PlaceGroup this$110785 = this;
                
                //#line 169 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
                
                
                //#line 167 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
                final x10.lang.PlaceGroup.SimplePlaceGroup this$110925 = this;
                
                //#line 169 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
                this.numPlaces = numPlaces;
            }
            return this;
        }
        
        
        
        //#line 170 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
        public x10.lang.Place $apply(final long i) {
            
            //#line 170 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
            final x10.lang.Place alloc$76151 = ((x10.lang.Place)(new x10.lang.Place((java.lang.System[]) null)));
            
            //#line 170 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
            alloc$76151.x10$lang$Place$$init$S(((long)(i)));
            
            //#line 170 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
            return alloc$76151;
        }
        
        
        //#line 171 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
        public long numPlaces$O() {
            
            //#line 171 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
            final long t$110846 = numPlaces;
            
            //#line 171 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
            return t$110846;
        }
        
        
        //#line 172 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
        public boolean contains$O(final long id) {
            
            //#line 172 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
            boolean t$110848 = ((id) >= (((long)(0L))));
            
            //#line 172 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
            if (t$110848) {
                
                //#line 172 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
                final long t$110847 = numPlaces;
                
                //#line 172 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
                t$110848 = ((id) < (((long)(t$110847))));
            }
            
            //#line 172 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
            final boolean t$110849 = t$110848;
            
            //#line 172 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
            return t$110849;
        }
        
        
        //#line 173 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
        public long indexOf$O(final long id) {
            
            //#line 173 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
            final boolean t$110850 = this.contains$O((long)(id));
            
            //#line 173 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
            long t$110851 =  0;
            
            //#line 173 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
            if (t$110850) {
                
                //#line 173 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
                t$110851 = id;
            } else {
                
                //#line 173 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
                t$110851 = -1L;
            }
            
            //#line 173 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
            final long t$110852 = t$110851;
            
            //#line 173 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
            return t$110852;
        }
        
        
        //#line 174 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
        public x10.lang.Iterator iterator() {
            
            //#line 174 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
            final x10.lang.PlaceGroup.SimplePlaceGroup.Anonymous$5937 alloc$76152 = ((x10.lang.PlaceGroup.SimplePlaceGroup.Anonymous$5937)(new x10.lang.PlaceGroup.SimplePlaceGroup.Anonymous$5937((java.lang.System[]) null)));
            
            //#line 167 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
            final x10.lang.PlaceGroup.SimplePlaceGroup out$110792 = ((x10.lang.PlaceGroup.SimplePlaceGroup)(this));
            
            //#line 167 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
            alloc$76152.out$ = out$110792;
            
            //#line 174 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
            return alloc$76152;
        }
        
        
        //#line 179 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
        public boolean equals(final java.lang.Object thatObj) {
            
            //#line 180 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
            final boolean t$110858 = x10.lang.PlaceGroup.SimplePlaceGroup.$RTT.isInstance(thatObj);
            
            //#line 180 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
            if (t$110858) {
                
                //#line 181 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
                final long t$110854 = this.numPlaces$O();
                
                //#line 181 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
                final x10.lang.PlaceGroup t$110853 = ((x10.lang.PlaceGroup)(x10.rtt.Types.<x10.lang.PlaceGroup> cast(thatObj,x10.lang.PlaceGroup.$RTT)));
                
                //#line 181 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
                final long t$110855 = t$110853.numPlaces$O();
                
                //#line 181 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
                final boolean t$110856 = ((long) t$110854) == ((long) t$110855);
                
                //#line 181 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
                return t$110856;
            } else {
                
                //#line 183 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
                final boolean t$110857 = super.equals(((java.lang.Object)(thatObj)));
                
                //#line 183 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
                return t$110857;
            }
        }
        
        
        //#line 186 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
        public int hashCode() {
            
            //#line 186 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
            final long t$110859 = numPlaces;
            
            //#line 186 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
            final int t$110860 = x10.rtt.Types.hashCode(t$110859);
            
            //#line 186 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
            return t$110860;
        }
        
        
        //#line 187 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
        public void broadcastFlat(final x10.core.fun.VoidFun_0_0 cl) {
            
            //#line 188 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
            final long t$110861 = this.numPlaces$O();
            
            //#line 188 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
            final boolean t$110879 = ((t$110861) >= (((long)(1024L))));
            
            //#line 188 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
            if (t$110879) {
                
                //#line 189 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
                final x10.io.Serializer ser = ((x10.io.Serializer)(new x10.io.Serializer()));
                
                //#line 190 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
                ser.writeAny(((java.lang.Object)(cl)));
                
                //#line 191 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
                final x10.lang.PlaceGroup this$110794 = ((x10.lang.PlaceGroup)
                                                          this);
                
                //#line 41 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
                final long t$110862 = this$110794.numPlaces$O();
                
                //#line 191 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
                final long t$110863 = ((t$110862) - (((long)(1L))));
                
                //#line 191 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
                ser.addDeserializeCount((long)(t$110863));
                
                //#line 192 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
                final x10.core.Rail message = ser.toRail();
                {
                    
                    //#line 193 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
                    x10.lang.Runtime.ensureNotInAtomic();
                    
                    //#line 193 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
                    final x10.lang.FinishState x10$__var7 = x10.lang.Runtime.startFinish((int)(x10.compiler.Pragma.FINISH_SPMD));
                    
                    //#line 193 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
                    try {{
                        {
                            
                            //#line 193 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
                            final long t$110865 = this.numPlaces$O();
                            
                            //#line 193 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
                            long i = ((t$110865) - (((long)(1L))));
                            
                            //#line 193 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
                            for (;
                                 true;
                                 ) {
                                
                                //#line 193 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
                                final long t$110866 = i;
                                
                                //#line 193 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
                                final boolean t$110878 = ((t$110866) >= (((long)(0L))));
                                
                                //#line 193 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
                                if (!(t$110878)) {
                                    
                                    //#line 193 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
                                    break;
                                }
                                
                                //#line 194 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
                                final x10.lang.Place alloc$110934 = ((x10.lang.Place)(new x10.lang.Place((java.lang.System[]) null)));
                                
                                //#line 194 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
                                final long t$110933 = i;
                                
                                //#line 194 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
                                alloc$110934.x10$lang$Place$$init$S(t$110933);
                                
                                //#line 194 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
                                x10.lang.Runtime.runAsync(((x10.lang.Place)(alloc$110934)), ((x10.core.fun.VoidFun_0_0)(new x10.lang.PlaceGroup.SimplePlaceGroup.$Closure$128(message, (x10.lang.PlaceGroup.SimplePlaceGroup.$Closure$128.__0$1x10$lang$Byte$2) null))), ((x10.lang.Runtime.Profile)(null)));
                                
                                //#line 193 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
                                final long t$110941 = i;
                                
                                //#line 193 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
                                final long t$110942 = ((t$110941) - (((long)(32L))));
                                
                                //#line 193 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
                                i = t$110942;
                            }
                        }
                    }}catch (java.lang.Throwable __lowerer__var__0__) {
                        
                        //#line 193 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
                        x10.lang.Runtime.pushException(((java.lang.Throwable)(__lowerer__var__0__)));
                        
                        //#line 193 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
                        throw new java.lang.RuntimeException();
                    }finally {{
                         
                         //#line 193 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
                         x10.lang.Runtime.stopFinish(((x10.lang.FinishState)(x10$__var7)));
                     }}
                    }
                } else {
                    
                    //#line 207 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
                    super.broadcastFlat(((x10.core.fun.VoidFun_0_0)(cl)));
                }
            }
        
        
        //#line 167 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
        final public x10.lang.PlaceGroup.SimplePlaceGroup x10$lang$PlaceGroup$SimplePlaceGroup$$this$x10$lang$PlaceGroup$SimplePlaceGroup() {
            
            //#line 167 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
            return x10.lang.PlaceGroup.SimplePlaceGroup.this;
        }
        
        
        //#line 167 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
        final public void __fieldInitializers_x10_lang_PlaceGroup_SimplePlaceGroup() {
            
        }
        
        
        //#line 174 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
        @x10.runtime.impl.java.X10Generated
        final public static class Anonymous$5937 extends x10.core.Ref implements x10.lang.Iterator, x10.serialization.X10JavaSerializable
        {
            public static final x10.rtt.RuntimeType<Anonymous$5937> $RTT = 
                x10.rtt.NamedType.<Anonymous$5937> make("x10.lang.PlaceGroup.SimplePlaceGroup.Anonymous$5937",
                                                        Anonymous$5937.class,
                                                        new x10.rtt.Type[] {
                                                            x10.rtt.ParameterizedType.make(x10.lang.Iterator.$RTT, x10.lang.Place.$RTT)
                                                        });
            
            public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
            
            public x10.rtt.Type<?> $getParam(int i) { return null; }
            
            public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.PlaceGroup.SimplePlaceGroup.Anonymous$5937 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
                $_obj.i = $deserializer.readLong();
                $_obj.out$ = $deserializer.readObject();
                return $_obj;
            }
            
            public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
                x10.lang.PlaceGroup.SimplePlaceGroup.Anonymous$5937 $_obj = new x10.lang.PlaceGroup.SimplePlaceGroup.Anonymous$5937((java.lang.System[]) null);
                $deserializer.record_reference($_obj);
                return $_deserialize_body($_obj, $deserializer);
            }
            
            public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
                $serializer.write(this.i);
                $serializer.write(this.out$);
                
            }
            
            // constructor just for allocation
            public Anonymous$5937(final java.lang.System[] $dummy) {
                
            }
            
            // bridge for method abstract public x10.lang.Iterator[T].next(){}:T
            public x10.lang.Place next$G() {
                return next();
            }
            
            
        
            
            //#line 167 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
            public x10.lang.PlaceGroup.SimplePlaceGroup out$;
            
            //#line 175 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
            public long i = 0L;
            
            
            //#line 176 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
            public boolean hasNext$O() {
                
                //#line 176 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
                final long t$110881 = i;
                
                //#line 176 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
                final x10.lang.PlaceGroup.SimplePlaceGroup t$110880 = this.out$;
                
                //#line 176 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
                final long t$110882 = t$110880.numPlaces;
                
                //#line 176 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
                final boolean t$110883 = ((t$110881) < (((long)(t$110882))));
                
                //#line 176 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
                return t$110883;
            }
            
            
            //#line 177 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
            public x10.lang.Place next() {
                
                //#line 177 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
                final x10.lang.Place alloc$76155 = ((x10.lang.Place)(new x10.lang.Place((java.lang.System[]) null)));
                
                //#line 177 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
                final long t$110943 = this.i;
                
                //#line 177 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
                final long t$110944 = ((t$110943) + (((long)(1L))));
                
                //#line 177 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
                final long t$110945 = this.i = t$110944;
                
                //#line 177 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
                final long t$110946 = ((t$110945) - (((long)(1L))));
                
                //#line 177 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
                alloc$76155.x10$lang$Place$$init$S(t$110946);
                
                //#line 177 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
                return alloc$76155;
            }
            
            
            //#line 174 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
            // creation method for java code (1-phase java constructor)
            public Anonymous$5937(final x10.lang.PlaceGroup.SimplePlaceGroup out$) {
                this((java.lang.System[]) null);
                x10$lang$PlaceGroup$SimplePlaceGroup$Anonymous$5937$$init$S(out$);
            }
            
            // constructor for non-virtual call
            final public x10.lang.PlaceGroup.SimplePlaceGroup.Anonymous$5937 x10$lang$PlaceGroup$SimplePlaceGroup$Anonymous$5937$$init$S(final x10.lang.PlaceGroup.SimplePlaceGroup out$) {
                 {
                    
                    //#line 167 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
                    this.out$ = out$;
                }
                return this;
            }
            
        }
        
        @x10.runtime.impl.java.X10Generated
        final public static class $Closure$127 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
        {
            public static final x10.rtt.RuntimeType<$Closure$127> $RTT = 
                x10.rtt.StaticVoidFunType.<$Closure$127> make($Closure$127.class,
                                                              new x10.rtt.Type[] {
                                                                  x10.core.fun.VoidFun_0_0.$RTT
                                                              });
            
            public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
            
            public x10.rtt.Type<?> $getParam(int i) { return null; }
            
            public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.PlaceGroup.SimplePlaceGroup.$Closure$127 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
                $_obj.message = $deserializer.readObject();
                return $_obj;
            }
            
            public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
                x10.lang.PlaceGroup.SimplePlaceGroup.$Closure$127 $_obj = new x10.lang.PlaceGroup.SimplePlaceGroup.$Closure$127((java.lang.System[]) null);
                $deserializer.record_reference($_obj);
                return $_deserialize_body($_obj, $deserializer);
            }
            
            public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
                $serializer.write(this.message);
                
            }
            
            // constructor just for allocation
            public $Closure$127(final java.lang.System[] $dummy) {
                
            }
            
            // synthetic type for parameter mangling
            public static final class __0$1x10$lang$Byte$2 {}
            
        
            
            public void $apply() {
                
                //#line 198 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
                try {{
                    
                    //#line 199 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
                    final x10.io.Deserializer dser$110928 = ((x10.io.Deserializer)(new x10.io.Deserializer(this.message, (x10.io.Deserializer.__0$1x10$lang$Byte$2) null)));
                    
                    //#line 200 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
                    final java.lang.Object t$110929 = dser$110928.readAny();
                    
                    //#line 200 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
                    final x10.core.fun.VoidFun_0_0 cls$110930 = x10.rtt.Types.<x10.core.fun.VoidFun_0_0> cast(t$110929,x10.core.fun.VoidFun_0_0.$RTT);
                    
                    //#line 201 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
                    ((x10.core.fun.VoidFun_0_0)cls$110930).$apply();
                }}catch (java.lang.Error __lowerer__var__0__) {
                    
                    //#line 198 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
                    throw __lowerer__var__0__;
                }catch (java.lang.Throwable __lowerer__var__1__) {
                    
                    //#line 198 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
                    throw x10.rtt.Types.EXCEPTION.isInstance(__lowerer__var__1__) ? (java.lang.RuntimeException)(__lowerer__var__1__) : new x10.lang.WrappedThrowable(__lowerer__var__1__);
                }
            }
            
            public x10.core.Rail<x10.core.Byte> message;
            
            public $Closure$127(final x10.core.Rail<x10.core.Byte> message, __0$1x10$lang$Byte$2 $dummy) {
                 {
                    this.message = ((x10.core.Rail)(message));
                }
            }
            
        }
        
        @x10.runtime.impl.java.X10Generated
        final public static class $Closure$128 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
        {
            public static final x10.rtt.RuntimeType<$Closure$128> $RTT = 
                x10.rtt.StaticVoidFunType.<$Closure$128> make($Closure$128.class,
                                                              new x10.rtt.Type[] {
                                                                  x10.core.fun.VoidFun_0_0.$RTT
                                                              });
            
            public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
            
            public x10.rtt.Type<?> $getParam(int i) { return null; }
            
            public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.PlaceGroup.SimplePlaceGroup.$Closure$128 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
                $_obj.message = $deserializer.readObject();
                return $_obj;
            }
            
            public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
                x10.lang.PlaceGroup.SimplePlaceGroup.$Closure$128 $_obj = new x10.lang.PlaceGroup.SimplePlaceGroup.$Closure$128((java.lang.System[]) null);
                $deserializer.record_reference($_obj);
                return $_deserialize_body($_obj, $deserializer);
            }
            
            public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
                $serializer.write(this.message);
                
            }
            
            // constructor just for allocation
            public $Closure$128(final java.lang.System[] $dummy) {
                
            }
            
            // synthetic type for parameter mangling
            public static final class __0$1x10$lang$Byte$2 {}
            
        
            
            public void $apply() {
                
                //#line 194 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
                try {{
                    
                    //#line 195 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
                    final long max$110935 = ((long)x10.x10rt.X10RT.here());
                    
                    //#line 196 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
                    final long t$110936 = ((max$110935) - (((long)(31L))));
                    
                    //#line 196 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
                    final long min$110937 = java.lang.Math.max(((long)(t$110936)),((long)(0L)));
                    {
                        
                        //#line 197 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
                        x10.lang.Runtime.ensureNotInAtomic();
                        
                        //#line 197 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
                        final x10.lang.FinishState x10$__var6 = x10.lang.Runtime.startFinish((int)(x10.compiler.Pragma.FINISH_SPMD));
                        
                        //#line 197 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
                        try {{
                            {
                                
                                //#line 197 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
                                long j$110938 = min$110937;
                                
                                //#line 197 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
                                for (;
                                     true;
                                     ) {
                                    
                                    //#line 197 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
                                    final long t$110939 = j$110938;
                                    
                                    //#line 197 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
                                    final boolean t$110940 = ((t$110939) <= (((long)(max$110935))));
                                    
                                    //#line 197 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
                                    if (!(t$110940)) {
                                        
                                        //#line 197 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
                                        break;
                                    }
                                    
                                    //#line 198 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
                                    final x10.lang.Place alloc$110927 = ((x10.lang.Place)(new x10.lang.Place((java.lang.System[]) null)));
                                    
                                    //#line 198 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
                                    final long t$110926 = j$110938;
                                    
                                    //#line 198 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
                                    alloc$110927.x10$lang$Place$$init$S(t$110926);
                                    
                                    //#line 198 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
                                    x10.lang.Runtime.runAsync(((x10.lang.Place)(alloc$110927)), ((x10.core.fun.VoidFun_0_0)(new x10.lang.PlaceGroup.SimplePlaceGroup.$Closure$127(((x10.core.Rail)(this.message)), (x10.lang.PlaceGroup.SimplePlaceGroup.$Closure$127.__0$1x10$lang$Byte$2) null))), ((x10.lang.Runtime.Profile)(null)));
                                    
                                    //#line 197 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
                                    final long t$110931 = j$110938;
                                    
                                    //#line 197 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
                                    final long t$110932 = ((t$110931) + (((long)(1L))));
                                    
                                    //#line 197 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
                                    j$110938 = t$110932;
                                }
                            }
                        }}catch (java.lang.Throwable __lowerer__var__0__) {
                            
                            //#line 197 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
                            x10.lang.Runtime.pushException(((java.lang.Throwable)(__lowerer__var__0__)));
                            
                            //#line 197 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
                            throw new java.lang.RuntimeException();
                        }finally {{
                             
                             //#line 197 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
                             x10.lang.Runtime.stopFinish(((x10.lang.FinishState)(x10$__var6)));
                         }}
                        }
                    }}catch (java.lang.Error __lowerer__var__0__) {
                        
                        //#line 194 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
                        throw __lowerer__var__0__;
                    }catch (java.lang.Throwable __lowerer__var__1__) {
                        
                        //#line 194 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
                        throw x10.rtt.Types.EXCEPTION.isInstance(__lowerer__var__1__) ? (java.lang.RuntimeException)(__lowerer__var__1__) : new x10.lang.WrappedThrowable(__lowerer__var__1__);
                    }
                }
            
            public x10.core.Rail<x10.core.Byte> message;
            
            public $Closure$128(final x10.core.Rail<x10.core.Byte> message, __0$1x10$lang$Byte$2 $dummy) {
                 {
                    this.message = ((x10.core.Rail)(message));
                }
            }
            
            }
            
        
        public boolean x10$lang$PlaceGroup$equals$S$O(final java.lang.Object a0) {
            return super.equals(((java.lang.Object)(a0)));
        }
        
        public void x10$lang$PlaceGroup$broadcastFlat$S(final x10.core.fun.VoidFun_0_0 a0) {
            super.broadcastFlat(((x10.core.fun.VoidFun_0_0)(a0)));
        }
        }
        
        
        
        //#line 212 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
        final public static x10.lang.PlaceGroup.SimplePlaceGroup make(final long numPlaces) {
            
            //#line 212 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
            final x10.lang.PlaceGroup.SimplePlaceGroup alloc$76156 = ((x10.lang.PlaceGroup.SimplePlaceGroup)(new x10.lang.PlaceGroup.SimplePlaceGroup((java.lang.System[]) null)));
            
            //#line 212 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
            alloc$76156.x10$lang$PlaceGroup$SimplePlaceGroup$$init$S(((long)(numPlaces)));
            
            //#line 212 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
            return alloc$76156;
        }
        
        
        //#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
        final public x10.lang.PlaceGroup x10$lang$PlaceGroup$$this$x10$lang$PlaceGroup() {
            
            //#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
            return x10.lang.PlaceGroup.this;
        }
        
        
        //#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
        
        // constructor for non-virtual call
        final public x10.lang.PlaceGroup x10$lang$PlaceGroup$$init$S() {
             {
                
                //#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
                
                
                //#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
                final x10.lang.PlaceGroup this$110795 = this;
            }
            return this;
        }
        
        
        
        //#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
        abstract public x10.lang.Iterator iterator();
        
        
        //#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
        final public void __fieldInitializers_x10_lang_PlaceGroup() {
            
        }
        
        final private static x10.core.concurrent.AtomicInteger initStatus$WORLD = new x10.core.concurrent.AtomicInteger(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED);
        private static x10.lang.ExceptionInInitializer exception$WORLD;
        
        public static x10.lang.PlaceGroup.SimplePlaceGroup get$WORLD() {
            if (((int) x10.lang.PlaceGroup.initStatus$WORLD.get()) == ((int) x10.runtime.impl.java.InitDispatcher.INITIALIZED)) {
                return x10.lang.PlaceGroup.WORLD;
            }
            if (((int) x10.lang.PlaceGroup.initStatus$WORLD.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
                throw x10.lang.PlaceGroup.exception$WORLD;
            }
            if (x10.lang.PlaceGroup.initStatus$WORLD.compareAndSet((int)(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED), (int)(x10.runtime.impl.java.InitDispatcher.INITIALIZING))) {
                try {{
                    x10.lang.PlaceGroup.WORLD = ((x10.lang.PlaceGroup.SimplePlaceGroup)(new x10.lang.PlaceGroup.SimplePlaceGroup((java.lang.System[]) null).x10$lang$PlaceGroup$SimplePlaceGroup$$init$S(((long)(x10.lang.Place.get$MAX_PLACES())))));
                }}catch (java.lang.Throwable exc$110975) {
                    x10.lang.PlaceGroup.exception$WORLD = new x10.lang.ExceptionInInitializer(exc$110975);
                    x10.lang.PlaceGroup.initStatus$WORLD.set((int)(x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED));
                    x10.runtime.impl.java.InitDispatcher.lockInitialized();
                    x10.runtime.impl.java.InitDispatcher.notifyInitialized();
                    throw x10.lang.PlaceGroup.exception$WORLD;
                }
                x10.lang.PlaceGroup.initStatus$WORLD.set((int)(x10.runtime.impl.java.InitDispatcher.INITIALIZED));
                x10.runtime.impl.java.InitDispatcher.lockInitialized();
                x10.runtime.impl.java.InitDispatcher.notifyInitialized();
            } else {
                if (x10.lang.PlaceGroup.initStatus$WORLD.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                    x10.runtime.impl.java.InitDispatcher.lockInitialized();
                    while (x10.lang.PlaceGroup.initStatus$WORLD.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                        x10.runtime.impl.java.InitDispatcher.awaitInitialized();
                    }
                    x10.runtime.impl.java.InitDispatcher.unlockInitialized();
                    if (((int) x10.lang.PlaceGroup.initStatus$WORLD.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
                        throw x10.lang.PlaceGroup.exception$WORLD;
                    }
                }
            }
            return x10.lang.PlaceGroup.WORLD;
        }
        
        @x10.runtime.impl.java.X10Generated
        final public static class $Closure$129 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
        {
            public static final x10.rtt.RuntimeType<$Closure$129> $RTT = 
                x10.rtt.StaticVoidFunType.<$Closure$129> make($Closure$129.class,
                                                              new x10.rtt.Type[] {
                                                                  x10.core.fun.VoidFun_0_0.$RTT
                                                              });
            
            public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
            
            public x10.rtt.Type<?> $getParam(int i) { return null; }
            
            public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.PlaceGroup.$Closure$129 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
                $_obj.message = $deserializer.readObject();
                return $_obj;
            }
            
            public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
                x10.lang.PlaceGroup.$Closure$129 $_obj = new x10.lang.PlaceGroup.$Closure$129((java.lang.System[]) null);
                $deserializer.record_reference($_obj);
                return $_deserialize_body($_obj, $deserializer);
            }
            
            public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
                $serializer.write(this.message);
                
            }
            
            // constructor just for allocation
            public $Closure$129(final java.lang.System[] $dummy) {
                
            }
            
            // synthetic type for parameter mangling
            public static final class __0$1x10$lang$Byte$2 {}
            
        
            
            public void $apply() {
                
                //#line 122 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
                try {{
                    
                    //#line 123 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
                    final x10.io.Deserializer dser$110903 = ((x10.io.Deserializer)(new x10.io.Deserializer(this.message, (x10.io.Deserializer.__0$1x10$lang$Byte$2) null)));
                    
                    //#line 124 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
                    final java.lang.Object t$110904 = dser$110903.readAny();
                    
                    //#line 124 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
                    final x10.core.fun.VoidFun_0_0 cls$110905 = x10.rtt.Types.<x10.core.fun.VoidFun_0_0> cast(t$110904,x10.core.fun.VoidFun_0_0.$RTT);
                    
                    //#line 125 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
                    ((x10.core.fun.VoidFun_0_0)cls$110905).$apply();
                }}catch (java.lang.Error __lowerer__var__0__) {
                    
                    //#line 122 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
                    throw __lowerer__var__0__;
                }catch (java.lang.Throwable __lowerer__var__1__) {
                    
                    //#line 122 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
                    throw x10.rtt.Types.EXCEPTION.isInstance(__lowerer__var__1__) ? (java.lang.RuntimeException)(__lowerer__var__1__) : new x10.lang.WrappedThrowable(__lowerer__var__1__);
                }
            }
            
            public x10.core.Rail<x10.core.Byte> message;
            
            public $Closure$129(final x10.core.Rail<x10.core.Byte> message, __0$1x10$lang$Byte$2 $dummy) {
                 {
                    this.message = ((x10.core.Rail)(message));
                }
            }
            
        }
        
        @x10.runtime.impl.java.X10Generated
        final public static class $Closure$130 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
        {
            public static final x10.rtt.RuntimeType<$Closure$130> $RTT = 
                x10.rtt.StaticVoidFunType.<$Closure$130> make($Closure$130.class,
                                                              new x10.rtt.Type[] {
                                                                  x10.core.fun.VoidFun_0_0.$RTT
                                                              });
            
            public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
            
            public x10.rtt.Type<?> $getParam(int i) { return null; }
            
            public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.PlaceGroup.$Closure$130 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
                $_obj.message = $deserializer.readObject();
                return $_obj;
            }
            
            public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
                x10.lang.PlaceGroup.$Closure$130 $_obj = new x10.lang.PlaceGroup.$Closure$130((java.lang.System[]) null);
                $deserializer.record_reference($_obj);
                return $_deserialize_body($_obj, $deserializer);
            }
            
            public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
                $serializer.write(this.message);
                
            }
            
            // constructor just for allocation
            public $Closure$130(final java.lang.System[] $dummy) {
                
            }
            
            // synthetic type for parameter mangling
            public static final class __0$1x10$lang$Byte$2 {}
            
        
            
            public void $apply() {
                
                //#line 143 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
                try {{
                    
                    //#line 144 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
                    final x10.io.Deserializer dser$110912 = ((x10.io.Deserializer)(new x10.io.Deserializer(this.message, (x10.io.Deserializer.__0$1x10$lang$Byte$2) null)));
                    
                    //#line 145 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
                    final java.lang.Object t$110913 = dser$110912.readAny();
                    
                    //#line 145 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
                    final x10.core.fun.VoidFun_0_0 cls$110914 = x10.rtt.Types.<x10.core.fun.VoidFun_0_0> cast(t$110913,x10.core.fun.VoidFun_0_0.$RTT);
                    
                    //#line 146 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
                    ((x10.core.fun.VoidFun_0_0)cls$110914).$apply();
                }}catch (java.lang.Error __lowerer__var__0__) {
                    
                    //#line 143 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
                    throw __lowerer__var__0__;
                }catch (java.lang.Throwable __lowerer__var__1__) {
                    
                    //#line 143 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
                    throw x10.rtt.Types.EXCEPTION.isInstance(__lowerer__var__1__) ? (java.lang.RuntimeException)(__lowerer__var__1__) : new x10.lang.WrappedThrowable(__lowerer__var__1__);
                }
            }
            
            public x10.core.Rail<x10.core.Byte> message;
            
            public $Closure$130(final x10.core.Rail<x10.core.Byte> message, __0$1x10$lang$Byte$2 $dummy) {
                 {
                    this.message = ((x10.core.Rail)(message));
                }
            }
            
        }
        
    }
    
    