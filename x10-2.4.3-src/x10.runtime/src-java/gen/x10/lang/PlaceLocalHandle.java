package x10.lang;


@x10.runtime.impl.java.X10Generated
final public class PlaceLocalHandle<$T> extends x10.core.Struct implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<PlaceLocalHandle> $RTT = 
        x10.rtt.NamedStructType.<PlaceLocalHandle> make("x10.lang.PlaceLocalHandle",
                                                        PlaceLocalHandle.class,
                                                        1,
                                                        new x10.rtt.Type[] {
                                                            x10.rtt.Types.STRUCT
                                                        });
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $T; return null; }
    
    public static <$T> x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.PlaceLocalHandle<$T> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        $_obj.$T = (x10.rtt.Type) $deserializer.readObject();
        $_obj.__NATIVE_FIELD__ = $deserializer.readObject();
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.lang.PlaceLocalHandle $_obj = new x10.lang.PlaceLocalHandle(null, (java.lang.System) null);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        $serializer.write(this.$T);
        $serializer.write(this.__NATIVE_FIELD__);
        
    }
    
    // zero value constructor
    public PlaceLocalHandle(final x10.rtt.Type $T, final java.lang.System $dummy) { this.$T = $T; this.__NATIVE_FIELD__ = new x10.core.PlaceLocalHandle<$T>($T, $dummy); }
    
    // constructor just for allocation
    public PlaceLocalHandle(final java.lang.System[] $dummy, final x10.rtt.Type $T) {
        x10.lang.PlaceLocalHandle.$initParams(this, $T);
        
    }
    
    private x10.rtt.Type $T;
    
    // initializer of type parameters
    public static void $initParams(final PlaceLocalHandle $this, final x10.rtt.Type $T) {
        $this.$T = $T;
        
    }
    

    
    //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
    public x10.core.PlaceLocalHandle<$T> __NATIVE_FIELD__;
    
    
    //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
    public PlaceLocalHandle(final x10.rtt.Type $T, final x10.core.PlaceLocalHandle<$T> id0) {
        x10.lang.PlaceLocalHandle.$initParams(this, $T);
         {
            
            //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
            ((x10.lang.PlaceLocalHandle<$T>)this).__NATIVE_FIELD__ = id0;
        }
    }
    
    
    
    //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
    public PlaceLocalHandle(final x10.rtt.Type $T) {
        x10.lang.PlaceLocalHandle.$initParams(this, $T);
         {
            
            //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
            ((x10.lang.PlaceLocalHandle<$T>)this).__NATIVE_FIELD__ = new x10.core.PlaceLocalHandle<$T>((java.lang.System[]) null, $T).x10$core$PlaceLocalHandle$$init$S();
        }
    }
    
    
    
    //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
    final public $T $apply$G() {
        
        //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
        final x10.core.PlaceLocalHandle t$110976 = this.__NATIVE_FIELD__;
        
        //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
        final $T t$110977 = (($T)(((x10.core.PlaceLocalHandle<$T>)t$110976).$apply$G()));
        
        //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
        return t$110977;
    }
    
    
    //#line 46 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
    final public void set__0x10$lang$PlaceLocalHandle$$T(final $T newVal) {
        
        //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
        final x10.core.PlaceLocalHandle t$110978 = this.__NATIVE_FIELD__;
        
        //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
        ((x10.core.PlaceLocalHandle<$T>)t$110978).set__0x10$lang$PlaceLocalHandle$$T((($T)(newVal)));
    }
    
    
    //#line 48 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
    final public int hashCode() {
        
        //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
        final x10.core.PlaceLocalHandle t$110979 = this.__NATIVE_FIELD__;
        
        //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
        final int t$110980 = ((x10.core.PlaceLocalHandle<$T>)t$110979).hashCode();
        
        //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
        return t$110980;
    }
    
    
    //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
    final public java.lang.String toString() {
        
        //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
        final x10.core.PlaceLocalHandle t$110981 = this.__NATIVE_FIELD__;
        
        //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
        final java.lang.String t$110982 = ((x10.core.PlaceLocalHandle<$T>)t$110981).toString();
        
        //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
        return t$110982;
    }
    
    
    //#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
    final public static <$T>x10.lang.PlaceLocalHandle make__1$1x10$lang$PlaceLocalHandle$$T$2(final x10.rtt.Type $T, final x10.lang.PlaceGroup pg, final x10.core.fun.Fun_0_0<$T> init) {
        
        //#line 64 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
        final x10.lang.Place t$75981 = ((x10.lang.Place)(x10.lang.Place.get$FIRST_PLACE()));
        
        //#line 64 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
        final x10.lang.PlaceLocalHandle handle = x10.lang.Runtime.<x10.lang.PlaceLocalHandle<$T>> evalAt__1$1x10$lang$Runtime$$T$2$G(x10.rtt.ParameterizedType.make(x10.lang.PlaceLocalHandle.$RTT, $T), ((x10.lang.Place)(t$75981)), ((x10.core.fun.Fun_0_0)(new x10.lang.PlaceLocalHandle.$Closure$131<$T>($T))), ((x10.lang.Runtime.Profile)(null)));
        {
            
            //#line 65 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
            x10.lang.Runtime.ensureNotInAtomic();
            
            //#line 65 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
            final x10.lang.FinishState x10$__var8 = x10.lang.Runtime.startFinish();
            
            //#line 65 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
            try {{
                {
                    
                    //#line 65 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
                    final x10.lang.Iterator p$75997 = pg.iterator();
                    
                    //#line 65 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
                    for (;
                         true;
                         ) {
                        
                        //#line 65 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
                        final boolean t$110985 = ((x10.lang.Iterator<x10.lang.Place>)p$75997).hasNext$O();
                        
                        //#line 65 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
                        if (!(t$110985)) {
                            
                            //#line 65 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
                            break;
                        }
                        
                        //#line 65 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
                        final x10.lang.Place p$111033 = ((x10.lang.Place)(((x10.lang.Iterator<x10.lang.Place>)p$75997).next$G()));
                        
                        //#line 66 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
                        x10.lang.Runtime.runAsync(((x10.lang.Place)(p$111033)), ((x10.core.fun.VoidFun_0_0)(new x10.lang.PlaceLocalHandle.$Closure$132<$T>($T, init, handle, (x10.lang.PlaceLocalHandle.$Closure$132.__0$1x10$lang$PlaceLocalHandle$$Closure$132$$T$2__1$1x10$lang$PlaceLocalHandle$$Closure$132$$T$2) null))), ((x10.lang.Runtime.Profile)(null)));
                    }
                }
            }}catch (java.lang.Throwable __lowerer__var__2__) {
                
                //#line 65 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
                x10.lang.Runtime.pushException(((java.lang.Throwable)(__lowerer__var__2__)));
                
                //#line 65 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
                throw new java.lang.RuntimeException();
            }finally {{
                 
                 //#line 65 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
                 x10.lang.Runtime.stopFinish(((x10.lang.FinishState)(x10$__var8)));
             }}
            }
        
        //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
        return handle;
        }
    
    
    //#line 84 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
    final public static <$T>x10.lang.PlaceLocalHandle make__1$1x10$lang$PlaceLocalHandle$$T$2__2$1x10$lang$Place$3x10$lang$Boolean$2(final x10.rtt.Type $T, final x10.lang.PlaceGroup pg, final x10.core.fun.Fun_0_0<$T> init, final x10.core.fun.Fun_0_1<x10.lang.Place,x10.core.Boolean> ignoreIfDead) {
        
        //#line 86 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
        final x10.lang.Place t$75983 = ((x10.lang.Place)(x10.lang.Place.get$FIRST_PLACE()));
        
        //#line 86 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
        final x10.lang.PlaceLocalHandle handle = x10.lang.Runtime.<x10.lang.PlaceLocalHandle<$T>> evalAt__1$1x10$lang$Runtime$$T$2$G(x10.rtt.ParameterizedType.make(x10.lang.PlaceLocalHandle.$RTT, $T), ((x10.lang.Place)(t$75983)), ((x10.core.fun.Fun_0_0)(new x10.lang.PlaceLocalHandle.$Closure$133<$T>($T))), ((x10.lang.Runtime.Profile)(null)));
        {
            
            //#line 87 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
            x10.lang.Runtime.ensureNotInAtomic();
            
            //#line 87 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
            final x10.lang.FinishState x10$__var9 = x10.lang.Runtime.startFinish();
            
            //#line 87 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
            try {{
                {
                    
                    //#line 87 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
                    final x10.lang.Iterator p$75999 = pg.iterator();
                    
                    //#line 87 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
                    for (;
                         true;
                         ) {
                        
                        //#line 87 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
                        final boolean t$110992 = ((x10.lang.Iterator<x10.lang.Place>)p$75999).hasNext$O();
                        
                        //#line 87 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
                        if (!(t$110992)) {
                            
                            //#line 87 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
                            break;
                        }
                        
                        //#line 87 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
                        final x10.lang.Place p$111035 = ((x10.lang.Place)(((x10.lang.Iterator<x10.lang.Place>)p$75999).next$G()));
                        
                        //#line 88 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
                        final boolean t$111036 = p$111035.isDead$O();
                        
                        //#line 88 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
                        boolean t$111037 = !(t$111036);
                        
                        //#line 88 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
                        if (!(t$111037)) {
                            
                            //#line 88 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
                            final boolean t$111038 = x10.core.Boolean.$unbox(((x10.core.fun.Fun_0_1<x10.lang.Place,x10.core.Boolean>)ignoreIfDead).$apply(p$111035, x10.lang.Place.$RTT));
                            
                            //#line 88 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
                            t$111037 = !(t$111038);
                        }
                        
                        //#line 88 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
                        final boolean t$111039 = t$111037;
                        
                        //#line 88 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
                        if (t$111039) {
                            
                            //#line 89 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
                            x10.lang.Runtime.runAsync(((x10.lang.Place)(p$111035)), ((x10.core.fun.VoidFun_0_0)(new x10.lang.PlaceLocalHandle.$Closure$134<$T>($T, init, handle, (x10.lang.PlaceLocalHandle.$Closure$134.__0$1x10$lang$PlaceLocalHandle$$Closure$134$$T$2__1$1x10$lang$PlaceLocalHandle$$Closure$134$$T$2) null))), ((x10.lang.Runtime.Profile)(null)));
                        }
                    }
                }
            }}catch (java.lang.Throwable __lowerer__var__2__) {
                
                //#line 87 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
                x10.lang.Runtime.pushException(((java.lang.Throwable)(__lowerer__var__2__)));
                
                //#line 87 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
                throw new java.lang.RuntimeException();
            }finally {{
                 
                 //#line 87 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
                 x10.lang.Runtime.stopFinish(((x10.lang.FinishState)(x10$__var9)));
             }}
            }
        
        //#line 92 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
        return handle;
        }
    
    
    //#line 109 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
    final public static <$T, $U>x10.lang.PlaceLocalHandle make__1$1x10$lang$Place$3x10$lang$PlaceLocalHandle$$U$2__2$1x10$lang$PlaceLocalHandle$$U$3x10$lang$PlaceLocalHandle$$T$2(final x10.rtt.Type $T, final x10.rtt.Type $U, final x10.lang.PlaceGroup pg, final x10.core.fun.Fun_0_1<x10.lang.Place,$U> init_here, final x10.core.fun.Fun_0_1<$U,$T> init_there) {
        
        //#line 110 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
        final x10.lang.Place t$75985 = ((x10.lang.Place)(x10.lang.Place.get$FIRST_PLACE()));
        
        //#line 110 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
        final x10.lang.PlaceLocalHandle handle = x10.lang.Runtime.<x10.lang.PlaceLocalHandle<$T>> evalAt__1$1x10$lang$Runtime$$T$2$G(x10.rtt.ParameterizedType.make(x10.lang.PlaceLocalHandle.$RTT, $T), ((x10.lang.Place)(t$75985)), ((x10.core.fun.Fun_0_0)(new x10.lang.PlaceLocalHandle.$Closure$135<$T, $U>($T, $U))), ((x10.lang.Runtime.Profile)(null)));
        {
            
            //#line 111 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
            x10.lang.Runtime.ensureNotInAtomic();
            
            //#line 111 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
            final x10.lang.FinishState x10$__var10 = x10.lang.Runtime.startFinish();
            
            //#line 111 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
            try {{
                {
                    
                    //#line 111 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
                    final x10.lang.Iterator p$76001 = pg.iterator();
                    
                    //#line 111 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
                    for (;
                         true;
                         ) {
                        
                        //#line 111 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
                        final boolean t$110995 = ((x10.lang.Iterator<x10.lang.Place>)p$76001).hasNext$O();
                        
                        //#line 111 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
                        if (!(t$110995)) {
                            
                            //#line 111 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
                            break;
                        }
                        
                        //#line 111 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
                        final x10.lang.Place p$111041 = ((x10.lang.Place)(((x10.lang.Iterator<x10.lang.Place>)p$76001).next$G()));
                        
                        //#line 112 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
                        final $U v$111042 = (($U)((($U)
                                                    ((x10.core.fun.Fun_0_1<x10.lang.Place,$U>)init_here).$apply(p$111041, x10.lang.Place.$RTT))));
                        
                        //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
                        x10.lang.Runtime.runAsync(((x10.lang.Place)(p$111041)), ((x10.core.fun.VoidFun_0_0)(new x10.lang.PlaceLocalHandle.$Closure$136<$T, $U>($T, $U, init_there, v$111042, handle, (x10.lang.PlaceLocalHandle.$Closure$136.__0$1x10$lang$PlaceLocalHandle$$Closure$136$$U$3x10$lang$PlaceLocalHandle$$Closure$136$$T$2__1x10$lang$PlaceLocalHandle$$Closure$136$$U__2$1x10$lang$PlaceLocalHandle$$Closure$136$$T$2) null))), ((x10.lang.Runtime.Profile)(null)));
                    }
                }
            }}catch (java.lang.Throwable __lowerer__var__2__) {
                
                //#line 111 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
                x10.lang.Runtime.pushException(((java.lang.Throwable)(__lowerer__var__2__)));
                
                //#line 111 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
                throw new java.lang.RuntimeException();
            }finally {{
                 
                 //#line 111 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
                 x10.lang.Runtime.stopFinish(((x10.lang.FinishState)(x10$__var10)));
             }}
            }
        
        //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
        return handle;
        }
    
    
    //#line 134 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
    final public static <$T, $U>x10.lang.PlaceLocalHandle make__1$1x10$lang$Place$3x10$lang$PlaceLocalHandle$$U$2__2$1x10$lang$PlaceLocalHandle$$U$3x10$lang$PlaceLocalHandle$$T$2__3$1x10$lang$Place$3x10$lang$Boolean$2(final x10.rtt.Type $T, final x10.rtt.Type $U, final x10.lang.PlaceGroup pg, final x10.core.fun.Fun_0_1<x10.lang.Place,$U> init_here, final x10.core.fun.Fun_0_1<$U,$T> init_there, final x10.core.fun.Fun_0_1<x10.lang.Place,x10.core.Boolean> ignoreIfDead) {
        
        //#line 136 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
        final x10.lang.Place t$75987 = ((x10.lang.Place)(x10.lang.Place.get$FIRST_PLACE()));
        
        //#line 136 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
        final x10.lang.PlaceLocalHandle handle = x10.lang.Runtime.<x10.lang.PlaceLocalHandle<$T>> evalAt__1$1x10$lang$Runtime$$T$2$G(x10.rtt.ParameterizedType.make(x10.lang.PlaceLocalHandle.$RTT, $T), ((x10.lang.Place)(t$75987)), ((x10.core.fun.Fun_0_0)(new x10.lang.PlaceLocalHandle.$Closure$137<$T, $U>($T, $U))), ((x10.lang.Runtime.Profile)(null)));
        {
            
            //#line 137 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
            x10.lang.Runtime.ensureNotInAtomic();
            
            //#line 137 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
            final x10.lang.FinishState x10$__var11 = x10.lang.Runtime.startFinish();
            
            //#line 137 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
            try {{
                {
                    
                    //#line 137 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
                    final x10.lang.Iterator p$76003 = pg.iterator();
                    
                    //#line 137 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
                    for (;
                         true;
                         ) {
                        
                        //#line 137 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
                        final boolean t$111002 = ((x10.lang.Iterator<x10.lang.Place>)p$76003).hasNext$O();
                        
                        //#line 137 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
                        if (!(t$111002)) {
                            
                            //#line 137 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
                            break;
                        }
                        
                        //#line 137 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
                        final x10.lang.Place p$111044 = ((x10.lang.Place)(((x10.lang.Iterator<x10.lang.Place>)p$76003).next$G()));
                        
                        //#line 138 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
                        final $U v$111045 = (($U)((($U)
                                                    ((x10.core.fun.Fun_0_1<x10.lang.Place,$U>)init_here).$apply(p$111044, x10.lang.Place.$RTT))));
                        
                        //#line 139 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
                        final boolean t$111046 = p$111044.isDead$O();
                        
                        //#line 139 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
                        boolean t$111047 = !(t$111046);
                        
                        //#line 139 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
                        if (!(t$111047)) {
                            
                            //#line 139 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
                            final boolean t$111048 = x10.core.Boolean.$unbox(((x10.core.fun.Fun_0_1<x10.lang.Place,x10.core.Boolean>)ignoreIfDead).$apply(p$111044, x10.lang.Place.$RTT));
                            
                            //#line 139 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
                            t$111047 = !(t$111048);
                        }
                        
                        //#line 139 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
                        final boolean t$111049 = t$111047;
                        
                        //#line 139 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
                        if (t$111049) {
                            
                            //#line 140 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
                            x10.lang.Runtime.runAsync(((x10.lang.Place)(p$111044)), ((x10.core.fun.VoidFun_0_0)(new x10.lang.PlaceLocalHandle.$Closure$138<$T, $U>($T, $U, init_there, v$111045, handle, (x10.lang.PlaceLocalHandle.$Closure$138.__0$1x10$lang$PlaceLocalHandle$$Closure$138$$U$3x10$lang$PlaceLocalHandle$$Closure$138$$T$2__1x10$lang$PlaceLocalHandle$$Closure$138$$U__2$1x10$lang$PlaceLocalHandle$$Closure$138$$T$2) null))), ((x10.lang.Runtime.Profile)(null)));
                        }
                    }
                }
            }}catch (java.lang.Throwable __lowerer__var__2__) {
                
                //#line 137 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
                x10.lang.Runtime.pushException(((java.lang.Throwable)(__lowerer__var__2__)));
                
                //#line 137 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
                throw new java.lang.RuntimeException();
            }finally {{
                 
                 //#line 137 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
                 x10.lang.Runtime.stopFinish(((x10.lang.FinishState)(x10$__var11)));
             }}
            }
        
        //#line 143 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
        return handle;
        }
    
    
    //#line 164 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
    final public static <$T>x10.lang.PlaceLocalHandle makeFlat__1$1x10$lang$PlaceLocalHandle$$T$2(final x10.rtt.Type $T, final x10.lang.PlaceGroup pg, final x10.core.fun.Fun_0_0<$T> init) {
        
        //#line 165 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
        final x10.lang.Place t$75989 = ((x10.lang.Place)(x10.lang.Place.get$FIRST_PLACE()));
        
        //#line 165 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
        final x10.lang.PlaceLocalHandle handle = x10.lang.Runtime.<x10.lang.PlaceLocalHandle<$T>> evalAt__1$1x10$lang$Runtime$$T$2$G(x10.rtt.ParameterizedType.make(x10.lang.PlaceLocalHandle.$RTT, $T), ((x10.lang.Place)(t$75989)), ((x10.core.fun.Fun_0_0)(new x10.lang.PlaceLocalHandle.$Closure$139<$T>($T))), ((x10.lang.Runtime.Profile)(null)));
        
        //#line 166 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
        final x10.core.fun.VoidFun_0_0 t$111004 = ((x10.core.fun.VoidFun_0_0)(new x10.lang.PlaceLocalHandle.$Closure$140<$T>($T, init, handle, (x10.lang.PlaceLocalHandle.$Closure$140.__0$1x10$lang$PlaceLocalHandle$$Closure$140$$T$2__1$1x10$lang$PlaceLocalHandle$$Closure$140$$T$2) null)));
        
        //#line 166 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
        pg.broadcastFlat(((x10.core.fun.VoidFun_0_0)(t$111004)));
        
        //#line 167 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
        return handle;
    }
    
    
    //#line 186 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
    final public static <$T>x10.lang.PlaceLocalHandle makeFlat__1$1x10$lang$PlaceLocalHandle$$T$2__2$1x10$lang$Place$3x10$lang$Boolean$2(final x10.rtt.Type $T, final x10.lang.PlaceGroup pg, final x10.core.fun.Fun_0_0<$T> init, final x10.core.fun.Fun_0_1<x10.lang.Place,x10.core.Boolean> ignoreIfDead) {
        
        //#line 188 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
        final x10.lang.Place t$75991 = ((x10.lang.Place)(x10.lang.Place.get$FIRST_PLACE()));
        
        //#line 188 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
        final x10.lang.PlaceLocalHandle handle = x10.lang.Runtime.<x10.lang.PlaceLocalHandle<$T>> evalAt__1$1x10$lang$Runtime$$T$2$G(x10.rtt.ParameterizedType.make(x10.lang.PlaceLocalHandle.$RTT, $T), ((x10.lang.Place)(t$75991)), ((x10.core.fun.Fun_0_0)(new x10.lang.PlaceLocalHandle.$Closure$141<$T>($T))), ((x10.lang.Runtime.Profile)(null)));
        
        //#line 189 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
        final x10.core.fun.VoidFun_0_0 t$111006 = ((x10.core.fun.VoidFun_0_0)(new x10.lang.PlaceLocalHandle.$Closure$142<$T>($T, init, handle, (x10.lang.PlaceLocalHandle.$Closure$142.__0$1x10$lang$PlaceLocalHandle$$Closure$142$$T$2__1$1x10$lang$PlaceLocalHandle$$Closure$142$$T$2) null)));
        
        //#line 189 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
        pg.broadcastFlat__1$1x10$lang$Place$3x10$lang$Boolean$2(((x10.core.fun.VoidFun_0_0)(t$111006)), ((x10.core.fun.Fun_0_1)(ignoreIfDead)));
        
        //#line 190 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
        return handle;
    }
    
    
    //#line 210 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
    final public static <$T, $U>x10.lang.PlaceLocalHandle makeFlat__1$1x10$lang$Place$3x10$lang$PlaceLocalHandle$$U$2__2$1x10$lang$PlaceLocalHandle$$U$3x10$lang$PlaceLocalHandle$$T$2(final x10.rtt.Type $T, final x10.rtt.Type $U, final x10.lang.PlaceGroup pg, final x10.core.fun.Fun_0_1<x10.lang.Place,$U> init_here, final x10.core.fun.Fun_0_1<$U,$T> init_there) {
        
        //#line 211 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
        final x10.lang.Place t$75993 = ((x10.lang.Place)(x10.lang.Place.get$FIRST_PLACE()));
        
        //#line 211 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
        final x10.lang.PlaceLocalHandle handle = x10.lang.Runtime.<x10.lang.PlaceLocalHandle<$T>> evalAt__1$1x10$lang$Runtime$$T$2$G(x10.rtt.ParameterizedType.make(x10.lang.PlaceLocalHandle.$RTT, $T), ((x10.lang.Place)(t$75993)), ((x10.core.fun.Fun_0_0)(new x10.lang.PlaceLocalHandle.$Closure$143<$T, $U>($T, $U))), ((x10.lang.Runtime.Profile)(null)));
        {
            
            //#line 212 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
            x10.lang.Runtime.ensureNotInAtomic();
            
            //#line 212 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
            final x10.lang.FinishState x10$__var12 = x10.lang.Runtime.startFinish((int)(x10.compiler.Pragma.FINISH_SPMD));
            
            //#line 212 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
            try {{
                {
                    
                    //#line 212 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
                    final x10.lang.Iterator p$76005 = pg.iterator();
                    
                    //#line 212 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
                    for (;
                         true;
                         ) {
                        
                        //#line 212 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
                        final boolean t$111009 = ((x10.lang.Iterator<x10.lang.Place>)p$76005).hasNext$O();
                        
                        //#line 212 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
                        if (!(t$111009)) {
                            
                            //#line 212 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
                            break;
                        }
                        
                        //#line 212 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
                        final x10.lang.Place p$111051 = ((x10.lang.Place)(((x10.lang.Iterator<x10.lang.Place>)p$76005).next$G()));
                        
                        //#line 213 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
                        final $U v$111052 = (($U)((($U)
                                                    ((x10.core.fun.Fun_0_1<x10.lang.Place,$U>)init_here).$apply(p$111051, x10.lang.Place.$RTT))));
                        
                        //#line 214 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
                        x10.lang.Runtime.runAsync(((x10.lang.Place)(p$111051)), ((x10.core.fun.VoidFun_0_0)(new x10.lang.PlaceLocalHandle.$Closure$144<$T, $U>($T, $U, init_there, v$111052, handle, (x10.lang.PlaceLocalHandle.$Closure$144.__0$1x10$lang$PlaceLocalHandle$$Closure$144$$U$3x10$lang$PlaceLocalHandle$$Closure$144$$T$2__1x10$lang$PlaceLocalHandle$$Closure$144$$U__2$1x10$lang$PlaceLocalHandle$$Closure$144$$T$2) null))), ((x10.lang.Runtime.Profile)(null)));
                    }
                }
            }}catch (java.lang.Throwable __lowerer__var__2__) {
                
                //#line 212 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
                x10.lang.Runtime.pushException(((java.lang.Throwable)(__lowerer__var__2__)));
                
                //#line 212 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
                throw new java.lang.RuntimeException();
            }finally {{
                 
                 //#line 212 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
                 x10.lang.Runtime.stopFinish(((x10.lang.FinishState)(x10$__var12)));
             }}
            }
        
        //#line 216 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
        return handle;
        }
    
    
    //#line 238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
    final public static <$T, $U>x10.lang.PlaceLocalHandle makeFlat__1$1x10$lang$Place$3x10$lang$PlaceLocalHandle$$U$2__2$1x10$lang$PlaceLocalHandle$$U$3x10$lang$PlaceLocalHandle$$T$2__3$1x10$lang$Place$3x10$lang$Boolean$2(final x10.rtt.Type $T, final x10.rtt.Type $U, final x10.lang.PlaceGroup pg, final x10.core.fun.Fun_0_1<x10.lang.Place,$U> init_here, final x10.core.fun.Fun_0_1<$U,$T> init_there, final x10.core.fun.Fun_0_1<x10.lang.Place,x10.core.Boolean> ignoreIfDead) {
        
        //#line 240 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
        final x10.lang.Place t$75995 = ((x10.lang.Place)(x10.lang.Place.get$FIRST_PLACE()));
        
        //#line 240 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
        final x10.lang.PlaceLocalHandle handle = x10.lang.Runtime.<x10.lang.PlaceLocalHandle<$T>> evalAt__1$1x10$lang$Runtime$$T$2$G(x10.rtt.ParameterizedType.make(x10.lang.PlaceLocalHandle.$RTT, $T), ((x10.lang.Place)(t$75995)), ((x10.core.fun.Fun_0_0)(new x10.lang.PlaceLocalHandle.$Closure$145<$T, $U>($T, $U))), ((x10.lang.Runtime.Profile)(null)));
        {
            
            //#line 241 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
            x10.lang.Runtime.ensureNotInAtomic();
            
            //#line 241 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
            final x10.lang.FinishState x10$__var13 = x10.lang.Runtime.startFinish((int)(x10.compiler.Pragma.FINISH_SPMD));
            
            //#line 241 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
            try {{
                {
                    
                    //#line 241 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
                    final x10.lang.Iterator p$76007 = pg.iterator();
                    
                    //#line 241 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
                    for (;
                         true;
                         ) {
                        
                        //#line 241 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
                        final boolean t$111016 = ((x10.lang.Iterator<x10.lang.Place>)p$76007).hasNext$O();
                        
                        //#line 241 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
                        if (!(t$111016)) {
                            
                            //#line 241 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
                            break;
                        }
                        
                        //#line 241 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
                        final x10.lang.Place p$111054 = ((x10.lang.Place)(((x10.lang.Iterator<x10.lang.Place>)p$76007).next$G()));
                        
                        //#line 242 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
                        final $U v$111055 = (($U)((($U)
                                                    ((x10.core.fun.Fun_0_1<x10.lang.Place,$U>)init_here).$apply(p$111054, x10.lang.Place.$RTT))));
                        
                        //#line 243 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
                        final boolean t$111056 = p$111054.isDead$O();
                        
                        //#line 243 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
                        boolean t$111057 = !(t$111056);
                        
                        //#line 243 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
                        if (!(t$111057)) {
                            
                            //#line 243 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
                            final boolean t$111058 = x10.core.Boolean.$unbox(((x10.core.fun.Fun_0_1<x10.lang.Place,x10.core.Boolean>)ignoreIfDead).$apply(p$111054, x10.lang.Place.$RTT));
                            
                            //#line 243 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
                            t$111057 = !(t$111058);
                        }
                        
                        //#line 243 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
                        final boolean t$111059 = t$111057;
                        
                        //#line 243 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
                        if (t$111059) {
                            
                            //#line 244 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
                            x10.lang.Runtime.runAsync(((x10.lang.Place)(p$111054)), ((x10.core.fun.VoidFun_0_0)(new x10.lang.PlaceLocalHandle.$Closure$146<$T, $U>($T, $U, init_there, v$111055, handle, (x10.lang.PlaceLocalHandle.$Closure$146.__0$1x10$lang$PlaceLocalHandle$$Closure$146$$U$3x10$lang$PlaceLocalHandle$$Closure$146$$T$2__1x10$lang$PlaceLocalHandle$$Closure$146$$U__2$1x10$lang$PlaceLocalHandle$$Closure$146$$T$2) null))), ((x10.lang.Runtime.Profile)(null)));
                        }
                    }
                }
            }}catch (java.lang.Throwable __lowerer__var__2__) {
                
                //#line 241 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
                x10.lang.Runtime.pushException(((java.lang.Throwable)(__lowerer__var__2__)));
                
                //#line 241 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
                throw new java.lang.RuntimeException();
            }finally {{
                 
                 //#line 241 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
                 x10.lang.Runtime.stopFinish(((x10.lang.FinishState)(x10$__var13)));
             }}
            }
        
        //#line 247 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
        return handle;
        }
    
    
    //#line 256 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
    final public static <$T>void destroy__1$1x10$lang$PlaceLocalHandle$$T$2(final x10.rtt.Type $T, final x10.lang.PlaceGroup pg, final x10.lang.PlaceLocalHandle<$T> plh) {
        
        //#line 257 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
        final x10.core.fun.VoidFun_0_0 t$111017 = ((x10.core.fun.VoidFun_0_0)(new x10.lang.PlaceLocalHandle.$Closure$147<$T>($T, plh, (x10.lang.PlaceLocalHandle.$Closure$147.__0$1x10$lang$PlaceLocalHandle$$Closure$147$$T$2) null)));
        
        //#line 257 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
        pg.broadcastFlat(((x10.core.fun.VoidFun_0_0)(t$111017)));
    }
    
    
    //#line 265 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
    final public static <$T>void destroy__1$1x10$lang$PlaceLocalHandle$$T$2__2$1x10$lang$Place$3x10$lang$Boolean$2(final x10.rtt.Type $T, final x10.lang.PlaceGroup pg, final x10.lang.PlaceLocalHandle<$T> plh, final x10.core.fun.Fun_0_1<x10.lang.Place,x10.core.Boolean> ignoreIfDead) {
        
        //#line 267 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
        final x10.core.fun.VoidFun_0_0 t$111018 = ((x10.core.fun.VoidFun_0_0)(new x10.lang.PlaceLocalHandle.$Closure$148<$T>($T, plh, (x10.lang.PlaceLocalHandle.$Closure$148.__0$1x10$lang$PlaceLocalHandle$$Closure$148$$T$2) null)));
        
        //#line 267 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
        pg.broadcastFlat__1$1x10$lang$Place$3x10$lang$Boolean$2(((x10.core.fun.VoidFun_0_0)(t$111018)), ((x10.core.fun.Fun_0_1)(ignoreIfDead)));
    }
    
    
    //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
    final public java.lang.String typeName() {
        try {
            return x10.rtt.Types.typeName(this);
        }
        catch (java.lang.Throwable exc$146406) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$146406);
        }
        
    }
    
    
    
    //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
    final public boolean equals(java.lang.Object other) {
        
        //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
        final java.lang.Object t$111021 = ((java.lang.Object)(other));
        
        //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
        final boolean t$111022 = x10.lang.PlaceLocalHandle.$RTT.isInstance(t$111021, $T);
        
        //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
        final boolean t$111023 = !(t$111022);
        
        //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
        if (t$111023) {
            
            //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
            return false;
        }
        
        //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
        final java.lang.Object t$111024 = ((java.lang.Object)(other));
        
        //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
        final x10.lang.PlaceLocalHandle t$111025 = ((x10.lang.PlaceLocalHandle)x10.rtt.Types.asStruct(x10.rtt.ParameterizedType.make(x10.lang.PlaceLocalHandle.$RTT, $T),t$111024));
        
        //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
        final boolean t$111026 = this.equals__0$1x10$lang$PlaceLocalHandle$$T$2$O(((x10.lang.PlaceLocalHandle)(t$111025)));
        
        //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
        return t$111026;
    }
    
    
    //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
    final public boolean equals__0$1x10$lang$PlaceLocalHandle$$T$2$O(x10.lang.PlaceLocalHandle other) {
        
        //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
        return true;
    }
    
    
    //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
    final public boolean _struct_equals$O(java.lang.Object other) {
        
        //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
        final java.lang.Object t$111027 = ((java.lang.Object)(other));
        
        //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
        final boolean t$111028 = x10.lang.PlaceLocalHandle.$RTT.isInstance(t$111027, $T);
        
        //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
        final boolean t$111029 = !(t$111028);
        
        //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
        if (t$111029) {
            
            //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
            return false;
        }
        
        //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
        final java.lang.Object t$111030 = ((java.lang.Object)(other));
        
        //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
        final x10.lang.PlaceLocalHandle t$111031 = ((x10.lang.PlaceLocalHandle)x10.rtt.Types.asStruct(x10.rtt.ParameterizedType.make(x10.lang.PlaceLocalHandle.$RTT, $T),t$111030));
        
        //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
        final boolean t$111032 = this._struct_equals__0$1x10$lang$PlaceLocalHandle$$T$2$O(((x10.lang.PlaceLocalHandle)(t$111031)));
        
        //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
        return t$111032;
    }
    
    
    //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
    final public boolean _struct_equals__0$1x10$lang$PlaceLocalHandle$$T$2$O(x10.lang.PlaceLocalHandle other) {
        
        //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
        return true;
    }
    
    
    //#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
    final public x10.lang.PlaceLocalHandle x10$lang$PlaceLocalHandle$$this$x10$lang$PlaceLocalHandle() {
        
        //#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
        return x10.lang.PlaceLocalHandle.this;
    }
    
    
    //#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
    final public void __fieldInitializers_x10_lang_PlaceLocalHandle() {
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$131<$T> extends x10.core.Ref implements x10.core.fun.Fun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$131> $RTT = 
            x10.rtt.StaticFunType.<$Closure$131> make($Closure$131.class,
                                                      1,
                                                      new x10.rtt.Type[] {
                                                          x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_0.$RTT, x10.rtt.ParameterizedType.make(x10.lang.PlaceLocalHandle.$RTT, x10.rtt.UnresolvedType.PARAM(0)))
                                                      });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $T; return null; }
        
        public static <$T> x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.PlaceLocalHandle.$Closure$131<$T> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.$T = (x10.rtt.Type) $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.lang.PlaceLocalHandle.$Closure$131 $_obj = new x10.lang.PlaceLocalHandle.$Closure$131((java.lang.System[]) null, (x10.rtt.Type) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.$T);
            
        }
        
        // constructor just for allocation
        public $Closure$131(final java.lang.System[] $dummy, final x10.rtt.Type $T) {
            x10.lang.PlaceLocalHandle.$Closure$131.$initParams(this, $T);
            
        }
        
        // bridge for method abstract public ()=>U.operator()():U
        public x10.lang.PlaceLocalHandle $apply$G() {
            return $apply();
        }
        
        private x10.rtt.Type $T;
        
        // initializer of type parameters
        public static void $initParams(final $Closure$131 $this, final x10.rtt.Type $T) {
            $this.$T = $T;
            
        }
        
    
        
        public x10.lang.PlaceLocalHandle $apply() {
            
            //#line 64 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
            try {{
                
                //#line 64 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
                final x10.lang.PlaceLocalHandle t$75980 = new x10.lang.PlaceLocalHandle<$T>($T);
                
                //#line 64 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
                return t$75980;
            }}catch (java.lang.Throwable __lowerer__var__0__) {
                
                //#line 64 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
                x10.lang.PlaceLocalHandle __lowerer__var__1__ = ((x10.lang.PlaceLocalHandle)(x10.lang.Runtime.<x10.lang.PlaceLocalHandle<$T>> wrapAtChecked$G(x10.rtt.ParameterizedType.make(x10.lang.PlaceLocalHandle.$RTT, $T), ((java.lang.Throwable)(__lowerer__var__0__)))));
                
                //#line 64 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
                return __lowerer__var__1__;
            }
        }
        
        public $Closure$131(final x10.rtt.Type $T) {
            x10.lang.PlaceLocalHandle.$Closure$131.$initParams(this, $T);
             {
                
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$132<$T> extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$132> $RTT = 
            x10.rtt.StaticVoidFunType.<$Closure$132> make($Closure$132.class,
                                                          1,
                                                          new x10.rtt.Type[] {
                                                              x10.core.fun.VoidFun_0_0.$RTT
                                                          });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $T; return null; }
        
        public static <$T> x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.PlaceLocalHandle.$Closure$132<$T> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.$T = (x10.rtt.Type) $deserializer.readObject();
            $_obj.init = $deserializer.readObject();
            $_obj.handle = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.lang.PlaceLocalHandle.$Closure$132 $_obj = new x10.lang.PlaceLocalHandle.$Closure$132((java.lang.System[]) null, (x10.rtt.Type) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.$T);
            $serializer.write(this.init);
            $serializer.write(this.handle);
            
        }
        
        // constructor just for allocation
        public $Closure$132(final java.lang.System[] $dummy, final x10.rtt.Type $T) {
            x10.lang.PlaceLocalHandle.$Closure$132.$initParams(this, $T);
            
        }
        
        private x10.rtt.Type $T;
        
        // initializer of type parameters
        public static void $initParams(final $Closure$132 $this, final x10.rtt.Type $T) {
            $this.$T = $T;
            
        }
        // synthetic type for parameter mangling
        public static final class __0$1x10$lang$PlaceLocalHandle$$Closure$132$$T$2__1$1x10$lang$PlaceLocalHandle$$Closure$132$$T$2 {}
        
    
        
        public void $apply() {
            
            //#line 66 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
            try {{
                
                //#line 66 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
                final $T t$111034 = (($T)(((x10.core.fun.Fun_0_0<$T>)this.init).$apply$G()));
                
                //#line 66 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
                ((x10.lang.PlaceLocalHandle<$T>)this.handle).set__0x10$lang$PlaceLocalHandle$$T((($T)(t$111034)));
            }}catch (java.lang.Error __lowerer__var__2__) {
                
                //#line 66 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
                throw __lowerer__var__2__;
            }catch (java.lang.Throwable __lowerer__var__3__) {
                
                //#line 66 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
                throw x10.rtt.Types.EXCEPTION.isInstance(__lowerer__var__3__) ? (java.lang.RuntimeException)(__lowerer__var__3__) : new x10.lang.WrappedThrowable(__lowerer__var__3__);
            }
        }
        
        public x10.core.fun.Fun_0_0<$T> init;
        public x10.lang.PlaceLocalHandle<$T> handle;
        
        public $Closure$132(final x10.rtt.Type $T, final x10.core.fun.Fun_0_0<$T> init, final x10.lang.PlaceLocalHandle<$T> handle, __0$1x10$lang$PlaceLocalHandle$$Closure$132$$T$2__1$1x10$lang$PlaceLocalHandle$$Closure$132$$T$2 $dummy) {
            x10.lang.PlaceLocalHandle.$Closure$132.$initParams(this, $T);
             {
                ((x10.lang.PlaceLocalHandle.$Closure$132<$T>)this).init = ((x10.core.fun.Fun_0_0)(init));
                ((x10.lang.PlaceLocalHandle.$Closure$132<$T>)this).handle = ((x10.lang.PlaceLocalHandle)(handle));
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$133<$T> extends x10.core.Ref implements x10.core.fun.Fun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$133> $RTT = 
            x10.rtt.StaticFunType.<$Closure$133> make($Closure$133.class,
                                                      1,
                                                      new x10.rtt.Type[] {
                                                          x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_0.$RTT, x10.rtt.ParameterizedType.make(x10.lang.PlaceLocalHandle.$RTT, x10.rtt.UnresolvedType.PARAM(0)))
                                                      });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $T; return null; }
        
        public static <$T> x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.PlaceLocalHandle.$Closure$133<$T> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.$T = (x10.rtt.Type) $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.lang.PlaceLocalHandle.$Closure$133 $_obj = new x10.lang.PlaceLocalHandle.$Closure$133((java.lang.System[]) null, (x10.rtt.Type) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.$T);
            
        }
        
        // constructor just for allocation
        public $Closure$133(final java.lang.System[] $dummy, final x10.rtt.Type $T) {
            x10.lang.PlaceLocalHandle.$Closure$133.$initParams(this, $T);
            
        }
        
        // bridge for method abstract public ()=>U.operator()():U
        public x10.lang.PlaceLocalHandle $apply$G() {
            return $apply();
        }
        
        private x10.rtt.Type $T;
        
        // initializer of type parameters
        public static void $initParams(final $Closure$133 $this, final x10.rtt.Type $T) {
            $this.$T = $T;
            
        }
        
    
        
        public x10.lang.PlaceLocalHandle $apply() {
            
            //#line 86 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
            try {{
                
                //#line 86 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
                final x10.lang.PlaceLocalHandle t$75982 = new x10.lang.PlaceLocalHandle<$T>($T);
                
                //#line 86 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
                return t$75982;
            }}catch (java.lang.Throwable __lowerer__var__0__) {
                
                //#line 86 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
                x10.lang.PlaceLocalHandle __lowerer__var__1__ = ((x10.lang.PlaceLocalHandle)(x10.lang.Runtime.<x10.lang.PlaceLocalHandle<$T>> wrapAtChecked$G(x10.rtt.ParameterizedType.make(x10.lang.PlaceLocalHandle.$RTT, $T), ((java.lang.Throwable)(__lowerer__var__0__)))));
                
                //#line 86 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
                return __lowerer__var__1__;
            }
        }
        
        public $Closure$133(final x10.rtt.Type $T) {
            x10.lang.PlaceLocalHandle.$Closure$133.$initParams(this, $T);
             {
                
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$134<$T> extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$134> $RTT = 
            x10.rtt.StaticVoidFunType.<$Closure$134> make($Closure$134.class,
                                                          1,
                                                          new x10.rtt.Type[] {
                                                              x10.core.fun.VoidFun_0_0.$RTT
                                                          });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $T; return null; }
        
        public static <$T> x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.PlaceLocalHandle.$Closure$134<$T> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.$T = (x10.rtt.Type) $deserializer.readObject();
            $_obj.init = $deserializer.readObject();
            $_obj.handle = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.lang.PlaceLocalHandle.$Closure$134 $_obj = new x10.lang.PlaceLocalHandle.$Closure$134((java.lang.System[]) null, (x10.rtt.Type) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.$T);
            $serializer.write(this.init);
            $serializer.write(this.handle);
            
        }
        
        // constructor just for allocation
        public $Closure$134(final java.lang.System[] $dummy, final x10.rtt.Type $T) {
            x10.lang.PlaceLocalHandle.$Closure$134.$initParams(this, $T);
            
        }
        
        private x10.rtt.Type $T;
        
        // initializer of type parameters
        public static void $initParams(final $Closure$134 $this, final x10.rtt.Type $T) {
            $this.$T = $T;
            
        }
        // synthetic type for parameter mangling
        public static final class __0$1x10$lang$PlaceLocalHandle$$Closure$134$$T$2__1$1x10$lang$PlaceLocalHandle$$Closure$134$$T$2 {}
        
    
        
        public void $apply() {
            
            //#line 89 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
            try {{
                
                //#line 89 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
                final $T t$111040 = (($T)(((x10.core.fun.Fun_0_0<$T>)this.init).$apply$G()));
                
                //#line 89 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
                ((x10.lang.PlaceLocalHandle<$T>)this.handle).set__0x10$lang$PlaceLocalHandle$$T((($T)(t$111040)));
            }}catch (java.lang.Error __lowerer__var__2__) {
                
                //#line 89 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
                throw __lowerer__var__2__;
            }catch (java.lang.Throwable __lowerer__var__3__) {
                
                //#line 89 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
                throw x10.rtt.Types.EXCEPTION.isInstance(__lowerer__var__3__) ? (java.lang.RuntimeException)(__lowerer__var__3__) : new x10.lang.WrappedThrowable(__lowerer__var__3__);
            }
        }
        
        public x10.core.fun.Fun_0_0<$T> init;
        public x10.lang.PlaceLocalHandle<$T> handle;
        
        public $Closure$134(final x10.rtt.Type $T, final x10.core.fun.Fun_0_0<$T> init, final x10.lang.PlaceLocalHandle<$T> handle, __0$1x10$lang$PlaceLocalHandle$$Closure$134$$T$2__1$1x10$lang$PlaceLocalHandle$$Closure$134$$T$2 $dummy) {
            x10.lang.PlaceLocalHandle.$Closure$134.$initParams(this, $T);
             {
                ((x10.lang.PlaceLocalHandle.$Closure$134<$T>)this).init = ((x10.core.fun.Fun_0_0)(init));
                ((x10.lang.PlaceLocalHandle.$Closure$134<$T>)this).handle = ((x10.lang.PlaceLocalHandle)(handle));
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$135<$T, $U> extends x10.core.Ref implements x10.core.fun.Fun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$135> $RTT = 
            x10.rtt.StaticFunType.<$Closure$135> make($Closure$135.class,
                                                      2,
                                                      new x10.rtt.Type[] {
                                                          x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_0.$RTT, x10.rtt.ParameterizedType.make(x10.lang.PlaceLocalHandle.$RTT, x10.rtt.UnresolvedType.PARAM(0)))
                                                      });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $T; if (i == 1) return $U; return null; }
        
        public static <$T, $U> x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.PlaceLocalHandle.$Closure$135<$T, $U> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.$T = (x10.rtt.Type) $deserializer.readObject();
            $_obj.$U = (x10.rtt.Type) $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.lang.PlaceLocalHandle.$Closure$135 $_obj = new x10.lang.PlaceLocalHandle.$Closure$135((java.lang.System[]) null, (x10.rtt.Type) null, (x10.rtt.Type) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.$T);
            $serializer.write(this.$U);
            
        }
        
        // constructor just for allocation
        public $Closure$135(final java.lang.System[] $dummy, final x10.rtt.Type $T, final x10.rtt.Type $U) {
            x10.lang.PlaceLocalHandle.$Closure$135.$initParams(this, $T, $U);
            
        }
        
        // bridge for method abstract public ()=>U.operator()():U
        public x10.lang.PlaceLocalHandle $apply$G() {
            return $apply();
        }
        
        private x10.rtt.Type $T;
        private x10.rtt.Type $U;
        
        // initializer of type parameters
        public static void $initParams(final $Closure$135 $this, final x10.rtt.Type $T, final x10.rtt.Type $U) {
            $this.$T = $T;
            $this.$U = $U;
            
        }
        
    
        
        public x10.lang.PlaceLocalHandle $apply() {
            
            //#line 110 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
            try {{
                
                //#line 110 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
                final x10.lang.PlaceLocalHandle t$75984 = new x10.lang.PlaceLocalHandle<$T>($T);
                
                //#line 110 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
                return t$75984;
            }}catch (java.lang.Throwable __lowerer__var__0__) {
                
                //#line 110 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
                x10.lang.PlaceLocalHandle __lowerer__var__1__ = ((x10.lang.PlaceLocalHandle)(x10.lang.Runtime.<x10.lang.PlaceLocalHandle<$T>> wrapAtChecked$G(x10.rtt.ParameterizedType.make(x10.lang.PlaceLocalHandle.$RTT, $T), ((java.lang.Throwable)(__lowerer__var__0__)))));
                
                //#line 110 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
                return __lowerer__var__1__;
            }
        }
        
        public $Closure$135(final x10.rtt.Type $T, final x10.rtt.Type $U) {
            x10.lang.PlaceLocalHandle.$Closure$135.$initParams(this, $T, $U);
             {
                
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$136<$T, $U> extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$136> $RTT = 
            x10.rtt.StaticVoidFunType.<$Closure$136> make($Closure$136.class,
                                                          2,
                                                          new x10.rtt.Type[] {
                                                              x10.core.fun.VoidFun_0_0.$RTT
                                                          });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $T; if (i == 1) return $U; return null; }
        
        public static <$T, $U> x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.PlaceLocalHandle.$Closure$136<$T, $U> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.$T = (x10.rtt.Type) $deserializer.readObject();
            $_obj.$U = (x10.rtt.Type) $deserializer.readObject();
            $_obj.init_there = $deserializer.readObject();
            $_obj.v$111042 = $deserializer.readObject();
            $_obj.handle = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.lang.PlaceLocalHandle.$Closure$136 $_obj = new x10.lang.PlaceLocalHandle.$Closure$136((java.lang.System[]) null, (x10.rtt.Type) null, (x10.rtt.Type) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.$T);
            $serializer.write(this.$U);
            $serializer.write(this.init_there);
            $serializer.write(this.v$111042);
            $serializer.write(this.handle);
            
        }
        
        // constructor just for allocation
        public $Closure$136(final java.lang.System[] $dummy, final x10.rtt.Type $T, final x10.rtt.Type $U) {
            x10.lang.PlaceLocalHandle.$Closure$136.$initParams(this, $T, $U);
            
        }
        
        private x10.rtt.Type $T;
        private x10.rtt.Type $U;
        
        // initializer of type parameters
        public static void $initParams(final $Closure$136 $this, final x10.rtt.Type $T, final x10.rtt.Type $U) {
            $this.$T = $T;
            $this.$U = $U;
            
        }
        // synthetic type for parameter mangling
        public static final class __0$1x10$lang$PlaceLocalHandle$$Closure$136$$U$3x10$lang$PlaceLocalHandle$$Closure$136$$T$2__1x10$lang$PlaceLocalHandle$$Closure$136$$U__2$1x10$lang$PlaceLocalHandle$$Closure$136$$T$2 {}
        
    
        
        public void $apply() {
            
            //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
            try {{
                
                //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
                final $T t$111043 = (($T)((($T)
                                            ((x10.core.fun.Fun_0_1<$U,$T>)this.init_there).$apply(this.v$111042, $U))));
                
                //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
                ((x10.lang.PlaceLocalHandle<$T>)this.handle).set__0x10$lang$PlaceLocalHandle$$T((($T)(t$111043)));
            }}catch (java.lang.Error __lowerer__var__2__) {
                
                //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
                throw __lowerer__var__2__;
            }catch (java.lang.Throwable __lowerer__var__3__) {
                
                //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
                throw x10.rtt.Types.EXCEPTION.isInstance(__lowerer__var__3__) ? (java.lang.RuntimeException)(__lowerer__var__3__) : new x10.lang.WrappedThrowable(__lowerer__var__3__);
            }
        }
        
        public x10.core.fun.Fun_0_1<$U,$T> init_there;
        public $U v$111042;
        public x10.lang.PlaceLocalHandle<$T> handle;
        
        public $Closure$136(final x10.rtt.Type $T, final x10.rtt.Type $U, final x10.core.fun.Fun_0_1<$U,$T> init_there, final $U v$111042, final x10.lang.PlaceLocalHandle<$T> handle, __0$1x10$lang$PlaceLocalHandle$$Closure$136$$U$3x10$lang$PlaceLocalHandle$$Closure$136$$T$2__1x10$lang$PlaceLocalHandle$$Closure$136$$U__2$1x10$lang$PlaceLocalHandle$$Closure$136$$T$2 $dummy) {
            x10.lang.PlaceLocalHandle.$Closure$136.$initParams(this, $T, $U);
             {
                ((x10.lang.PlaceLocalHandle.$Closure$136<$T, $U>)this).init_there = ((x10.core.fun.Fun_0_1)(init_there));
                ((x10.lang.PlaceLocalHandle.$Closure$136<$T, $U>)this).v$111042 = (($U)(v$111042));
                ((x10.lang.PlaceLocalHandle.$Closure$136<$T, $U>)this).handle = ((x10.lang.PlaceLocalHandle)(handle));
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$137<$T, $U> extends x10.core.Ref implements x10.core.fun.Fun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$137> $RTT = 
            x10.rtt.StaticFunType.<$Closure$137> make($Closure$137.class,
                                                      2,
                                                      new x10.rtt.Type[] {
                                                          x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_0.$RTT, x10.rtt.ParameterizedType.make(x10.lang.PlaceLocalHandle.$RTT, x10.rtt.UnresolvedType.PARAM(0)))
                                                      });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $T; if (i == 1) return $U; return null; }
        
        public static <$T, $U> x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.PlaceLocalHandle.$Closure$137<$T, $U> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.$T = (x10.rtt.Type) $deserializer.readObject();
            $_obj.$U = (x10.rtt.Type) $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.lang.PlaceLocalHandle.$Closure$137 $_obj = new x10.lang.PlaceLocalHandle.$Closure$137((java.lang.System[]) null, (x10.rtt.Type) null, (x10.rtt.Type) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.$T);
            $serializer.write(this.$U);
            
        }
        
        // constructor just for allocation
        public $Closure$137(final java.lang.System[] $dummy, final x10.rtt.Type $T, final x10.rtt.Type $U) {
            x10.lang.PlaceLocalHandle.$Closure$137.$initParams(this, $T, $U);
            
        }
        
        // bridge for method abstract public ()=>U.operator()():U
        public x10.lang.PlaceLocalHandle $apply$G() {
            return $apply();
        }
        
        private x10.rtt.Type $T;
        private x10.rtt.Type $U;
        
        // initializer of type parameters
        public static void $initParams(final $Closure$137 $this, final x10.rtt.Type $T, final x10.rtt.Type $U) {
            $this.$T = $T;
            $this.$U = $U;
            
        }
        
    
        
        public x10.lang.PlaceLocalHandle $apply() {
            
            //#line 136 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
            try {{
                
                //#line 136 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
                final x10.lang.PlaceLocalHandle t$75986 = new x10.lang.PlaceLocalHandle<$T>($T);
                
                //#line 136 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
                return t$75986;
            }}catch (java.lang.Throwable __lowerer__var__0__) {
                
                //#line 136 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
                x10.lang.PlaceLocalHandle __lowerer__var__1__ = ((x10.lang.PlaceLocalHandle)(x10.lang.Runtime.<x10.lang.PlaceLocalHandle<$T>> wrapAtChecked$G(x10.rtt.ParameterizedType.make(x10.lang.PlaceLocalHandle.$RTT, $T), ((java.lang.Throwable)(__lowerer__var__0__)))));
                
                //#line 136 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
                return __lowerer__var__1__;
            }
        }
        
        public $Closure$137(final x10.rtt.Type $T, final x10.rtt.Type $U) {
            x10.lang.PlaceLocalHandle.$Closure$137.$initParams(this, $T, $U);
             {
                
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$138<$T, $U> extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$138> $RTT = 
            x10.rtt.StaticVoidFunType.<$Closure$138> make($Closure$138.class,
                                                          2,
                                                          new x10.rtt.Type[] {
                                                              x10.core.fun.VoidFun_0_0.$RTT
                                                          });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $T; if (i == 1) return $U; return null; }
        
        public static <$T, $U> x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.PlaceLocalHandle.$Closure$138<$T, $U> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.$T = (x10.rtt.Type) $deserializer.readObject();
            $_obj.$U = (x10.rtt.Type) $deserializer.readObject();
            $_obj.init_there = $deserializer.readObject();
            $_obj.v$111045 = $deserializer.readObject();
            $_obj.handle = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.lang.PlaceLocalHandle.$Closure$138 $_obj = new x10.lang.PlaceLocalHandle.$Closure$138((java.lang.System[]) null, (x10.rtt.Type) null, (x10.rtt.Type) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.$T);
            $serializer.write(this.$U);
            $serializer.write(this.init_there);
            $serializer.write(this.v$111045);
            $serializer.write(this.handle);
            
        }
        
        // constructor just for allocation
        public $Closure$138(final java.lang.System[] $dummy, final x10.rtt.Type $T, final x10.rtt.Type $U) {
            x10.lang.PlaceLocalHandle.$Closure$138.$initParams(this, $T, $U);
            
        }
        
        private x10.rtt.Type $T;
        private x10.rtt.Type $U;
        
        // initializer of type parameters
        public static void $initParams(final $Closure$138 $this, final x10.rtt.Type $T, final x10.rtt.Type $U) {
            $this.$T = $T;
            $this.$U = $U;
            
        }
        // synthetic type for parameter mangling
        public static final class __0$1x10$lang$PlaceLocalHandle$$Closure$138$$U$3x10$lang$PlaceLocalHandle$$Closure$138$$T$2__1x10$lang$PlaceLocalHandle$$Closure$138$$U__2$1x10$lang$PlaceLocalHandle$$Closure$138$$T$2 {}
        
    
        
        public void $apply() {
            
            //#line 140 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
            try {{
                
                //#line 140 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
                final $T t$111050 = (($T)((($T)
                                            ((x10.core.fun.Fun_0_1<$U,$T>)this.init_there).$apply(this.v$111045, $U))));
                
                //#line 140 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
                ((x10.lang.PlaceLocalHandle<$T>)this.handle).set__0x10$lang$PlaceLocalHandle$$T((($T)(t$111050)));
            }}catch (java.lang.Error __lowerer__var__2__) {
                
                //#line 140 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
                throw __lowerer__var__2__;
            }catch (java.lang.Throwable __lowerer__var__3__) {
                
                //#line 140 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
                throw x10.rtt.Types.EXCEPTION.isInstance(__lowerer__var__3__) ? (java.lang.RuntimeException)(__lowerer__var__3__) : new x10.lang.WrappedThrowable(__lowerer__var__3__);
            }
        }
        
        public x10.core.fun.Fun_0_1<$U,$T> init_there;
        public $U v$111045;
        public x10.lang.PlaceLocalHandle<$T> handle;
        
        public $Closure$138(final x10.rtt.Type $T, final x10.rtt.Type $U, final x10.core.fun.Fun_0_1<$U,$T> init_there, final $U v$111045, final x10.lang.PlaceLocalHandle<$T> handle, __0$1x10$lang$PlaceLocalHandle$$Closure$138$$U$3x10$lang$PlaceLocalHandle$$Closure$138$$T$2__1x10$lang$PlaceLocalHandle$$Closure$138$$U__2$1x10$lang$PlaceLocalHandle$$Closure$138$$T$2 $dummy) {
            x10.lang.PlaceLocalHandle.$Closure$138.$initParams(this, $T, $U);
             {
                ((x10.lang.PlaceLocalHandle.$Closure$138<$T, $U>)this).init_there = ((x10.core.fun.Fun_0_1)(init_there));
                ((x10.lang.PlaceLocalHandle.$Closure$138<$T, $U>)this).v$111045 = (($U)(v$111045));
                ((x10.lang.PlaceLocalHandle.$Closure$138<$T, $U>)this).handle = ((x10.lang.PlaceLocalHandle)(handle));
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$139<$T> extends x10.core.Ref implements x10.core.fun.Fun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$139> $RTT = 
            x10.rtt.StaticFunType.<$Closure$139> make($Closure$139.class,
                                                      1,
                                                      new x10.rtt.Type[] {
                                                          x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_0.$RTT, x10.rtt.ParameterizedType.make(x10.lang.PlaceLocalHandle.$RTT, x10.rtt.UnresolvedType.PARAM(0)))
                                                      });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $T; return null; }
        
        public static <$T> x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.PlaceLocalHandle.$Closure$139<$T> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.$T = (x10.rtt.Type) $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.lang.PlaceLocalHandle.$Closure$139 $_obj = new x10.lang.PlaceLocalHandle.$Closure$139((java.lang.System[]) null, (x10.rtt.Type) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.$T);
            
        }
        
        // constructor just for allocation
        public $Closure$139(final java.lang.System[] $dummy, final x10.rtt.Type $T) {
            x10.lang.PlaceLocalHandle.$Closure$139.$initParams(this, $T);
            
        }
        
        // bridge for method abstract public ()=>U.operator()():U
        public x10.lang.PlaceLocalHandle $apply$G() {
            return $apply();
        }
        
        private x10.rtt.Type $T;
        
        // initializer of type parameters
        public static void $initParams(final $Closure$139 $this, final x10.rtt.Type $T) {
            $this.$T = $T;
            
        }
        
    
        
        public x10.lang.PlaceLocalHandle $apply() {
            
            //#line 165 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
            try {{
                
                //#line 165 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
                final x10.lang.PlaceLocalHandle t$75988 = new x10.lang.PlaceLocalHandle<$T>($T);
                
                //#line 165 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
                return t$75988;
            }}catch (java.lang.Throwable __lowerer__var__0__) {
                
                //#line 165 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
                x10.lang.PlaceLocalHandle __lowerer__var__1__ = ((x10.lang.PlaceLocalHandle)(x10.lang.Runtime.<x10.lang.PlaceLocalHandle<$T>> wrapAtChecked$G(x10.rtt.ParameterizedType.make(x10.lang.PlaceLocalHandle.$RTT, $T), ((java.lang.Throwable)(__lowerer__var__0__)))));
                
                //#line 165 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
                return __lowerer__var__1__;
            }
        }
        
        public $Closure$139(final x10.rtt.Type $T) {
            x10.lang.PlaceLocalHandle.$Closure$139.$initParams(this, $T);
             {
                
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$140<$T> extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$140> $RTT = 
            x10.rtt.StaticVoidFunType.<$Closure$140> make($Closure$140.class,
                                                          1,
                                                          new x10.rtt.Type[] {
                                                              x10.core.fun.VoidFun_0_0.$RTT
                                                          });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $T; return null; }
        
        public static <$T> x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.PlaceLocalHandle.$Closure$140<$T> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.$T = (x10.rtt.Type) $deserializer.readObject();
            $_obj.init = $deserializer.readObject();
            $_obj.handle = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.lang.PlaceLocalHandle.$Closure$140 $_obj = new x10.lang.PlaceLocalHandle.$Closure$140((java.lang.System[]) null, (x10.rtt.Type) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.$T);
            $serializer.write(this.init);
            $serializer.write(this.handle);
            
        }
        
        // constructor just for allocation
        public $Closure$140(final java.lang.System[] $dummy, final x10.rtt.Type $T) {
            x10.lang.PlaceLocalHandle.$Closure$140.$initParams(this, $T);
            
        }
        
        private x10.rtt.Type $T;
        
        // initializer of type parameters
        public static void $initParams(final $Closure$140 $this, final x10.rtt.Type $T) {
            $this.$T = $T;
            
        }
        // synthetic type for parameter mangling
        public static final class __0$1x10$lang$PlaceLocalHandle$$Closure$140$$T$2__1$1x10$lang$PlaceLocalHandle$$Closure$140$$T$2 {}
        
    
        
        public void $apply() {
            
            //#line 166 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
            final $T t$111003 = (($T)(((x10.core.fun.Fun_0_0<$T>)this.init).$apply$G()));
            
            //#line 166 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
            ((x10.lang.PlaceLocalHandle<$T>)this.handle).set__0x10$lang$PlaceLocalHandle$$T((($T)(t$111003)));
        }
        
        public x10.core.fun.Fun_0_0<$T> init;
        public x10.lang.PlaceLocalHandle<$T> handle;
        
        public $Closure$140(final x10.rtt.Type $T, final x10.core.fun.Fun_0_0<$T> init, final x10.lang.PlaceLocalHandle<$T> handle, __0$1x10$lang$PlaceLocalHandle$$Closure$140$$T$2__1$1x10$lang$PlaceLocalHandle$$Closure$140$$T$2 $dummy) {
            x10.lang.PlaceLocalHandle.$Closure$140.$initParams(this, $T);
             {
                ((x10.lang.PlaceLocalHandle.$Closure$140<$T>)this).init = ((x10.core.fun.Fun_0_0)(init));
                ((x10.lang.PlaceLocalHandle.$Closure$140<$T>)this).handle = ((x10.lang.PlaceLocalHandle)(handle));
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$141<$T> extends x10.core.Ref implements x10.core.fun.Fun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$141> $RTT = 
            x10.rtt.StaticFunType.<$Closure$141> make($Closure$141.class,
                                                      1,
                                                      new x10.rtt.Type[] {
                                                          x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_0.$RTT, x10.rtt.ParameterizedType.make(x10.lang.PlaceLocalHandle.$RTT, x10.rtt.UnresolvedType.PARAM(0)))
                                                      });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $T; return null; }
        
        public static <$T> x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.PlaceLocalHandle.$Closure$141<$T> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.$T = (x10.rtt.Type) $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.lang.PlaceLocalHandle.$Closure$141 $_obj = new x10.lang.PlaceLocalHandle.$Closure$141((java.lang.System[]) null, (x10.rtt.Type) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.$T);
            
        }
        
        // constructor just for allocation
        public $Closure$141(final java.lang.System[] $dummy, final x10.rtt.Type $T) {
            x10.lang.PlaceLocalHandle.$Closure$141.$initParams(this, $T);
            
        }
        
        // bridge for method abstract public ()=>U.operator()():U
        public x10.lang.PlaceLocalHandle $apply$G() {
            return $apply();
        }
        
        private x10.rtt.Type $T;
        
        // initializer of type parameters
        public static void $initParams(final $Closure$141 $this, final x10.rtt.Type $T) {
            $this.$T = $T;
            
        }
        
    
        
        public x10.lang.PlaceLocalHandle $apply() {
            
            //#line 188 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
            try {{
                
                //#line 188 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
                final x10.lang.PlaceLocalHandle t$75990 = new x10.lang.PlaceLocalHandle<$T>($T);
                
                //#line 188 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
                return t$75990;
            }}catch (java.lang.Throwable __lowerer__var__0__) {
                
                //#line 188 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
                x10.lang.PlaceLocalHandle __lowerer__var__1__ = ((x10.lang.PlaceLocalHandle)(x10.lang.Runtime.<x10.lang.PlaceLocalHandle<$T>> wrapAtChecked$G(x10.rtt.ParameterizedType.make(x10.lang.PlaceLocalHandle.$RTT, $T), ((java.lang.Throwable)(__lowerer__var__0__)))));
                
                //#line 188 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
                return __lowerer__var__1__;
            }
        }
        
        public $Closure$141(final x10.rtt.Type $T) {
            x10.lang.PlaceLocalHandle.$Closure$141.$initParams(this, $T);
             {
                
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$142<$T> extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$142> $RTT = 
            x10.rtt.StaticVoidFunType.<$Closure$142> make($Closure$142.class,
                                                          1,
                                                          new x10.rtt.Type[] {
                                                              x10.core.fun.VoidFun_0_0.$RTT
                                                          });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $T; return null; }
        
        public static <$T> x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.PlaceLocalHandle.$Closure$142<$T> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.$T = (x10.rtt.Type) $deserializer.readObject();
            $_obj.init = $deserializer.readObject();
            $_obj.handle = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.lang.PlaceLocalHandle.$Closure$142 $_obj = new x10.lang.PlaceLocalHandle.$Closure$142((java.lang.System[]) null, (x10.rtt.Type) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.$T);
            $serializer.write(this.init);
            $serializer.write(this.handle);
            
        }
        
        // constructor just for allocation
        public $Closure$142(final java.lang.System[] $dummy, final x10.rtt.Type $T) {
            x10.lang.PlaceLocalHandle.$Closure$142.$initParams(this, $T);
            
        }
        
        private x10.rtt.Type $T;
        
        // initializer of type parameters
        public static void $initParams(final $Closure$142 $this, final x10.rtt.Type $T) {
            $this.$T = $T;
            
        }
        // synthetic type for parameter mangling
        public static final class __0$1x10$lang$PlaceLocalHandle$$Closure$142$$T$2__1$1x10$lang$PlaceLocalHandle$$Closure$142$$T$2 {}
        
    
        
        public void $apply() {
            
            //#line 189 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
            final $T t$111005 = (($T)(((x10.core.fun.Fun_0_0<$T>)this.init).$apply$G()));
            
            //#line 189 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
            ((x10.lang.PlaceLocalHandle<$T>)this.handle).set__0x10$lang$PlaceLocalHandle$$T((($T)(t$111005)));
        }
        
        public x10.core.fun.Fun_0_0<$T> init;
        public x10.lang.PlaceLocalHandle<$T> handle;
        
        public $Closure$142(final x10.rtt.Type $T, final x10.core.fun.Fun_0_0<$T> init, final x10.lang.PlaceLocalHandle<$T> handle, __0$1x10$lang$PlaceLocalHandle$$Closure$142$$T$2__1$1x10$lang$PlaceLocalHandle$$Closure$142$$T$2 $dummy) {
            x10.lang.PlaceLocalHandle.$Closure$142.$initParams(this, $T);
             {
                ((x10.lang.PlaceLocalHandle.$Closure$142<$T>)this).init = ((x10.core.fun.Fun_0_0)(init));
                ((x10.lang.PlaceLocalHandle.$Closure$142<$T>)this).handle = ((x10.lang.PlaceLocalHandle)(handle));
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$143<$T, $U> extends x10.core.Ref implements x10.core.fun.Fun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$143> $RTT = 
            x10.rtt.StaticFunType.<$Closure$143> make($Closure$143.class,
                                                      2,
                                                      new x10.rtt.Type[] {
                                                          x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_0.$RTT, x10.rtt.ParameterizedType.make(x10.lang.PlaceLocalHandle.$RTT, x10.rtt.UnresolvedType.PARAM(0)))
                                                      });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $T; if (i == 1) return $U; return null; }
        
        public static <$T, $U> x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.PlaceLocalHandle.$Closure$143<$T, $U> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.$T = (x10.rtt.Type) $deserializer.readObject();
            $_obj.$U = (x10.rtt.Type) $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.lang.PlaceLocalHandle.$Closure$143 $_obj = new x10.lang.PlaceLocalHandle.$Closure$143((java.lang.System[]) null, (x10.rtt.Type) null, (x10.rtt.Type) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.$T);
            $serializer.write(this.$U);
            
        }
        
        // constructor just for allocation
        public $Closure$143(final java.lang.System[] $dummy, final x10.rtt.Type $T, final x10.rtt.Type $U) {
            x10.lang.PlaceLocalHandle.$Closure$143.$initParams(this, $T, $U);
            
        }
        
        // bridge for method abstract public ()=>U.operator()():U
        public x10.lang.PlaceLocalHandle $apply$G() {
            return $apply();
        }
        
        private x10.rtt.Type $T;
        private x10.rtt.Type $U;
        
        // initializer of type parameters
        public static void $initParams(final $Closure$143 $this, final x10.rtt.Type $T, final x10.rtt.Type $U) {
            $this.$T = $T;
            $this.$U = $U;
            
        }
        
    
        
        public x10.lang.PlaceLocalHandle $apply() {
            
            //#line 211 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
            try {{
                
                //#line 211 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
                final x10.lang.PlaceLocalHandle t$75992 = new x10.lang.PlaceLocalHandle<$T>($T);
                
                //#line 211 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
                return t$75992;
            }}catch (java.lang.Throwable __lowerer__var__0__) {
                
                //#line 211 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
                x10.lang.PlaceLocalHandle __lowerer__var__1__ = ((x10.lang.PlaceLocalHandle)(x10.lang.Runtime.<x10.lang.PlaceLocalHandle<$T>> wrapAtChecked$G(x10.rtt.ParameterizedType.make(x10.lang.PlaceLocalHandle.$RTT, $T), ((java.lang.Throwable)(__lowerer__var__0__)))));
                
                //#line 211 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
                return __lowerer__var__1__;
            }
        }
        
        public $Closure$143(final x10.rtt.Type $T, final x10.rtt.Type $U) {
            x10.lang.PlaceLocalHandle.$Closure$143.$initParams(this, $T, $U);
             {
                
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$144<$T, $U> extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$144> $RTT = 
            x10.rtt.StaticVoidFunType.<$Closure$144> make($Closure$144.class,
                                                          2,
                                                          new x10.rtt.Type[] {
                                                              x10.core.fun.VoidFun_0_0.$RTT
                                                          });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $T; if (i == 1) return $U; return null; }
        
        public static <$T, $U> x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.PlaceLocalHandle.$Closure$144<$T, $U> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.$T = (x10.rtt.Type) $deserializer.readObject();
            $_obj.$U = (x10.rtt.Type) $deserializer.readObject();
            $_obj.init_there = $deserializer.readObject();
            $_obj.v$111052 = $deserializer.readObject();
            $_obj.handle = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.lang.PlaceLocalHandle.$Closure$144 $_obj = new x10.lang.PlaceLocalHandle.$Closure$144((java.lang.System[]) null, (x10.rtt.Type) null, (x10.rtt.Type) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.$T);
            $serializer.write(this.$U);
            $serializer.write(this.init_there);
            $serializer.write(this.v$111052);
            $serializer.write(this.handle);
            
        }
        
        // constructor just for allocation
        public $Closure$144(final java.lang.System[] $dummy, final x10.rtt.Type $T, final x10.rtt.Type $U) {
            x10.lang.PlaceLocalHandle.$Closure$144.$initParams(this, $T, $U);
            
        }
        
        private x10.rtt.Type $T;
        private x10.rtt.Type $U;
        
        // initializer of type parameters
        public static void $initParams(final $Closure$144 $this, final x10.rtt.Type $T, final x10.rtt.Type $U) {
            $this.$T = $T;
            $this.$U = $U;
            
        }
        // synthetic type for parameter mangling
        public static final class __0$1x10$lang$PlaceLocalHandle$$Closure$144$$U$3x10$lang$PlaceLocalHandle$$Closure$144$$T$2__1x10$lang$PlaceLocalHandle$$Closure$144$$U__2$1x10$lang$PlaceLocalHandle$$Closure$144$$T$2 {}
        
    
        
        public void $apply() {
            
            //#line 214 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
            try {{
                
                //#line 214 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
                final $T t$111053 = (($T)((($T)
                                            ((x10.core.fun.Fun_0_1<$U,$T>)this.init_there).$apply(this.v$111052, $U))));
                
                //#line 214 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
                ((x10.lang.PlaceLocalHandle<$T>)this.handle).set__0x10$lang$PlaceLocalHandle$$T((($T)(t$111053)));
            }}catch (java.lang.Error __lowerer__var__2__) {
                
                //#line 214 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
                throw __lowerer__var__2__;
            }catch (java.lang.Throwable __lowerer__var__3__) {
                
                //#line 214 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
                throw x10.rtt.Types.EXCEPTION.isInstance(__lowerer__var__3__) ? (java.lang.RuntimeException)(__lowerer__var__3__) : new x10.lang.WrappedThrowable(__lowerer__var__3__);
            }
        }
        
        public x10.core.fun.Fun_0_1<$U,$T> init_there;
        public $U v$111052;
        public x10.lang.PlaceLocalHandle<$T> handle;
        
        public $Closure$144(final x10.rtt.Type $T, final x10.rtt.Type $U, final x10.core.fun.Fun_0_1<$U,$T> init_there, final $U v$111052, final x10.lang.PlaceLocalHandle<$T> handle, __0$1x10$lang$PlaceLocalHandle$$Closure$144$$U$3x10$lang$PlaceLocalHandle$$Closure$144$$T$2__1x10$lang$PlaceLocalHandle$$Closure$144$$U__2$1x10$lang$PlaceLocalHandle$$Closure$144$$T$2 $dummy) {
            x10.lang.PlaceLocalHandle.$Closure$144.$initParams(this, $T, $U);
             {
                ((x10.lang.PlaceLocalHandle.$Closure$144<$T, $U>)this).init_there = ((x10.core.fun.Fun_0_1)(init_there));
                ((x10.lang.PlaceLocalHandle.$Closure$144<$T, $U>)this).v$111052 = (($U)(v$111052));
                ((x10.lang.PlaceLocalHandle.$Closure$144<$T, $U>)this).handle = ((x10.lang.PlaceLocalHandle)(handle));
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$145<$T, $U> extends x10.core.Ref implements x10.core.fun.Fun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$145> $RTT = 
            x10.rtt.StaticFunType.<$Closure$145> make($Closure$145.class,
                                                      2,
                                                      new x10.rtt.Type[] {
                                                          x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_0.$RTT, x10.rtt.ParameterizedType.make(x10.lang.PlaceLocalHandle.$RTT, x10.rtt.UnresolvedType.PARAM(0)))
                                                      });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $T; if (i == 1) return $U; return null; }
        
        public static <$T, $U> x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.PlaceLocalHandle.$Closure$145<$T, $U> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.$T = (x10.rtt.Type) $deserializer.readObject();
            $_obj.$U = (x10.rtt.Type) $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.lang.PlaceLocalHandle.$Closure$145 $_obj = new x10.lang.PlaceLocalHandle.$Closure$145((java.lang.System[]) null, (x10.rtt.Type) null, (x10.rtt.Type) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.$T);
            $serializer.write(this.$U);
            
        }
        
        // constructor just for allocation
        public $Closure$145(final java.lang.System[] $dummy, final x10.rtt.Type $T, final x10.rtt.Type $U) {
            x10.lang.PlaceLocalHandle.$Closure$145.$initParams(this, $T, $U);
            
        }
        
        // bridge for method abstract public ()=>U.operator()():U
        public x10.lang.PlaceLocalHandle $apply$G() {
            return $apply();
        }
        
        private x10.rtt.Type $T;
        private x10.rtt.Type $U;
        
        // initializer of type parameters
        public static void $initParams(final $Closure$145 $this, final x10.rtt.Type $T, final x10.rtt.Type $U) {
            $this.$T = $T;
            $this.$U = $U;
            
        }
        
    
        
        public x10.lang.PlaceLocalHandle $apply() {
            
            //#line 240 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
            try {{
                
                //#line 240 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
                final x10.lang.PlaceLocalHandle t$75994 = new x10.lang.PlaceLocalHandle<$T>($T);
                
                //#line 240 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
                return t$75994;
            }}catch (java.lang.Throwable __lowerer__var__0__) {
                
                //#line 240 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
                x10.lang.PlaceLocalHandle __lowerer__var__1__ = ((x10.lang.PlaceLocalHandle)(x10.lang.Runtime.<x10.lang.PlaceLocalHandle<$T>> wrapAtChecked$G(x10.rtt.ParameterizedType.make(x10.lang.PlaceLocalHandle.$RTT, $T), ((java.lang.Throwable)(__lowerer__var__0__)))));
                
                //#line 240 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
                return __lowerer__var__1__;
            }
        }
        
        public $Closure$145(final x10.rtt.Type $T, final x10.rtt.Type $U) {
            x10.lang.PlaceLocalHandle.$Closure$145.$initParams(this, $T, $U);
             {
                
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$146<$T, $U> extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$146> $RTT = 
            x10.rtt.StaticVoidFunType.<$Closure$146> make($Closure$146.class,
                                                          2,
                                                          new x10.rtt.Type[] {
                                                              x10.core.fun.VoidFun_0_0.$RTT
                                                          });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $T; if (i == 1) return $U; return null; }
        
        public static <$T, $U> x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.PlaceLocalHandle.$Closure$146<$T, $U> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.$T = (x10.rtt.Type) $deserializer.readObject();
            $_obj.$U = (x10.rtt.Type) $deserializer.readObject();
            $_obj.init_there = $deserializer.readObject();
            $_obj.v$111055 = $deserializer.readObject();
            $_obj.handle = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.lang.PlaceLocalHandle.$Closure$146 $_obj = new x10.lang.PlaceLocalHandle.$Closure$146((java.lang.System[]) null, (x10.rtt.Type) null, (x10.rtt.Type) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.$T);
            $serializer.write(this.$U);
            $serializer.write(this.init_there);
            $serializer.write(this.v$111055);
            $serializer.write(this.handle);
            
        }
        
        // constructor just for allocation
        public $Closure$146(final java.lang.System[] $dummy, final x10.rtt.Type $T, final x10.rtt.Type $U) {
            x10.lang.PlaceLocalHandle.$Closure$146.$initParams(this, $T, $U);
            
        }
        
        private x10.rtt.Type $T;
        private x10.rtt.Type $U;
        
        // initializer of type parameters
        public static void $initParams(final $Closure$146 $this, final x10.rtt.Type $T, final x10.rtt.Type $U) {
            $this.$T = $T;
            $this.$U = $U;
            
        }
        // synthetic type for parameter mangling
        public static final class __0$1x10$lang$PlaceLocalHandle$$Closure$146$$U$3x10$lang$PlaceLocalHandle$$Closure$146$$T$2__1x10$lang$PlaceLocalHandle$$Closure$146$$U__2$1x10$lang$PlaceLocalHandle$$Closure$146$$T$2 {}
        
    
        
        public void $apply() {
            
            //#line 244 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
            try {{
                
                //#line 244 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
                final $T t$111060 = (($T)((($T)
                                            ((x10.core.fun.Fun_0_1<$U,$T>)this.init_there).$apply(this.v$111055, $U))));
                
                //#line 244 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
                ((x10.lang.PlaceLocalHandle<$T>)this.handle).set__0x10$lang$PlaceLocalHandle$$T((($T)(t$111060)));
            }}catch (java.lang.Error __lowerer__var__2__) {
                
                //#line 244 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
                throw __lowerer__var__2__;
            }catch (java.lang.Throwable __lowerer__var__3__) {
                
                //#line 244 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
                throw x10.rtt.Types.EXCEPTION.isInstance(__lowerer__var__3__) ? (java.lang.RuntimeException)(__lowerer__var__3__) : new x10.lang.WrappedThrowable(__lowerer__var__3__);
            }
        }
        
        public x10.core.fun.Fun_0_1<$U,$T> init_there;
        public $U v$111055;
        public x10.lang.PlaceLocalHandle<$T> handle;
        
        public $Closure$146(final x10.rtt.Type $T, final x10.rtt.Type $U, final x10.core.fun.Fun_0_1<$U,$T> init_there, final $U v$111055, final x10.lang.PlaceLocalHandle<$T> handle, __0$1x10$lang$PlaceLocalHandle$$Closure$146$$U$3x10$lang$PlaceLocalHandle$$Closure$146$$T$2__1x10$lang$PlaceLocalHandle$$Closure$146$$U__2$1x10$lang$PlaceLocalHandle$$Closure$146$$T$2 $dummy) {
            x10.lang.PlaceLocalHandle.$Closure$146.$initParams(this, $T, $U);
             {
                ((x10.lang.PlaceLocalHandle.$Closure$146<$T, $U>)this).init_there = ((x10.core.fun.Fun_0_1)(init_there));
                ((x10.lang.PlaceLocalHandle.$Closure$146<$T, $U>)this).v$111055 = (($U)(v$111055));
                ((x10.lang.PlaceLocalHandle.$Closure$146<$T, $U>)this).handle = ((x10.lang.PlaceLocalHandle)(handle));
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$147<$T> extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$147> $RTT = 
            x10.rtt.StaticVoidFunType.<$Closure$147> make($Closure$147.class,
                                                          1,
                                                          new x10.rtt.Type[] {
                                                              x10.core.fun.VoidFun_0_0.$RTT
                                                          });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $T; return null; }
        
        public static <$T> x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.PlaceLocalHandle.$Closure$147<$T> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.$T = (x10.rtt.Type) $deserializer.readObject();
            $_obj.plh = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.lang.PlaceLocalHandle.$Closure$147 $_obj = new x10.lang.PlaceLocalHandle.$Closure$147((java.lang.System[]) null, (x10.rtt.Type) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.$T);
            $serializer.write(this.plh);
            
        }
        
        // constructor just for allocation
        public $Closure$147(final java.lang.System[] $dummy, final x10.rtt.Type $T) {
            x10.lang.PlaceLocalHandle.$Closure$147.$initParams(this, $T);
            
        }
        
        private x10.rtt.Type $T;
        
        // initializer of type parameters
        public static void $initParams(final $Closure$147 $this, final x10.rtt.Type $T) {
            $this.$T = $T;
            
        }
        // synthetic type for parameter mangling
        public static final class __0$1x10$lang$PlaceLocalHandle$$Closure$147$$T$2 {}
        
    
        
        public void $apply() {
            
            //#line 257 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
            ((x10.lang.PlaceLocalHandle<$T>)this.plh).set__0x10$lang$PlaceLocalHandle$$T((($T)(null)));
        }
        
        public x10.lang.PlaceLocalHandle<$T> plh;
        
        public $Closure$147(final x10.rtt.Type $T, final x10.lang.PlaceLocalHandle<$T> plh, __0$1x10$lang$PlaceLocalHandle$$Closure$147$$T$2 $dummy) {
            x10.lang.PlaceLocalHandle.$Closure$147.$initParams(this, $T);
             {
                ((x10.lang.PlaceLocalHandle.$Closure$147<$T>)this).plh = ((x10.lang.PlaceLocalHandle)(plh));
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$148<$T> extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$148> $RTT = 
            x10.rtt.StaticVoidFunType.<$Closure$148> make($Closure$148.class,
                                                          1,
                                                          new x10.rtt.Type[] {
                                                              x10.core.fun.VoidFun_0_0.$RTT
                                                          });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $T; return null; }
        
        public static <$T> x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.PlaceLocalHandle.$Closure$148<$T> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.$T = (x10.rtt.Type) $deserializer.readObject();
            $_obj.plh = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.lang.PlaceLocalHandle.$Closure$148 $_obj = new x10.lang.PlaceLocalHandle.$Closure$148((java.lang.System[]) null, (x10.rtt.Type) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.$T);
            $serializer.write(this.plh);
            
        }
        
        // constructor just for allocation
        public $Closure$148(final java.lang.System[] $dummy, final x10.rtt.Type $T) {
            x10.lang.PlaceLocalHandle.$Closure$148.$initParams(this, $T);
            
        }
        
        private x10.rtt.Type $T;
        
        // initializer of type parameters
        public static void $initParams(final $Closure$148 $this, final x10.rtt.Type $T) {
            $this.$T = $T;
            
        }
        // synthetic type for parameter mangling
        public static final class __0$1x10$lang$PlaceLocalHandle$$Closure$148$$T$2 {}
        
    
        
        public void $apply() {
            
            //#line 267 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
            ((x10.lang.PlaceLocalHandle<$T>)this.plh).set__0x10$lang$PlaceLocalHandle$$T((($T)(null)));
        }
        
        public x10.lang.PlaceLocalHandle<$T> plh;
        
        public $Closure$148(final x10.rtt.Type $T, final x10.lang.PlaceLocalHandle<$T> plh, __0$1x10$lang$PlaceLocalHandle$$Closure$148$$T$2 $dummy) {
            x10.lang.PlaceLocalHandle.$Closure$148.$initParams(this, $T);
             {
                ((x10.lang.PlaceLocalHandle.$Closure$148<$T>)this).plh = ((x10.lang.PlaceLocalHandle)(plh));
            }
        }
        
    }
    
    }
    
    