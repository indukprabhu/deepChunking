package x10.util;


@x10.runtime.impl.java.X10Generated
public class OptionsParser extends x10.core.Ref implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<OptionsParser> $RTT = 
        x10.rtt.NamedType.<OptionsParser> make("x10.util.OptionsParser",
                                               OptionsParser.class);
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.util.OptionsParser $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        $_obj.onTooFew = $deserializer.readObject();
        $_obj.onTooMany = $deserializer.readObject();
        $_obj.onDuplicate = $deserializer.readObject();
        $_obj.onMoreThanOne = $deserializer.readObject();
        $_obj.onUnknownKey = $deserializer.readObject();
        $_obj.options = $deserializer.readObject();
        $_obj.keyMap = $deserializer.readObject();
        $_obj.args = $deserializer.readObject();
        $_obj.properties = $deserializer.readObject();
        $_obj.tailStart = $deserializer.readInt();
        $_obj.required = $deserializer.readObject();
        $_obj.oneCharFlags = $deserializer.readObject();
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.util.OptionsParser $_obj = new x10.util.OptionsParser((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        $serializer.write(this.onTooFew);
        $serializer.write(this.onTooMany);
        $serializer.write(this.onDuplicate);
        $serializer.write(this.onMoreThanOne);
        $serializer.write(this.onUnknownKey);
        $serializer.write(this.options);
        $serializer.write(this.keyMap);
        $serializer.write(this.args);
        $serializer.write(this.properties);
        $serializer.write(this.tailStart);
        $serializer.write(this.required);
        $serializer.write(this.oneCharFlags);
        
    }
    
    // constructor just for allocation
    public OptionsParser(final java.lang.System[] $dummy) {
        
    }
    
    // synthetic type for parameter mangling
    public static final class __0$1x10$lang$String$2 {}
    // synthetic type for parameter mangling
    public static final class __0$1x10$lang$String$2__1$1x10$util$Option$2 {}
    // synthetic type for parameter mangling
    public static final class __0$1x10$lang$String$2__1$1x10$util$Option$2__2$1x10$util$Option$2 {}
    // synthetic type for parameter mangling
    public static final class __0$1x10$lang$String$2__1$1x10$util$Option$2__2$1x10$lang$Any$2 {}
    

    
    //#line 85 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
    @x10.runtime.impl.java.X10Generated
    final public static class Err extends java.lang.RuntimeException implements x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<Err> $RTT = 
            x10.rtt.NamedType.<Err> make("x10.util.OptionsParser.Err",
                                         Err.class,
                                         new x10.rtt.Type[] {
                                             x10.rtt.Types.EXCEPTION
                                         });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.util.OptionsParser.Err $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $deserializer.deserializeFieldsStartingFromClass(java.lang.RuntimeException.class, $_obj, 0);
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.util.OptionsParser.Err $_obj = new x10.util.OptionsParser.Err((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.serializeFieldsStartingFromClass(this, java.lang.RuntimeException.class);
            
        }
        
        // constructor just for allocation
        public Err(final java.lang.System[] $dummy) {
            
        }
        
        
    
        
        
        //#line 86 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        public Err(final java.lang.String m) {
            super(((java.lang.String)(m)));
             {
                
                //#line 86 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                
                
                //#line 85 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                this.__fieldInitializers_x10_util_OptionsParser_Err();
            }
        }
        
        
        
        //#line 85 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        final public x10.util.OptionsParser.Err x10$util$OptionsParser$Err$$this$x10$util$OptionsParser$Err() {
            
            //#line 85 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            return x10.util.OptionsParser.Err.this;
        }
        
        
        //#line 85 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        final public void __fieldInitializers_x10_util_OptionsParser_Err() {
            
        }
    }
    
    
    
    
    
    
    
    //#line 149 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
    /**
     * IGNORE and START_TAIL are the two things you can do when you hit an
     * unrecognized key that is not known to be in the tail.  Unknown key
     * handlers are assumed to return one of these two values.  IGNORE
     * means: don't assume this is part of the tail...keep looking for 
     * more keys.
     */
    final public static int IGNORE = 0;
    
    //#line 152 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
    /** assume that the tail begins at this key, if not before */
    final public static int START_TAIL = 1;
    
    
    //#line 172 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
    /**
     * this handles the event in which too few values are provided for a key.
     * It is a function of three arguments: the key itself, how many arguments
     * were expected, and how many were actually found.  Nota bene: we are 
     * talking about parsing the command line and not finding a value.  We
     * are NOT talking about asking, once the command line has been read,
     * what value, if any, was supplied for a given option.
     */
    public x10.core.fun.Fun_0_3<java.lang.String,x10.core.Int,x10.core.Int,x10.core.Rail<java.lang.String>> onTooFew;
    
    //#line 188 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
    /**
     * this handles the problem of what to do when too many values are provided
     * for a key.  The default action is just to use the number expected and
     * ignore the rest.  If you want different behavior, you need to supply a
     * function of three arguments: the key itself, how many arguments were
     * expected, and how many were actually found. It should return the number
     * to use.
     */
    public x10.core.fun.Fun_0_3<java.lang.String,x10.core.Int,x10.core.Int,x10.core.Int> onTooMany;
    
    //#line 196 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
    /**
     * this handles the problem of what to do when the same key (or the short
     * and long forms of the same key) appear multiple times in a single command.
     * The default is that the last wins.
     */
    public x10.core.fun.VoidFun_0_5<java.lang.String,x10.util.HashMap<java.lang.String, x10.core.Rail<java.lang.String>>,x10.core.Rail<java.lang.String>,x10.core.Int,x10.core.Int> onDuplicate;
    
    //#line 209 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
    /**
     * this handles the problem of what to do when the application asks for the
     * value of an option, expecting that exactly none or one value will be
     * provided.  The default is to throw an exception.  
     */
    public x10.core.fun.Fun_0_3<java.lang.String,java.lang.String,x10.core.Rail<java.lang.String>,java.lang.String> onMoreThanOne;
    
    //#line 219 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
    private static x10.core.fun.Fun_0_3<java.lang.String,java.lang.String,x10.core.Rail<java.lang.String>,java.lang.String> firstOnMoreThanOne;
    
    //#line 226 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
    private static x10.core.fun.Fun_0_3<java.lang.String,java.lang.String,x10.core.Rail<java.lang.String>,java.lang.String> lastOnMoreThanOne;
    
    //#line 238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
    /**
     * this handles the problem of what to do if an unexpected key is found while
     * parsing the command line.  The default action on reading an unrecognized
     * key is to add it as a flag and mark it as unexpected.  This means that
     * the tail will only be correctly recognized as such if either the unknown
     * key is not the last key, or the unexpected key really is a flag, or you
     * explicitly insert "--" to separate the tail.
     */
    public x10.core.fun.Fun_0_2<java.lang.String,x10.util.HashMap<java.lang.String, x10.util.Option>,x10.core.Int> onUnknownKey;
    
    //#line 254 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
    private static x10.core.fun.Fun_0_2<java.lang.String,x10.util.HashMap<java.lang.String, x10.util.Option>,x10.core.Int> startTailOnUnknownKey;
    
    
    //#line 257 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
    final public void setHandlers__0$1x10$lang$Any$2(final x10.core.Rail hndlrs) {
        
        //#line 259 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        final x10.core.Rail rail$140188 = ((x10.core.Rail)(hndlrs));
        
        //#line 259 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        final long i$140185max$140187 = ((x10.core.Rail<java.lang.Object>)rail$140188).size;
        
        //#line 259 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        long i$141328 = 0L;
        {
            
            //#line 259 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final java.lang.Object[] hndlrs$value$141656 = ((java.lang.Object[])hndlrs.value);
            
            //#line 259 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            for (;
                 true;
                 ) {
                
                //#line 259 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                final long t$141329 = i$141328;
                
                //#line 259 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                final boolean t$141330 = ((t$141329) < (((long)(i$140185max$140187))));
                
                //#line 259 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                if (!(t$141330)) {
                    
                    //#line 259 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                    break;
                }
                
                //#line 259 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                final long n$141325 = i$141328;
                
                //#line 260 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                final java.lang.Object hndlr$141314 = ((java.lang.Object)hndlrs$value$141656[(int)n$141325]);
                
                //#line 261 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                final boolean t$141315 = x10.core.fun.Fun_0_3.$RTT.isInstance(hndlr$141314, x10.rtt.Types.STRING, x10.rtt.Types.INT, x10.rtt.Types.INT, x10.rtt.Types.INT);
                
                //#line 261 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                if (t$141315) {
                    
                    //#line 261 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                    final x10.core.fun.Fun_0_3 t$141316 = ((x10.core.fun.Fun_0_3)(x10.rtt.Types.<x10.core.fun.Fun_0_3<java.lang.String,x10.core.Int,x10.core.Int,x10.core.Int>> cast(hndlr$141314,x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_3.$RTT,x10.rtt.Types.STRING,x10.rtt.Types.INT,x10.rtt.Types.INT,x10.rtt.Types.INT))));
                    
                    //#line 261 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                    this.onTooMany = ((x10.core.fun.Fun_0_3)(t$141316));
                } else {
                    
                    //#line 262 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                    final boolean t$141317 = x10.core.fun.Fun_0_3.$RTT.isInstance(hndlr$141314, x10.rtt.Types.STRING, x10.rtt.Types.INT, x10.rtt.Types.INT, x10.rtt.ParameterizedType.make(x10.core.Rail.$RTT, x10.rtt.Types.STRING));
                    
                    //#line 262 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                    if (t$141317) {
                        
                        //#line 262 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                        final x10.core.fun.Fun_0_3 t$141318 = ((x10.core.fun.Fun_0_3)(x10.rtt.Types.<x10.core.fun.Fun_0_3<java.lang.String,x10.core.Int,x10.core.Int,x10.core.Rail<java.lang.String>>> cast(hndlr$141314,x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_3.$RTT,x10.rtt.Types.STRING,x10.rtt.Types.INT,x10.rtt.Types.INT,x10.rtt.ParameterizedType.make(x10.core.Rail.$RTT, x10.rtt.Types.STRING)))));
                        
                        //#line 262 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                        this.onTooFew = ((x10.core.fun.Fun_0_3)(t$141318));
                    } else {
                        
                        //#line 263 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                        final boolean t$141319 = x10.core.fun.VoidFun_0_5.$RTT.isInstance(hndlr$141314, x10.rtt.Types.STRING, x10.rtt.ParameterizedType.make(x10.util.HashMap.$RTT, x10.rtt.Types.STRING, x10.rtt.ParameterizedType.make(x10.core.Rail.$RTT, x10.rtt.Types.STRING)), x10.rtt.ParameterizedType.make(x10.core.Rail.$RTT, x10.rtt.Types.STRING), x10.rtt.Types.INT, x10.rtt.Types.INT);
                        
                        //#line 263 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                        if (t$141319) {
                            
                            //#line 263 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                            final x10.core.fun.VoidFun_0_5 t$141320 = ((x10.core.fun.VoidFun_0_5)(x10.rtt.Types.<x10.core.fun.VoidFun_0_5<java.lang.String,x10.util.HashMap<java.lang.String, x10.core.Rail<java.lang.String>>,x10.core.Rail<java.lang.String>,x10.core.Int,x10.core.Int>> cast(hndlr$141314,x10.rtt.ParameterizedType.make(x10.core.fun.VoidFun_0_5.$RTT,x10.rtt.Types.STRING,x10.rtt.ParameterizedType.make(x10.util.HashMap.$RTT, x10.rtt.Types.STRING, x10.rtt.ParameterizedType.make(x10.core.Rail.$RTT, x10.rtt.Types.STRING)),x10.rtt.ParameterizedType.make(x10.core.Rail.$RTT, x10.rtt.Types.STRING),x10.rtt.Types.INT,x10.rtt.Types.INT))));
                            
                            //#line 263 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                            this.onDuplicate = ((x10.core.fun.VoidFun_0_5)(t$141320));
                        } else {
                            
                            //#line 264 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                            final boolean t$141321 = x10.core.fun.Fun_0_3.$RTT.isInstance(hndlr$141314, x10.rtt.Types.STRING, x10.rtt.Types.STRING, x10.rtt.ParameterizedType.make(x10.core.Rail.$RTT, x10.rtt.Types.STRING), x10.rtt.Types.STRING);
                            
                            //#line 264 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                            if (t$141321) {
                                
                                //#line 264 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                                final x10.core.fun.Fun_0_3 t$141322 = ((x10.core.fun.Fun_0_3)(x10.rtt.Types.<x10.core.fun.Fun_0_3<java.lang.String,java.lang.String,x10.core.Rail<java.lang.String>,java.lang.String>> cast(hndlr$141314,x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_3.$RTT,x10.rtt.Types.STRING,x10.rtt.Types.STRING,x10.rtt.ParameterizedType.make(x10.core.Rail.$RTT, x10.rtt.Types.STRING),x10.rtt.Types.STRING))));
                                
                                //#line 264 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                                this.onMoreThanOne = ((x10.core.fun.Fun_0_3)(t$141322));
                            } else {
                                
                                //#line 265 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                                final boolean t$141323 = x10.core.fun.Fun_0_2.$RTT.isInstance(hndlr$141314, x10.rtt.Types.STRING, x10.rtt.ParameterizedType.make(x10.util.HashMap.$RTT, x10.rtt.Types.STRING, x10.util.Option.$RTT), x10.rtt.Types.INT);
                                
                                //#line 265 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                                if (t$141323) {
                                    
                                    //#line 265 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                                    final x10.core.fun.Fun_0_2 t$141324 = ((x10.core.fun.Fun_0_2)(x10.rtt.Types.<x10.core.fun.Fun_0_2<java.lang.String,x10.util.HashMap<java.lang.String, x10.util.Option>,x10.core.Int>> cast(hndlr$141314,x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_2.$RTT,x10.rtt.Types.STRING,x10.rtt.ParameterizedType.make(x10.util.HashMap.$RTT, x10.rtt.Types.STRING, x10.util.Option.$RTT),x10.rtt.Types.INT))));
                                    
                                    //#line 265 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                                    this.onUnknownKey = ((x10.core.fun.Fun_0_2)(t$141324));
                                }
                            }
                        }
                    }
                }
                
                //#line 259 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                final long t$141326 = i$141328;
                
                //#line 259 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                final long t$141327 = ((t$141326) + (((long)(1L))));
                
                //#line 259 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                i$141328 = t$141327;
            }
        }
    }
    
    
    //#line 272 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
    public x10.core.Rail<x10.util.Option> options;
    
    //#line 273 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
    public x10.util.HashMap<java.lang.String, x10.util.Option> keyMap;
    
    //#line 274 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
    public x10.core.Rail<java.lang.String> args;
    
    //#line 275 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
    public x10.util.HashMap<java.lang.String, x10.core.Rail<java.lang.String>> properties;
    
    //#line 276 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
    public int tailStart;
    
    //#line 277 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
    public x10.util.HashSet<x10.util.Option> required;
    
    //#line 278 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
    public x10.util.HashSet<java.lang.String> oneCharFlags;
    
    
    //#line 291 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
    // creation method for java code (1-phase java constructor)
    public OptionsParser(final x10.core.Rail<java.lang.String> args, __0$1x10$lang$String$2 $dummy) {
        this((java.lang.System[]) null);
        x10$util$OptionsParser$$init$S(args, (x10.util.OptionsParser.__0$1x10$lang$String$2) null);
    }
    
    // constructor for non-virtual call
    final public x10.util.OptionsParser x10$util$OptionsParser$$init$S(final x10.core.Rail<java.lang.String> args, __0$1x10$lang$String$2 $dummy) {
         {
            
            //#line 291 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            
            
            //#line 80 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            this.__fieldInitializers_x10_util_OptionsParser();
            
            //#line 292 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final x10.core.Rail t$140778 = x10.util.OptionsParser.makeOptionArray__0$1x10$lang$String$2(((x10.core.Rail)(args)));
            
            //#line 292 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            this.parse__0$1x10$lang$String$2__1$1x10$util$Option$2(((x10.core.Rail)(args)), ((x10.core.Rail)(t$140778)));
        }
        return this;
    }
    
    
    
    //#line 294 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
    public static x10.core.Rail makeOptionArray__0$1x10$lang$String$2(final x10.core.Rail<java.lang.String> args) {
        
        //#line 295 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        final x10.util.RailBuilder builder = ((x10.util.RailBuilder)(new x10.util.RailBuilder<x10.util.Option>((java.lang.System[]) null, x10.util.Option.$RTT)));
        
        //#line 295 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        final long t$141367 = ((x10.core.Rail<java.lang.String>)args).size;
        
        //#line 295 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        builder.x10$util$RailBuilder$$init$S(((long)(t$141367)));
        
        //#line 296 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        final long t$140780 = ((x10.core.Rail<java.lang.String>)args).size;
        
        //#line 296 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        final long lastArg = ((t$140780) - (((long)(1L))));
        
        //#line 297 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        final long i$140204max$141368 = lastArg;
        
        //#line 297 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        long i$141362 = 0L;
        {
            
            //#line 297 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final java.lang.String[] args$value$141657 = ((java.lang.String[])args.value);
            
            //#line 297 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            for (;
                 true;
                 ) {
                
                //#line 297 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                final long t$141363 = i$141362;
                
                //#line 297 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                final boolean t$141364 = ((t$141363) <= (((long)(i$140204max$141368))));
                
                //#line 297 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                if (!(t$141364)) {
                    
                    //#line 297 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                    break;
                }
                
                //#line 297 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                L$141365: {
                    
                    //#line 297 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                    final long n$141366 = i$141362;
                    //#line 298 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                    java.lang.String argN$141331 = ((java.lang.String)args$value$141657[(int)n$141366]);
                    //#line 299 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                    final java.lang.String t$141332 = ((java.lang.String)(argN$141331));
                    //#line 299 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                    final char t$141333 = (t$141332).charAt(((int)(0)));
                    //#line 299 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                    final boolean t$141334 = ((char) t$141333) == ((char) '-');
                    //#line 299 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                    if (t$141334) {
                        
                        //#line 300 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                        final java.lang.String t$141335 = ((java.lang.String)(argN$141331));
                        
                        //#line 300 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                        final int t$141336 = (t$141335).length();
                        
                        //#line 300 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                        final long t$141337 = ((long)(((int)(t$141336))));
                        
                        //#line 300 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                        boolean t$141338 = ((t$141337) > (((long)(1L))));
                        
                        //#line 300 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                        if (t$141338) {
                            
                            //#line 300 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                            final java.lang.String t$141339 = ((java.lang.String)(argN$141331));
                            
                            //#line 300 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                            final char t$141340 = (t$141339).charAt(((int)(1)));
                            
                            //#line 300 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                            t$141338 = java.lang.Character.isDigit(t$141340);
                        }
                        
                        //#line 300 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                        final boolean t$141341 = t$141338;
                        
                        //#line 300 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                        if (t$141341) {
                            
                            //#line 300 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                            break L$141365;
                        } else {
                            
                            //#line 301 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                            final java.lang.String t$141342 = ((java.lang.String)(argN$141331));
                            
                            //#line 301 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                            final boolean t$141343 = (t$141342).equals("--");
                            
                            //#line 301 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                            if (t$141343) {
                                
                                //#line 301 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                                break;
                            }
                        }
                        
                        //#line 302 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                        final java.lang.String t$141344 = ((java.lang.String)(argN$141331));
                        
                        //#line 302 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                        final int firstEq$141345 = (t$141344).indexOf("=");
                        
                        //#line 303 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                        final boolean t$141346 = ((firstEq$141345) > (((int)(0))));
                        
                        //#line 303 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                        if (t$141346) {
                            
                            //#line 303 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                            final java.lang.String t$141347 = ((java.lang.String)(argN$141331));
                            
                            //#line 303 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                            final java.lang.String t$141348 = (t$141347).substring(((int)(0)), ((int)(firstEq$141345)));
                            
                            //#line 303 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                            argN$141331 = ((java.lang.String)(t$141348));
                        }
                        
                        //#line 304 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                        final java.lang.String t$141349 = ((java.lang.String)(argN$141331));
                        
                        //#line 304 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                        final char t$141350 = (t$141349).charAt(((int)(1)));
                        
                        //#line 304 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                        final boolean t$141351 = ((char) t$141350) == ((char) '-');
                        
                        //#line 304 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                        if (t$141351) {
                            
                            //#line 305 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                            final x10.util.Option alloc$141352 = new x10.util.Option((java.lang.System[]) null);
                            
                            //#line 119 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
                            final java.lang.String s$141353 = ((java.lang.String)(""));
                            
                            //#line 119 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
                            final java.lang.String l$141354 = ((java.lang.String)(argN$141331));
                            
                            //#line 119 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
                            final java.lang.String d$141355 = ((java.lang.String)("no description given"));
                            
                            //#line 120 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
                            alloc$141352.x10$util$Option$$init$S(((java.lang.String)(s$141353)), ((java.lang.String)(l$141354)), ((java.lang.String)(d$141355)), ((int)(0)), ((boolean)(true)), ((boolean)(false)), ((boolean)(false)));
                            
                            //#line 305 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                            ((x10.util.RailBuilder<x10.util.Option>)builder).add__0x10$util$RailBuilder$$T(((x10.util.Option)(alloc$141352)));
                        } else {
                            
                            //#line 307 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                            final x10.util.Option alloc$141356 = new x10.util.Option((java.lang.System[]) null);
                            
                            //#line 119 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
                            final java.lang.String s$141357 = ((java.lang.String)(argN$141331));
                            
                            //#line 119 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
                            final java.lang.String l$141358 = ((java.lang.String)(""));
                            
                            //#line 119 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
                            final java.lang.String d$141359 = ((java.lang.String)("no description given"));
                            
                            //#line 120 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
                            alloc$141356.x10$util$Option$$init$S(((java.lang.String)(s$141357)), ((java.lang.String)(l$141358)), ((java.lang.String)(d$141359)), ((int)(0)), ((boolean)(true)), ((boolean)(false)), ((boolean)(false)));
                            
                            //#line 307 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                            ((x10.util.RailBuilder<x10.util.Option>)builder).add__0x10$util$RailBuilder$$T(((x10.util.Option)(alloc$141356)));
                        }
                    }
                }
                
                //#line 297 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                final long t$141360 = i$141362;
                
                //#line 297 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                final long t$141361 = ((t$141360) + (((long)(1L))));
                
                //#line 297 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                i$141362 = t$141361;
            }
        }
        
        //#line 310 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        final x10.core.Rail t$140805 = ((x10.core.Rail<x10.util.Option>)
                                         ((x10.util.RailBuilder<x10.util.Option>)builder).result());
        
        //#line 310 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        return t$140805;
    }
    
    
    //#line 320 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
    // creation method for java code (1-phase java constructor)
    public OptionsParser(final x10.core.Rail<java.lang.String> args, final x10.core.Rail<x10.util.Option> options, __0$1x10$lang$String$2__1$1x10$util$Option$2 $dummy) {
        this((java.lang.System[]) null);
        x10$util$OptionsParser$$init$S(args, options, (x10.util.OptionsParser.__0$1x10$lang$String$2__1$1x10$util$Option$2) null);
    }
    
    // constructor for non-virtual call
    final public x10.util.OptionsParser x10$util$OptionsParser$$init$S(final x10.core.Rail<java.lang.String> args, final x10.core.Rail<x10.util.Option> options, __0$1x10$lang$String$2__1$1x10$util$Option$2 $dummy) {
         {
            
            //#line 320 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            
            
            //#line 80 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            this.__fieldInitializers_x10_util_OptionsParser();
            
            //#line 321 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final x10.core.Rail t$140806 = ((x10.core.Rail)(new x10.core.Rail<x10.util.Option>(x10.util.Option.$RTT, ((x10.core.Rail)(options)), (x10.core.Rail.__0$1x10$lang$Rail$$T$2) null)));
            
            //#line 321 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            this.parse__0$1x10$lang$String$2__1$1x10$util$Option$2(((x10.core.Rail)(args)), ((x10.core.Rail)(t$140806)));
        }
        return this;
    }
    
    
    
    //#line 340 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
    // creation method for java code (1-phase java constructor)
    public OptionsParser(final x10.core.Rail<java.lang.String> args, final x10.core.Rail<x10.util.Option> flags, final x10.core.Rail<x10.util.Option> others, __0$1x10$lang$String$2__1$1x10$util$Option$2__2$1x10$util$Option$2 $dummy) {
        this((java.lang.System[]) null);
        x10$util$OptionsParser$$init$S(args, flags, others, (x10.util.OptionsParser.__0$1x10$lang$String$2__1$1x10$util$Option$2__2$1x10$util$Option$2) null);
    }
    
    // constructor for non-virtual call
    final public x10.util.OptionsParser x10$util$OptionsParser$$init$S(final x10.core.Rail<java.lang.String> args, final x10.core.Rail<x10.util.Option> flags, final x10.core.Rail<x10.util.Option> others, __0$1x10$lang$String$2__1$1x10$util$Option$2__2$1x10$util$Option$2 $dummy) {
         {
            
            //#line 340 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            
            
            //#line 80 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            this.__fieldInitializers_x10_util_OptionsParser();
            
            //#line 341 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final x10.core.Rail t$140807 = x10.util.OptionsParser.merge__0$1x10$util$Option$2__1$1x10$util$Option$2(((x10.core.Rail)(flags)), ((x10.core.Rail)(others)));
            
            //#line 341 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            this.parse__0$1x10$lang$String$2__1$1x10$util$Option$2(((x10.core.Rail)(args)), ((x10.core.Rail)(t$140807)));
        }
        return this;
    }
    
    
    
    //#line 343 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
    public static x10.core.Rail merge__0$1x10$util$Option$2__1$1x10$util$Option$2(final x10.core.Rail<x10.util.Option> flags, final x10.core.Rail<x10.util.Option> parms) {
        
        //#line 344 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        final x10.util.RailBuilder builder = ((x10.util.RailBuilder)(new x10.util.RailBuilder<x10.util.Option>((java.lang.System[]) null, x10.util.Option.$RTT)));
        
        //#line 344 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        final long t$141385 = ((x10.core.Rail<x10.util.Option>)flags).size;
        
        //#line 344 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        final long t$141386 = ((x10.core.Rail<x10.util.Option>)parms).size;
        
        //#line 344 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        final long t$141387 = ((t$141385) + (((long)(t$141386))));
        
        //#line 344 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        builder.x10$util$RailBuilder$$init$S(t$141387);
        
        //#line 345 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        final x10.core.Rail rail$141388 = ((x10.core.Rail)(flags));
        
        //#line 345 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        final long i$140222max$141389 = ((x10.core.Rail<x10.util.Option>)rail$141388).size;
        
        //#line 345 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        long i$141374 = 0L;
        {
            
            //#line 345 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final x10.util.Option[] flags$value$141658 = ((x10.util.Option[])flags.value);
            
            //#line 345 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            for (;
                 true;
                 ) {
                
                //#line 345 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                final long t$141375 = i$141374;
                
                //#line 345 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                final boolean t$141376 = ((t$141375) < (((long)(i$140222max$141389))));
                
                //#line 345 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                if (!(t$141376)) {
                    
                    //#line 345 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                    break;
                }
                
                //#line 345 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                final long m$141371 = i$141374;
                
                //#line 345 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                final x10.util.Option t$141369 = ((x10.util.Option)flags$value$141658[(int)m$141371]);
                
                //#line 345 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                final x10.util.Option t$141370 = t$141369.asFlag();
                
                //#line 345 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                ((x10.util.RailBuilder<x10.util.Option>)builder).add__0x10$util$RailBuilder$$T(((x10.util.Option)(t$141370)));
                
                //#line 345 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                final long t$141372 = i$141374;
                
                //#line 345 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                final long t$141373 = ((t$141372) + (((long)(1L))));
                
                //#line 345 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                i$141374 = t$141373;
            }
        }
        
        //#line 346 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        final x10.core.Rail rail$141390 = ((x10.core.Rail)(parms));
        
        //#line 346 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        final long i$140241max$141391 = ((x10.core.Rail<x10.util.Option>)rail$141390).size;
        
        //#line 346 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        long i$141382 = 0L;
        {
            
            //#line 346 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final x10.util.Option[] parms$value$141659 = ((x10.util.Option[])parms.value);
            
            //#line 346 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            for (;
                 true;
                 ) {
                
                //#line 346 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                final long t$141383 = i$141382;
                
                //#line 346 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                final boolean t$141384 = ((t$141383) < (((long)(i$140241max$141391))));
                
                //#line 346 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                if (!(t$141384)) {
                    
                    //#line 346 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                    break;
                }
                
                //#line 346 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                final long n$141379 = i$141382;
                
                //#line 346 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                final x10.util.Option t$141377 = ((x10.util.Option)parms$value$141659[(int)n$141379]);
                
                //#line 346 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                final x10.util.Option t$141378 = t$141377.asSimpleParm();
                
                //#line 346 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                ((x10.util.RailBuilder<x10.util.Option>)builder).add__0x10$util$RailBuilder$$T(((x10.util.Option)(t$141378)));
                
                //#line 346 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                final long t$141380 = i$141382;
                
                //#line 346 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                final long t$141381 = ((t$141380) + (((long)(1L))));
                
                //#line 346 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                i$141382 = t$141381;
            }
        }
        
        //#line 347 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        final x10.core.Rail t$140825 = ((x10.core.Rail<x10.util.Option>)
                                         ((x10.util.RailBuilder<x10.util.Option>)builder).result());
        
        //#line 347 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        return t$140825;
    }
    
    
    //#line 370 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
    // creation method for java code (1-phase java constructor)
    public OptionsParser(final x10.core.Rail<java.lang.String> args, final x10.core.Rail<x10.util.Option> options, final x10.core.Rail<java.lang.Object> handlers, __0$1x10$lang$String$2__1$1x10$util$Option$2__2$1x10$lang$Any$2 $dummy) {
        this((java.lang.System[]) null);
        x10$util$OptionsParser$$init$S(args, options, handlers, (x10.util.OptionsParser.__0$1x10$lang$String$2__1$1x10$util$Option$2__2$1x10$lang$Any$2) null);
    }
    
    // constructor for non-virtual call
    final public x10.util.OptionsParser x10$util$OptionsParser$$init$S(final x10.core.Rail<java.lang.String> args, final x10.core.Rail<x10.util.Option> options, final x10.core.Rail<java.lang.Object> handlers, __0$1x10$lang$String$2__1$1x10$util$Option$2__2$1x10$lang$Any$2 $dummy) {
         {
            
            //#line 370 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            
            
            //#line 80 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            this.__fieldInitializers_x10_util_OptionsParser();
            
            //#line 371 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            this.setHandlers__0$1x10$lang$Any$2(((x10.core.Rail)(handlers)));
            
            //#line 372 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final x10.core.Rail t$140826 = ((x10.core.Rail)(new x10.core.Rail<x10.util.Option>(x10.util.Option.$RTT, ((x10.core.Rail)(options)), (x10.core.Rail.__0$1x10$lang$Rail$$T$2) null)));
            
            //#line 372 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            this.parse__0$1x10$lang$String$2__1$1x10$util$Option$2(((x10.core.Rail)(args)), ((x10.core.Rail)(t$140826)));
        }
        return this;
    }
    
    
    
    //#line 378 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
    private void parse__0$1x10$lang$String$2__1$1x10$util$Option$2(final x10.core.Rail args, final x10.core.Rail options) {
        
        //#line 380 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        final x10.util.HashMap t$140827 = ((x10.util.HashMap)(properties));
        
        //#line 380 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        final boolean t$140829 = ((t$140827) != (null));
        
        //#line 380 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        if (t$140829) {
            
            //#line 381 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final x10.io.Printer t$140828 = ((x10.io.Printer)(x10.io.Console.get$ERR()));
            
            //#line 381 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            t$140828.println(((java.lang.Object)("Command line already parsed!")));
            
            //#line 382 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            return;
        }
        
        //#line 384 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        this.options = ((x10.core.Rail)(options));
        
        //#line 385 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        this.initializeKeyMap__0$1x10$util$Option$2(((x10.core.Rail)(options)));
        
        //#line 386 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        final x10.core.Rail keyIndex = this.makeKeyIndex__0$1x10$lang$String$2__1$1x10$util$Option$2(((x10.core.Rail)(args)), ((x10.core.Rail)(options)));
        
        //#line 387 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        final x10.util.HashMap props = ((x10.util.HashMap)(new x10.util.HashMap<java.lang.String, x10.core.Rail<java.lang.String>>((java.lang.System[]) null, x10.rtt.Types.STRING, x10.rtt.ParameterizedType.make(x10.core.Rail.$RTT, x10.rtt.Types.STRING))));
        
        //#line 387 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        props.x10$util$HashMap$$init$S();
        
        //#line 388 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        x10.core.Rail keyInArgs = keyIndex;
        
        //#line 389 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        int newTailStart = 0;
        
        //#line 390 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        final x10.core.Rail t$140830 = ((x10.core.Rail)(keyInArgs));
        
        //#line 390 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        final long t$140831 = ((x10.core.Rail<x10.core.Int>)t$140830).size;
        
        //#line 390 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        final int t$140832 = ((int)(long)(((long)(t$140831))));
        
        //#line 390 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        int lastIndex = ((t$140832) - (((int)(2))));
        
        //#line 391 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        this.properties = ((x10.util.HashMap)(props));
        
        //#line 392 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        int k$141477 = 0;
        
        //#line 392 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        for (;
             true;
             ) {
            
            //#line 392 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final int t$141478 = k$141477;
            
            //#line 392 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final int t$141479 = lastIndex;
            
            //#line 392 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final boolean t$141480 = ((t$141478) <= (((int)(t$141479))));
            
            //#line 392 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            if (!(t$141480)) {
                
                //#line 392 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                break;
            }
            
            //#line 393 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final x10.core.Rail t$141392 = ((x10.core.Rail)(this.args));
            
            //#line 393 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final x10.core.Rail t$141393 = ((x10.core.Rail)(keyInArgs));
            
            //#line 393 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final int t$141394 = k$141477;
            
            //#line 393 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final long t$141395 = ((long)(((int)(t$141394))));
            
            //#line 393 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final int t$141396 = ((int[])t$141393.value)[(int)t$141395];
            
            //#line 393 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final long t$141397 = ((long)(((int)(t$141396))));
            
            //#line 393 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final java.lang.String key$141398 = ((java.lang.String[])t$141392.value)[(int)t$141397];
            
            //#line 394 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final x10.util.HashMap t$141399 = ((x10.util.HashMap)(keyMap));
            
            //#line 394 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final x10.util.Option t$141400 = ((x10.util.Option)(x10.util.Option.get$BAD()));
            
            //#line 394 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final x10.util.Option option$141401 = ((x10.util.HashMap<java.lang.String, x10.util.Option>)t$141399).getOrElse__0x10$util$HashMap$$K__1x10$util$HashMap$$V$G(((java.lang.String)(key$141398)), ((x10.util.Option)(t$141400)));
            
            //#line 395 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final x10.util.Option t$141402 = ((x10.util.Option)(x10.util.Option.get$BAD()));
            
            //#line 395 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final boolean t$141403 = x10.rtt.Equality.equalsequals((option$141401),(t$141402));
            
            //#line 395 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            if (t$141403) {
                
                //#line 395 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                break;
            }
            
            //#line 396 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final x10.core.Rail t$141404 = ((x10.core.Rail)(keyInArgs));
            
            //#line 396 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final int t$141405 = k$141477;
            
            //#line 396 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final long t$141406 = ((long)(((int)(t$141405))));
            
            //#line 396 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final int t$141407 = ((int[])t$141404.value)[(int)t$141406];
            
            //#line 396 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final int first$141408 = ((t$141407) + (((int)(1))));
            
            //#line 397 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final x10.core.Rail t$141409 = ((x10.core.Rail)(keyInArgs));
            
            //#line 397 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final int t$141410 = k$141477;
            
            //#line 397 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final int t$141411 = ((t$141410) + (((int)(1))));
            
            //#line 397 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final long t$141412 = ((long)(((int)(t$141411))));
            
            //#line 397 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final int t$141413 = ((int[])t$141409.value)[(int)t$141412];
            
            //#line 397 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            int valueCount$141414 = ((t$141413) - (((int)(first$141408))));
            
            //#line 398 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final int expected$141415 = option$141401.minFollow;
            
            //#line 399 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            x10.core.Rail values$141416 = null;
            
            //#line 400 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final int t$141417 = valueCount$141414;
            
            //#line 400 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final boolean t$141418 = ((expected$141415) > (((int)(t$141417))));
            
            //#line 400 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            if (t$141418) {
                
                //#line 401 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                final x10.core.fun.Fun_0_3 t$141419 = ((x10.core.fun.Fun_0_3)(onTooFew));
                
                //#line 401 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                final int t$141420 = valueCount$141414;
                
                //#line 401 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                final x10.core.Rail t$141421 = ((x10.core.Rail<java.lang.String>)
                                                 ((x10.core.fun.Fun_0_3<java.lang.String,x10.core.Int,x10.core.Int,x10.core.Rail<java.lang.String>>)t$141419).$apply(key$141398, x10.rtt.Types.STRING, x10.core.Int.$box(expected$141415), x10.rtt.Types.INT, x10.core.Int.$box(t$141420), x10.rtt.Types.INT));
                
                //#line 401 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                values$141416 = ((x10.core.Rail)(t$141421));
            } else {
                
                //#line 403 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                final int t$141422 = valueCount$141414;
                
                //#line 403 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                final boolean t$141423 = ((expected$141415) < (((int)(t$141422))));
                
                //#line 403 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                if (t$141423) {
                    
                    //#line 404 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                    final boolean t$141424 = option$141401.arbFollow;
                    
                    //#line 404 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                    final boolean t$141425 = !(t$141424);
                    
                    //#line 404 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                    if (t$141425) {
                        
                        //#line 405 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                        final x10.core.fun.Fun_0_3 t$141426 = ((x10.core.fun.Fun_0_3)(onTooMany));
                        
                        //#line 405 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                        final int t$141427 = valueCount$141414;
                        
                        //#line 405 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                        final int t$141428 = x10.core.Int.$unbox(((x10.core.fun.Fun_0_3<java.lang.String,x10.core.Int,x10.core.Int,x10.core.Int>)t$141426).$apply(key$141398, x10.rtt.Types.STRING, x10.core.Int.$box(expected$141415), x10.rtt.Types.INT, x10.core.Int.$box(t$141427), x10.rtt.Types.INT));
                        
                        //#line 405 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                        valueCount$141414 = t$141428;
                        
                        //#line 406 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                        final int t$141429 = valueCount$141414;
                        
                        //#line 406 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                        final int newTail$141430 = ((first$141408) + (((int)(t$141429))));
                        
                        //#line 407 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                        final int t$141431 = k$141477;
                        
                        //#line 407 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                        final int thisK$141432 = lastIndex = t$141431;
                        
                        //#line 409 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                        final int t$141433 = k$141477;
                        
                        //#line 409 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                        final int t$141434 = ((t$141433) + (((int)(2))));
                        
                        //#line 409 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                        final long t$141435 = ((long)(((int)(t$141434))));
                        
                        //#line 408 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                        final x10.core.fun.Fun_0_1 t$141436 = ((x10.core.fun.Fun_0_1)(new x10.util.OptionsParser.$Closure$294(thisK$141432, keyIndex, newTail$141430, (x10.util.OptionsParser.$Closure$294.__1$1x10$lang$Int$2) null)));
                        
                        //#line 409 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                        final x10.core.Rail t$141442 = ((x10.core.Rail)(new x10.core.Rail<x10.core.Int>(x10.rtt.Types.INT, t$141435, ((x10.core.fun.Fun_0_1)(t$141436)), (x10.core.Rail.__1$1x10$lang$Long$3x10$lang$Rail$$T$2) null)));
                        
                        //#line 409 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                        keyInArgs = ((x10.core.Rail)(t$141442));
                    }
                }
            }
            
            //#line 415 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final int t$141443 = valueCount$141414;
            
            //#line 415 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final int t$141444 = ((first$141408) + (((int)(t$141443))));
            
            //#line 415 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            newTailStart = t$141444;
            
            //#line 416 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final x10.util.HashMap t$141445 = ((x10.util.HashMap)(properties));
            
            //#line 416 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final boolean t$141446 = ((x10.util.HashMap<java.lang.String, x10.core.Rail<java.lang.String>>)t$141445).containsKey__0x10$util$HashMap$$K$O(((java.lang.String)(key$141398)));
            
            //#line 416 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            if (t$141446) {
                
                //#line 417 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                final int t$141447 = valueCount$141414;
                
                //#line 417 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                final boolean t$141448 = ((t$141447) > (((int)(0))));
                
                //#line 417 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                if (t$141448) {
                    
                    //#line 418 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                    final x10.core.fun.VoidFun_0_5 t$141449 = ((x10.core.fun.VoidFun_0_5)(onDuplicate));
                    
                    //#line 418 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                    final x10.core.Rail t$141450 = ((x10.core.Rail)(this.args));
                    
                    //#line 418 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                    final int t$141451 = valueCount$141414;
                    
                    //#line 418 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                    ((x10.core.fun.VoidFun_0_5<java.lang.String,x10.util.HashMap<java.lang.String, x10.core.Rail<java.lang.String>>,x10.core.Rail<java.lang.String>,x10.core.Int,x10.core.Int>)t$141449).$apply(key$141398, x10.rtt.Types.STRING, props, x10.rtt.ParameterizedType.make(x10.util.HashMap.$RTT, x10.rtt.Types.STRING, x10.rtt.ParameterizedType.make(x10.core.Rail.$RTT, x10.rtt.Types.STRING)), t$141450, x10.rtt.ParameterizedType.make(x10.core.Rail.$RTT, x10.rtt.Types.STRING), x10.core.Int.$box(first$141408), x10.rtt.Types.INT, x10.core.Int.$box(t$141451), x10.rtt.Types.INT);
                }
            } else {
                
                //#line 422 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                final x10.core.Rail whatToPut$141452;
                
                //#line 423 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                final int t$141453 = valueCount$141414;
                
                //#line 423 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                final boolean t$141454 = ((int) t$141453) == ((int) 0);
                
                //#line 423 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                if (t$141454) {
                    
                    //#line 424 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                    final boolean t$141455 = option$141401.arbFollow;
                    
                    //#line 424 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                    if (t$141455) {
                        
                        //#line 425 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                        final x10.core.Rail t$141456 = ((x10.core.Rail)(new x10.core.Rail<java.lang.String>(x10.rtt.Types.STRING)));
                        
                        //#line 425 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                        whatToPut$141452 = ((x10.core.Rail)(t$141456));
                    } else {
                        
                        //#line 427 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                        final x10.core.Rail t$141457 = ((x10.core.Rail)(new x10.core.Rail<java.lang.String>(x10.rtt.Types.STRING, ((long)(1L)), ((java.lang.String)("true")), (x10.core.Rail.__1x10$lang$Rail$$T) null)));
                        
                        //#line 427 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                        whatToPut$141452 = ((x10.core.Rail)(t$141457));
                    }
                } else {
                    
                    //#line 429 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                    final x10.core.Rail t$141458 = ((x10.core.Rail)(values$141416));
                    
                    //#line 429 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                    final boolean t$141459 = ((t$141458) != (null));
                    
                    //#line 429 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                    if (t$141459) {
                        
                        //#line 429 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                        final x10.core.Rail t$141460 = ((x10.core.Rail)(values$141416));
                        
                        //#line 429 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                        whatToPut$141452 = ((x10.core.Rail)(t$141460));
                    } else {
                        
                        //#line 431 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                        final x10.core.Rail thisArgs$141461 = ((x10.core.Rail)(this.args));
                        
                        //#line 433 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                        final int t$141462 = valueCount$141414;
                        
                        //#line 433 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                        final long t$141463 = ((long)(((int)(t$141462))));
                        
                        //#line 432 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                        final x10.core.fun.Fun_0_1 t$141464 = ((x10.core.fun.Fun_0_1)(new x10.util.OptionsParser.$Closure$295(first$141408, thisArgs$141461, (x10.util.OptionsParser.$Closure$295.__1$1x10$lang$String$2) null)));
                        
                        //#line 433 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                        final x10.core.Rail t$141469 = ((x10.core.Rail)(new x10.core.Rail<java.lang.String>(x10.rtt.Types.STRING, t$141463, ((x10.core.fun.Fun_0_1)(t$141464)), (x10.core.Rail.__1$1x10$lang$Long$3x10$lang$Rail$$T$2) null)));
                        
                        //#line 433 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                        whatToPut$141452 = ((x10.core.Rail)(t$141469));
                    }
                }
                
                //#line 435 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                final x10.util.HashMap t$141470 = ((x10.util.HashMap)(properties));
                
                //#line 435 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                ((x10.util.HashMap<java.lang.String, x10.core.Rail<java.lang.String>>)t$141470).put__0x10$util$HashMap$$K__1x10$util$HashMap$$V(((java.lang.String)(key$141398)), ((x10.core.Rail)(whatToPut$141452)));
                
                //#line 436 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                final java.lang.String otherForm$141471 = option$141401.otherForm(((java.lang.String)(key$141398)));
                
                //#line 437 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                final int t$141472 = (otherForm$141471).length();
                
                //#line 437 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                final boolean t$141473 = ((t$141472) > (((int)(0))));
                
                //#line 437 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                if (t$141473) {
                    
                    //#line 437 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                    final x10.util.HashMap t$141474 = ((x10.util.HashMap)(properties));
                    
                    //#line 437 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                    ((x10.util.HashMap<java.lang.String, x10.core.Rail<java.lang.String>>)t$141474).put__0x10$util$HashMap$$K__1x10$util$HashMap$$V(((java.lang.String)(otherForm$141471)), ((x10.core.Rail)(whatToPut$141452)));
                }
            }
            
            //#line 392 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final int t$141475 = k$141477;
            
            //#line 392 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final int t$141476 = ((t$141475) + (((int)(1))));
            
            //#line 392 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            k$141477 = t$141476;
        }
        
        //#line 440 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        final x10.core.Rail t$140911 = ((x10.core.Rail)(keyInArgs));
        
        //#line 440 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        final x10.core.Rail t$140909 = ((x10.core.Rail)(keyInArgs));
        
        //#line 440 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        final long t$140910 = ((x10.core.Rail<x10.core.Int>)t$140909).size;
        
        //#line 440 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        final long t$140912 = ((t$140910) - (((long)(1L))));
        
        //#line 440 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        final int t$140913 = newTailStart;
        
        //#line 440 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        final int t$140914 = x10.core.Int.$unbox(((int[])t$140911.value)[(int)t$140912] = t$140913);
        
        //#line 440 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        this.tailStart = t$140914;
    }
    
    public static void parse$P__0$1x10$lang$String$2__1$1x10$util$Option$2(final x10.core.Rail<java.lang.String> args, final x10.core.Rail<x10.util.Option> options, final x10.util.OptionsParser OptionsParser) {
        OptionsParser.parse__0$1x10$lang$String$2__1$1x10$util$Option$2(((x10.core.Rail)(args)), ((x10.core.Rail)(options)));
    }
    
    
    //#line 443 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
    private void initializeKeyMap__0$1x10$util$Option$2(final x10.core.Rail options) {
        
        //#line 445 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        final x10.util.HashMap km = ((x10.util.HashMap)(new x10.util.HashMap<java.lang.String, x10.util.Option>((java.lang.System[]) null, x10.rtt.Types.STRING, x10.util.Option.$RTT)));
        
        //#line 445 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        final long t$141506 = ((x10.core.Rail<x10.util.Option>)options).size;
        
        //#line 445 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        final long t$141507 = ((t$141506) * (((long)(2L))));
        
        //#line 445 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        final int t$141508 = ((int)(long)(((long)(t$141507))));
        
        //#line 445 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        final long t$141509 = ((long)(((int)(t$141508))));
        
        //#line 445 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        km.x10$util$HashMap$$init$S(t$141509);
        
        //#line 446 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        final x10.util.HashSet req = ((x10.util.HashSet)(new x10.util.HashSet<x10.util.Option>((java.lang.System[]) null, x10.util.Option.$RTT)));
        
        //#line 446 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        final long t$141510 = ((x10.core.Rail<x10.util.Option>)options).size;
        
        //#line 446 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        final int t$141511 = ((int)(long)(((long)(t$141510))));
        
        //#line 446 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        req.x10$util$HashSet$$init$S(t$141511);
        
        //#line 447 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        final x10.util.HashSet ocf = ((x10.util.HashSet)(new x10.util.HashSet<java.lang.String>((java.lang.System[]) null, x10.rtt.Types.STRING)));
        
        //#line 447 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        final long t$141512 = ((x10.core.Rail<x10.util.Option>)options).size;
        
        //#line 447 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        final int t$141513 = ((int)(long)(((long)(t$141512))));
        
        //#line 447 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        ocf.x10$util$HashSet$$init$S(t$141513);
        
        //#line 448 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        final x10.core.Rail rail$141514 = ((x10.core.Rail)(options));
        
        //#line 448 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        final long i$140260max$141515 = ((x10.core.Rail<x10.util.Option>)rail$141514).size;
        
        //#line 448 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        long i$141503 = 0L;
        {
            
            //#line 448 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final x10.util.Option[] options$value$141660 = ((x10.util.Option[])options.value);
            
            //#line 448 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            for (;
                 true;
                 ) {
                
                //#line 448 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                final long t$141504 = i$141503;
                
                //#line 448 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                final boolean t$141505 = ((t$141504) < (((long)(i$140260max$141515))));
                
                //#line 448 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                if (!(t$141505)) {
                    
                    //#line 448 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                    break;
                }
                
                //#line 448 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                final long ox$141500 = i$141503;
                
                //#line 449 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                final x10.util.Option o$141481 = ((x10.util.Option)options$value$141660[(int)ox$141500]);
                
                //#line 450 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                final java.lang.String t$141482 = ((java.lang.String)(o$141481.shortForm));
                
                //#line 450 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                final int t$141483 = (t$141482).length();
                
                //#line 450 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                final long t$141484 = ((long)(((int)(t$141483))));
                
                //#line 450 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                final boolean t$141485 = ((t$141484) > (((long)(0L))));
                
                //#line 450 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                if (t$141485) {
                    
                    //#line 451 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                    final java.lang.String t$141486 = ((java.lang.String)(o$141481.shortForm));
                    
                    //#line 451 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                    ((x10.util.HashMap<java.lang.String, x10.util.Option>)km).put__0x10$util$HashMap$$K__1x10$util$HashMap$$V(((java.lang.String)(t$141486)), ((x10.util.Option)(o$141481)));
                    
                    //#line 452 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                    final java.lang.String t$141487 = ((java.lang.String)(o$141481.shortForm));
                    
                    //#line 452 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                    final int t$141488 = (t$141487).length();
                    
                    //#line 452 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                    boolean t$141489 = ((int) t$141488) == ((int) 2);
                    
                    //#line 452 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                    if (t$141489) {
                        
                        //#line 452 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                        final int t$141490 = o$141481.minFollow;
                        
                        //#line 452 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                        t$141489 = ((int) t$141490) == ((int) 0);
                    }
                    
                    //#line 452 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                    boolean t$141491 = t$141489;
                    
                    //#line 452 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                    if (t$141491) {
                        
                        //#line 452 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                        final boolean t$141492 = o$141481.arbFollow;
                        
                        //#line 452 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                        t$141491 = !(t$141492);
                    }
                    
                    //#line 452 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                    final boolean t$141493 = t$141491;
                    
                    //#line 452 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                    if (t$141493) {
                        
                        //#line 453 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                        final java.lang.String t$141494 = ((java.lang.String)(o$141481.shortForm));
                        
                        //#line 453 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                        ((x10.util.MapSet<java.lang.String>)ocf).add__0x10$util$MapSet$$T$O(((java.lang.String)(t$141494)));
                    }
                }
                
                //#line 456 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                final java.lang.String t$141495 = ((java.lang.String)(o$141481.longForm));
                
                //#line 456 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                final int t$141496 = (t$141495).length();
                
                //#line 456 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                final boolean t$141497 = ((t$141496) > (((int)(0))));
                
                //#line 456 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                if (t$141497) {
                    
                    //#line 456 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                    final java.lang.String t$141498 = ((java.lang.String)(o$141481.longForm));
                    
                    //#line 456 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                    ((x10.util.HashMap<java.lang.String, x10.util.Option>)km).put__0x10$util$HashMap$$K__1x10$util$HashMap$$V(((java.lang.String)(t$141498)), ((x10.util.Option)(o$141481)));
                }
                
                //#line 457 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                final boolean t$141499 = o$141481.required;
                
                //#line 457 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                if (t$141499) {
                    
                    //#line 457 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                    ((x10.util.MapSet<x10.util.Option>)req).add__0x10$util$MapSet$$T$O(((x10.util.Option)(o$141481)));
                }
                
                //#line 448 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                final long t$141501 = i$141503;
                
                //#line 448 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                final long t$141502 = ((t$141501) + (((long)(1L))));
                
                //#line 448 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                i$141503 = t$141502;
            }
        }
        
        //#line 459 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        this.keyMap = ((x10.util.HashMap)(km));
        
        //#line 460 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        this.required = ((x10.util.HashSet)(req));
        
        //#line 461 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        this.oneCharFlags = ((x10.util.HashSet)(ocf));
    }
    
    public static void initializeKeyMap$P__0$1x10$util$Option$2(final x10.core.Rail<x10.util.Option> options, final x10.util.OptionsParser OptionsParser) {
        OptionsParser.initializeKeyMap__0$1x10$util$Option$2(((x10.core.Rail)(options)));
    }
    
    
    //#line 470 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
    private x10.core.Rail makeKeyIndex__0$1x10$lang$String$2__1$1x10$util$Option$2(final x10.core.Rail args, final x10.core.Rail options) {
        
        //#line 472 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        final x10.util.RailBuilder keyIndex = ((x10.util.RailBuilder)(new x10.util.RailBuilder<x10.core.Int>((java.lang.System[]) null, x10.rtt.Types.INT)));
        
        //#line 472 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        final long t$141551 = ((x10.core.Rail<java.lang.String>)args).size;
        
        //#line 472 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        keyIndex.x10$util$RailBuilder$$init$S(((long)(t$141551)));
        
        //#line 473 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        int keyCount = 0;
        
        //#line 474 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        boolean helpOnly = false;
        
        //#line 475 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        final x10.core.Rail expanded = this.expandArgs__0$1x10$lang$String$2(((x10.core.Rail)(args)));
        
        //#line 476 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        final long t$140947 = ((x10.core.Rail<java.lang.String>)expanded).size;
        
        //#line 476 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        int tailStart = ((int)(long)(((long)(t$140947))));
        
        //#line 477 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        final long t$140948 = ((x10.core.Rail<java.lang.String>)expanded).size;
        
        //#line 477 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        final int t$140949 = ((int)(long)(((long)(t$140948))));
        
        //#line 477 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        final int lastArg = ((t$140949) - (((int)(1))));
        
        //#line 478 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        final x10.util.HashSet t$140950 = ((x10.util.HashSet)(required));
        
        //#line 478 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        final x10.util.HashSet reqNotSeen = ((x10.util.HashSet<x10.util.Option>)
                                              ((x10.util.HashSet<x10.util.Option>)t$140950).clone());
        
        //#line 479 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        final int i$140279max$141552 = lastArg;
        
        //#line 479 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        int i$141542 = 0;
        {
            
            //#line 479 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final java.lang.String[] expanded$value$141661 = ((java.lang.String[])expanded.value);
            
            //#line 479 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            for (;
                 true;
                 ) {
                
                //#line 479 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                final int t$141543 = i$141542;
                
                //#line 479 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                final boolean t$141544 = ((t$141543) <= (((int)(i$140279max$141552))));
                
                //#line 479 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                if (!(t$141544)) {
                    
                    //#line 479 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                    break;
                }
                
                //#line 479 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                L$141545: {
                    
                    //#line 479 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                    final int i$141546 = i$141542;
                    //#line 480 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                    final long t$141516 = ((long)(((int)(i$141546))));
                    //#line 480 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                    final java.lang.String s$141517 = ((java.lang.String)expanded$value$141661[(int)t$141516]);
                    //#line 481 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                    final int t$141518 = (s$141517).length();
                    //#line 481 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                    boolean t$141519 = ((t$141518) > (((int)(0))));
                    //#line 481 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                    if (t$141519) {
                        
                        //#line 481 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                        final char t$141520 = (s$141517).charAt(((int)(0)));
                        
                        //#line 481 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                        t$141519 = ((char) t$141520) == ((char) '-');
                    }
                    //#line 481 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                    final boolean t$141521 = t$141519;
                    //#line 481 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                    if (t$141521) {
                        
                        //#line 482 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                        final int t$141522 = (s$141517).length();
                        
                        //#line 482 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                        final long t$141523 = ((long)(((int)(t$141522))));
                        
                        //#line 482 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                        boolean t$141524 = ((t$141523) > (((long)(1L))));
                        
                        //#line 482 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                        if (t$141524) {
                            
                            //#line 482 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                            final char t$141525 = (s$141517).charAt(((int)(1)));
                            
                            //#line 482 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                            t$141524 = java.lang.Character.isDigit(t$141525);
                        }
                        
                        //#line 482 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                        final boolean t$141526 = t$141524;
                        
                        //#line 482 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                        if (t$141526) {
                            
                            //#line 482 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                            break L$141545;
                        } else {
                            
                            //#line 483 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                            final x10.util.HashMap t$141527 = ((x10.util.HashMap)(keyMap));
                            
                            //#line 483 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                            final boolean t$141528 = ((x10.util.HashMap<java.lang.String, x10.util.Option>)t$141527).containsKey__0x10$util$HashMap$$K$O(((java.lang.String)(s$141517)));
                            
                            //#line 483 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                            if (t$141528) {
                                
                                //#line 484 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                                ((x10.util.RailBuilder<x10.core.Int>)keyIndex).add__0x10$util$RailBuilder$$T(x10.core.Int.$box(i$141546));
                                
                                //#line 485 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                                final x10.util.HashMap t$141529 = ((x10.util.HashMap)(keyMap));
                                
                                //#line 485 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                                final x10.util.Option t$141530 = ((x10.util.Option)(x10.util.Option.get$BAD()));
                                
                                //#line 485 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                                final x10.util.Option optForS$141531 = ((x10.util.HashMap<java.lang.String, x10.util.Option>)t$141529).getOrElse__0x10$util$HashMap$$K__1x10$util$HashMap$$V$G(((java.lang.String)(s$141517)), ((x10.util.Option)(t$141530)));
                                
                                //#line 486 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                                final boolean t$141532 = optForS$141531.required;
                                
                                //#line 486 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                                if (t$141532) {
                                    
                                    //#line 486 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                                    ((x10.util.MapSet<x10.util.Option>)reqNotSeen).remove__0x10$util$MapSet$$T$O(((x10.util.Option)(optForS$141531)));
                                } else {
                                    
                                    //#line 487 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                                    final x10.util.Option t$141533 = ((x10.util.Option)(x10.util.Option.get$HELP()));
                                    
                                    //#line 487 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                                    final boolean t$141534 = x10.rtt.Equality.equalsequals((optForS$141531),(t$141533));
                                    
                                    //#line 487 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                                    if (t$141534) {
                                        
                                        //#line 488 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                                        helpOnly = true;
                                    }
                                }
                            } else {
                                
                                //#line 491 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                                boolean t$141535 = (s$141517).equals("--");
                                
                                //#line 491 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                                if (!(t$141535)) {
                                    
                                    //#line 491 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                                    final x10.core.fun.Fun_0_2 t$141536 = ((x10.core.fun.Fun_0_2)(onUnknownKey));
                                    
                                    //#line 491 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                                    final x10.util.HashMap t$141537 = ((x10.util.HashMap)(keyMap));
                                    
                                    //#line 491 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                                    final int t$141538 = x10.core.Int.$unbox(((x10.core.fun.Fun_0_2<java.lang.String,x10.util.HashMap<java.lang.String, x10.util.Option>,x10.core.Int>)t$141536).$apply(s$141517, x10.rtt.Types.STRING, t$141537, x10.rtt.ParameterizedType.make(x10.util.HashMap.$RTT, x10.rtt.Types.STRING, x10.util.Option.$RTT)));
                                    
                                    //#line 491 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                                    t$141535 = ((int) t$141538) == ((int) 1);
                                }
                                
                                //#line 491 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                                final boolean t$141539 = t$141535;
                                
                                //#line 491 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                                if (t$141539) {
                                    
                                    //#line 492 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                                    tailStart = i$141546;
                                    
                                    //#line 492 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                                    break;
                                } else {
                                    
                                    //#line 494 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                                    ((x10.util.RailBuilder<x10.core.Int>)keyIndex).add__0x10$util$RailBuilder$$T(x10.core.Int.$box(i$141546));
                                }
                            }
                        }
                    }
                }
                
                //#line 479 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                final int t$141540 = i$141542;
                
                //#line 479 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                final int t$141541 = ((t$141540) + (((int)(1))));
                
                //#line 479 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                i$141542 = t$141541;
            }
        }
        
        //#line 497 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        final int t$140978 = tailStart;
        
        //#line 497 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        ((x10.util.RailBuilder<x10.core.Int>)keyIndex).add__0x10$util$RailBuilder$$T(x10.core.Int.$box(t$140978));
        
        //#line 498 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        final long howManyMissing = ((x10.util.MapSet<x10.util.Option>)reqNotSeen).size$O();
        
        //#line 499 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        boolean t$140979 = helpOnly;
        
        //#line 499 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        if (!(t$140979)) {
            
            //#line 499 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            t$140979 = ((long) howManyMissing) == ((long) 0L);
        }
        
        //#line 499 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        final boolean t$140989 = t$140979;
        
        //#line 499 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        if (t$140989) {
            
            //#line 500 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            this.args = ((x10.core.Rail)(expanded));
            
            //#line 501 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final x10.core.Rail t$140980 = ((x10.core.Rail<x10.core.Int>)
                                             ((x10.util.RailBuilder<x10.core.Int>)keyIndex).result());
            
            //#line 501 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            return t$140980;
        } else {
            
            //#line 504 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final x10.util.StringBuilder sb = ((x10.util.StringBuilder)(new x10.util.StringBuilder((java.lang.System[]) null)));
            
            //#line 504 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            sb.x10$util$StringBuilder$$init$S();
            
            //#line 505 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            sb.add(((java.lang.String)("The following ")));
            
            //#line 506 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final boolean t$140982 = ((long) howManyMissing) == ((long) 1L);
            
            //#line 506 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            if (t$140982) {
                
                //#line 506 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                sb.add(((java.lang.String)("option is missing:\n\t")));
            } else {
                
                //#line 507 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                final java.lang.String t$140981 = (((x10.core.Long.$box(howManyMissing))) + (" options are missing\n\t"));
                
                //#line 507 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                sb.add(((java.lang.String)(t$140981)));
            }
            
            //#line 508 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final x10.lang.Iterator o$141549 = ((x10.lang.Iterator<x10.util.Option>)
                                                 ((x10.util.MapSet<x10.util.Option>)reqNotSeen).iterator());
            
            //#line 508 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            for (;
                 true;
                 ) {
                
                //#line 508 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                final boolean t$141550 = ((x10.lang.Iterator<x10.util.Option>)o$141549).hasNext$O();
                
                //#line 508 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                if (!(t$141550)) {
                    
                    //#line 508 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                    break;
                }
                
                //#line 508 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                final x10.util.Option o$141547 = ((x10.util.Option)(((x10.lang.Iterator<x10.util.Option>)o$141549).next$G()));
                
                //#line 509 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                final java.lang.String t$141548 = o$141547.usage();
                
                //#line 509 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                sb.add(((java.lang.String)(t$141548)));
                
                //#line 510 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                sb.add(((java.lang.String)("\n\t")));
            }
            
            //#line 512 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final java.lang.String t$140986 = sb.result();
            
            //#line 512 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final java.lang.String t$140987 = ((t$140986) + ("\n"));
            
            //#line 512 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final x10.util.OptionsParser.Err t$140988 = ((x10.util.OptionsParser.Err)(new x10.util.OptionsParser.Err(t$140987)));
            
            //#line 512 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            throw t$140988;
        }
    }
    
    public static x10.core.Rail makeKeyIndex$P__0$1x10$lang$String$2__1$1x10$util$Option$2(final x10.core.Rail<java.lang.String> args, final x10.core.Rail<x10.util.Option> options, final x10.util.OptionsParser OptionsParser) {
        return OptionsParser.makeKeyIndex__0$1x10$lang$String$2__1$1x10$util$Option$2(((x10.core.Rail)(args)), ((x10.core.Rail)(options)));
    }
    
    
    //#line 521 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
    private x10.core.Rail expandArgs__0$1x10$lang$String$2(final x10.core.Rail args) {
        
        //#line 523 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        final x10.util.RailBuilder builder = ((x10.util.RailBuilder)(new x10.util.RailBuilder<java.lang.String>((java.lang.System[]) null, x10.rtt.Types.STRING)));
        
        //#line 523 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        final long t$141618 = ((x10.core.Rail<java.lang.String>)args).size;
        
        //#line 523 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        final long t$141619 = ((2L) * (((long)(t$141618))));
        
        //#line 523 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        final long t$141620 = java.lang.Math.min(((long)(8L)),((long)(t$141619)));
        
        //#line 523 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        builder.x10$util$RailBuilder$$init$S(t$141620);
        
        //#line 524 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        boolean inTail = false;
        
        //#line 525 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        final x10.core.Rail rail$141621 = ((x10.core.Rail)(args));
        
        //#line 525 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        final long i$140337max$141622 = ((x10.core.Rail<java.lang.String>)rail$141621).size;
        
        //#line 525 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        long i$141615 = 0L;
        {
            
            //#line 525 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final java.lang.String[] args$value$141664 = ((java.lang.String[])args.value);
            
            //#line 525 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            for (;
                 true;
                 ) {
                
                //#line 525 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                final long t$141616 = i$141615;
                
                //#line 525 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                final boolean t$141617 = ((t$141616) < (((long)(i$140337max$141622))));
                
                //#line 525 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                if (!(t$141617)) {
                    
                    //#line 525 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                    break;
                }
                
                //#line 525 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                final long n$141612 = i$141615;
                
                //#line 526 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                final java.lang.String argN$141572 = ((java.lang.String)args$value$141664[(int)n$141612]);
                
                //#line 527 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                final int t$141573 = (argN$141572).length();
                
                //#line 527 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                boolean t$141574 = ((int) t$141573) == ((int) 0);
                
                //#line 527 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                if (!(t$141574)) {
                    
                    //#line 527 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                    final char t$141575 = (argN$141572).charAt(((int)(0)));
                    
                    //#line 527 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                    t$141574 = ((char) t$141575) != ((char) '-');
                }
                
                //#line 527 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                boolean t$141576 = t$141574;
                
                //#line 527 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                if (!(t$141576)) {
                    
                    //#line 527 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                    t$141576 = inTail;
                }
                
                //#line 527 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                final boolean t$141577 = t$141576;
                
                //#line 527 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                if (t$141577) {
                    
                    //#line 527 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                    ((x10.util.RailBuilder<java.lang.String>)builder).add__0x10$util$RailBuilder$$T(((java.lang.String)(argN$141572)));
                } else {
                    
                    //#line 528 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                    final boolean t$141578 = (argN$141572).equals("--");
                    
                    //#line 528 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                    if (t$141578) {
                        
                        //#line 528 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                        inTail = true;
                        
                        //#line 528 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                        ((x10.util.RailBuilder<java.lang.String>)builder).add__0x10$util$RailBuilder$$T(((java.lang.String)(argN$141572)));
                    } else {
                        
                        //#line 529 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                        final int t$141579 = (argN$141572).length();
                        
                        //#line 529 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                        final boolean t$141580 = ((t$141579) < (((int)(2))));
                        
                        //#line 529 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                        if (t$141580) {
                            
                            //#line 529 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                            ((x10.util.RailBuilder<java.lang.String>)builder).add__0x10$util$RailBuilder$$T(((java.lang.String)(argN$141572)));
                        } else {
                            
                            //#line 530 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                            final char t$141581 = (argN$141572).charAt(((int)(1)));
                            
                            //#line 530 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                            final boolean t$141582 = java.lang.Character.isDigit(t$141581);
                            
                            //#line 530 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                            if (t$141582) {
                                
                                //#line 530 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                                ((x10.util.RailBuilder<java.lang.String>)builder).add__0x10$util$RailBuilder$$T(((java.lang.String)(argN$141572)));
                            } else {
                                
                                //#line 531 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                                final x10.util.HashMap t$141583 = ((x10.util.HashMap)(keyMap));
                                
                                //#line 531 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                                final boolean t$141584 = ((x10.util.HashMap<java.lang.String, x10.util.Option>)t$141583).containsKey__0x10$util$HashMap$$K$O(((java.lang.String)(argN$141572)));
                                
                                //#line 531 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                                if (t$141584) {
                                    
                                    //#line 531 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                                    ((x10.util.RailBuilder<java.lang.String>)builder).add__0x10$util$RailBuilder$$T(((java.lang.String)(argN$141572)));
                                } else {
                                    
                                    //#line 533 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                                    boolean isFlags$141585 = true;
                                    
                                    //#line 534 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                                    final int t$141586 = (argN$141572).length();
                                    
                                    //#line 534 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                                    final int count$141587 = ((t$141586) - (((int)(1))));
                                    
                                    //#line 535 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                                    final long t$141588 = ((long)(((int)(count$141587))));
                                    
                                    //#line 535 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                                    final x10.core.fun.Fun_0_1 t$141589 = ((x10.core.fun.Fun_0_1)(new x10.util.OptionsParser.$Closure$296(argN$141572)));
                                    
                                    //#line 535 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                                    final x10.core.Rail exploded$141595 = ((x10.core.Rail)(new x10.core.Rail<java.lang.String>(x10.rtt.Types.STRING, t$141588, ((x10.core.fun.Fun_0_1)(t$141589)), (x10.core.Rail.__1$1x10$lang$Long$3x10$lang$Rail$$T$2) null)));
                                    
                                    //#line 536 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                                    final x10.core.Rail rail$141570 = ((x10.core.Rail)(exploded$141595));
                                    
                                    //#line 536 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                                    final long i$140299max$141571 = ((x10.core.Rail<java.lang.String>)rail$141570).size;
                                    
                                    //#line 536 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                                    long i$141560 = 0L;
                                    {
                                        
                                        //#line 536 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                                        final java.lang.String[] exploded$141595$value$141662 = ((java.lang.String[])exploded$141595.value);
                                        
                                        //#line 536 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                                        for (;
                                             true;
                                             ) {
                                            
                                            //#line 536 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                                            final long t$141561 = i$141560;
                                            
                                            //#line 536 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                                            final boolean t$141562 = ((t$141561) < (((long)(i$140299max$141571))));
                                            
                                            //#line 536 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                                            if (!(t$141562)) {
                                                
                                                //#line 536 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                                                break;
                                            }
                                            
                                            //#line 536 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                                            final long k$141557 = i$141560;
                                            
                                            //#line 537 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                                            final x10.util.HashSet t$141553 = ((x10.util.HashSet)(oneCharFlags));
                                            
                                            //#line 537 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                                            final java.lang.String t$141554 = ((java.lang.String)exploded$141595$value$141662[(int)k$141557]);
                                            
                                            //#line 537 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                                            final boolean t$141555 = ((x10.util.MapSet<java.lang.String>)t$141553).contains__0x10$util$MapSet$$T$O(((java.lang.String)(t$141554)));
                                            
                                            //#line 537 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                                            final boolean t$141556 = !(t$141555);
                                            
                                            //#line 537 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                                            if (t$141556) {
                                                
                                                //#line 538 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                                                isFlags$141585 = false;
                                                
                                                //#line 538 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                                                break;
                                            }
                                            
                                            //#line 536 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                                            final long t$141558 = i$141560;
                                            
                                            //#line 536 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                                            final long t$141559 = ((t$141558) + (((long)(1L))));
                                            
                                            //#line 536 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                                            i$141560 = t$141559;
                                        }
                                    }
                                    
                                    //#line 541 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                                    final boolean t$141596 = isFlags$141585;
                                    
                                    //#line 541 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                                    if (t$141596) {
                                        
                                        //#line 541 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                                        final x10.core.Rail rail$141597 = ((x10.core.Rail)(exploded$141595));
                                        
                                        //#line 541 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                                        final long i$140318max$141598 = ((x10.core.Rail<java.lang.String>)rail$141597).size;
                                        
                                        //#line 541 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                                        long i$141567 = 0L;
                                        {
                                            
                                            //#line 541 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                                            final java.lang.String[] exploded$141595$value$141663 = ((java.lang.String[])exploded$141595.value);
                                            
                                            //#line 541 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                                            for (;
                                                 true;
                                                 ) {
                                                
                                                //#line 541 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                                                final long t$141568 = i$141567;
                                                
                                                //#line 541 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                                                final boolean t$141569 = ((t$141568) < (((long)(i$140318max$141598))));
                                                
                                                //#line 541 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                                                if (!(t$141569)) {
                                                    
                                                    //#line 541 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                                                    break;
                                                }
                                                
                                                //#line 541 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                                                final long k$141564 = i$141567;
                                                
                                                //#line 541 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                                                final java.lang.String t$141563 = ((java.lang.String)exploded$141595$value$141663[(int)k$141564]);
                                                
                                                //#line 541 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                                                ((x10.util.RailBuilder<java.lang.String>)builder).add__0x10$util$RailBuilder$$T(((java.lang.String)(t$141563)));
                                                
                                                //#line 541 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                                                final long t$141565 = i$141567;
                                                
                                                //#line 541 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                                                final long t$141566 = ((t$141565) + (((long)(1L))));
                                                
                                                //#line 541 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                                                i$141567 = t$141566;
                                            }
                                        }
                                    } else {
                                        
                                        //#line 543 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                                        final int firstEq$141599 = (argN$141572).indexOf("=");
                                        
                                        //#line 544 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                                        boolean t$141600 = ((firstEq$141599) > (((int)(0))));
                                        
                                        //#line 544 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                                        if (t$141600) {
                                            
                                            //#line 544 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                                            final x10.util.HashMap t$141601 = ((x10.util.HashMap)(keyMap));
                                            
                                            //#line 544 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                                            final java.lang.String t$141602 = (argN$141572).substring(((int)(0)), ((int)(firstEq$141599)));
                                            
                                            //#line 544 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                                            t$141600 = ((x10.util.HashMap<java.lang.String, x10.util.Option>)t$141601).containsKey__0x10$util$HashMap$$K$O(((java.lang.String)(t$141602)));
                                        }
                                        
                                        //#line 544 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                                        final boolean t$141603 = t$141600;
                                        
                                        //#line 544 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                                        if (t$141603) {
                                            
                                            //#line 545 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                                            final java.lang.String t$141604 = (argN$141572).substring(((int)(0)), ((int)(firstEq$141599)));
                                            
                                            //#line 545 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                                            ((x10.util.RailBuilder<java.lang.String>)builder).add__0x10$util$RailBuilder$$T(((java.lang.String)(t$141604)));
                                            
                                            //#line 546 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                                            final int t$141605 = ((firstEq$141599) + (((int)(1))));
                                            
                                            //#line 546 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                                            final java.lang.String t$141606 = (argN$141572).substring(((int)(t$141605)));
                                            
                                            //#line 546 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                                            ((x10.util.RailBuilder<java.lang.String>)builder).add__0x10$util$RailBuilder$$T(((java.lang.String)(t$141606)));
                                        } else {
                                            
                                            //#line 549 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                                            ((x10.util.RailBuilder<java.lang.String>)builder).add__0x10$util$RailBuilder$$T(((java.lang.String)(argN$141572)));
                                            
                                            //#line 550 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                                            try {{
                                                
                                                //#line 551 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                                                final x10.core.fun.Fun_0_2 t$141607 = ((x10.core.fun.Fun_0_2)(onUnknownKey));
                                                
                                                //#line 551 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                                                final x10.util.HashMap t$141608 = ((x10.util.HashMap)(keyMap));
                                                
                                                //#line 551 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                                                final int where$141609 = x10.core.Int.$unbox(((x10.core.fun.Fun_0_2<java.lang.String,x10.util.HashMap<java.lang.String, x10.util.Option>,x10.core.Int>)t$141607).$apply(argN$141572, x10.rtt.Types.STRING, t$141608, x10.rtt.ParameterizedType.make(x10.util.HashMap.$RTT, x10.rtt.Types.STRING, x10.util.Option.$RTT)));
                                                
                                                //#line 552 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                                                final boolean t$141610 = ((int) where$141609) == ((int) 1);
                                                
                                                //#line 552 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                                                if (t$141610) {
                                                    
                                                    //#line 552 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                                                    inTail = true;
                                                }
                                            }}catch (final x10.util.OptionsParser.Err e$141611) {
                                                
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                
                //#line 525 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                final long t$141613 = i$141615;
                
                //#line 525 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                final long t$141614 = ((t$141613) + (((long)(1L))));
                
                //#line 525 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                i$141615 = t$141614;
            }
        }
        
        //#line 559 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        final x10.core.Rail t$141043 = ((x10.core.Rail<java.lang.String>)
                                         ((x10.util.RailBuilder<java.lang.String>)builder).result());
        
        //#line 559 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        final x10.core.Rail t$141044 = ((x10.core.Rail)(this.args = ((x10.core.Rail)(t$141043))));
        
        //#line 559 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        return t$141044;
    }
    
    public static x10.core.Rail expandArgs$P__0$1x10$lang$String$2(final x10.core.Rail<java.lang.String> args, final x10.util.OptionsParser OptionsParser) {
        return OptionsParser.expandArgs__0$1x10$lang$String$2(((x10.core.Rail)(args)));
    }
    
    
    //#line 569 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
    public x10.core.Rail getTail() {
        
        //#line 570 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        final int t$141045 = tailStart;
        
        //#line 570 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        final long t$141047 = ((long)(((int)(t$141045))));
        
        //#line 570 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        final x10.core.Rail t$141046 = ((x10.core.Rail)(args));
        
        //#line 570 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        final long t$141048 = ((x10.core.Rail<java.lang.String>)t$141046).size;
        
        //#line 570 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        final boolean t$141050 = ((t$141047) >= (((long)(t$141048))));
        
        //#line 570 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        if (t$141050) {
            
            //#line 570 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final x10.core.Rail t$141049 = ((x10.core.Rail)(new x10.core.Rail<java.lang.String>(x10.rtt.Types.STRING, ((long)(0L)), ((java.lang.String)("")), (x10.core.Rail.__1x10$lang$Rail$$T) null)));
            
            //#line 570 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            return t$141049;
        }
        
        //#line 571 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        final x10.core.Rail t$141052 = ((x10.core.Rail)(args));
        
        //#line 571 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        final int t$141051 = tailStart;
        
        //#line 571 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        final long t$141053 = ((long)(((int)(t$141051))));
        
        //#line 571 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        final java.lang.String t$141054 = ((java.lang.String[])t$141052.value)[(int)t$141053];
        
        //#line 571 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        final boolean t$141056 = (t$141054).equals("--");
        
        //#line 571 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        int t$141057 =  0;
        
        //#line 571 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        if (t$141056) {
            
            //#line 571 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final int t$141055 = tailStart;
            
            //#line 571 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            t$141057 = ((t$141055) + (((int)(1))));
        } else {
            
            //#line 571 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            t$141057 = tailStart;
        }
        
        //#line 571 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        final int first = t$141057;
        
        //#line 573 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        final x10.core.Rail t$141058 = ((x10.core.Rail)(args));
        
        //#line 573 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        final long t$141059 = ((x10.core.Rail<java.lang.String>)t$141058).size;
        
        //#line 573 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        final long t$141060 = ((long)(((int)(first))));
        
        //#line 573 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        final long t$141065 = ((t$141059) - (((long)(t$141060))));
        
        //#line 572 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        final x10.core.fun.Fun_0_1 t$141066 = ((x10.core.fun.Fun_0_1)(new x10.util.OptionsParser.$Closure$297(this, first)));
        
        //#line 573 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        final x10.core.Rail t$141067 = ((x10.core.Rail)(new x10.core.Rail<java.lang.String>(x10.rtt.Types.STRING, t$141065, ((x10.core.fun.Fun_0_1)(t$141066)), (x10.core.Rail.__1$1x10$lang$Long$3x10$lang$Rail$$T$2) null)));
        
        //#line 573 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        return t$141067;
    }
    
    
    //#line 580 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
    public boolean hasTail$O() {
        
        //#line 580 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        final int t$141068 = tailStart;
        
        //#line 580 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        final long t$141070 = ((long)(((int)(t$141068))));
        
        //#line 580 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        final x10.core.Rail t$141069 = ((x10.core.Rail)(args));
        
        //#line 580 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        final long t$141071 = ((x10.core.Rail<java.lang.String>)t$141069).size;
        
        //#line 580 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        final boolean t$141072 = ((t$141070) < (((long)(t$141071))));
        
        //#line 580 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        return t$141072;
    }
    
    
    //#line 611 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
    final public x10.core.Rail get(final java.lang.String key) {
        
        //#line 613 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        java.lang.String winner = key;
        
        //#line 614 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        boolean isValid = true;
        
        //#line 615 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        final char t$141073 = (key).charAt(((int)(0)));
        
        //#line 615 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        final boolean t$141093 = ((char) t$141073) == ((char) '-');
        
        //#line 615 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        if (t$141093) {
            
            //#line 616 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final x10.util.HashMap t$141074 = ((x10.util.HashMap)(keyMap));
            
            //#line 616 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final x10.util.Option t$141075 = ((x10.util.Option)(x10.util.Option.get$BAD()));
            
            //#line 616 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final x10.util.Option t$141076 = ((x10.util.HashMap<java.lang.String, x10.util.Option>)t$141074).getOrElse__0x10$util$HashMap$$K__1x10$util$HashMap$$V$G(((java.lang.String)(key)), ((x10.util.Option)(t$141075)));
            
            //#line 616 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final x10.util.Option t$141077 = ((x10.util.Option)(x10.util.Option.get$BAD()));
            
            //#line 616 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final boolean t$141078 = x10.rtt.Equality.equalsequals((t$141076),(t$141077));
            
            //#line 616 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            if (t$141078) {
                
                //#line 616 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                isValid = false;
            }
        } else {
            
            //#line 619 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final java.lang.String t$141079 = (("-") + (key));
            
            //#line 619 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            winner = ((java.lang.String)(t$141079));
            
            //#line 620 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final x10.util.HashMap t$141080 = ((x10.util.HashMap)(keyMap));
            
            //#line 620 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final java.lang.String t$141081 = ((java.lang.String)(winner));
            
            //#line 620 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final x10.util.Option t$141082 = ((x10.util.Option)(x10.util.Option.get$BAD()));
            
            //#line 620 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final x10.util.Option t$141083 = ((x10.util.HashMap<java.lang.String, x10.util.Option>)t$141080).getOrElse__0x10$util$HashMap$$K__1x10$util$HashMap$$V$G(((java.lang.String)(t$141081)), ((x10.util.Option)(t$141082)));
            
            //#line 620 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final x10.util.Option t$141084 = ((x10.util.Option)(x10.util.Option.get$BAD()));
            
            //#line 620 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final boolean t$141092 = x10.rtt.Equality.equalsequals((t$141083),(t$141084));
            
            //#line 620 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            if (t$141092) {
                
                //#line 621 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                final java.lang.String t$141085 = (("--") + (key));
                
                //#line 621 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                winner = ((java.lang.String)(t$141085));
                
                //#line 622 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                final x10.util.HashMap t$141086 = ((x10.util.HashMap)(keyMap));
                
                //#line 622 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                final java.lang.String t$141087 = ((java.lang.String)(winner));
                
                //#line 622 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                final x10.util.Option t$141088 = ((x10.util.Option)(x10.util.Option.get$BAD()));
                
                //#line 622 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                final x10.util.Option t$141089 = ((x10.util.HashMap<java.lang.String, x10.util.Option>)t$141086).getOrElse__0x10$util$HashMap$$K__1x10$util$HashMap$$V$G(((java.lang.String)(t$141087)), ((x10.util.Option)(t$141088)));
                
                //#line 622 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                final x10.util.Option t$141090 = ((x10.util.Option)(x10.util.Option.get$BAD()));
                
                //#line 622 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                final boolean t$141091 = x10.rtt.Equality.equalsequals((t$141089),(t$141090));
                
                //#line 622 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                if (t$141091) {
                    
                    //#line 622 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                    isValid = false;
                }
            }
        }
        
        //#line 625 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        final boolean t$141100 = isValid;
        
        //#line 625 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        if (t$141100) {
            
            //#line 625 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final x10.util.HashMap t$141094 = ((x10.util.HashMap)(properties));
            
            //#line 625 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final java.lang.String t$141095 = ((java.lang.String)(winner));
            
            //#line 625 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final x10.core.Rail t$141096 = ((x10.core.Rail)(new x10.core.Rail<java.lang.String>(x10.rtt.Types.STRING, ((long)(0L)))));
            
            //#line 625 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final x10.core.Rail t$141097 = ((x10.util.HashMap<java.lang.String, x10.core.Rail<java.lang.String>>)t$141094).getOrElse__0x10$util$HashMap$$K__1x10$util$HashMap$$V$G(((java.lang.String)(t$141095)), ((x10.core.Rail)(t$141096)));
            
            //#line 625 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            return t$141097;
        } else {
            
            //#line 627 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final x10.core.fun.Fun_0_2 t$141098 = ((x10.core.fun.Fun_0_2)(onUnknownKey));
            
            //#line 627 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final x10.util.HashMap t$141099 = ((x10.util.HashMap)(keyMap));
            
            //#line 627 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            ((x10.core.fun.Fun_0_2<java.lang.String,x10.util.HashMap<java.lang.String, x10.util.Option>,x10.core.Int>)t$141098).$apply(key, x10.rtt.Types.STRING, t$141099, x10.rtt.ParameterizedType.make(x10.util.HashMap.$RTT, x10.rtt.Types.STRING, x10.util.Option.$RTT));
            
            //#line 628 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            return null;
        }
    }
    
    
    //#line 635 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
    final public x10.core.Rail getOrElse__1$1x10$lang$String$2(java.lang.String key, final x10.core.Rail orElse) {
        
        //#line 637 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        final java.lang.String t$141101 = ((java.lang.String)(key));
        
        //#line 637 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        final x10.core.Rail found = this.get(((java.lang.String)(t$141101)));
        
        //#line 638 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        boolean t$141103 = ((found) == (null));
        
        //#line 638 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        if (!(t$141103)) {
            
            //#line 638 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final long t$141102 = ((x10.core.Rail<java.lang.String>)found).size;
            
            //#line 638 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            t$141103 = ((long) t$141102) == ((long) 0L);
        }
        
        //#line 638 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        final boolean t$141104 = t$141103;
        
        //#line 638 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        x10.core.Rail t$141105 =  null;
        
        //#line 638 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        if (t$141104) {
            
            //#line 638 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            t$141105 = orElse;
        } else {
            
            //#line 638 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            t$141105 = found;
        }
        
        //#line 638 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        final x10.core.Rail t$141106 = t$141105;
        
        //#line 638 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        return t$141106;
    }
    
    
    //#line 647 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
    public java.lang.Object howManyValues(final java.lang.String key) {
        
        //#line 648 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        final x10.core.Rail values = this.get(((java.lang.String)(key)));
        
        //#line 649 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        final boolean t$141108 = ((values) == (null));
        
        //#line 649 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        java.lang.Object t$141109 =  null;
        
        //#line 649 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        if (t$141108) {
            
            //#line 649 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            t$141109 = ((java.lang.Object)((x10.core.Long.$box(-1L))));
        } else {
            
            //#line 649 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final long t$141107 = ((x10.core.Rail<java.lang.String>)values).size;
            
            //#line 649 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            t$141109 = ((java.lang.Object)((x10.core.Int.$box(((int)(long)(((long)(t$141107))))))));
        }
        
        //#line 649 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        final java.lang.Object t$141110 = t$141109;
        
        //#line 649 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        return t$141110;
    }
    
    
    //#line 657 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
    final public boolean $apply$O(final java.lang.String key) {
        
        //#line 658 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        final char t$141111 = (key).charAt(((int)(0)));
        
        //#line 658 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        final boolean t$141135 = ((char) t$141111) == ((char) '-');
        
        //#line 658 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        if (t$141135) {
            
            //#line 659 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final x10.util.HashMap t$141112 = ((x10.util.HashMap)(keyMap));
            
            //#line 659 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final x10.util.Option t$141113 = ((x10.util.Option)(x10.util.Option.get$BAD()));
            
            //#line 659 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final x10.util.Option t$141114 = ((x10.util.HashMap<java.lang.String, x10.util.Option>)t$141112).getOrElse__0x10$util$HashMap$$K__1x10$util$HashMap$$V$G(((java.lang.String)(key)), ((x10.util.Option)(t$141113)));
            
            //#line 659 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final x10.util.Option t$141115 = ((x10.util.Option)(x10.util.Option.get$BAD()));
            
            //#line 659 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final boolean t$141118 = x10.rtt.Equality.equalsequals((t$141114),(t$141115));
            
            //#line 659 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            if (t$141118) {
                
                //#line 659 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                return false;
            } else {
                
                //#line 660 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                final x10.util.HashMap t$141116 = ((x10.util.HashMap)(properties));
                
                //#line 660 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                final boolean t$141117 = ((x10.util.HashMap<java.lang.String, x10.core.Rail<java.lang.String>>)t$141116).containsKey__0x10$util$HashMap$$K$O(((java.lang.String)(key)));
                
                //#line 660 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                return t$141117;
            }
        } else {
            
            //#line 663 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            java.lang.String winner = (("-") + (key));
            
            //#line 664 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final x10.util.HashMap t$141119 = ((x10.util.HashMap)(keyMap));
            
            //#line 664 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final java.lang.String t$141120 = ((java.lang.String)(winner));
            
            //#line 664 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final x10.util.Option t$141121 = ((x10.util.Option)(x10.util.Option.get$BAD()));
            
            //#line 664 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final x10.util.Option t$141122 = ((x10.util.HashMap<java.lang.String, x10.util.Option>)t$141119).getOrElse__0x10$util$HashMap$$K__1x10$util$HashMap$$V$G(((java.lang.String)(t$141120)), ((x10.util.Option)(t$141121)));
            
            //#line 664 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final x10.util.Option t$141123 = ((x10.util.Option)(x10.util.Option.get$BAD()));
            
            //#line 664 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final boolean t$141131 = x10.rtt.Equality.equalsequals((t$141122),(t$141123));
            
            //#line 664 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            if (t$141131) {
                
                //#line 665 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                final java.lang.String t$141124 = (("--") + (key));
                
                //#line 665 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                winner = ((java.lang.String)(t$141124));
                
                //#line 666 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                final x10.util.HashMap t$141125 = ((x10.util.HashMap)(keyMap));
                
                //#line 666 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                final java.lang.String t$141126 = ((java.lang.String)(winner));
                
                //#line 666 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                final x10.util.Option t$141127 = ((x10.util.Option)(x10.util.Option.get$BAD()));
                
                //#line 666 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                final x10.util.Option t$141128 = ((x10.util.HashMap<java.lang.String, x10.util.Option>)t$141125).getOrElse__0x10$util$HashMap$$K__1x10$util$HashMap$$V$G(((java.lang.String)(t$141126)), ((x10.util.Option)(t$141127)));
                
                //#line 666 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                final x10.util.Option t$141129 = ((x10.util.Option)(x10.util.Option.get$BAD()));
                
                //#line 666 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                final boolean t$141130 = x10.rtt.Equality.equalsequals((t$141128),(t$141129));
                
                //#line 666 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                if (t$141130) {
                    
                    //#line 666 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                    return false;
                }
            }
            
            //#line 668 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final x10.util.HashMap t$141132 = ((x10.util.HashMap)(properties));
            
            //#line 668 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final java.lang.String t$141133 = ((java.lang.String)(winner));
            
            //#line 668 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final boolean t$141134 = ((x10.util.HashMap<java.lang.String, x10.core.Rail<java.lang.String>>)t$141132).containsKey__0x10$util$HashMap$$K$O(((java.lang.String)(t$141133)));
            
            //#line 668 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            return t$141134;
        }
    }
    
    
    //#line 682 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
    final public java.lang.String $apply(final java.lang.String key, final java.lang.String d) {
        
        //#line 683 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        final x10.core.Rail raw = this.get(((java.lang.String)(key)));
        
        //#line 684 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        boolean t$141137 = ((raw) == (null));
        
        //#line 684 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        if (!(t$141137)) {
            
            //#line 684 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final long t$141136 = ((x10.core.Rail<java.lang.String>)raw).size;
            
            //#line 684 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            t$141137 = ((long) t$141136) == ((long) 0L);
        }
        
        //#line 684 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        final boolean t$141143 = t$141137;
        
        //#line 684 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        if (t$141143) {
            
            //#line 684 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            return d;
        } else {
            
            //#line 685 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final long t$141138 = ((x10.core.Rail<java.lang.String>)raw).size;
            
            //#line 685 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final boolean t$141142 = ((long) t$141138) == ((long) 1L);
            
            //#line 685 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            if (t$141142) {
                
                //#line 685 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                final java.lang.String t$141139 = ((java.lang.String[])raw.value)[(int)0L];
                
                //#line 685 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                return t$141139;
            } else {
                
                //#line 686 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                final x10.core.fun.Fun_0_3 t$141140 = ((x10.core.fun.Fun_0_3)(onMoreThanOne));
                
                //#line 686 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                final java.lang.String t$141141 = ((java.lang.String)
                                                    ((x10.core.fun.Fun_0_3<java.lang.String,java.lang.String,x10.core.Rail<java.lang.String>,java.lang.String>)t$141140).$apply(key, x10.rtt.Types.STRING, d, x10.rtt.Types.STRING, raw, x10.rtt.ParameterizedType.make(x10.core.Rail.$RTT, x10.rtt.Types.STRING)));
                
                //#line 686 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                return t$141141;
            }
        }
    }
    
    
    //#line 698 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
    final public byte $apply$O(final java.lang.String key, final byte d) {
        
        //#line 699 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        final java.lang.String v = this.$apply(((java.lang.String)(key)), ((java.lang.String)("")));
        
        //#line 700 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        final int t$141144 = (v).length();
        
        //#line 700 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        final boolean t$141145 = ((int) t$141144) == ((int) 0);
        
        //#line 700 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        if (t$141145) {
            
            //#line 700 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            return d;
        }
        
        //#line 701 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        try {{
            
            //#line 701 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final byte t$141146 = x10.util.StringUtil.parseByte$O(((java.lang.String)(v)));
            
            //#line 701 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            return t$141146;
        }}catch (final java.lang.NumberFormatException e) {
            
            //#line 703 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final java.lang.String t$141147 = (("Expected a byte, got: \"") + (v));
            
            //#line 703 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final java.lang.String t$141148 = ((t$141147) + ("\""));
            
            //#line 703 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final x10.util.OptionsParser.Err t$141149 = ((x10.util.OptionsParser.Err)(new x10.util.OptionsParser.Err(t$141148)));
            
            //#line 703 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            throw t$141149;
        }
    }
    
    
    //#line 716 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
    final public short $apply$O(final java.lang.String key, final short d) {
        
        //#line 717 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        final java.lang.String v = this.$apply(((java.lang.String)(key)), ((java.lang.String)("")));
        
        //#line 718 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        final int t$141150 = (v).length();
        
        //#line 718 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        final boolean t$141151 = ((int) t$141150) == ((int) 0);
        
        //#line 718 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        if (t$141151) {
            
            //#line 718 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            return d;
        }
        
        //#line 719 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        try {{
            
            //#line 719 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final short t$141152 = x10.util.StringUtil.parseShort$O(((java.lang.String)(v)));
            
            //#line 719 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            return t$141152;
        }}catch (final java.lang.NumberFormatException e) {
            
            //#line 721 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final java.lang.String t$141153 = (("Expected a Short, got: \"") + (v));
            
            //#line 721 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final java.lang.String t$141154 = ((t$141153) + ("\""));
            
            //#line 721 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final x10.util.OptionsParser.Err t$141155 = ((x10.util.OptionsParser.Err)(new x10.util.OptionsParser.Err(t$141154)));
            
            //#line 721 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            throw t$141155;
        }
    }
    
    
    //#line 734 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
    final public int $apply$O(final java.lang.String key, final int d) {
        
        //#line 735 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        final java.lang.String v = this.$apply(((java.lang.String)(key)), ((java.lang.String)("")));
        
        //#line 736 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        final int t$141156 = (v).length();
        
        //#line 736 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        final boolean t$141157 = ((int) t$141156) == ((int) 0);
        
        //#line 736 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        if (t$141157) {
            
            //#line 736 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            return d;
        }
        
        //#line 737 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        try {{
            
            //#line 737 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final int t$141158 = x10.util.StringUtil.parseInt$O(((java.lang.String)(v)));
            
            //#line 737 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            return t$141158;
        }}catch (final java.lang.NumberFormatException e) {
            
            //#line 739 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final java.lang.String t$141159 = (("Expected an Int, got: \"") + (v));
            
            //#line 739 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final java.lang.String t$141160 = ((t$141159) + ("\""));
            
            //#line 739 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final x10.util.OptionsParser.Err t$141161 = ((x10.util.OptionsParser.Err)(new x10.util.OptionsParser.Err(t$141160)));
            
            //#line 739 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            throw t$141161;
        }
    }
    
    
    //#line 752 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
    final public long $apply$O(final java.lang.String key, final long d) {
        
        //#line 753 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        final java.lang.String v = this.$apply(((java.lang.String)(key)), ((java.lang.String)("")));
        
        //#line 754 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        final int t$141162 = (v).length();
        
        //#line 754 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        final boolean t$141163 = ((int) t$141162) == ((int) 0);
        
        //#line 754 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        if (t$141163) {
            
            //#line 754 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            return d;
        }
        
        //#line 755 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        try {{
            
            //#line 755 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final long t$141164 = x10.util.StringUtil.parseLong$O(((java.lang.String)(v)));
            
            //#line 755 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            return t$141164;
        }}catch (final java.lang.NumberFormatException e) {
            
            //#line 757 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final java.lang.String t$141165 = (("Expected a Long, got: \"") + (v));
            
            //#line 757 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final java.lang.String t$141166 = ((t$141165) + ("\""));
            
            //#line 757 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final x10.util.OptionsParser.Err t$141167 = ((x10.util.OptionsParser.Err)(new x10.util.OptionsParser.Err(t$141166)));
            
            //#line 757 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            throw t$141167;
        }
    }
    
    
    //#line 770 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
    final public byte $apply__1$u$O(final java.lang.String key, final byte d) {
        
        //#line 771 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        final java.lang.String v = this.$apply(((java.lang.String)(key)), ((java.lang.String)("")));
        
        //#line 772 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        final int t$141168 = (v).length();
        
        //#line 772 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        final boolean t$141169 = ((int) t$141168) == ((int) 0);
        
        //#line 772 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        if (t$141169) {
            
            //#line 772 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            return d;
        }
        
        //#line 773 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        try {{
            
            //#line 773 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final byte t$141170 = x10.util.StringUtil.parseUByte$O(((java.lang.String)(v)));
            
            //#line 773 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            return t$141170;
        }}catch (final java.lang.NumberFormatException e) {
            
            //#line 775 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final java.lang.String t$141171 = (("Expected a UByte, got: \"") + (v));
            
            //#line 775 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final java.lang.String t$141172 = ((t$141171) + ("\""));
            
            //#line 775 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final x10.util.OptionsParser.Err t$141173 = ((x10.util.OptionsParser.Err)(new x10.util.OptionsParser.Err(t$141172)));
            
            //#line 775 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            throw t$141173;
        }
    }
    
    
    //#line 788 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
    final public short $apply__1$u$O(final java.lang.String key, final short d) {
        
        //#line 789 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        final java.lang.String v = this.$apply(((java.lang.String)(key)), ((java.lang.String)("")));
        
        //#line 790 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        final int t$141174 = (v).length();
        
        //#line 790 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        final boolean t$141175 = ((int) t$141174) == ((int) 0);
        
        //#line 790 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        if (t$141175) {
            
            //#line 790 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            return d;
        }
        
        //#line 791 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        try {{
            
            //#line 791 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final short t$141176 = x10.util.StringUtil.parseUShort$O(((java.lang.String)(v)));
            
            //#line 791 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            return t$141176;
        }}catch (final java.lang.NumberFormatException e) {
            
            //#line 793 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final java.lang.String t$141177 = (("Expected a UShort, got: \"") + (v));
            
            //#line 793 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final java.lang.String t$141178 = ((t$141177) + ("\""));
            
            //#line 793 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final x10.util.OptionsParser.Err t$141179 = ((x10.util.OptionsParser.Err)(new x10.util.OptionsParser.Err(t$141178)));
            
            //#line 793 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            throw t$141179;
        }
    }
    
    
    //#line 806 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
    final public int $apply__1$u$O(final java.lang.String key, final int d) {
        
        //#line 807 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        final java.lang.String v = this.$apply(((java.lang.String)(key)), ((java.lang.String)("")));
        
        //#line 808 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        final int t$141180 = (v).length();
        
        //#line 808 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        final boolean t$141181 = ((int) t$141180) == ((int) 0);
        
        //#line 808 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        if (t$141181) {
            
            //#line 808 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            return d;
        }
        
        //#line 809 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        try {{
            
            //#line 809 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final int t$141182 = x10.util.StringUtil.parseUInt$O(((java.lang.String)(v)));
            
            //#line 809 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            return t$141182;
        }}catch (final java.lang.NumberFormatException e) {
            
            //#line 811 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final java.lang.String t$141183 = (("Expected a UInt, got: \"") + (v));
            
            //#line 811 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final java.lang.String t$141184 = ((t$141183) + ("\""));
            
            //#line 811 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final x10.util.OptionsParser.Err t$141185 = ((x10.util.OptionsParser.Err)(new x10.util.OptionsParser.Err(t$141184)));
            
            //#line 811 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            throw t$141185;
        }
    }
    
    
    //#line 824 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
    final public long $apply__1$u$O(final java.lang.String key, final long d) {
        
        //#line 825 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        final java.lang.String v = this.$apply(((java.lang.String)(key)), ((java.lang.String)("")));
        
        //#line 826 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        final int t$141186 = (v).length();
        
        //#line 826 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        final boolean t$141187 = ((int) t$141186) == ((int) 0);
        
        //#line 826 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        if (t$141187) {
            
            //#line 826 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            return d;
        }
        
        //#line 827 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        try {{
            
            //#line 827 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final long t$141188 = x10.util.StringUtil.parseULong$O(((java.lang.String)(v)));
            
            //#line 827 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            return t$141188;
        }}catch (final java.lang.NumberFormatException e) {
            
            //#line 829 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final java.lang.String t$141189 = (("Expected a ULong, got: \"") + (v));
            
            //#line 829 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final java.lang.String t$141190 = ((t$141189) + ("\""));
            
            //#line 829 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final x10.util.OptionsParser.Err t$141191 = ((x10.util.OptionsParser.Err)(new x10.util.OptionsParser.Err(t$141190)));
            
            //#line 829 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            throw t$141191;
        }
    }
    
    
    //#line 842 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
    final public double $apply$O(final java.lang.String key, final double d) {
        
        //#line 843 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        final java.lang.String v = this.$apply(((java.lang.String)(key)), ((java.lang.String)("")));
        
        //#line 845 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        final int t$141192 = (v).length();
        
        //#line 845 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        final boolean t$141193 = ((int) t$141192) == ((int) 0);
        
        //#line 845 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        if (t$141193) {
            
            //#line 845 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            return d;
        }
        
        //#line 846 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        try {{
            
            //#line 846 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final double t$141194 = java.lang.Double.parseDouble(v);
            
            //#line 846 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            return t$141194;
        }}catch (final java.lang.NumberFormatException e) {
            
            //#line 848 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final java.lang.String t$141195 = (("Expected a Double, got: \"") + (v));
            
            //#line 848 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final java.lang.String t$141196 = ((t$141195) + ("\""));
            
            //#line 848 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final x10.util.OptionsParser.Err t$141197 = ((x10.util.OptionsParser.Err)(new x10.util.OptionsParser.Err(t$141196)));
            
            //#line 848 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            throw t$141197;
        }
    }
    
    
    //#line 861 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
    final public float $apply$O(final java.lang.String key, final float d) {
        
        //#line 862 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        final java.lang.String v = this.$apply(((java.lang.String)(key)), ((java.lang.String)("")));
        
        //#line 863 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        final int t$141198 = (v).length();
        
        //#line 863 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        final boolean t$141199 = ((int) t$141198) == ((int) 0);
        
        //#line 863 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        if (t$141199) {
            
            //#line 863 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            return d;
        }
        
        //#line 864 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        try {{
            
            //#line 864 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final float t$141200 = java.lang.Float.parseFloat(v);
            
            //#line 864 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            return t$141200;
        }}catch (final java.lang.NumberFormatException e) {
            
            //#line 866 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final java.lang.String t$141201 = (("Expected a Float, got: \"") + (v));
            
            //#line 866 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final java.lang.String t$141202 = ((t$141201) + ("\""));
            
            //#line 866 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final x10.util.OptionsParser.Err t$141203 = ((x10.util.OptionsParser.Err)(new x10.util.OptionsParser.Err(t$141202)));
            
            //#line 866 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            throw t$141203;
        }
    }
    
    
    //#line 890 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
    final public boolean $apply$O(final java.lang.String key, final boolean d) {
        
        //#line 891 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        final java.lang.String v = this.$apply(((java.lang.String)(key)), ((java.lang.String)("")));
        
        //#line 892 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        final int t$141204 = (v).length();
        
        //#line 892 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        final boolean t$141205 = ((int) t$141204) == ((int) 0);
        
        //#line 892 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        boolean t$141206 =  false;
        
        //#line 892 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        if (t$141205) {
            
            //#line 892 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            t$141206 = d;
        } else {
            
            //#line 892 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            t$141206 = x10.util.StringUtil.checkBoolean$O(((java.lang.String)(v)));
        }
        
        //#line 892 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        final boolean t$141207 = t$141206;
        
        //#line 892 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        return t$141207;
    }
    
    
    //#line 900 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
    public java.lang.String usage(final java.lang.String leader) {
        
        //#line 901 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        final x10.util.StringBuilder details = ((x10.util.StringBuilder)(new x10.util.StringBuilder((java.lang.System[]) null)));
        
        //#line 901 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        details.x10$util$StringBuilder$$init$S();
        
        //#line 902 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        details.add(((java.lang.String)(leader)));
        
        //#line 903 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        final x10.core.Rail rail$141632 = ((x10.core.Rail)(options));
        
        //#line 903 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        final long i$140356max$141633 = ((x10.core.Rail<x10.util.Option>)rail$141632).size;
        
        //#line 903 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        long i$141629 = 0L;
        
        //#line 903 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        for (;
             true;
             ) {
            
            //#line 903 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final long t$141630 = i$141629;
            
            //#line 903 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final boolean t$141631 = ((t$141630) < (((long)(i$140356max$141633))));
            
            //#line 903 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            if (!(t$141631)) {
                
                //#line 903 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                break;
            }
            
            //#line 903 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final long n$141626 = i$141629;
            
            //#line 904 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            details.add(((java.lang.String)("   ")));
            
            //#line 905 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final x10.core.Rail t$141623 = ((x10.core.Rail)(options));
            
            //#line 905 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final x10.util.Option t$141624 = ((x10.util.Option[])t$141623.value)[(int)n$141626];
            
            //#line 905 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final java.lang.String t$141625 = t$141624.usage();
            
            //#line 905 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            details.add(((java.lang.String)(t$141625)));
            
            //#line 906 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            details.add(((java.lang.String)("\n")));
            
            //#line 903 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final long t$141627 = i$141629;
            
            //#line 903 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final long t$141628 = ((t$141627) + (((long)(1L))));
            
            //#line 903 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            i$141629 = t$141628;
        }
        
        //#line 908 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        details.add(((java.lang.String)("\n")));
        
        //#line 909 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        final java.lang.String t$141216 = details.result();
        
        //#line 909 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        return t$141216;
    }
    
    
    //#line 911 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
    private static x10.util.Option HELP;
    
    
    //#line 912 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
    public void showHELP() {
        
        //#line 913 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        final x10.io.Printer t$141224 = ((x10.io.Printer)(x10.io.Console.get$ERR()));
        
        //#line 913 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        final x10.util.Option t$141217 = ((x10.util.Option)(x10.util.OptionsParser.get$HELP()));
        
        //#line 913 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        final java.lang.String t$141218 = ((java.lang.String)(t$141217.shortForm));
        
        //#line 913 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        final java.lang.String t$141219 = (("Use ") + (t$141218));
        
        //#line 913 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        final java.lang.String t$141221 = ((t$141219) + (" or "));
        
        //#line 914 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        final x10.util.Option t$141220 = ((x10.util.Option)(x10.util.OptionsParser.get$HELP()));
        
        //#line 914 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        final java.lang.String t$141222 = ((java.lang.String)(t$141220.longForm));
        
        //#line 913 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        final java.lang.String t$141223 = ((t$141221) + (t$141222));
        
        //#line 913 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        final java.lang.String t$141225 = ((t$141223) + (" to see the correct usage."));
        
        //#line 913 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        t$141224.println(((java.lang.Object)(t$141225)));
    }
    
    
    //#line 923 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
    public boolean wantsUsageOnly$O(final java.lang.String leader) {
        
        //#line 924 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        final x10.util.Option t$141226 = ((x10.util.Option)(x10.util.OptionsParser.get$HELP()));
        
        //#line 924 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        final java.lang.String t$141227 = ((java.lang.String)(t$141226.shortForm));
        
        //#line 924 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        boolean t$141230 = this.$apply$O(((java.lang.String)(t$141227)));
        
        //#line 924 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        if (!(t$141230)) {
            
            //#line 924 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final x10.util.Option t$141228 = ((x10.util.Option)(x10.util.OptionsParser.get$HELP()));
            
            //#line 924 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final java.lang.String t$141229 = ((java.lang.String)(t$141228.longForm));
            
            //#line 924 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            t$141230 = this.$apply$O(((java.lang.String)(t$141229)));
        }
        
        //#line 924 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        final boolean t$141233 = t$141230;
        
        //#line 924 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        if (t$141233) {
            
            //#line 925 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final x10.io.Printer t$141231 = ((x10.io.Printer)(x10.io.Console.get$ERR()));
            
            //#line 925 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final java.lang.String t$141232 = this.usage(((java.lang.String)(leader)));
            
            //#line 925 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            t$141231.print(((java.lang.String)(t$141232)));
            
            //#line 926 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            return true;
        } else {
            
            //#line 928 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            return false;
        }
    }
    
    
    //#line 936 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
    public x10.core.Rail filteredArgs() {
        
        //#line 937 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        final x10.util.RailBuilder builder = ((x10.util.RailBuilder)(new x10.util.RailBuilder<java.lang.String>((java.lang.System[]) null, x10.rtt.Types.STRING)));
        
        //#line 937 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        builder.x10$util$RailBuilder$$init$S();
        
        //#line 938 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        final x10.core.Rail rail$141648 = ((x10.core.Rail)(options));
        
        //#line 938 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        final long size$141649 = ((x10.core.Rail<x10.util.Option>)rail$141648).size;
        
        //#line 938 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        long idx$141645 = 0L;
        {
            
            //#line 938 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final x10.util.Option[] rail$141648$value$141665 = ((x10.util.Option[])rail$141648.value);
            
            //#line 938 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            for (;
                 true;
                 ) {
                
                //#line 938 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                final long t$141646 = idx$141645;
                
                //#line 938 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                final boolean t$141647 = ((t$141646) < (((long)(size$141649))));
                
                //#line 938 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                if (!(t$141647)) {
                    
                    //#line 938 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                    break;
                }
                
                //#line 938 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                final long t$141641 = idx$141645;
                
                //#line 938 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                final x10.util.Option o$141642 = ((x10.util.Option)(((x10.util.Option)rail$141648$value$141665[(int)t$141641])));
                
                //#line 939 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                final boolean t$141634 = o$141642.onTheFly;
                
                //#line 939 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                if (t$141634) {
                    
                    //#line 940 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                    final java.lang.String t$141635 = ((java.lang.String)(o$141642.shortForm));
                    
                    //#line 940 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                    final int t$141636 = (t$141635).length();
                    
                    //#line 940 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                    final long t$141637 = ((long)(((int)(t$141636))));
                    
                    //#line 940 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                    final boolean t$141638 = ((t$141637) > (((long)(0L))));
                    
                    //#line 940 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                    java.lang.String t$141639 =  null;
                    
                    //#line 940 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                    if (t$141638) {
                        
                        //#line 940 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                        t$141639 = o$141642.shortForm;
                    } else {
                        
                        //#line 940 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                        t$141639 = o$141642.longForm;
                    }
                    
                    //#line 940 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                    final java.lang.String key$141640 = t$141639;
                    
                    //#line 941 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                    ((x10.util.RailBuilder<java.lang.String>)builder).add__0x10$util$RailBuilder$$T(((java.lang.String)(key$141640)));
                }
                
                //#line 938 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                final long t$141643 = idx$141645;
                
                //#line 938 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                final long t$141644 = ((t$141643) + (((long)(1L))));
                
                //#line 938 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                idx$141645 = t$141644;
            }
        }
        
        //#line 944 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        final x10.core.Rail t$141246 = ((x10.core.Rail<java.lang.String>)
                                         ((x10.util.RailBuilder<java.lang.String>)builder).result());
        
        //#line 944 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        return t$141246;
    }
    
    
    //#line 951 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
    public boolean hasUnexpectedArgs$O(final boolean show) {
        
        //#line 952 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        final x10.core.Rail badArgs = this.filteredArgs();
        
        //#line 953 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        final long t$141247 = ((x10.core.Rail<java.lang.String>)badArgs).size;
        
        //#line 953 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        final boolean rc = ((t$141247) > (((long)(0L))));
        
        //#line 954 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        boolean t$141248 = rc;
        
        //#line 954 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        if (t$141248) {
            
            //#line 954 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            t$141248 = show;
        }
        
        //#line 954 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        final boolean t$141252 = t$141248;
        
        //#line 954 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        if (t$141252) {
            
            //#line 109 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
            final x10.core.Rail a$140762 = ((x10.core.Rail)(badArgs));
            
            //#line 955 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final java.lang.String badArgsString = x10.util.StringUtil.<java.lang.String> formatArray__0$1x10$util$StringUtil$$T$2(x10.rtt.Types.STRING, ((x10.core.Rail)(a$140762)), ((java.lang.String)(", ")), ((java.lang.String)("    ")), (int)(80));
            
            //#line 956 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final x10.io.Printer t$141250 = ((x10.io.Printer)(x10.io.Console.get$ERR()));
            
            //#line 956 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final java.lang.String t$141249 = (("Unexpected arguments:\n\t") + (badArgsString));
            
            //#line 956 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final java.lang.String t$141251 = ((t$141249) + ("\n"));
            
            //#line 956 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            t$141250.println(((java.lang.Object)(t$141251)));
            
            //#line 957 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            this.showHELP();
        }
        
        //#line 959 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        return rc;
    }
    
    
    //#line 80 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
    final public x10.util.OptionsParser x10$util$OptionsParser$$this$x10$util$OptionsParser() {
        
        //#line 80 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        return x10.util.OptionsParser.this;
    }
    
    
    //#line 80 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
    final public void __fieldInitializers_x10_util_OptionsParser() {
        
        //#line 173 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        final x10.core.fun.Fun_0_3 t$141263 = ((x10.core.fun.Fun_0_3)(new x10.util.OptionsParser.$Closure$298()));
        
        //#line 80 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        this.onTooFew = ((x10.core.fun.Fun_0_3)(t$141263));
        
        //#line 189 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        final x10.core.fun.Fun_0_3 t$141264 = ((x10.core.fun.Fun_0_3)(new x10.util.OptionsParser.$Closure$299()));
        
        //#line 80 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        this.onTooMany = ((x10.core.fun.Fun_0_3)(t$141264));
        
        //#line 197 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        final x10.core.fun.VoidFun_0_5 t$141276 = ((x10.core.fun.VoidFun_0_5)(new x10.util.OptionsParser.$Closure$301()));
        
        //#line 80 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        this.onDuplicate = ((x10.core.fun.VoidFun_0_5)(t$141276));
        
        //#line 210 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        final x10.core.fun.Fun_0_3 t$141283 = ((x10.core.fun.Fun_0_3)(new x10.util.OptionsParser.$Closure$302()));
        
        //#line 80 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        this.onMoreThanOne = ((x10.core.fun.Fun_0_3)(t$141283));
        
        //#line 239 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        final x10.core.fun.Fun_0_2 t$141313 = ((x10.core.fun.Fun_0_2)(new x10.util.OptionsParser.$Closure$303()));
        
        //#line 80 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        this.onUnknownKey = ((x10.core.fun.Fun_0_2)(t$141313));
        
        //#line 80 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        this.options = null;
        
        //#line 80 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        this.keyMap = null;
        
        //#line 80 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        this.args = null;
        
        //#line 80 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        this.properties = null;
        
        //#line 80 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        this.tailStart = -1;
        
        //#line 80 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        this.required = null;
        
        //#line 80 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        this.oneCharFlags = null;
    }
    
    final private static x10.core.concurrent.AtomicInteger initStatus$HELP = new x10.core.concurrent.AtomicInteger(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED);
    private static x10.lang.ExceptionInInitializer exception$HELP;
    final private static x10.core.concurrent.AtomicInteger initStatus$startTailOnUnknownKey = new x10.core.concurrent.AtomicInteger(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED);
    private static x10.lang.ExceptionInInitializer exception$startTailOnUnknownKey;
    final private static x10.core.concurrent.AtomicInteger initStatus$lastOnMoreThanOne = new x10.core.concurrent.AtomicInteger(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED);
    private static x10.lang.ExceptionInInitializer exception$lastOnMoreThanOne;
    final private static x10.core.concurrent.AtomicInteger initStatus$firstOnMoreThanOne = new x10.core.concurrent.AtomicInteger(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED);
    private static x10.lang.ExceptionInInitializer exception$firstOnMoreThanOne;
    
    public static int get$IGNORE() {
        return x10.util.OptionsParser.IGNORE;
    }
    
    public static int get$START_TAIL() {
        return x10.util.OptionsParser.START_TAIL;
    }
    
    public static x10.core.fun.Fun_0_3 get$firstOnMoreThanOne() {
        if (((int) x10.util.OptionsParser.initStatus$firstOnMoreThanOne.get()) == ((int) x10.runtime.impl.java.InitDispatcher.INITIALIZED)) {
            return x10.util.OptionsParser.firstOnMoreThanOne;
        }
        if (((int) x10.util.OptionsParser.initStatus$firstOnMoreThanOne.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
            throw x10.util.OptionsParser.exception$firstOnMoreThanOne;
        }
        if (x10.util.OptionsParser.initStatus$firstOnMoreThanOne.compareAndSet((int)(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED), (int)(x10.runtime.impl.java.InitDispatcher.INITIALIZING))) {
            try {{
                x10.util.OptionsParser.firstOnMoreThanOne = ((x10.core.fun.Fun_0_3)(new x10.util.OptionsParser.$Closure$304()));
            }}catch (java.lang.Throwable exc$141652) {
                x10.util.OptionsParser.exception$firstOnMoreThanOne = new x10.lang.ExceptionInInitializer(exc$141652);
                x10.util.OptionsParser.initStatus$firstOnMoreThanOne.set((int)(x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED));
                x10.runtime.impl.java.InitDispatcher.lockInitialized();
                x10.runtime.impl.java.InitDispatcher.notifyInitialized();
                throw x10.util.OptionsParser.exception$firstOnMoreThanOne;
            }
            x10.util.OptionsParser.initStatus$firstOnMoreThanOne.set((int)(x10.runtime.impl.java.InitDispatcher.INITIALIZED));
            x10.runtime.impl.java.InitDispatcher.lockInitialized();
            x10.runtime.impl.java.InitDispatcher.notifyInitialized();
        } else {
            if (x10.util.OptionsParser.initStatus$firstOnMoreThanOne.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                x10.runtime.impl.java.InitDispatcher.lockInitialized();
                while (x10.util.OptionsParser.initStatus$firstOnMoreThanOne.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                    x10.runtime.impl.java.InitDispatcher.awaitInitialized();
                }
                x10.runtime.impl.java.InitDispatcher.unlockInitialized();
                if (((int) x10.util.OptionsParser.initStatus$firstOnMoreThanOne.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
                    throw x10.util.OptionsParser.exception$firstOnMoreThanOne;
                }
            }
        }
        return x10.util.OptionsParser.firstOnMoreThanOne;
    }
    
    public static x10.core.fun.Fun_0_3 get$lastOnMoreThanOne() {
        if (((int) x10.util.OptionsParser.initStatus$lastOnMoreThanOne.get()) == ((int) x10.runtime.impl.java.InitDispatcher.INITIALIZED)) {
            return x10.util.OptionsParser.lastOnMoreThanOne;
        }
        if (((int) x10.util.OptionsParser.initStatus$lastOnMoreThanOne.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
            throw x10.util.OptionsParser.exception$lastOnMoreThanOne;
        }
        if (x10.util.OptionsParser.initStatus$lastOnMoreThanOne.compareAndSet((int)(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED), (int)(x10.runtime.impl.java.InitDispatcher.INITIALIZING))) {
            try {{
                x10.util.OptionsParser.lastOnMoreThanOne = ((x10.core.fun.Fun_0_3)(new x10.util.OptionsParser.$Closure$305()));
            }}catch (java.lang.Throwable exc$141653) {
                x10.util.OptionsParser.exception$lastOnMoreThanOne = new x10.lang.ExceptionInInitializer(exc$141653);
                x10.util.OptionsParser.initStatus$lastOnMoreThanOne.set((int)(x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED));
                x10.runtime.impl.java.InitDispatcher.lockInitialized();
                x10.runtime.impl.java.InitDispatcher.notifyInitialized();
                throw x10.util.OptionsParser.exception$lastOnMoreThanOne;
            }
            x10.util.OptionsParser.initStatus$lastOnMoreThanOne.set((int)(x10.runtime.impl.java.InitDispatcher.INITIALIZED));
            x10.runtime.impl.java.InitDispatcher.lockInitialized();
            x10.runtime.impl.java.InitDispatcher.notifyInitialized();
        } else {
            if (x10.util.OptionsParser.initStatus$lastOnMoreThanOne.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                x10.runtime.impl.java.InitDispatcher.lockInitialized();
                while (x10.util.OptionsParser.initStatus$lastOnMoreThanOne.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                    x10.runtime.impl.java.InitDispatcher.awaitInitialized();
                }
                x10.runtime.impl.java.InitDispatcher.unlockInitialized();
                if (((int) x10.util.OptionsParser.initStatus$lastOnMoreThanOne.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
                    throw x10.util.OptionsParser.exception$lastOnMoreThanOne;
                }
            }
        }
        return x10.util.OptionsParser.lastOnMoreThanOne;
    }
    
    public static x10.core.fun.Fun_0_2 get$startTailOnUnknownKey() {
        if (((int) x10.util.OptionsParser.initStatus$startTailOnUnknownKey.get()) == ((int) x10.runtime.impl.java.InitDispatcher.INITIALIZED)) {
            return x10.util.OptionsParser.startTailOnUnknownKey;
        }
        if (((int) x10.util.OptionsParser.initStatus$startTailOnUnknownKey.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
            throw x10.util.OptionsParser.exception$startTailOnUnknownKey;
        }
        if (x10.util.OptionsParser.initStatus$startTailOnUnknownKey.compareAndSet((int)(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED), (int)(x10.runtime.impl.java.InitDispatcher.INITIALIZING))) {
            try {{
                x10.util.OptionsParser.startTailOnUnknownKey = ((x10.core.fun.Fun_0_2)(new x10.util.OptionsParser.$Closure$306()));
            }}catch (java.lang.Throwable exc$141654) {
                x10.util.OptionsParser.exception$startTailOnUnknownKey = new x10.lang.ExceptionInInitializer(exc$141654);
                x10.util.OptionsParser.initStatus$startTailOnUnknownKey.set((int)(x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED));
                x10.runtime.impl.java.InitDispatcher.lockInitialized();
                x10.runtime.impl.java.InitDispatcher.notifyInitialized();
                throw x10.util.OptionsParser.exception$startTailOnUnknownKey;
            }
            x10.util.OptionsParser.initStatus$startTailOnUnknownKey.set((int)(x10.runtime.impl.java.InitDispatcher.INITIALIZED));
            x10.runtime.impl.java.InitDispatcher.lockInitialized();
            x10.runtime.impl.java.InitDispatcher.notifyInitialized();
        } else {
            if (x10.util.OptionsParser.initStatus$startTailOnUnknownKey.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                x10.runtime.impl.java.InitDispatcher.lockInitialized();
                while (x10.util.OptionsParser.initStatus$startTailOnUnknownKey.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                    x10.runtime.impl.java.InitDispatcher.awaitInitialized();
                }
                x10.runtime.impl.java.InitDispatcher.unlockInitialized();
                if (((int) x10.util.OptionsParser.initStatus$startTailOnUnknownKey.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
                    throw x10.util.OptionsParser.exception$startTailOnUnknownKey;
                }
            }
        }
        return x10.util.OptionsParser.startTailOnUnknownKey;
    }
    
    public static x10.util.Option get$HELP() {
        if (((int) x10.util.OptionsParser.initStatus$HELP.get()) == ((int) x10.runtime.impl.java.InitDispatcher.INITIALIZED)) {
            return x10.util.OptionsParser.HELP;
        }
        if (((int) x10.util.OptionsParser.initStatus$HELP.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
            throw x10.util.OptionsParser.exception$HELP;
        }
        if (x10.util.OptionsParser.initStatus$HELP.compareAndSet((int)(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED), (int)(x10.runtime.impl.java.InitDispatcher.INITIALIZING))) {
            try {{
                x10.util.OptionsParser.HELP = ((x10.util.Option)(x10.util.Option.get$HELP()));
            }}catch (java.lang.Throwable exc$141655) {
                x10.util.OptionsParser.exception$HELP = new x10.lang.ExceptionInInitializer(exc$141655);
                x10.util.OptionsParser.initStatus$HELP.set((int)(x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED));
                x10.runtime.impl.java.InitDispatcher.lockInitialized();
                x10.runtime.impl.java.InitDispatcher.notifyInitialized();
                throw x10.util.OptionsParser.exception$HELP;
            }
            x10.util.OptionsParser.initStatus$HELP.set((int)(x10.runtime.impl.java.InitDispatcher.INITIALIZED));
            x10.runtime.impl.java.InitDispatcher.lockInitialized();
            x10.runtime.impl.java.InitDispatcher.notifyInitialized();
        } else {
            if (x10.util.OptionsParser.initStatus$HELP.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                x10.runtime.impl.java.InitDispatcher.lockInitialized();
                while (x10.util.OptionsParser.initStatus$HELP.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                    x10.runtime.impl.java.InitDispatcher.awaitInitialized();
                }
                x10.runtime.impl.java.InitDispatcher.unlockInitialized();
                if (((int) x10.util.OptionsParser.initStatus$HELP.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
                    throw x10.util.OptionsParser.exception$HELP;
                }
            }
        }
        return x10.util.OptionsParser.HELP;
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$294 extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$294> $RTT = 
            x10.rtt.StaticFunType.<$Closure$294> make($Closure$294.class,
                                                      new x10.rtt.Type[] {
                                                          x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.LONG, x10.rtt.Types.INT)
                                                      });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.util.OptionsParser.$Closure$294 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.thisK$141432 = $deserializer.readInt();
            $_obj.keyIndex = $deserializer.readObject();
            $_obj.newTail$141430 = $deserializer.readInt();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.util.OptionsParser.$Closure$294 $_obj = new x10.util.OptionsParser.$Closure$294((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.thisK$141432);
            $serializer.write(this.keyIndex);
            $serializer.write(this.newTail$141430);
            
        }
        
        // constructor just for allocation
        public $Closure$294(final java.lang.System[] $dummy) {
            
        }
        
        // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1):U
        public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1) {
            return x10.core.Int.$box($apply$O(x10.core.Long.$unbox(a1)));
            
        }
        
        // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1):U
        public int $apply$I(final java.lang.Object a1, final x10.rtt.Type t1) {
            return $apply$O(x10.core.Long.$unbox(a1));
            
        }
        
        // synthetic type for parameter mangling
        public static final class __1$1x10$lang$Int$2 {}
        
    
        
        public int $apply$O(final long n$141437) {
            
            //#line 408 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final long t$141438 = ((long)(((int)(this.thisK$141432))));
            
            //#line 408 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final boolean t$141439 = ((n$141437) <= (((long)(t$141438))));
            
            //#line 408 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            int t$141440 =  0;
            
            //#line 408 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            if (t$141439) {
                
                //#line 408 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                t$141440 = ((int[])this.keyIndex.value)[(int)n$141437];
            } else {
                
                //#line 408 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                t$141440 = this.newTail$141430;
            }
            
            //#line 408 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final int t$141441 = t$141440;
            
            //#line 408 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            return t$141441;
        }
        
        public int thisK$141432;
        public x10.core.Rail<x10.core.Int> keyIndex;
        public int newTail$141430;
        
        public $Closure$294(final int thisK$141432, final x10.core.Rail<x10.core.Int> keyIndex, final int newTail$141430, __1$1x10$lang$Int$2 $dummy) {
             {
                this.thisK$141432 = thisK$141432;
                this.keyIndex = ((x10.core.Rail)(keyIndex));
                this.newTail$141430 = newTail$141430;
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$295 extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$295> $RTT = 
            x10.rtt.StaticFunType.<$Closure$295> make($Closure$295.class,
                                                      new x10.rtt.Type[] {
                                                          x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.LONG, x10.rtt.Types.STRING)
                                                      });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.util.OptionsParser.$Closure$295 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.first$141408 = $deserializer.readInt();
            $_obj.thisArgs$141461 = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.util.OptionsParser.$Closure$295 $_obj = new x10.util.OptionsParser.$Closure$295((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.first$141408);
            $serializer.write(this.thisArgs$141461);
            
        }
        
        // constructor just for allocation
        public $Closure$295(final java.lang.System[] $dummy) {
            
        }
        
        // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1):U
        public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1) {
            return $apply(x10.core.Long.$unbox(a1));
            
        }
        
        // synthetic type for parameter mangling
        public static final class __1$1x10$lang$String$2 {}
        
    
        
        public java.lang.String $apply(final long n$141465) {
            
            //#line 432 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final long t$141466 = ((long)(((int)(this.first$141408))));
            
            //#line 432 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final long t$141467 = ((t$141466) + (((long)(n$141465))));
            
            //#line 432 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final java.lang.String t$141468 = ((java.lang.String[])this.thisArgs$141461.value)[(int)t$141467];
            
            //#line 432 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            return t$141468;
        }
        
        public int first$141408;
        public x10.core.Rail<java.lang.String> thisArgs$141461;
        
        public $Closure$295(final int first$141408, final x10.core.Rail<java.lang.String> thisArgs$141461, __1$1x10$lang$String$2 $dummy) {
             {
                this.first$141408 = first$141408;
                this.thisArgs$141461 = ((x10.core.Rail)(thisArgs$141461));
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$296 extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$296> $RTT = 
            x10.rtt.StaticFunType.<$Closure$296> make($Closure$296.class,
                                                      new x10.rtt.Type[] {
                                                          x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.LONG, x10.rtt.Types.STRING)
                                                      });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.util.OptionsParser.$Closure$296 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.argN$141572 = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.util.OptionsParser.$Closure$296 $_obj = new x10.util.OptionsParser.$Closure$296((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.argN$141572);
            
        }
        
        // constructor just for allocation
        public $Closure$296(final java.lang.System[] $dummy) {
            
        }
        
        // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1):U
        public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1) {
            return $apply(x10.core.Long.$unbox(a1));
            
        }
        
        
    
        
        public java.lang.String $apply(final long k$141590) {
            
            //#line 535 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final int t$141591 = ((int)(long)(((long)(k$141590))));
            
            //#line 535 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final int t$141592 = ((t$141591) + (((int)(1))));
            
            //#line 535 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final char t$141593 = (this.argN$141572).charAt(((int)(t$141592)));
            
            //#line 535 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final java.lang.String t$141594 = (("-") + ((x10.core.Char.$box(t$141593))));
            
            //#line 535 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            return t$141594;
        }
        
        public java.lang.String argN$141572;
        
        public $Closure$296(final java.lang.String argN$141572) {
             {
                this.argN$141572 = ((java.lang.String)(argN$141572));
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$297 extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$297> $RTT = 
            x10.rtt.StaticFunType.<$Closure$297> make($Closure$297.class,
                                                      new x10.rtt.Type[] {
                                                          x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.LONG, x10.rtt.Types.STRING)
                                                      });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.util.OptionsParser.$Closure$297 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.out$$ = $deserializer.readObject();
            $_obj.first = $deserializer.readInt();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.util.OptionsParser.$Closure$297 $_obj = new x10.util.OptionsParser.$Closure$297((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.out$$);
            $serializer.write(this.first);
            
        }
        
        // constructor just for allocation
        public $Closure$297(final java.lang.System[] $dummy) {
            
        }
        
        // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1):U
        public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1) {
            return $apply(x10.core.Long.$unbox(a1));
            
        }
        
        
    
        
        public java.lang.String $apply(final long n) {
            
            //#line 572 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final x10.core.Rail t$141062 = ((x10.core.Rail)(this.out$$.args));
            
            //#line 572 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final long t$141061 = ((long)(((int)(this.first))));
            
            //#line 572 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final long t$141063 = ((n) + (((long)(t$141061))));
            
            //#line 572 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final java.lang.String t$141064 = ((java.lang.String[])t$141062.value)[(int)t$141063];
            
            //#line 572 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            return t$141064;
        }
        
        public x10.util.OptionsParser out$$;
        public int first;
        
        public $Closure$297(final x10.util.OptionsParser out$$, final int first) {
             {
                this.out$$ = out$$;
                this.first = first;
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$298 extends x10.core.Ref implements x10.core.fun.Fun_0_3, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$298> $RTT = 
            x10.rtt.StaticFunType.<$Closure$298> make($Closure$298.class,
                                                      new x10.rtt.Type[] {
                                                          x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_3.$RTT, x10.rtt.Types.STRING, x10.rtt.Types.INT, x10.rtt.Types.INT, x10.rtt.ParameterizedType.make(x10.core.Rail.$RTT, x10.rtt.Types.STRING))
                                                      });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.util.OptionsParser.$Closure$298 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.util.OptionsParser.$Closure$298 $_obj = new x10.util.OptionsParser.$Closure$298((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            
        }
        
        // constructor just for allocation
        public $Closure$298(final java.lang.System[] $dummy) {
            
        }
        
        // dispatcher for method abstract public (Z1,Z2,Z3)=>U.operator()(a1:Z1, a2:Z2, a3:Z3):U
        public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1, final java.lang.Object a2, final x10.rtt.Type t2, final java.lang.Object a3, final x10.rtt.Type t3) {
            return $apply((java.lang.String)a1, x10.core.Int.$unbox(a2), x10.core.Int.$unbox(a3));
            
        }
        
        
    
        
        public x10.core.Rail $apply(final java.lang.String key, final int expected, final int got) {
            
            //#line 174 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final int t$141253 = (key).length();
            
            //#line 174 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final long t$141254 = ((long)(((int)(t$141253))));
            
            //#line 174 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final boolean t$141261 = ((t$141254) > (((long)(0L))));
            
            //#line 174 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            if (t$141261) {
                
                //#line 175 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                final java.lang.String t$141255 = (("Missing arguments for ") + (key));
                
                //#line 175 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                final java.lang.String t$141256 = ((t$141255) + (": "));
                
                //#line 175 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                final java.lang.String t$141257 = ((t$141256) + ((x10.core.Int.$box(expected))));
                
                //#line 175 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                final java.lang.String t$141258 = ((t$141257) + (" expected, got "));
                
                //#line 175 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                final java.lang.String t$141259 = ((t$141258) + ((x10.core.Int.$box(got))));
                
                //#line 175 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                final x10.util.OptionsParser.Err t$141260 = ((x10.util.OptionsParser.Err)(new x10.util.OptionsParser.Err(t$141259)));
                
                //#line 175 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                throw t$141260;
            }
            
            //#line 177 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final x10.core.Rail t$141262 = ((x10.core.Rail)(new x10.core.Rail<java.lang.String>(x10.rtt.Types.STRING, ((long)(0L)))));
            
            //#line 177 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            return t$141262;
        }
        
        public $Closure$298() {
             {
                
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$299 extends x10.core.Ref implements x10.core.fun.Fun_0_3, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$299> $RTT = 
            x10.rtt.StaticFunType.<$Closure$299> make($Closure$299.class,
                                                      new x10.rtt.Type[] {
                                                          x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_3.$RTT, x10.rtt.Types.STRING, x10.rtt.Types.INT, x10.rtt.Types.INT, x10.rtt.Types.INT)
                                                      });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.util.OptionsParser.$Closure$299 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.util.OptionsParser.$Closure$299 $_obj = new x10.util.OptionsParser.$Closure$299((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            
        }
        
        // constructor just for allocation
        public $Closure$299(final java.lang.System[] $dummy) {
            
        }
        
        // dispatcher for method abstract public (Z1,Z2,Z3)=>U.operator()(a1:Z1, a2:Z2, a3:Z3):U
        public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1, final java.lang.Object a2, final x10.rtt.Type t2, final java.lang.Object a3, final x10.rtt.Type t3) {
            return x10.core.Int.$box($apply$O((java.lang.String)a1, x10.core.Int.$unbox(a2), x10.core.Int.$unbox(a3)));
            
        }
        
        // dispatcher for method abstract public (Z1,Z2,Z3)=>U.operator()(a1:Z1, a2:Z2, a3:Z3):U
        public int $apply$I(final java.lang.Object a1, final x10.rtt.Type t1, final java.lang.Object a2, final x10.rtt.Type t2, final java.lang.Object a3, final x10.rtt.Type t3) {
            return $apply$O((java.lang.String)a1, x10.core.Int.$unbox(a2), x10.core.Int.$unbox(a3));
            
        }
        
        
    
        
        public int $apply$O(final java.lang.String key, final int expected, final int got) {
            
            //#line 189 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            return expected;
        }
        
        public $Closure$299() {
             {
                
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$300 extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$300> $RTT = 
            x10.rtt.StaticFunType.<$Closure$300> make($Closure$300.class,
                                                      new x10.rtt.Type[] {
                                                          x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.LONG, x10.rtt.Types.STRING)
                                                      });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.util.OptionsParser.$Closure$300 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.first = $deserializer.readInt();
            $_obj.args = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.util.OptionsParser.$Closure$300 $_obj = new x10.util.OptionsParser.$Closure$300((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.first);
            $serializer.write(this.args);
            
        }
        
        // constructor just for allocation
        public $Closure$300(final java.lang.System[] $dummy) {
            
        }
        
        // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1):U
        public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1) {
            return $apply(x10.core.Long.$unbox(a1));
            
        }
        
        // synthetic type for parameter mangling
        public static final class __1$1x10$lang$String$2 {}
        
    
        
        public java.lang.String $apply(final long n) {
            
            //#line 198 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final int t$141265 = ((int)(long)(((long)(n))));
            
            //#line 198 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final int t$141266 = ((this.first) + (((int)(t$141265))));
            
            //#line 198 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final long t$141267 = ((long)(((int)(t$141266))));
            
            //#line 198 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final java.lang.String t$141268 = ((java.lang.String[])this.args.value)[(int)t$141267];
            
            //#line 198 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            return t$141268;
        }
        
        public int first;
        public x10.core.Rail<java.lang.String> args;
        
        public $Closure$300(final int first, final x10.core.Rail<java.lang.String> args, __1$1x10$lang$String$2 $dummy) {
             {
                this.first = first;
                this.args = ((x10.core.Rail)(args));
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$301 extends x10.core.Ref implements x10.core.fun.VoidFun_0_5, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$301> $RTT = 
            x10.rtt.StaticVoidFunType.<$Closure$301> make($Closure$301.class,
                                                          new x10.rtt.Type[] {
                                                              x10.rtt.ParameterizedType.make(x10.core.fun.VoidFun_0_5.$RTT, x10.rtt.Types.STRING, x10.rtt.ParameterizedType.make(x10.util.HashMap.$RTT, x10.rtt.Types.STRING, x10.rtt.ParameterizedType.make(x10.core.Rail.$RTT, x10.rtt.Types.STRING)), x10.rtt.ParameterizedType.make(x10.core.Rail.$RTT, x10.rtt.Types.STRING), x10.rtt.Types.INT, x10.rtt.Types.INT)
                                                          });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.util.OptionsParser.$Closure$301 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.util.OptionsParser.$Closure$301 $_obj = new x10.util.OptionsParser.$Closure$301((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            
        }
        
        // constructor just for allocation
        public $Closure$301(final java.lang.System[] $dummy) {
            
        }
        
        // dispatcher for method abstract public (Z1,Z2,Z3,Z4,Z5)=>void.operator()(a1:Z1, a2:Z2, a3:Z3, a4:Z4, a5:Z5):void
        public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1, final java.lang.Object a2, final x10.rtt.Type t2, final java.lang.Object a3, final x10.rtt.Type t3, final java.lang.Object a4, final x10.rtt.Type t4, final java.lang.Object a5, final x10.rtt.Type t5) {
            $apply__1$1x10$lang$String$3x10$lang$Rail$1x10$lang$String$2$2__2$1x10$lang$String$2((java.lang.String)a1, (x10.util.HashMap)a2, (x10.core.Rail)a3, x10.core.Int.$unbox(a4), x10.core.Int.$unbox(a5)); return null;
            
        }
        
        // dispatcher for method abstract public (Z1,Z2,Z3,Z4,Z5)=>void.operator()(a1:Z1, a2:Z2, a3:Z3, a4:Z4, a5:Z5):void
        public void $apply$V(final java.lang.Object a1, final x10.rtt.Type t1, final java.lang.Object a2, final x10.rtt.Type t2, final java.lang.Object a3, final x10.rtt.Type t3, final java.lang.Object a4, final x10.rtt.Type t4, final java.lang.Object a5, final x10.rtt.Type t5) {
            $apply__1$1x10$lang$String$3x10$lang$Rail$1x10$lang$String$2$2__2$1x10$lang$String$2((java.lang.String)a1, (x10.util.HashMap)a2, (x10.core.Rail)a3, x10.core.Int.$unbox(a4), x10.core.Int.$unbox(a5));
            
        }
        
        
    
        
        public void $apply__1$1x10$lang$String$3x10$lang$Rail$1x10$lang$String$2$2__2$1x10$lang$String$2(final java.lang.String key, final x10.util.HashMap props, final x10.core.Rail args, final int first, final int values) {
            
            //#line 199 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final long t$141269 = ((long)(((int)(values))));
            
            //#line 198 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final x10.core.fun.Fun_0_1 t$141270 = ((x10.core.fun.Fun_0_1)(new x10.util.OptionsParser.$Closure$300(first, args, (x10.util.OptionsParser.$Closure$300.__1$1x10$lang$String$2) null)));
            
            //#line 199 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final x10.core.Rail valueArray = ((x10.core.Rail)(new x10.core.Rail<java.lang.String>(x10.rtt.Types.STRING, t$141269, ((x10.core.fun.Fun_0_1)(t$141270)), (x10.core.Rail.__1$1x10$lang$Long$3x10$lang$Rail$$T$2) null)));
            
            //#line 200 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final x10.io.Printer t$141274 = ((x10.io.Printer)(x10.io.Console.get$ERR()));
            
            //#line 200 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final java.lang.String t$141271 = (("Duplicated ") + (key));
            
            //#line 200 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final java.lang.String t$141272 = ((t$141271) + (", It\'s value now: "));
            
            //#line 200 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final java.lang.String t$141273 = ((java.lang.String[])valueArray.value)[(int)0L];
            
            //#line 200 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final java.lang.String t$141275 = ((t$141272) + (t$141273));
            
            //#line 200 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            t$141274.println(((java.lang.Object)(t$141275)));
            
            //#line 201 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            ((x10.util.HashMap<java.lang.String, x10.core.Rail<java.lang.String>>)props).put__0x10$util$HashMap$$K__1x10$util$HashMap$$V(((java.lang.String)(key)), ((x10.core.Rail)(valueArray)));
        }
        
        public $Closure$301() {
             {
                
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$302 extends x10.core.Ref implements x10.core.fun.Fun_0_3, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$302> $RTT = 
            x10.rtt.StaticFunType.<$Closure$302> make($Closure$302.class,
                                                      new x10.rtt.Type[] {
                                                          x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_3.$RTT, x10.rtt.Types.STRING, x10.rtt.Types.STRING, x10.rtt.ParameterizedType.make(x10.core.Rail.$RTT, x10.rtt.Types.STRING), x10.rtt.Types.STRING)
                                                      });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.util.OptionsParser.$Closure$302 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.util.OptionsParser.$Closure$302 $_obj = new x10.util.OptionsParser.$Closure$302((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            
        }
        
        // constructor just for allocation
        public $Closure$302(final java.lang.System[] $dummy) {
            
        }
        
        // dispatcher for method abstract public (Z1,Z2,Z3)=>U.operator()(a1:Z1, a2:Z2, a3:Z3):U
        public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1, final java.lang.Object a2, final x10.rtt.Type t2, final java.lang.Object a3, final x10.rtt.Type t3) {
            return $apply__2$1x10$lang$String$2((java.lang.String)a1, (java.lang.String)a2, (x10.core.Rail)a3);
            
        }
        
        
    
        
        public java.lang.String $apply__2$1x10$lang$String$2(final java.lang.String key, final java.lang.String orElse, final x10.core.Rail values) {
            
            //#line 211 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final java.lang.String t$141277 = (("request of value for (") + (key));
            
            //#line 211 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final java.lang.String t$141278 = ((t$141277) + (", "));
            
            //#line 211 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final java.lang.String t$141279 = ((t$141278) + (orElse));
            
            //#line 211 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final java.lang.String t$141280 = ((t$141279) + (") failed: values == "));
            
            //#line 211 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final java.lang.String t$141281 = ((t$141280) + (values));
            
            //#line 211 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final x10.util.OptionsParser.Err t$141282 = ((x10.util.OptionsParser.Err)(new x10.util.OptionsParser.Err(t$141281)));
            
            //#line 211 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            throw t$141282;
        }
        
        public $Closure$302() {
             {
                
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$303 extends x10.core.Ref implements x10.core.fun.Fun_0_2, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$303> $RTT = 
            x10.rtt.StaticFunType.<$Closure$303> make($Closure$303.class,
                                                      new x10.rtt.Type[] {
                                                          x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_2.$RTT, x10.rtt.Types.STRING, x10.rtt.ParameterizedType.make(x10.util.HashMap.$RTT, x10.rtt.Types.STRING, x10.util.Option.$RTT), x10.rtt.Types.INT)
                                                      });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.util.OptionsParser.$Closure$303 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.util.OptionsParser.$Closure$303 $_obj = new x10.util.OptionsParser.$Closure$303((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            
        }
        
        // constructor just for allocation
        public $Closure$303(final java.lang.System[] $dummy) {
            
        }
        
        // dispatcher for method abstract public (Z1,Z2)=>U.operator()(a1:Z1, a2:Z2):U
        public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1, final java.lang.Object a2, final x10.rtt.Type t2) {
            return x10.core.Int.$box($apply__1$1x10$lang$String$3x10$util$Option$2$O((java.lang.String)a1, (x10.util.HashMap)a2));
            
        }
        
        // dispatcher for method abstract public (Z1,Z2)=>U.operator()(a1:Z1, a2:Z2):U
        public int $apply$I(final java.lang.Object a1, final x10.rtt.Type t1, final java.lang.Object a2, final x10.rtt.Type t2) {
            return $apply__1$1x10$lang$String$3x10$util$Option$2$O((java.lang.String)a1, (x10.util.HashMap)a2);
            
        }
        
        
    
        
        public int $apply__1$1x10$lang$String$3x10$util$Option$2$O(final java.lang.String key, final x10.util.HashMap keyMap) {
            
            //#line 240 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final x10.io.Printer t$141285 = ((x10.io.Printer)(x10.io.Console.get$ERR()));
            
            //#line 240 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final java.lang.String t$141284 = (("Unknown key, \'") + (key));
            
            //#line 240 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final java.lang.String t$141286 = ((t$141284) + ("\' will be treated as flag."));
            
            //#line 240 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            t$141285.println(((java.lang.Object)(t$141286)));
            
            //#line 241 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            java.lang.String shortKey = "";
            
            //#line 241 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            java.lang.String longKey = "";
            
            //#line 242 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final int t$141287 = (key).indexOf("--");
            
            //#line 242 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final boolean t$141292 = ((int) t$141287) == ((int) 0);
            
            //#line 242 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            if (t$141292) {
                
                //#line 242 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                longKey = key;
            } else {
                
                //#line 243 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                final int t$141288 = (key).indexOf("-");
                
                //#line 243 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                final boolean t$141291 = ((int) t$141288) == ((int) 0);
                
                //#line 243 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                if (t$141291) {
                    
                    //#line 243 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                    shortKey = key;
                } else {
                    
                    //#line 244 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                    final java.lang.String t$141289 = (("--") + (key));
                    
                    //#line 244 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                    longKey = t$141289;
                    
                    //#line 244 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                    final java.lang.String t$141290 = (("-") + (key));
                    
                    //#line 244 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                    shortKey = t$141290;
                }
            }
            
            //#line 245 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final java.lang.String t$141293 = shortKey;
            
            //#line 245 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final int t$141294 = (t$141293).length();
            
            //#line 245 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final long t$141295 = ((long)(((int)(t$141294))));
            
            //#line 245 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            boolean t$141299 = ((t$141295) > (((long)(0L))));
            
            //#line 245 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            if (!(t$141299)) {
                
                //#line 245 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                final java.lang.String t$141296 = longKey;
                
                //#line 245 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                final int t$141297 = (t$141296).length();
                
                //#line 245 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                final long t$141298 = ((long)(((int)(t$141297))));
                
                //#line 245 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                t$141299 = ((t$141298) > (((long)(0L))));
            }
            
            //#line 245 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            final boolean t$141312 = t$141299;
            
            //#line 245 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            if (t$141312) {
                
                //#line 246 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                final x10.util.Option added = new x10.util.Option((java.lang.System[]) null);
                
                //#line 246 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                final java.lang.String t$141650 = shortKey;
                
                //#line 246 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                final java.lang.String t$141651 = longKey;
                
                //#line 246 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                added.x10$util$Option$$init$S(t$141650, t$141651, ((java.lang.String)("???")), ((int)(0)), ((boolean)(true)), ((boolean)(false)), ((boolean)(true)));
                
                //#line 247 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                final java.lang.String t$141302 = shortKey;
                
                //#line 247 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                final int t$141303 = (t$141302).length();
                
                //#line 247 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                final long t$141304 = ((long)(((int)(t$141303))));
                
                //#line 247 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                final boolean t$141306 = ((t$141304) > (((long)(0L))));
                
                //#line 247 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                if (t$141306) {
                    
                    //#line 247 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                    final java.lang.String t$141305 = shortKey;
                    
                    //#line 247 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                    ((x10.util.HashMap<java.lang.String, x10.util.Option>)keyMap).put__0x10$util$HashMap$$K__1x10$util$HashMap$$V(((java.lang.String)(t$141305)), ((x10.util.Option)(added)));
                }
                
                //#line 248 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                final java.lang.String t$141307 = longKey;
                
                //#line 248 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                final int t$141308 = (t$141307).length();
                
                //#line 248 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                final long t$141309 = ((long)(((int)(t$141308))));
                
                //#line 248 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                final boolean t$141311 = ((t$141309) > (((long)(0L))));
                
                //#line 248 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                if (t$141311) {
                    
                    //#line 248 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                    final java.lang.String t$141310 = longKey;
                    
                    //#line 248 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                    ((x10.util.HashMap<java.lang.String, x10.util.Option>)keyMap).put__0x10$util$HashMap$$K__1x10$util$HashMap$$V(((java.lang.String)(t$141310)), ((x10.util.Option)(added)));
                }
            }
            
            //#line 250 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            return 0;
        }
        
        public $Closure$303() {
             {
                
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$304 extends x10.core.Ref implements x10.core.fun.Fun_0_3, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$304> $RTT = 
            x10.rtt.StaticFunType.<$Closure$304> make($Closure$304.class,
                                                      new x10.rtt.Type[] {
                                                          x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_3.$RTT, x10.rtt.Types.STRING, x10.rtt.Types.STRING, x10.rtt.ParameterizedType.make(x10.core.Rail.$RTT, x10.rtt.Types.STRING), x10.rtt.Types.STRING)
                                                      });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.util.OptionsParser.$Closure$304 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.util.OptionsParser.$Closure$304 $_obj = new x10.util.OptionsParser.$Closure$304((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            
        }
        
        // constructor just for allocation
        public $Closure$304(final java.lang.System[] $dummy) {
            
        }
        
        // dispatcher for method abstract public (Z1,Z2,Z3)=>U.operator()(a1:Z1, a2:Z2, a3:Z3):U
        public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1, final java.lang.Object a2, final x10.rtt.Type t2, final java.lang.Object a3, final x10.rtt.Type t3) {
            return $apply__2$1x10$lang$String$2((java.lang.String)a1, (java.lang.String)a2, (x10.core.Rail)a3);
            
        }
        
        
    
        
        public java.lang.String $apply__2$1x10$lang$String$2(final java.lang.String key, final java.lang.String orElse, final x10.core.Rail values) {
            
            //#line 220 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            return ((java.lang.String[])values.value)[(int)0L];
        }
        
        public $Closure$304() {
             {
                
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$305 extends x10.core.Ref implements x10.core.fun.Fun_0_3, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$305> $RTT = 
            x10.rtt.StaticFunType.<$Closure$305> make($Closure$305.class,
                                                      new x10.rtt.Type[] {
                                                          x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_3.$RTT, x10.rtt.Types.STRING, x10.rtt.Types.STRING, x10.rtt.ParameterizedType.make(x10.core.Rail.$RTT, x10.rtt.Types.STRING), x10.rtt.Types.STRING)
                                                      });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.util.OptionsParser.$Closure$305 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.util.OptionsParser.$Closure$305 $_obj = new x10.util.OptionsParser.$Closure$305((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            
        }
        
        // constructor just for allocation
        public $Closure$305(final java.lang.System[] $dummy) {
            
        }
        
        // dispatcher for method abstract public (Z1,Z2,Z3)=>U.operator()(a1:Z1, a2:Z2, a3:Z3):U
        public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1, final java.lang.Object a2, final x10.rtt.Type t2, final java.lang.Object a3, final x10.rtt.Type t3) {
            return $apply__2$1x10$lang$String$2((java.lang.String)a1, (java.lang.String)a2, (x10.core.Rail)a3);
            
        }
        
        
    
        
        public java.lang.String $apply__2$1x10$lang$String$2(final java.lang.String key, final java.lang.String orElse, final x10.core.Rail values) {
            
            //#line 228 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            return ((java.lang.String[])values.value)[(int)((((x10.core.Rail<java.lang.String>)values).size) - (((long)(1L))))];
        }
        
        public $Closure$305() {
             {
                
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$306 extends x10.core.Ref implements x10.core.fun.Fun_0_2, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$306> $RTT = 
            x10.rtt.StaticFunType.<$Closure$306> make($Closure$306.class,
                                                      new x10.rtt.Type[] {
                                                          x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_2.$RTT, x10.rtt.Types.STRING, x10.rtt.ParameterizedType.make(x10.util.HashMap.$RTT, x10.rtt.Types.STRING, x10.util.Option.$RTT), x10.rtt.Types.INT)
                                                      });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.util.OptionsParser.$Closure$306 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.util.OptionsParser.$Closure$306 $_obj = new x10.util.OptionsParser.$Closure$306((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            
        }
        
        // constructor just for allocation
        public $Closure$306(final java.lang.System[] $dummy) {
            
        }
        
        // dispatcher for method abstract public (Z1,Z2)=>U.operator()(a1:Z1, a2:Z2):U
        public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1, final java.lang.Object a2, final x10.rtt.Type t2) {
            return x10.core.Int.$box($apply__1$1x10$lang$String$3x10$util$Option$2$O((java.lang.String)a1, (x10.util.HashMap)a2));
            
        }
        
        // dispatcher for method abstract public (Z1,Z2)=>U.operator()(a1:Z1, a2:Z2):U
        public int $apply$I(final java.lang.Object a1, final x10.rtt.Type t1, final java.lang.Object a2, final x10.rtt.Type t2) {
            return $apply__1$1x10$lang$String$3x10$util$Option$2$O((java.lang.String)a1, (x10.util.HashMap)a2);
            
        }
        
        
    
        
        public int $apply__1$1x10$lang$String$3x10$util$Option$2$O(final java.lang.String key, final x10.util.HashMap keyMap) {
            
            //#line 255 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            return 1;
        }
        
        public $Closure$306() {
             {
                
            }
        }
        
    }
    
}

