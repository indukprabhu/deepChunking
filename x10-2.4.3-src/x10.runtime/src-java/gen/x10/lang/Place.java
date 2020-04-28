package x10.lang;


@x10.runtime.impl.java.X10Generated
final public class Place extends x10.core.Struct implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<Place> $RTT = 
        x10.rtt.NamedStructType.<Place> make("x10.lang.Place",
                                             Place.class,
                                             new x10.rtt.Type[] {
                                                 x10.rtt.Types.STRUCT
                                             });
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.Place $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        $_obj.id = $deserializer.readLong();
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.lang.Place $_obj = new x10.lang.Place((java.lang.System[]) null);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        $serializer.write(this.id);
        
    }
    
    // zero value constructor
    public Place(final java.lang.System $dummy) { this.id = 0L; }
    
    // constructor just for allocation
    public Place(final java.lang.System[] $dummy) {
        
    }
    
    
    // properties
    
    //#line 31 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
    public long id;
    

    
    
    //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
    final public long id$O() {
        
        //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
        final long t$110717 = id;
        
        //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
        return t$110717;
    }
    
    
    //#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
    /** The number of places including accelerators.
     * Accelerator places have limitations on the kinds of code they can run.
     */
    final public static long ALL_PLACES = 4L;
    
    //#line 44 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
    /** The number of places not including accelerators. */
    final public static long MAX_PLACES = 4L;
    
    
    //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
    final public static long numDead$O() {
        try {
            return ((long)x10.x10rt.X10RT.numDead());
        }
        catch (java.lang.Throwable exc$146401) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$146401);
        }
        
    }
    
    
    
    //#line 52 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
    private static long NUM_ACCELS = 0L;
    
    
    //#line 59 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
    final public static long numChildren$O(final long id) {
        
        //#line 60 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
        return 0L;
    }
    
    
    //#line 65 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
    final public static boolean isHost$O(final long id) {
        
        //#line 66 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
        return true;
    }
    
    
    //#line 71 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
    final public static boolean isDead$O(final long id) {
        try {
            return x10.x10rt.X10RT.isPlaceDead((int)id);
        }
        catch (java.lang.Throwable exc$146402) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$146402);
        }
        
    }
    
    
    
    //#line 78 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
    final public static long numPlaces$O() {
        try {
            return ((long)x10.x10rt.X10RT.numPlaces());
        }
        catch (java.lang.Throwable exc$146403) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$146403);
        }
        
    }
    
    
    
    //#line 85 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
    final public static boolean isCUDA$O(final long id) {
        
        //#line 86 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
        return false;
    }
    
    
    //#line 93 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
    final public static long parent$O(final long id) {
        
        //#line 94 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
        return id;
    }
    
    
    //#line 101 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
    final public static long child$O(final long p, final long i) {
        
        //#line 102 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
        final x10.lang.BadPlaceException t$110719 = ((x10.lang.BadPlaceException)(new x10.lang.BadPlaceException()));
        
        //#line 102 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
        throw t$110719;
    }
    
    
    //#line 108 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
    final public static long childIndex$O(final long id) {
        
        //#line 109 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
        final x10.lang.BadPlaceException t$110720 = ((x10.lang.BadPlaceException)(new x10.lang.BadPlaceException()));
        
        //#line 109 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
        throw t$110720;
    }
    
    
    //#line 111 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
    private static x10.core.Rail<x10.core.Rail<x10.lang.Place>> children;
    
    
    //#line 118 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
    final public static x10.lang.PlaceGroup places() {
        
        //#line 118 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
        final x10.lang.PlaceGroup.SimplePlaceGroup t$110721 = ((x10.lang.PlaceGroup.SimplePlaceGroup)(x10.lang.PlaceGroup.get$WORLD()));
        
        //#line 118 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
        return t$110721;
    }
    
    
    //#line 123 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
    private static x10.lang.Place FIRST_PLACE;
    
    //#line 128 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
    private static x10.lang.Place INVALID_PLACE;
    
    
    //#line 133 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
    // creation method for java code (1-phase java constructor)
    public Place(final long id) {
        this((java.lang.System[]) null);
        x10$lang$Place$$init$S(id);
    }
    
    // constructor for non-virtual call
    final public x10.lang.Place x10$lang$Place$$init$S(final long id) {
         {
            
            //#line 134 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
            this.id = id;
            
            
            //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
            final x10.lang.Place this$110703 = this;
        }
        return this;
    }
    
    
    
    //#line 143 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
    final public static x10.lang.Place place(final long id) {
        
        //#line 143 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
        final x10.lang.Place alloc$80351 = ((x10.lang.Place)(new x10.lang.Place((java.lang.System[]) null)));
        
        //#line 143 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
        alloc$80351.x10$lang$Place$$init$S(((long)(id)));
        
        //#line 143 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
        return alloc$80351;
    }
    
    
    //#line 148 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
    final public x10.lang.Place next() {
        
        //#line 148 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
        final x10.lang.Place t$110722 = this.next((long)(1L));
        
        //#line 148 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
        return t$110722;
    }
    
    
    //#line 153 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
    final public x10.lang.Place prev() {
        
        //#line 153 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
        final x10.lang.Place t$110723 = this.next((long)(-1L));
        
        //#line 153 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
        return t$110723;
    }
    
    
    //#line 158 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
    final public x10.lang.Place prev(final long i) {
        
        //#line 158 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
        final long t$110724 = (-(i));
        
        //#line 158 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
        final x10.lang.Place t$110725 = this.next((long)(t$110724));
        
        //#line 158 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
        return t$110725;
    }
    
    
    //#line 163 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
    final public x10.lang.Place next(final long i) {
        
        //#line 66 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
        final long id$110706 = id;
        {
            
            //#line 166 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
            final long t$110727 = id;
            
            //#line 166 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
            final long t$110726 = ((long)x10.runtime.impl.java.Runtime.MAX_PLACES);
            
            //#line 166 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
            final long t$110728 = ((i) % (((long)(t$110726))));
            
            //#line 166 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
            final long t$110729 = ((t$110727) + (((long)(t$110728))));
            
            //#line 166 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
            final long t$110730 = ((long)x10.runtime.impl.java.Runtime.MAX_PLACES);
            
            //#line 166 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
            final long t$110731 = ((t$110729) + (((long)(t$110730))));
            
            //#line 166 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
            final long t$110732 = ((long)x10.runtime.impl.java.Runtime.MAX_PLACES);
            
            //#line 166 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
            final long k = ((t$110731) % (((long)(t$110732))));
            
            //#line 143 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
            final long id$110707 = k;
            
            //#line 143 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
            final x10.lang.Place alloc$110708 = ((x10.lang.Place)(new x10.lang.Place((java.lang.System[]) null)));
            
            //#line 143 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
            alloc$110708.x10$lang$Place$$init$S(((long)(id$110707)));
            
            //#line 167 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
            return alloc$110708;
        }
    }
    
    
    //#line 176 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
    final public boolean isFirst$O() {
        
        //#line 176 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
        final long t$110733 = id;
        
        //#line 176 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
        final boolean t$110734 = ((long) t$110733) == ((long) 0L);
        
        //#line 176 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
        return t$110734;
    }
    
    
    //#line 177 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
    final public boolean isLast$O() {
        
        //#line 177 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
        final long t$110736 = id;
        
        //#line 177 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
        final long t$110735 = ((long)x10.runtime.impl.java.Runtime.MAX_PLACES);
        
        //#line 177 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
        final long t$110737 = ((t$110735) - (((long)(1L))));
        
        //#line 177 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
        final boolean t$110738 = ((long) t$110736) == ((long) t$110737);
        
        //#line 177 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
        return t$110738;
    }
    
    
    //#line 180 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
    final public boolean isHost$O() {
        
        //#line 66 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
        final long id$110709 = id;
        
        //#line 180 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
        return true;
    }
    
    
    //#line 183 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
    final public boolean isCUDA$O() {
        
        //#line 86 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
        final long id$110710 = id;
        
        //#line 183 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
        return false;
    }
    
    
    //#line 186 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
    final public boolean isDead$O() {
        
        //#line 186 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
        final long t$110739 = id;
        
        //#line 186 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
        final boolean t$110740 = x10.x10rt.X10RT.isPlaceDead((int)((long)(t$110739)));
        
        //#line 186 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
        return t$110740;
    }
    
    
    //#line 192 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
    final public long numChildren$O() {
        
        //#line 60 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
        final long id$110711 = id;
        
        //#line 192 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
        return 0L;
    }
    
    
    //#line 197 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
    final public x10.lang.Place child(final long i) {
        
        //#line 197 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
        final x10.lang.Place alloc$80352 = ((x10.lang.Place)(new x10.lang.Place((java.lang.System[]) null)));
        
        //#line 197 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
        final long t$110774 = id;
        
        //#line 197 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
        final long t$110775 = x10.lang.Place.child$O((long)(t$110774), (long)(i));
        
        //#line 197 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
        alloc$80352.x10$lang$Place$$init$S(t$110775);
        
        //#line 197 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
        return alloc$80352;
    }
    
    
    //#line 200 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
    final public x10.core.Rail children() {
        
        //#line 200 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
        final x10.core.Rail t$110743 = ((x10.core.Rail)(x10.lang.Place.get$children()));
        
        //#line 200 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
        final long t$110744 = id;
        
        //#line 200 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
        final x10.core.Rail t$110745 = ((x10.core.Rail[])t$110743.value)[(int)t$110744];
        
        //#line 200 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
        return t$110745;
    }
    
    
    //#line 203 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
    final public x10.lang.Place parent() {
        
        //#line 203 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
        final x10.lang.Place alloc$80353 = ((x10.lang.Place)(new x10.lang.Place((java.lang.System[]) null)));
        
        //#line 94 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
        final long id$110776 = id;
        
        //#line 203 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
        alloc$80353.x10$lang$Place$$init$S(((long)(id$110776)));
        
        //#line 203 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
        return alloc$80353;
    }
    
    
    //#line 208 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
    final public long childIndex$O() {
        
        //#line 209 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
        final x10.lang.Place this$110713 = ((x10.lang.Place)(this));
        
        //#line 66 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
        final long id$110714 = this$110713.id;
        {
            
            //#line 210 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
            final x10.lang.BadPlaceException t$110746 = ((x10.lang.BadPlaceException)(new x10.lang.BadPlaceException()));
            
            //#line 210 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
            throw t$110746;
        }
    }
    
    
    //#line 215 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
    final public java.lang.String toString() {
        
        //#line 215 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
        final long t$110749 = this.id;
        
        //#line 215 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
        final java.lang.String t$110750 = (("Place(") + ((x10.core.Long.$box(t$110749))));
        
        //#line 215 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
        final java.lang.String t$110751 = ((t$110750) + (")"));
        
        //#line 215 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
        return t$110751;
    }
    
    
    //#line 216 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
    final public boolean equals$O(final x10.lang.Place p) {
        
        //#line 216 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
        final long t$110752 = p.id;
        
        //#line 216 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
        final long t$110753 = this.id;
        
        //#line 216 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
        final boolean t$110754 = ((long) t$110752) == ((long) t$110753);
        
        //#line 216 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
        return t$110754;
    }
    
    
    //#line 217 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
    final public boolean equals(final java.lang.Object p) {
        
        //#line 217 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
        boolean t$110758 = x10.lang.Place.$RTT.isInstance(p);
        
        //#line 217 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
        if (t$110758) {
            
            //#line 217 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
            final x10.lang.Place t$110755 = ((x10.lang.Place)(((x10.lang.Place)x10.rtt.Types.asStruct(x10.lang.Place.$RTT,p))));
            
            //#line 217 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
            final long t$110756 = t$110755.id;
            
            //#line 217 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
            final long t$110757 = this.id;
            
            //#line 217 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
            t$110758 = ((long) t$110756) == ((long) t$110757);
        }
        
        //#line 217 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
        final boolean t$110759 = t$110758;
        
        //#line 217 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
        return t$110759;
    }
    
    
    //#line 218 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
    final public int hashCode() {
        
        //#line 218 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
        final long t$110760 = id;
        
        //#line 218 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
        final int t$110761 = ((int)(long)(((long)(t$110760))));
        
        //#line 218 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
        return t$110761;
    }
    
    
    //#line 224 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
    final public static <$T>x10.lang.Place $implicit_convert__0$1x10$lang$Place$$T$2(final x10.rtt.Type $T, final x10.core.GlobalRef<$T> r) {
        try {
            return (r).home;
        }
        catch (java.lang.Throwable exc$146404) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$146404);
        }
        
    }
    
    
    
    //#line 31 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
    final public java.lang.String typeName() {
        try {
            return x10.rtt.Types.typeName(this);
        }
        catch (java.lang.Throwable exc$146405) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$146405);
        }
        
    }
    
    
    
    //#line 31 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
    final public boolean _struct_equals$O(java.lang.Object other) {
        
        //#line 31 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
        final java.lang.Object t$110762 = ((java.lang.Object)(other));
        
        //#line 31 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
        final boolean t$110763 = x10.lang.Place.$RTT.isInstance(t$110762);
        
        //#line 31 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
        final boolean t$110764 = !(t$110763);
        
        //#line 31 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
        if (t$110764) {
            
            //#line 31 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
            return false;
        }
        
        //#line 31 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
        final x10.lang.Place this$110716 = ((x10.lang.Place)(this));
        
        //#line 31 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
        final java.lang.Object t$110765 = ((java.lang.Object)(other));
        
        //#line 31 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
        x10.lang.Place other$110715 = ((x10.lang.Place)(((x10.lang.Place)x10.rtt.Types.asStruct(x10.lang.Place.$RTT,t$110765))));
        
        //#line 31 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
        final long t$110767 = this$110716.id;
        
        //#line 31 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
        final x10.lang.Place t$110766 = ((x10.lang.Place)(other$110715));
        
        //#line 31 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
        final long t$110768 = t$110766.id;
        
        //#line 31 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
        final boolean t$110769 = ((long) t$110767) == ((long) t$110768);
        
        //#line 31 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
        return t$110769;
    }
    
    
    //#line 31 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
    final public boolean _struct_equals$O(x10.lang.Place other) {
        
        //#line 31 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
        final long t$110771 = this.id;
        
        //#line 31 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
        final x10.lang.Place t$110770 = ((x10.lang.Place)(other));
        
        //#line 31 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
        final long t$110772 = t$110770.id;
        
        //#line 31 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
        final boolean t$110773 = ((long) t$110771) == ((long) t$110772);
        
        //#line 31 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
        return t$110773;
    }
    
    
    //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
    final public x10.lang.Place x10$lang$Place$$this$x10$lang$Place() {
        
        //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
        return x10.lang.Place.this;
    }
    
    
    //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
    final public void __fieldInitializers_x10_lang_Place() {
        
    }
    
    final private static x10.core.concurrent.AtomicInteger initStatus$INVALID_PLACE = new x10.core.concurrent.AtomicInteger(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED);
    private static x10.lang.ExceptionInInitializer exception$INVALID_PLACE;
    final private static x10.core.concurrent.AtomicInteger initStatus$FIRST_PLACE = new x10.core.concurrent.AtomicInteger(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED);
    private static x10.lang.ExceptionInInitializer exception$FIRST_PLACE;
    final private static x10.core.concurrent.AtomicInteger initStatus$children = new x10.core.concurrent.AtomicInteger(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED);
    private static x10.lang.ExceptionInInitializer exception$children;
    final private static x10.core.concurrent.AtomicInteger initStatus$NUM_ACCELS = new x10.core.concurrent.AtomicInteger(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED);
    private static x10.lang.ExceptionInInitializer exception$NUM_ACCELS;
    
    public static long get$ALL_PLACES() {
        return ((long)x10.runtime.impl.java.Runtime.MAX_PLACES);
    }
    
    public static long get$MAX_PLACES() {
        return ((long)x10.runtime.impl.java.Runtime.MAX_PLACES);
    }
    
    public static long get$NUM_ACCELS() {
        if (((int) x10.lang.Place.initStatus$NUM_ACCELS.get()) == ((int) x10.runtime.impl.java.InitDispatcher.INITIALIZED)) {
            return x10.lang.Place.NUM_ACCELS;
        }
        if (((int) x10.lang.Place.initStatus$NUM_ACCELS.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
            throw x10.lang.Place.exception$NUM_ACCELS;
        }
        if (x10.lang.Place.initStatus$NUM_ACCELS.compareAndSet((int)(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED), (int)(x10.runtime.impl.java.InitDispatcher.INITIALIZING))) {
            try {{
                x10.lang.Place.NUM_ACCELS = ((((long)x10.runtime.impl.java.Runtime.MAX_PLACES)) - (((long)(((long)x10.runtime.impl.java.Runtime.MAX_PLACES)))));
            }}catch (java.lang.Throwable exc$110777) {
                x10.lang.Place.exception$NUM_ACCELS = new x10.lang.ExceptionInInitializer(exc$110777);
                x10.lang.Place.initStatus$NUM_ACCELS.set((int)(x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED));
                x10.runtime.impl.java.InitDispatcher.lockInitialized();
                x10.runtime.impl.java.InitDispatcher.notifyInitialized();
                throw x10.lang.Place.exception$NUM_ACCELS;
            }
            x10.lang.Place.initStatus$NUM_ACCELS.set((int)(x10.runtime.impl.java.InitDispatcher.INITIALIZED));
            x10.runtime.impl.java.InitDispatcher.lockInitialized();
            x10.runtime.impl.java.InitDispatcher.notifyInitialized();
        } else {
            if (x10.lang.Place.initStatus$NUM_ACCELS.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                x10.runtime.impl.java.InitDispatcher.lockInitialized();
                while (x10.lang.Place.initStatus$NUM_ACCELS.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                    x10.runtime.impl.java.InitDispatcher.awaitInitialized();
                }
                x10.runtime.impl.java.InitDispatcher.unlockInitialized();
                if (((int) x10.lang.Place.initStatus$NUM_ACCELS.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
                    throw x10.lang.Place.exception$NUM_ACCELS;
                }
            }
        }
        return x10.lang.Place.NUM_ACCELS;
    }
    
    public static x10.core.Rail get$children() {
        if (((int) x10.lang.Place.initStatus$children.get()) == ((int) x10.runtime.impl.java.InitDispatcher.INITIALIZED)) {
            return x10.lang.Place.children;
        }
        if (((int) x10.lang.Place.initStatus$children.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
            throw x10.lang.Place.exception$children;
        }
        if (x10.lang.Place.initStatus$children.compareAndSet((int)(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED), (int)(x10.runtime.impl.java.InitDispatcher.INITIALIZING))) {
            try {{
                x10.lang.Place.children = ((x10.core.Rail)(new x10.core.Rail<x10.core.Rail<x10.lang.Place>>(x10.rtt.ParameterizedType.make(x10.core.Rail.$RTT, x10.lang.Place.$RTT), ((long)(((long)x10.runtime.impl.java.Runtime.MAX_PLACES))), ((x10.core.fun.Fun_0_1)(new x10.lang.Place.$Closure$126())), (x10.core.Rail.__1$1x10$lang$Long$3x10$lang$Rail$$T$2) null)));
            }}catch (java.lang.Throwable exc$110778) {
                x10.lang.Place.exception$children = new x10.lang.ExceptionInInitializer(exc$110778);
                x10.lang.Place.initStatus$children.set((int)(x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED));
                x10.runtime.impl.java.InitDispatcher.lockInitialized();
                x10.runtime.impl.java.InitDispatcher.notifyInitialized();
                throw x10.lang.Place.exception$children;
            }
            x10.lang.Place.initStatus$children.set((int)(x10.runtime.impl.java.InitDispatcher.INITIALIZED));
            x10.runtime.impl.java.InitDispatcher.lockInitialized();
            x10.runtime.impl.java.InitDispatcher.notifyInitialized();
        } else {
            if (x10.lang.Place.initStatus$children.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                x10.runtime.impl.java.InitDispatcher.lockInitialized();
                while (x10.lang.Place.initStatus$children.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                    x10.runtime.impl.java.InitDispatcher.awaitInitialized();
                }
                x10.runtime.impl.java.InitDispatcher.unlockInitialized();
                if (((int) x10.lang.Place.initStatus$children.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
                    throw x10.lang.Place.exception$children;
                }
            }
        }
        return x10.lang.Place.children;
    }
    
    public static x10.lang.Place get$FIRST_PLACE() {
        if (((int) x10.lang.Place.initStatus$FIRST_PLACE.get()) == ((int) x10.runtime.impl.java.InitDispatcher.INITIALIZED)) {
            return x10.lang.Place.FIRST_PLACE;
        }
        if (((int) x10.lang.Place.initStatus$FIRST_PLACE.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
            throw x10.lang.Place.exception$FIRST_PLACE;
        }
        if (x10.lang.Place.initStatus$FIRST_PLACE.compareAndSet((int)(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED), (int)(x10.runtime.impl.java.InitDispatcher.INITIALIZING))) {
            try {{
                x10.lang.Place.FIRST_PLACE = ((x10.lang.Place)(new x10.lang.Place((java.lang.System[]) null).x10$lang$Place$$init$S(((long)(0L)))));
            }}catch (java.lang.Throwable exc$110779) {
                x10.lang.Place.exception$FIRST_PLACE = new x10.lang.ExceptionInInitializer(exc$110779);
                x10.lang.Place.initStatus$FIRST_PLACE.set((int)(x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED));
                x10.runtime.impl.java.InitDispatcher.lockInitialized();
                x10.runtime.impl.java.InitDispatcher.notifyInitialized();
                throw x10.lang.Place.exception$FIRST_PLACE;
            }
            x10.lang.Place.initStatus$FIRST_PLACE.set((int)(x10.runtime.impl.java.InitDispatcher.INITIALIZED));
            x10.runtime.impl.java.InitDispatcher.lockInitialized();
            x10.runtime.impl.java.InitDispatcher.notifyInitialized();
        } else {
            if (x10.lang.Place.initStatus$FIRST_PLACE.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                x10.runtime.impl.java.InitDispatcher.lockInitialized();
                while (x10.lang.Place.initStatus$FIRST_PLACE.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                    x10.runtime.impl.java.InitDispatcher.awaitInitialized();
                }
                x10.runtime.impl.java.InitDispatcher.unlockInitialized();
                if (((int) x10.lang.Place.initStatus$FIRST_PLACE.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
                    throw x10.lang.Place.exception$FIRST_PLACE;
                }
            }
        }
        return x10.lang.Place.FIRST_PLACE;
    }
    
    public static x10.lang.Place get$INVALID_PLACE() {
        if (((int) x10.lang.Place.initStatus$INVALID_PLACE.get()) == ((int) x10.runtime.impl.java.InitDispatcher.INITIALIZED)) {
            return x10.lang.Place.INVALID_PLACE;
        }
        if (((int) x10.lang.Place.initStatus$INVALID_PLACE.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
            throw x10.lang.Place.exception$INVALID_PLACE;
        }
        if (x10.lang.Place.initStatus$INVALID_PLACE.compareAndSet((int)(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED), (int)(x10.runtime.impl.java.InitDispatcher.INITIALIZING))) {
            try {{
                x10.lang.Place.INVALID_PLACE = ((x10.lang.Place)(new x10.lang.Place((java.lang.System[]) null).x10$lang$Place$$init$S(((long)(-1L)))));
            }}catch (java.lang.Throwable exc$110780) {
                x10.lang.Place.exception$INVALID_PLACE = new x10.lang.ExceptionInInitializer(exc$110780);
                x10.lang.Place.initStatus$INVALID_PLACE.set((int)(x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED));
                x10.runtime.impl.java.InitDispatcher.lockInitialized();
                x10.runtime.impl.java.InitDispatcher.notifyInitialized();
                throw x10.lang.Place.exception$INVALID_PLACE;
            }
            x10.lang.Place.initStatus$INVALID_PLACE.set((int)(x10.runtime.impl.java.InitDispatcher.INITIALIZED));
            x10.runtime.impl.java.InitDispatcher.lockInitialized();
            x10.runtime.impl.java.InitDispatcher.notifyInitialized();
        } else {
            if (x10.lang.Place.initStatus$INVALID_PLACE.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                x10.runtime.impl.java.InitDispatcher.lockInitialized();
                while (x10.lang.Place.initStatus$INVALID_PLACE.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                    x10.runtime.impl.java.InitDispatcher.awaitInitialized();
                }
                x10.runtime.impl.java.InitDispatcher.unlockInitialized();
                if (((int) x10.lang.Place.initStatus$INVALID_PLACE.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
                    throw x10.lang.Place.exception$INVALID_PLACE;
                }
            }
        }
        return x10.lang.Place.INVALID_PLACE;
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$125 extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$125> $RTT = 
            x10.rtt.StaticFunType.<$Closure$125> make($Closure$125.class,
                                                      new x10.rtt.Type[] {
                                                          x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.LONG, x10.lang.Place.$RTT)
                                                      });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.Place.$Closure$125 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.p = $deserializer.readLong();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.lang.Place.$Closure$125 $_obj = new x10.lang.Place.$Closure$125((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.p);
            
        }
        
        // constructor just for allocation
        public $Closure$125(final java.lang.System[] $dummy) {
            
        }
        
        // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1):U
        public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1) {
            return $apply(x10.core.Long.$unbox(a1));
            
        }
        
        
    
        
        public x10.lang.Place $apply(final long i) {
            
            //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
            return new x10.lang.Place((java.lang.System[]) null).x10$lang$Place$$init$S(x10.lang.Place.child$O((long)(this.p), (long)(i)));
        }
        
        public long p;
        
        public $Closure$125(final long p) {
             {
                this.p = p;
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$126 extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$126> $RTT = 
            x10.rtt.StaticFunType.<$Closure$126> make($Closure$126.class,
                                                      new x10.rtt.Type[] {
                                                          x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.LONG, x10.rtt.ParameterizedType.make(x10.core.Rail.$RTT, x10.lang.Place.$RTT))
                                                      });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.Place.$Closure$126 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.lang.Place.$Closure$126 $_obj = new x10.lang.Place.$Closure$126((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            
        }
        
        // constructor just for allocation
        public $Closure$126(final java.lang.System[] $dummy) {
            
        }
        
        // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1):U
        public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1) {
            return $apply(x10.core.Long.$unbox(a1));
            
        }
        
        
    
        
        public x10.core.Rail $apply(final long p) {
            
            //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
            return new x10.core.Rail<x10.lang.Place>(x10.lang.Place.$RTT, x10.lang.Place.numChildren$O((long)(p)), ((x10.core.fun.Fun_0_1)(new x10.lang.Place.$Closure$125(p))), (x10.core.Rail.__1$1x10$lang$Long$3x10$lang$Rail$$T$2) null);
        }
        
        public $Closure$126() {
             {
                
            }
        }
        
    }
    
}



