package x10.lang;

@x10.runtime.impl.java.X10Generated
final public class SparsePlaceGroup extends x10.lang.PlaceGroup implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<SparsePlaceGroup> $RTT = 
        x10.rtt.NamedType.<SparsePlaceGroup> make("x10.lang.SparsePlaceGroup",
                                                  SparsePlaceGroup.class,
                                                  new x10.rtt.Type[] {
                                                      x10.lang.PlaceGroup.$RTT
                                                  });
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.SparsePlaceGroup $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.lang.PlaceGroup.$_deserialize_body($_obj, $deserializer);
        $_obj.places = $deserializer.readObject();
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.lang.SparsePlaceGroup $_obj = new x10.lang.SparsePlaceGroup((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        super.$_serialize($serializer);
        $serializer.write(this.places);
        
    }
    
    // constructor just for allocation
    public SparsePlaceGroup(final java.lang.System[] $dummy) {
        super($dummy);
        
    }
    
    // synthetic type for parameter mangling
    public static final class __0$1x10$lang$Place$2 {}
    

    
    //#line 36 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/SparsePlaceGroup.x10"
    /**
   * The set of places.
   * The array is in sorted order by Place.id.
   * Only places that are in the group are in the array.
   */
    public x10.core.Rail<x10.lang.Place> places;
    
    
    //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/SparsePlaceGroup.x10"
    // creation method for java code (1-phase java constructor)
    public SparsePlaceGroup(final x10.core.Rail<x10.lang.Place> ps, __0$1x10$lang$Place$2 $dummy) {
        this((java.lang.System[]) null);
        x10$lang$SparsePlaceGroup$$init$S(ps, (x10.lang.SparsePlaceGroup.__0$1x10$lang$Place$2) null);
    }
    
    // constructor for non-virtual call
    final public x10.lang.SparsePlaceGroup x10$lang$SparsePlaceGroup$$init$S(final x10.core.Rail<x10.lang.Place> ps, __0$1x10$lang$Place$2 $dummy) {
         {
            
            //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/SparsePlaceGroup.x10"
            final x10.lang.PlaceGroup this$114472 = this;
            
            //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/SparsePlaceGroup.x10"
            
            
            //#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/SparsePlaceGroup.x10"
            final x10.lang.SparsePlaceGroup this$114553 = this;
            
            //#line 44 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/SparsePlaceGroup.x10"
            final x10.core.Rail t$114493 = ((x10.core.Rail)(new x10.core.Rail<x10.lang.Place>(x10.lang.Place.$RTT, ((x10.core.Rail)(ps)), (x10.core.Rail.__0$1x10$lang$Rail$$T$2) null)));
            
            //#line 44 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/SparsePlaceGroup.x10"
            this.places = ((x10.core.Rail)(t$114493));
            
            //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/SparsePlaceGroup.x10"
            final x10.core.Rail t$114554 = ((x10.core.Rail)(places));
            
            //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/SparsePlaceGroup.x10"
            final long t$114555 = ((x10.core.Rail<x10.lang.Place>)t$114554).size;
            
            //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/SparsePlaceGroup.x10"
            final long i$114411max$114556 = ((t$114555) - (((long)(1L))));
            
            //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/SparsePlaceGroup.x10"
            long i$114550 = 1L;
            
            //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/SparsePlaceGroup.x10"
            for (;
                 true;
                 ) {
                
                //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/SparsePlaceGroup.x10"
                final long t$114551 = i$114550;
                
                //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/SparsePlaceGroup.x10"
                final boolean t$114552 = ((t$114551) <= (((long)(i$114411max$114556))));
                
                //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/SparsePlaceGroup.x10"
                if (!(t$114552)) {
                    
                    //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/SparsePlaceGroup.x10"
                    break;
                }
                
                //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/SparsePlaceGroup.x10"
                final long i$114547 = i$114550;
                
                //#line 46 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/SparsePlaceGroup.x10"
                final x10.core.Rail t$114538 = ((x10.core.Rail)(places));
                
                //#line 46 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/SparsePlaceGroup.x10"
                final x10.lang.Place t$114539 = ((x10.lang.Place[])t$114538.value)[(int)i$114547];
                
                //#line 46 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/SparsePlaceGroup.x10"
                final long t$114540 = t$114539.id;
                
                //#line 46 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/SparsePlaceGroup.x10"
                final x10.core.Rail t$114541 = ((x10.core.Rail)(places));
                
                //#line 46 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/SparsePlaceGroup.x10"
                final long t$114542 = ((i$114547) - (((long)(1L))));
                
                //#line 46 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/SparsePlaceGroup.x10"
                final x10.lang.Place t$114543 = ((x10.lang.Place[])t$114541.value)[(int)t$114542];
                
                //#line 46 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/SparsePlaceGroup.x10"
                final long t$114544 = t$114543.id;
                
                //#line 46 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/SparsePlaceGroup.x10"
                final boolean t$114545 = ((t$114540) <= (((long)(t$114544))));
                
                //#line 46 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/SparsePlaceGroup.x10"
                if (t$114545) {
                    
                    //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/SparsePlaceGroup.x10"
                    final java.lang.IllegalArgumentException t$114546 = ((java.lang.IllegalArgumentException)(new java.lang.IllegalArgumentException("Argument rail was not sorted")));
                    
                    //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/SparsePlaceGroup.x10"
                    throw t$114546;
                }
                
                //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/SparsePlaceGroup.x10"
                final long t$114548 = i$114550;
                
                //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/SparsePlaceGroup.x10"
                final long t$114549 = ((t$114548) + (((long)(1L))));
                
                //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/SparsePlaceGroup.x10"
                i$114550 = t$114549;
            }
        }
        return this;
    }
    
    
    
    //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/SparsePlaceGroup.x10"
    // creation method for java code (1-phase java constructor)
    public SparsePlaceGroup(final x10.lang.PlaceGroup pg) {
        this((java.lang.System[]) null);
        x10$lang$SparsePlaceGroup$$init$S(pg);
    }
    
    // constructor for non-virtual call
    final public x10.lang.SparsePlaceGroup x10$lang$SparsePlaceGroup$$init$S(final x10.lang.PlaceGroup pg) {
         {
            
            //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/SparsePlaceGroup.x10"
            final x10.lang.PlaceGroup this$114479 = this;
            
            //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/SparsePlaceGroup.x10"
            
            
            //#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/SparsePlaceGroup.x10"
            final x10.lang.SparsePlaceGroup this$114557 = this;
            
            //#line 41 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
            final long t$114511 = pg.numPlaces$O();
            
            //#line 56 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/SparsePlaceGroup.x10"
            final x10.core.fun.Fun_0_1 t$114512 = ((x10.core.fun.Fun_0_1)(new x10.lang.SparsePlaceGroup.$Closure$189(pg)));
            
            //#line 56 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/SparsePlaceGroup.x10"
            final x10.core.Rail t$114513 = ((x10.core.Rail)(new x10.core.Rail<x10.lang.Place>(x10.lang.Place.$RTT, t$114511, ((x10.core.fun.Fun_0_1)(t$114512)), (x10.core.Rail.__1$1x10$lang$Long$3x10$lang$Rail$$T$2) null)));
            
            //#line 56 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/SparsePlaceGroup.x10"
            this.places = ((x10.core.Rail)(t$114513));
        }
        return this;
    }
    
    
    
    //#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/SparsePlaceGroup.x10"
    // creation method for java code (1-phase java constructor)
    public SparsePlaceGroup(final x10.lang.Place p) {
        this((java.lang.System[]) null);
        x10$lang$SparsePlaceGroup$$init$S(p);
    }
    
    // constructor for non-virtual call
    final public x10.lang.SparsePlaceGroup x10$lang$SparsePlaceGroup$$init$S(final x10.lang.Place p) {
         {
            
            //#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/SparsePlaceGroup.x10"
            final x10.lang.PlaceGroup this$114486 = this;
            
            //#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/SparsePlaceGroup.x10"
            
            
            //#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/SparsePlaceGroup.x10"
            final x10.lang.SparsePlaceGroup this$114558 = this;
            
            //#line 64 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/SparsePlaceGroup.x10"
            final x10.core.Rail t$114514 = ((x10.core.Rail)(new x10.core.Rail<x10.lang.Place>(x10.lang.Place.$RTT, ((long)(1L)), ((x10.lang.Place)(p)), (x10.core.Rail.__1x10$lang$Rail$$T) null)));
            
            //#line 64 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/SparsePlaceGroup.x10"
            this.places = ((x10.core.Rail)(t$114514));
        }
        return this;
    }
    
    
    
    //#line 67 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/SparsePlaceGroup.x10"
    public x10.lang.Place $apply(final long i) {
        
        //#line 67 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/SparsePlaceGroup.x10"
        final x10.core.Rail t$114515 = ((x10.core.Rail)(places));
        
        //#line 67 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/SparsePlaceGroup.x10"
        final x10.lang.Place t$114516 = ((x10.lang.Place[])t$114515.value)[(int)i];
        
        //#line 67 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/SparsePlaceGroup.x10"
        return t$114516;
    }
    
    
    //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/SparsePlaceGroup.x10"
    public x10.lang.Iterator iterator() {
        
        //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/SparsePlaceGroup.x10"
        final x10.core.Rail t$114517 = ((x10.core.Rail)(places));
        
        //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/SparsePlaceGroup.x10"
        final x10.lang.Iterator t$114518 = ((x10.lang.Iterator<x10.lang.Place>)
                                             ((x10.core.Rail<x10.lang.Place>)t$114517).iterator());
        
        //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/SparsePlaceGroup.x10"
        return t$114518;
    }
    
    
    //#line 71 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/SparsePlaceGroup.x10"
    public long numPlaces$O() {
        
        //#line 71 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/SparsePlaceGroup.x10"
        final x10.core.Rail t$114519 = ((x10.core.Rail)(places));
        
        //#line 71 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/SparsePlaceGroup.x10"
        final long t$114520 = ((x10.core.Rail<x10.lang.Place>)t$114519).size;
        
        //#line 71 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/SparsePlaceGroup.x10"
        return t$114520;
    }
    
    
    //#line 73 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/SparsePlaceGroup.x10"
    public boolean contains$O(final long id) {
        
        //#line 74 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/SparsePlaceGroup.x10"
        final x10.core.Rail rail$114568 = ((x10.core.Rail)(places));
        
        //#line 74 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/SparsePlaceGroup.x10"
        final long size$114569 = ((x10.core.Rail<x10.lang.Place>)rail$114568).size;
        
        //#line 74 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/SparsePlaceGroup.x10"
        long idx$114565 = 0L;
        {
            
            //#line 74 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/SparsePlaceGroup.x10"
            final x10.lang.Place[] rail$114568$value$114582 = ((x10.lang.Place[])rail$114568.value);
            
            //#line 74 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/SparsePlaceGroup.x10"
            for (;
                 true;
                 ) {
                
                //#line 74 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/SparsePlaceGroup.x10"
                final long t$114566 = idx$114565;
                
                //#line 74 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/SparsePlaceGroup.x10"
                final boolean t$114567 = ((t$114566) < (((long)(size$114569))));
                
                //#line 74 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/SparsePlaceGroup.x10"
                if (!(t$114567)) {
                    
                    //#line 74 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/SparsePlaceGroup.x10"
                    break;
                }
                
                //#line 74 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/SparsePlaceGroup.x10"
                final long t$114561 = idx$114565;
                
                //#line 74 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/SparsePlaceGroup.x10"
                final x10.lang.Place p$114562 = ((x10.lang.Place)(((x10.lang.Place)rail$114568$value$114582[(int)t$114561])));
                
                //#line 75 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/SparsePlaceGroup.x10"
                final long t$114559 = p$114562.id;
                
                //#line 75 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/SparsePlaceGroup.x10"
                final boolean t$114560 = ((long) t$114559) == ((long) id);
                
                //#line 75 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/SparsePlaceGroup.x10"
                if (t$114560) {
                    
                    //#line 75 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/SparsePlaceGroup.x10"
                    return true;
                }
                
                //#line 74 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/SparsePlaceGroup.x10"
                final long t$114563 = idx$114565;
                
                //#line 74 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/SparsePlaceGroup.x10"
                final long t$114564 = ((t$114563) + (((long)(1L))));
                
                //#line 74 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/SparsePlaceGroup.x10"
                idx$114565 = t$114564;
            }
        }
        
        //#line 77 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/SparsePlaceGroup.x10"
        return false;
    }
    
    
    //#line 80 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/SparsePlaceGroup.x10"
    public long indexOf$O(final long id) {
        
        //#line 81 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/SparsePlaceGroup.x10"
        final x10.core.Rail rail$114580 = ((x10.core.Rail)(places));
        
        //#line 81 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/SparsePlaceGroup.x10"
        final long i$114454max$114581 = ((x10.core.Rail<x10.lang.Place>)rail$114580).size;
        
        //#line 81 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/SparsePlaceGroup.x10"
        long i$114577 = 0L;
        
        //#line 81 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/SparsePlaceGroup.x10"
        for (;
             true;
             ) {
            
            //#line 81 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/SparsePlaceGroup.x10"
            final long t$114578 = i$114577;
            
            //#line 81 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/SparsePlaceGroup.x10"
            final boolean t$114579 = ((t$114578) < (((long)(i$114454max$114581))));
            
            //#line 81 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/SparsePlaceGroup.x10"
            if (!(t$114579)) {
                
                //#line 81 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/SparsePlaceGroup.x10"
                break;
            }
            
            //#line 81 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/SparsePlaceGroup.x10"
            final long i$114574 = i$114577;
            
            //#line 82 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/SparsePlaceGroup.x10"
            final x10.core.Rail t$114570 = ((x10.core.Rail)(places));
            
            //#line 82 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/SparsePlaceGroup.x10"
            final x10.lang.Place t$114571 = ((x10.lang.Place[])t$114570.value)[(int)i$114574];
            
            //#line 82 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/SparsePlaceGroup.x10"
            final long t$114572 = t$114571.id;
            
            //#line 82 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/SparsePlaceGroup.x10"
            final boolean t$114573 = ((long) t$114572) == ((long) id);
            
            //#line 82 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/SparsePlaceGroup.x10"
            if (t$114573) {
                
                //#line 82 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/SparsePlaceGroup.x10"
                return i$114574;
            }
            
            //#line 81 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/SparsePlaceGroup.x10"
            final long t$114575 = i$114577;
            
            //#line 81 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/SparsePlaceGroup.x10"
            final long t$114576 = ((t$114575) + (((long)(1L))));
            
            //#line 81 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/SparsePlaceGroup.x10"
            i$114577 = t$114576;
        }
        
        //#line 84 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/SparsePlaceGroup.x10"
        return -1L;
    }
    
    
    //#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/SparsePlaceGroup.x10"
    final public x10.lang.SparsePlaceGroup x10$lang$SparsePlaceGroup$$this$x10$lang$SparsePlaceGroup() {
        
        //#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/SparsePlaceGroup.x10"
        return x10.lang.SparsePlaceGroup.this;
    }
    
    
    //#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/SparsePlaceGroup.x10"
    final public void __fieldInitializers_x10_lang_SparsePlaceGroup() {
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$189 extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$189> $RTT = 
            x10.rtt.StaticFunType.<$Closure$189> make($Closure$189.class,
                                                      new x10.rtt.Type[] {
                                                          x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.LONG, x10.lang.Place.$RTT)
                                                      });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.SparsePlaceGroup.$Closure$189 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.pg = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.lang.SparsePlaceGroup.$Closure$189 $_obj = new x10.lang.SparsePlaceGroup.$Closure$189((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.pg);
            
        }
        
        // constructor just for allocation
        public $Closure$189(final java.lang.System[] $dummy) {
            
        }
        
        // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1):U
        public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1) {
            return $apply(x10.core.Long.$unbox(a1));
            
        }
        
        
    
        
        public x10.lang.Place $apply(final long i) {
            
            //#line 56 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/SparsePlaceGroup.x10"
            final x10.lang.Place t$114510 = this.pg.$apply((long)(i));
            
            //#line 56 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/SparsePlaceGroup.x10"
            return t$114510;
        }
        
        public x10.lang.PlaceGroup pg;
        
        public $Closure$189(final x10.lang.PlaceGroup pg) {
             {
                this.pg = ((x10.lang.PlaceGroup)(pg));
            }
        }
        
    }
    
}

