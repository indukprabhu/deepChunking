package x10.glb;


@x10.runtime.impl.java.X10Generated
public class ArrayListTaskBag<$T> extends x10.core.Ref implements x10.glb.TaskBag, x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<ArrayListTaskBag> $RTT = 
        x10.rtt.NamedType.<ArrayListTaskBag> make("x10.glb.ArrayListTaskBag",
                                                  ArrayListTaskBag.class,
                                                  1,
                                                  new x10.rtt.Type[] {
                                                      x10.glb.TaskBag.$RTT
                                                  });
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $T; return null; }
    
    public static <$T> x10.serialization.X10JavaSerializable $_deserialize_body(x10.glb.ArrayListTaskBag<$T> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        $_obj.$T = (x10.rtt.Type) $deserializer.readObject();
        $_obj.bag = $deserializer.readObject();
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.glb.ArrayListTaskBag $_obj = new x10.glb.ArrayListTaskBag((java.lang.System[]) null, (x10.rtt.Type) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        $serializer.write(this.$T);
        $serializer.write(this.bag);
        
    }
    
    // constructor just for allocation
    public ArrayListTaskBag(final java.lang.System[] $dummy, final x10.rtt.Type $T) {
        x10.glb.ArrayListTaskBag.$initParams(this, $T);
        
    }
    
    private x10.rtt.Type $T;
    
    // initializer of type parameters
    public static void $initParams(final ArrayListTaskBag $this, final x10.rtt.Type $T) {
        $this.$T = $T;
        
    }
    

    
    //#line 10 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/ArrayListTaskBag.x10"
    public x10.util.ArrayList<$T> bag;
    
    
    //#line 12 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/ArrayListTaskBag.x10"
    public long size$O() {
        
        //#line 12 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/ArrayListTaskBag.x10"
        final x10.util.ArrayList t$81050 = ((x10.util.ArrayList)(bag));
        
        //#line 12 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/ArrayListTaskBag.x10"
        final long t$81051 = ((x10.util.ArrayList<$T>)t$81050).size$O();
        
        //#line 12 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/ArrayListTaskBag.x10"
        return t$81051;
    }
    
    
    //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/ArrayListTaskBag.x10"
    public void merge(final x10.glb.TaskBag tb0) {
        
        //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/ArrayListTaskBag.x10"
        assert x10.glb.ArrayListTaskBag.$RTT.isInstance(tb0, $T);
        
        //#line 20 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/ArrayListTaskBag.x10"
        final x10.glb.ArrayListTaskBag tb = ((x10.glb.ArrayListTaskBag)(x10.rtt.Types.<x10.glb.ArrayListTaskBag<$T>> cast(tb0,x10.rtt.ParameterizedType.make(x10.glb.ArrayListTaskBag.$RTT, $T))));
        
        //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/ArrayListTaskBag.x10"
        final x10.util.ArrayList t$81052 = ((x10.util.ArrayList)(bag));
        
        //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/ArrayListTaskBag.x10"
        final x10.util.ArrayList t$81053 = ((x10.util.ArrayList)(((x10.glb.ArrayListTaskBag<$T>)tb).bag));
        
        //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/ArrayListTaskBag.x10"
        ((x10.util.AbstractCollection<$T>)t$81052).addAll__0$1x10$util$AbstractCollection$$T$2$O(((x10.util.Container)(t$81053)));
    }
    
    
    //#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/ArrayListTaskBag.x10"
    public x10.glb.ArrayListTaskBag split() {
        
        //#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/ArrayListTaskBag.x10"
        final x10.util.ArrayList t$81054 = ((x10.util.ArrayList)(bag));
        
        //#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/ArrayListTaskBag.x10"
        final long t$81055 = ((x10.util.ArrayList<$T>)t$81054).size$O();
        
        //#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/ArrayListTaskBag.x10"
        final boolean t$81056 = ((t$81055) <= (((long)(1L))));
        
        //#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/ArrayListTaskBag.x10"
        if (t$81056) {
            
            //#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/ArrayListTaskBag.x10"
            return null;
        }
        
        //#line 31 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/ArrayListTaskBag.x10"
        final x10.util.ArrayList t$81057 = ((x10.util.ArrayList)(bag));
        
        //#line 31 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/ArrayListTaskBag.x10"
        final long t$81058 = ((x10.util.ArrayList<$T>)t$81057).size$O();
        
        //#line 31 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/ArrayListTaskBag.x10"
        final long size = ((t$81058) / (((long)(2L))));
        
        //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/ArrayListTaskBag.x10"
        final x10.glb.ArrayListTaskBag o = ((x10.glb.ArrayListTaskBag)(new x10.glb.ArrayListTaskBag<$T>((java.lang.System[]) null, $T)));
        
        //#line 10 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/ArrayListTaskBag.x10"
        final x10.util.ArrayList alloc$81068 = ((x10.util.ArrayList)(new x10.util.ArrayList<$T>((java.lang.System[]) null, $T)));
        
        //#line 10 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/ArrayListTaskBag.x10"
        alloc$81068.x10$util$ArrayList$$init$S();
        
        //#line 8 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/ArrayListTaskBag.x10"
        ((x10.glb.ArrayListTaskBag<$T>)o).bag = ((x10.util.ArrayList)(alloc$81068));
        
        //#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/ArrayListTaskBag.x10"
        final long i$80624max$81078 = size;
        
        //#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/ArrayListTaskBag.x10"
        long i$81075 = 1L;
        
        //#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/ArrayListTaskBag.x10"
        for (;
             true;
             ) {
            
            //#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/ArrayListTaskBag.x10"
            final long t$81076 = i$81075;
            
            //#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/ArrayListTaskBag.x10"
            final boolean t$81077 = ((t$81076) <= (((long)(i$80624max$81078))));
            
            //#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/ArrayListTaskBag.x10"
            if (!(t$81077)) {
                
                //#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/ArrayListTaskBag.x10"
                break;
            }
            
            //#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/ArrayListTaskBag.x10"
            final long i$81072 = i$81075;
            
            //#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/ArrayListTaskBag.x10"
            final x10.util.ArrayList t$81069 = ((x10.util.ArrayList)(((x10.glb.ArrayListTaskBag<$T>)o).bag));
            
            //#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/ArrayListTaskBag.x10"
            final x10.util.ArrayList t$81070 = ((x10.util.ArrayList)(bag));
            
            //#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/ArrayListTaskBag.x10"
            final $T t$81071 = (($T)(((x10.util.ArrayList<$T>)t$81070).removeLast$G()));
            
            //#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/ArrayListTaskBag.x10"
            ((x10.util.ArrayList<$T>)t$81069).add__0x10$util$ArrayList$$T$O((($T)(t$81071)));
            
            //#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/ArrayListTaskBag.x10"
            final long t$81073 = i$81075;
            
            //#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/ArrayListTaskBag.x10"
            final long t$81074 = ((t$81073) + (((long)(1L))));
            
            //#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/ArrayListTaskBag.x10"
            i$81075 = t$81074;
        }
        
        //#line 34 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/ArrayListTaskBag.x10"
        return o;
    }
    
    
    //#line 41 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/ArrayListTaskBag.x10"
    public x10.util.ArrayList bag() {
        
        //#line 41 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/ArrayListTaskBag.x10"
        final x10.util.ArrayList t$81067 = ((x10.util.ArrayList)(bag));
        
        //#line 41 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/ArrayListTaskBag.x10"
        return t$81067;
    }
    
    
    //#line 8 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/ArrayListTaskBag.x10"
    final public x10.glb.ArrayListTaskBag x10$glb$ArrayListTaskBag$$this$x10$glb$ArrayListTaskBag() {
        
        //#line 8 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/ArrayListTaskBag.x10"
        return x10.glb.ArrayListTaskBag.this;
    }
    
    
    //#line 8 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/ArrayListTaskBag.x10"
    // creation method for java code (1-phase java constructor)
    public ArrayListTaskBag(final x10.rtt.Type $T) {
        this((java.lang.System[]) null, $T);
        x10$glb$ArrayListTaskBag$$init$S();
    }
    
    // constructor for non-virtual call
    final public x10.glb.ArrayListTaskBag<$T> x10$glb$ArrayListTaskBag$$init$S() {
         {
            
            //#line 8 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/ArrayListTaskBag.x10"
            
            
            //#line 8 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/ArrayListTaskBag.x10"
            final x10.glb.ArrayListTaskBag this$81047 = this;
            
            //#line 10 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/ArrayListTaskBag.x10"
            final x10.util.ArrayList alloc$81079 = ((x10.util.ArrayList)(new x10.util.ArrayList<$T>((java.lang.System[]) null, $T)));
            
            //#line 10 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/ArrayListTaskBag.x10"
            alloc$81079.x10$util$ArrayList$$init$S();
            
            //#line 8 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/ArrayListTaskBag.x10"
            ((x10.glb.ArrayListTaskBag<$T>)this$81047).bag = ((x10.util.ArrayList)(alloc$81079));
        }
        return this;
    }
    
    
    
    //#line 8 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/ArrayListTaskBag.x10"
    final public void __fieldInitializers_x10_glb_ArrayListTaskBag() {
        
        //#line 10 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/ArrayListTaskBag.x10"
        final x10.util.ArrayList alloc$80622 = ((x10.util.ArrayList)(new x10.util.ArrayList<$T>((java.lang.System[]) null, $T)));
        
        //#line 10 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/ArrayListTaskBag.x10"
        alloc$80622.x10$util$ArrayList$$init$S();
        
        //#line 8 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/ArrayListTaskBag.x10"
        ((x10.glb.ArrayListTaskBag<$T>)this).bag = ((x10.util.ArrayList)(alloc$80622));
    }
}

