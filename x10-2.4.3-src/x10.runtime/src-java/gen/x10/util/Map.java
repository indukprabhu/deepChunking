package x10.util;

@x10.runtime.impl.java.X10Generated
public interface Map<$K, $V> extends x10.core.Any
{
    public static final x10.rtt.RuntimeType<Map> $RTT = 
        x10.rtt.NamedType.<Map> make("x10.util.Map",
                                     Map.class,
                                     2);
    
    

    
    
    //#line 15 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Map.x10"
    boolean containsKey$Z(final java.lang.Object k, x10.rtt.Type t1);
    
    
    //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Map.x10"
    java.lang.Object get(final java.lang.Object k, x10.rtt.Type t1);
    
    
    //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Map.x10"
    java.lang.Object getOrElse(final java.lang.Object k, x10.rtt.Type t1, final java.lang.Object orelse, x10.rtt.Type t2);
    
    
    //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Map.x10"
    java.lang.Object getOrThrow(final java.lang.Object k, x10.rtt.Type t1);
    
    
    //#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Map.x10"
    java.lang.Object put(final java.lang.Object k, x10.rtt.Type t1, final java.lang.Object v, x10.rtt.Type t2);
    
    
    //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Map.x10"
    java.lang.Object remove(final java.lang.Object k, x10.rtt.Type t1);
    
    
    //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Map.x10"
    x10.util.Set keySet();
    
    
    //#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Map.x10"
    void clear();
    
    
    //#line 31 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Map.x10"
    x10.util.Set entries();
    
    
    //#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Map.x10"
    long size$O();
    
    
    //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Map.x10"
    @x10.runtime.impl.java.X10Generated
    public static interface Entry<$Key, $Val> extends x10.core.Any
    {
        public static final x10.rtt.RuntimeType<Entry> $RTT = 
            x10.rtt.NamedType.<Entry> make("x10.util.Map.Entry",
                                           Entry.class,
                                           2);
        
        
    
        
        
        //#line 36 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Map.x10"
        $Key getKey$G();
        
        
        //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Map.x10"
        $Val getValue$G();
        
        
        //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Map.x10"
        void setValue$V(final java.lang.Object v, x10.rtt.Type t1);
    }
    
}

