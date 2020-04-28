package x10.lang;

@x10.runtime.impl.java.X10Generated
public class GlobalCell<$T> extends x10.core.Ref implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<GlobalCell> $RTT = 
        x10.rtt.NamedType.<GlobalCell> make("x10.lang.GlobalCell",
                                            GlobalCell.class,
                                            1);
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $T; return null; }
    
    public static <$T> x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.GlobalCell<$T> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        $_obj.$T = (x10.rtt.Type) $deserializer.readObject();
        $_obj.root = $deserializer.readObject();
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.lang.GlobalCell $_obj = new x10.lang.GlobalCell((java.lang.System[]) null, (x10.rtt.Type) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        $serializer.write(this.$T);
        $serializer.write(this.root);
        
    }
    
    // constructor just for allocation
    public GlobalCell(final java.lang.System[] $dummy, final x10.rtt.Type $T) {
        x10.lang.GlobalCell.$initParams(this, $T);
        
    }
    
    private x10.rtt.Type $T;
    
    // initializer of type parameters
    public static void $initParams(final GlobalCell $this, final x10.rtt.Type $T) {
        $this.$T = $T;
        
    }
    // synthetic type for parameter mangling
    public static final class __0x10$lang$GlobalCell$$T {}
    

    
    //#line 16 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalCell.x10"
    public x10.core.GlobalRef<x10.lang.Cell<$T>> root;
    
    
    //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalCell.x10"
    // creation method for java code (1-phase java constructor)
    public GlobalCell(final x10.rtt.Type $T, final $T v, __0x10$lang$GlobalCell$$T $dummy) {
        this((java.lang.System[]) null, $T);
        x10$lang$GlobalCell$$init$S(v, (x10.lang.GlobalCell.__0x10$lang$GlobalCell$$T) null);
    }
    
    // constructor for non-virtual call
    final public x10.lang.GlobalCell<$T> x10$lang$GlobalCell$$init$S(final $T v, __0x10$lang$GlobalCell$$T $dummy) {
         {
            
            //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalCell.x10"
            
            
            //#line 14 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalCell.x10"
            final x10.lang.GlobalCell this$109779 = this;
            
            //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalCell.x10"
            final x10.lang.Cell alloc$109759 = ((x10.lang.Cell)(new x10.lang.Cell<$T>((java.lang.System[]) null, $T)));
            
            //#line 33 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Cell.x10"
            final $T x$109764 = (($T)(v));
            
            //#line 33 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Cell.x10"
            ((x10.lang.Cell<$T>)alloc$109759).value = (($T)(x$109764));
            
            //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalCell.x10"
            final x10.core.GlobalRef t$109768 = ((x10.core.GlobalRef)(new x10.core.GlobalRef<x10.lang.Cell<$T>>(x10.rtt.ParameterizedType.make(x10.lang.Cell.$RTT, $T), ((x10.lang.Cell<$T>)(alloc$109759)), (x10.core.GlobalRef.__0x10$lang$GlobalRef$$T) null)));
            
            //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalCell.x10"
            ((x10.lang.GlobalCell<$T>)this).root = ((x10.core.GlobalRef)(t$109768));
        }
        return this;
    }
    
    
    
    //#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalCell.x10"
    public java.lang.String toString() {
        
        //#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalCell.x10"
        final x10.core.GlobalRef t$109769 = ((x10.core.GlobalRef)(root));
        
        //#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalCell.x10"
        final java.lang.String t$109770 = (((x10.core.GlobalRef<x10.lang.Cell<$T>>)(t$109769))).toString();
        
        //#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalCell.x10"
        return t$109770;
    }
    
    
    //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalCell.x10"
    public $T $apply$G() {
        
        //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalCell.x10"
        final x10.core.GlobalRef t$109753 = ((x10.core.GlobalRef)(root));
        
        //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalCell.x10"
        final x10.lang.Place t$109757 = ((x10.lang.Place)((t$109753).home));
        
        //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalCell.x10"
        final $T t$109758 = (($T)(x10.lang.Runtime.<$T> evalAt__1$1x10$lang$Runtime$$T$2$G($T, ((x10.lang.Place)(t$109757)), ((x10.core.fun.Fun_0_0)(new x10.lang.GlobalCell.$Closure$112<$T>($T, ((x10.lang.GlobalCell<$T>)(this)), root, (x10.lang.GlobalCell.$Closure$112.__0$1x10$lang$GlobalCell$$Closure$112$$T$2__1$1x10$lang$Cell$1x10$lang$GlobalCell$$Closure$112$$T$2$2) null))), ((x10.lang.Runtime.Profile)(null)))));
        
        //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalCell.x10"
        return t$109758;
    }
    
    
    //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalCell.x10"
    public void $apply__0x10$lang$GlobalCell$$T(final $T x) {
        
        //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalCell.x10"
        final x10.core.GlobalRef t$109771 = ((x10.core.GlobalRef)(root));
        
        //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalCell.x10"
        final x10.lang.Place t$109774 = ((x10.lang.Place)((t$109771).home));
        {
            
            //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalCell.x10"
            x10.lang.Runtime.runAt(((x10.lang.Place)(t$109774)), ((x10.core.fun.VoidFun_0_0)(new x10.lang.GlobalCell.$Closure$113<$T>($T, ((x10.lang.GlobalCell<$T>)(this)), root, x, (x10.lang.GlobalCell.$Closure$113.__0$1x10$lang$GlobalCell$$Closure$113$$T$2__1$1x10$lang$Cell$1x10$lang$GlobalCell$$Closure$113$$T$2$2__2x10$lang$GlobalCell$$Closure$113$$T) null))), ((x10.lang.Runtime.Profile)(null)));
        }
    }
    
    
    //#line 52 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalCell.x10"
    public void $set__0x10$lang$GlobalCell$$T(final $T x) {
        
        //#line 52 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalCell.x10"
        this.set__0x10$lang$GlobalCell$$T$G((($T)(x)));
    }
    
    
    //#line 53 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalCell.x10"
    public $T set__0x10$lang$GlobalCell$$T$G(final $T x) {
        
        //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalCell.x10"
        final x10.core.GlobalRef t$109775 = ((x10.core.GlobalRef)(root));
        
        //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalCell.x10"
        final x10.lang.Place t$109778 = ((x10.lang.Place)((t$109775).home));
        {
            
            //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalCell.x10"
            x10.lang.Runtime.runAt(((x10.lang.Place)(t$109778)), ((x10.core.fun.VoidFun_0_0)(new x10.lang.GlobalCell.$Closure$114<$T>($T, ((x10.lang.GlobalCell<$T>)(this)), root, x, (x10.lang.GlobalCell.$Closure$114.__0$1x10$lang$GlobalCell$$Closure$114$$T$2__1$1x10$lang$Cell$1x10$lang$GlobalCell$$Closure$114$$T$2$2__2x10$lang$GlobalCell$$Closure$114$$T) null))), ((x10.lang.Runtime.Profile)(null)));
        }
        
        //#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalCell.x10"
        return x;
    }
    
    
    //#line 67 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalCell.x10"
    public static <$T>x10.lang.GlobalCell make__0x10$lang$GlobalCell$$T(final x10.rtt.Type $T, final $T x) {
        
        //#line 67 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalCell.x10"
        final x10.lang.GlobalCell alloc$109760 = ((x10.lang.GlobalCell)(new x10.lang.GlobalCell<$T>((java.lang.System[]) null, $T)));
        
        //#line 67 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalCell.x10"
        alloc$109760.x10$lang$GlobalCell$$init$S((($T)(x)), (x10.lang.GlobalCell.__0x10$lang$GlobalCell$$T) null);
        
        //#line 67 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalCell.x10"
        return alloc$109760;
    }
    
    
    //#line 14 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalCell.x10"
    final public x10.lang.GlobalCell x10$lang$GlobalCell$$this$x10$lang$GlobalCell() {
        
        //#line 14 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalCell.x10"
        return x10.lang.GlobalCell.this;
    }
    
    
    //#line 14 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalCell.x10"
    final public void __fieldInitializers_x10_lang_GlobalCell() {
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$112<$T> extends x10.core.Ref implements x10.core.fun.Fun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$112> $RTT = 
            x10.rtt.StaticFunType.<$Closure$112> make($Closure$112.class,
                                                      1,
                                                      new x10.rtt.Type[] {
                                                          x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_0.$RTT, x10.rtt.UnresolvedType.PARAM(0))
                                                      });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $T; return null; }
        
        public static <$T> x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.GlobalCell.$Closure$112<$T> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.$T = (x10.rtt.Type) $deserializer.readObject();
            $_obj.out$$ = $deserializer.readObject();
            $_obj.root = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.lang.GlobalCell.$Closure$112 $_obj = new x10.lang.GlobalCell.$Closure$112((java.lang.System[]) null, (x10.rtt.Type) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.$T);
            $serializer.write(this.out$$);
            $serializer.write(this.root);
            
        }
        
        // constructor just for allocation
        public $Closure$112(final java.lang.System[] $dummy, final x10.rtt.Type $T) {
            x10.lang.GlobalCell.$Closure$112.$initParams(this, $T);
            
        }
        
        private x10.rtt.Type $T;
        
        // initializer of type parameters
        public static void $initParams(final $Closure$112 $this, final x10.rtt.Type $T) {
            $this.$T = $T;
            
        }
        // synthetic type for parameter mangling
        public static final class __0$1x10$lang$GlobalCell$$Closure$112$$T$2__1$1x10$lang$Cell$1x10$lang$GlobalCell$$Closure$112$$T$2$2 {}
        
    
        
        public $T $apply$G() {
            
            //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalCell.x10"
            try {{
                
                //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalCell.x10"
                final x10.core.GlobalRef t$109754 = ((x10.core.GlobalRef)(this.root));
                
                //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalCell.x10"
                final x10.lang.Cell t$109755 = (((x10.core.GlobalRef<x10.lang.Cell<$T>>)(t$109754))).$apply$G();
                
                //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalCell.x10"
                final $T t$109756 = (($T)(((x10.lang.Cell<$T>)t$109755).value));
                
                //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalCell.x10"
                return t$109756;
            }}catch (java.lang.Throwable __lowerer__var__0__) {
                
                //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalCell.x10"
                $T __lowerer__var__1__ = (($T)(x10.lang.Runtime.<$T> wrapAtChecked$G($T, ((java.lang.Throwable)(__lowerer__var__0__)))));
                
                //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalCell.x10"
                return __lowerer__var__1__;
            }
        }
        
        public x10.lang.GlobalCell<$T> out$$;
        public x10.core.GlobalRef<x10.lang.Cell<$T>> root;
        
        public $Closure$112(final x10.rtt.Type $T, final x10.lang.GlobalCell<$T> out$$, final x10.core.GlobalRef<x10.lang.Cell<$T>> root, __0$1x10$lang$GlobalCell$$Closure$112$$T$2__1$1x10$lang$Cell$1x10$lang$GlobalCell$$Closure$112$$T$2$2 $dummy) {
            x10.lang.GlobalCell.$Closure$112.$initParams(this, $T);
             {
                ((x10.lang.GlobalCell.$Closure$112<$T>)this).out$$ = out$$;
                ((x10.lang.GlobalCell.$Closure$112<$T>)this).root = ((x10.core.GlobalRef)(root));
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$113<$T> extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$113> $RTT = 
            x10.rtt.StaticVoidFunType.<$Closure$113> make($Closure$113.class,
                                                          1,
                                                          new x10.rtt.Type[] {
                                                              x10.core.fun.VoidFun_0_0.$RTT
                                                          });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $T; return null; }
        
        public static <$T> x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.GlobalCell.$Closure$113<$T> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.$T = (x10.rtt.Type) $deserializer.readObject();
            $_obj.out$$ = $deserializer.readObject();
            $_obj.root = $deserializer.readObject();
            $_obj.x = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.lang.GlobalCell.$Closure$113 $_obj = new x10.lang.GlobalCell.$Closure$113((java.lang.System[]) null, (x10.rtt.Type) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.$T);
            $serializer.write(this.out$$);
            $serializer.write(this.root);
            $serializer.write(this.x);
            
        }
        
        // constructor just for allocation
        public $Closure$113(final java.lang.System[] $dummy, final x10.rtt.Type $T) {
            x10.lang.GlobalCell.$Closure$113.$initParams(this, $T);
            
        }
        
        private x10.rtt.Type $T;
        
        // initializer of type parameters
        public static void $initParams(final $Closure$113 $this, final x10.rtt.Type $T) {
            $this.$T = $T;
            
        }
        // synthetic type for parameter mangling
        public static final class __0$1x10$lang$GlobalCell$$Closure$113$$T$2__1$1x10$lang$Cell$1x10$lang$GlobalCell$$Closure$113$$T$2$2__2x10$lang$GlobalCell$$Closure$113$$T {}
        
    
        
        public void $apply() {
            
            //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalCell.x10"
            try {{
                
                //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalCell.x10"
                final x10.core.GlobalRef t$109772 = ((x10.core.GlobalRef)(this.root));
                
                //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalCell.x10"
                final x10.lang.Cell t$109773 = (((x10.core.GlobalRef<x10.lang.Cell<$T>>)(t$109772))).$apply$G();
                
                //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalCell.x10"
                ((x10.lang.Cell<$T>)t$109773).value = (($T)(this.x));
            }}catch (java.lang.Throwable __lowerer__var__0__) {
                
                //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalCell.x10"
                int __lowerer__var__1__ = (x10.core.Int.$unbox(x10.lang.Runtime.<x10.core.Int> wrapAtChecked$G(x10.rtt.Types.INT, ((java.lang.Throwable)(__lowerer__var__0__)))));
            }
        }
        
        public x10.lang.GlobalCell<$T> out$$;
        public x10.core.GlobalRef<x10.lang.Cell<$T>> root;
        public $T x;
        
        public $Closure$113(final x10.rtt.Type $T, final x10.lang.GlobalCell<$T> out$$, final x10.core.GlobalRef<x10.lang.Cell<$T>> root, final $T x, __0$1x10$lang$GlobalCell$$Closure$113$$T$2__1$1x10$lang$Cell$1x10$lang$GlobalCell$$Closure$113$$T$2$2__2x10$lang$GlobalCell$$Closure$113$$T $dummy) {
            x10.lang.GlobalCell.$Closure$113.$initParams(this, $T);
             {
                ((x10.lang.GlobalCell.$Closure$113<$T>)this).out$$ = out$$;
                ((x10.lang.GlobalCell.$Closure$113<$T>)this).root = ((x10.core.GlobalRef)(root));
                ((x10.lang.GlobalCell.$Closure$113<$T>)this).x = (($T)(x));
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$114<$T> extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$114> $RTT = 
            x10.rtt.StaticVoidFunType.<$Closure$114> make($Closure$114.class,
                                                          1,
                                                          new x10.rtt.Type[] {
                                                              x10.core.fun.VoidFun_0_0.$RTT
                                                          });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $T; return null; }
        
        public static <$T> x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.GlobalCell.$Closure$114<$T> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.$T = (x10.rtt.Type) $deserializer.readObject();
            $_obj.out$$ = $deserializer.readObject();
            $_obj.root = $deserializer.readObject();
            $_obj.x = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.lang.GlobalCell.$Closure$114 $_obj = new x10.lang.GlobalCell.$Closure$114((java.lang.System[]) null, (x10.rtt.Type) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.$T);
            $serializer.write(this.out$$);
            $serializer.write(this.root);
            $serializer.write(this.x);
            
        }
        
        // constructor just for allocation
        public $Closure$114(final java.lang.System[] $dummy, final x10.rtt.Type $T) {
            x10.lang.GlobalCell.$Closure$114.$initParams(this, $T);
            
        }
        
        private x10.rtt.Type $T;
        
        // initializer of type parameters
        public static void $initParams(final $Closure$114 $this, final x10.rtt.Type $T) {
            $this.$T = $T;
            
        }
        // synthetic type for parameter mangling
        public static final class __0$1x10$lang$GlobalCell$$Closure$114$$T$2__1$1x10$lang$Cell$1x10$lang$GlobalCell$$Closure$114$$T$2$2__2x10$lang$GlobalCell$$Closure$114$$T {}
        
    
        
        public void $apply() {
            
            //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalCell.x10"
            try {{
                
                //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalCell.x10"
                final x10.core.GlobalRef t$109776 = ((x10.core.GlobalRef)(this.root));
                
                //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalCell.x10"
                final x10.lang.Cell t$109777 = (((x10.core.GlobalRef<x10.lang.Cell<$T>>)(t$109776))).$apply$G();
                
                //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalCell.x10"
                ((x10.lang.Cell<$T>)t$109777).value = (($T)(this.x));
            }}catch (java.lang.Throwable __lowerer__var__0__) {
                
                //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalCell.x10"
                int __lowerer__var__1__ = (x10.core.Int.$unbox(x10.lang.Runtime.<x10.core.Int> wrapAtChecked$G(x10.rtt.Types.INT, ((java.lang.Throwable)(__lowerer__var__0__)))));
            }
        }
        
        public x10.lang.GlobalCell<$T> out$$;
        public x10.core.GlobalRef<x10.lang.Cell<$T>> root;
        public $T x;
        
        public $Closure$114(final x10.rtt.Type $T, final x10.lang.GlobalCell<$T> out$$, final x10.core.GlobalRef<x10.lang.Cell<$T>> root, final $T x, __0$1x10$lang$GlobalCell$$Closure$114$$T$2__1$1x10$lang$Cell$1x10$lang$GlobalCell$$Closure$114$$T$2$2__2x10$lang$GlobalCell$$Closure$114$$T $dummy) {
            x10.lang.GlobalCell.$Closure$114.$initParams(this, $T);
             {
                ((x10.lang.GlobalCell.$Closure$114<$T>)this).out$$ = out$$;
                ((x10.lang.GlobalCell.$Closure$114<$T>)this).root = ((x10.core.GlobalRef)(root));
                ((x10.lang.GlobalCell.$Closure$114<$T>)this).x = (($T)(x));
            }
        }
        
    }
    
}

