package x10.lang;


@x10.runtime.impl.java.X10Generated
public interface Reducible<$T> extends x10.core.Any
{
    public static final x10.rtt.RuntimeType<Reducible> $RTT = 
        x10.rtt.NamedType.<Reducible> make("x10.lang.Reducible",
                                           Reducible.class,
                                           1);
    
    

    
    
    //#line 28 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
    $T zero$G();
    
    
    //#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
    java.lang.Object $apply(final java.lang.Object a, x10.rtt.Type t1, final java.lang.Object b, x10.rtt.Type t2);
    
    
    //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
    @x10.runtime.impl.java.X10Generated
    public static class AndReducer extends x10.core.Struct implements x10.lang.Reducible, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<AndReducer> $RTT = 
            x10.rtt.NamedStructType.<AndReducer> make("x10.lang.Reducible.AndReducer",
                                                      AndReducer.class,
                                                      new x10.rtt.Type[] {
                                                          x10.rtt.ParameterizedType.make(x10.lang.Reducible.$RTT, x10.rtt.Types.BOOLEAN),
                                                          x10.rtt.Types.STRUCT
                                                      });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.Reducible.AndReducer $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.lang.Reducible.AndReducer $_obj = new x10.lang.Reducible.AndReducer((java.lang.System[]) null);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            
        }
        
        // zero value constructor
        public AndReducer(final java.lang.System $dummy) { }
        
        // constructor just for allocation
        public AndReducer(final java.lang.System[] $dummy) {
            
        }
        
        // dispatcher for method abstract public x10.lang.Reducible[T].operator()(a:T, b:T){}:T
        public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1, final java.lang.Object a2, final x10.rtt.Type t2) {
            return x10.core.Boolean.$box($apply$O(x10.core.Boolean.$unbox(a1), x10.core.Boolean.$unbox(a2)));
            
        }
        
        // dispatcher for method abstract public x10.lang.Reducible[T].operator()(a:T, b:T){}:T
        public boolean $apply$Z(final java.lang.Object a1, final x10.rtt.Type t1, final java.lang.Object a2, final x10.rtt.Type t2) {
            return $apply$O(x10.core.Boolean.$unbox(a1), x10.core.Boolean.$unbox(a2));
            
        }
        
        // bridge for method abstract public x10.lang.Reducible[T].zero(){}:T
        final public x10.core.Boolean zero$G() {
            return x10.core.Boolean.$box(zero$O());
        }
        
        
    
        
        
        //#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
        final public boolean zero$O() {
            
            //#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            return true;
        }
        
        
        //#line 34 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
        final public boolean $apply$O(final boolean a, final boolean b) {
            
            //#line 34 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            boolean t$111684 = a;
            
            //#line 34 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            if (t$111684) {
                
                //#line 34 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
                t$111684 = b;
            }
            
            //#line 34 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            final boolean t$111685 = t$111684;
            
            //#line 34 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            return t$111685;
        }
        
        
        //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
        final public java.lang.String typeName() {
            try {
                return x10.rtt.Types.typeName(this);
            }
            catch (java.lang.Throwable exc$146407) {
                throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$146407);
            }
            
        }
        
        
        
        //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
        final public java.lang.String toString() {
            
            //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            return "struct x10.lang.Reducible.AndReducer";
        }
        
        
        //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
        final public int hashCode() {
            
            //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            int result = 1;
            
            //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            final int t$111686 = result;
            
            //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            return t$111686;
        }
        
        
        //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
        final public boolean equals(java.lang.Object other) {
            
            //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            final java.lang.Object t$111687 = ((java.lang.Object)(other));
            
            //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            final boolean t$111688 = x10.lang.Reducible.AndReducer.$RTT.isInstance(t$111687);
            
            //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            final boolean t$111689 = !(t$111688);
            
            //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            if (t$111689) {
                
                //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
                return false;
            }
            
            //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            final x10.lang.Reducible.AndReducer this$111650 = ((x10.lang.Reducible.AndReducer)(this));
            
            //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            final java.lang.Object t$111690 = ((java.lang.Object)(other));
            
            //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            x10.lang.Reducible.AndReducer other$111649 = ((x10.lang.Reducible.AndReducer)(((x10.lang.Reducible.AndReducer)x10.rtt.Types.asStruct(x10.lang.Reducible.AndReducer.$RTT,t$111690))));
            
            //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            return true;
        }
        
        
        //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
        final public boolean equals$O(x10.lang.Reducible.AndReducer other) {
            
            //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            return true;
        }
        
        
        //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
        final public boolean _struct_equals$O(java.lang.Object other) {
            
            //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            final java.lang.Object t$111691 = ((java.lang.Object)(other));
            
            //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            final boolean t$111692 = x10.lang.Reducible.AndReducer.$RTT.isInstance(t$111691);
            
            //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            final boolean t$111693 = !(t$111692);
            
            //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            if (t$111693) {
                
                //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
                return false;
            }
            
            //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            final x10.lang.Reducible.AndReducer this$111652 = ((x10.lang.Reducible.AndReducer)(this));
            
            //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            final java.lang.Object t$111694 = ((java.lang.Object)(other));
            
            //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            x10.lang.Reducible.AndReducer other$111651 = ((x10.lang.Reducible.AndReducer)(((x10.lang.Reducible.AndReducer)x10.rtt.Types.asStruct(x10.lang.Reducible.AndReducer.$RTT,t$111694))));
            
            //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            return true;
        }
        
        
        //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
        final public boolean _struct_equals$O(x10.lang.Reducible.AndReducer other) {
            
            //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            return true;
        }
        
        
        //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
        final public x10.lang.Reducible.AndReducer x10$lang$Reducible$AndReducer$$this$x10$lang$Reducible$AndReducer() {
            
            //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            return x10.lang.Reducible.AndReducer.this;
        }
        
        
        //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
        // creation method for java code (1-phase java constructor)
        public AndReducer() {
            this((java.lang.System[]) null);
            x10$lang$Reducible$AndReducer$$init$S();
        }
        
        // constructor for non-virtual call
        final public x10.lang.Reducible.AndReducer x10$lang$Reducible$AndReducer$$init$S() {
             {
                
                //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
                
                
                //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
                final x10.lang.Reducible.AndReducer this$111653 = this;
            }
            return this;
        }
        
        
        
        //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
        final public void __fieldInitializers_x10_lang_Reducible_AndReducer() {
            
        }
    }
    
    
    //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
    @x10.runtime.impl.java.X10Generated
    public static class OrReducer extends x10.core.Struct implements x10.lang.Reducible, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<OrReducer> $RTT = 
            x10.rtt.NamedStructType.<OrReducer> make("x10.lang.Reducible.OrReducer",
                                                     OrReducer.class,
                                                     new x10.rtt.Type[] {
                                                         x10.rtt.ParameterizedType.make(x10.lang.Reducible.$RTT, x10.rtt.Types.BOOLEAN),
                                                         x10.rtt.Types.STRUCT
                                                     });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.Reducible.OrReducer $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.lang.Reducible.OrReducer $_obj = new x10.lang.Reducible.OrReducer((java.lang.System[]) null);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            
        }
        
        // zero value constructor
        public OrReducer(final java.lang.System $dummy) { }
        
        // constructor just for allocation
        public OrReducer(final java.lang.System[] $dummy) {
            
        }
        
        // dispatcher for method abstract public x10.lang.Reducible[T].operator()(a:T, b:T){}:T
        public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1, final java.lang.Object a2, final x10.rtt.Type t2) {
            return x10.core.Boolean.$box($apply$O(x10.core.Boolean.$unbox(a1), x10.core.Boolean.$unbox(a2)));
            
        }
        
        // dispatcher for method abstract public x10.lang.Reducible[T].operator()(a:T, b:T){}:T
        public boolean $apply$Z(final java.lang.Object a1, final x10.rtt.Type t1, final java.lang.Object a2, final x10.rtt.Type t2) {
            return $apply$O(x10.core.Boolean.$unbox(a1), x10.core.Boolean.$unbox(a2));
            
        }
        
        // bridge for method abstract public x10.lang.Reducible[T].zero(){}:T
        final public x10.core.Boolean zero$G() {
            return x10.core.Boolean.$box(zero$O());
        }
        
        
    
        
        
        //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
        final public boolean zero$O() {
            
            //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            return false;
        }
        
        
        //#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
        final public boolean $apply$O(final boolean a, final boolean b) {
            
            //#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            boolean t$111695 = a;
            
            //#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            if (!(t$111695)) {
                
                //#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
                t$111695 = b;
            }
            
            //#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            final boolean t$111696 = t$111695;
            
            //#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            return t$111696;
        }
        
        
        //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
        final public java.lang.String typeName() {
            try {
                return x10.rtt.Types.typeName(this);
            }
            catch (java.lang.Throwable exc$146408) {
                throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$146408);
            }
            
        }
        
        
        
        //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
        final public java.lang.String toString() {
            
            //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            return "struct x10.lang.Reducible.OrReducer";
        }
        
        
        //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
        final public int hashCode() {
            
            //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            int result = 1;
            
            //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            final int t$111697 = result;
            
            //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            return t$111697;
        }
        
        
        //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
        final public boolean equals(java.lang.Object other) {
            
            //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            final java.lang.Object t$111698 = ((java.lang.Object)(other));
            
            //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            final boolean t$111699 = x10.lang.Reducible.OrReducer.$RTT.isInstance(t$111698);
            
            //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            final boolean t$111700 = !(t$111699);
            
            //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            if (t$111700) {
                
                //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
                return false;
            }
            
            //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            final x10.lang.Reducible.OrReducer this$111657 = ((x10.lang.Reducible.OrReducer)(this));
            
            //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            final java.lang.Object t$111701 = ((java.lang.Object)(other));
            
            //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            x10.lang.Reducible.OrReducer other$111656 = ((x10.lang.Reducible.OrReducer)(((x10.lang.Reducible.OrReducer)x10.rtt.Types.asStruct(x10.lang.Reducible.OrReducer.$RTT,t$111701))));
            
            //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            return true;
        }
        
        
        //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
        final public boolean equals$O(x10.lang.Reducible.OrReducer other) {
            
            //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            return true;
        }
        
        
        //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
        final public boolean _struct_equals$O(java.lang.Object other) {
            
            //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            final java.lang.Object t$111702 = ((java.lang.Object)(other));
            
            //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            final boolean t$111703 = x10.lang.Reducible.OrReducer.$RTT.isInstance(t$111702);
            
            //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            final boolean t$111704 = !(t$111703);
            
            //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            if (t$111704) {
                
                //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
                return false;
            }
            
            //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            final x10.lang.Reducible.OrReducer this$111659 = ((x10.lang.Reducible.OrReducer)(this));
            
            //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            final java.lang.Object t$111705 = ((java.lang.Object)(other));
            
            //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            x10.lang.Reducible.OrReducer other$111658 = ((x10.lang.Reducible.OrReducer)(((x10.lang.Reducible.OrReducer)x10.rtt.Types.asStruct(x10.lang.Reducible.OrReducer.$RTT,t$111705))));
            
            //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            return true;
        }
        
        
        //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
        final public boolean _struct_equals$O(x10.lang.Reducible.OrReducer other) {
            
            //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            return true;
        }
        
        
        //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
        final public x10.lang.Reducible.OrReducer x10$lang$Reducible$OrReducer$$this$x10$lang$Reducible$OrReducer() {
            
            //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            return x10.lang.Reducible.OrReducer.this;
        }
        
        
        //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
        // creation method for java code (1-phase java constructor)
        public OrReducer() {
            this((java.lang.System[]) null);
            x10$lang$Reducible$OrReducer$$init$S();
        }
        
        // constructor for non-virtual call
        final public x10.lang.Reducible.OrReducer x10$lang$Reducible$OrReducer$$init$S() {
             {
                
                //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
                
                
                //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
                final x10.lang.Reducible.OrReducer this$111660 = this;
            }
            return this;
        }
        
        
        
        //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
        final public void __fieldInitializers_x10_lang_Reducible_OrReducer() {
            
        }
    }
    
    
    //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
    @x10.runtime.impl.java.X10Generated
    public static class SumReducer<$T> extends x10.core.Struct implements x10.lang.Reducible, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<SumReducer> $RTT = 
            x10.rtt.NamedStructType.<SumReducer> make("x10.lang.Reducible.SumReducer",
                                                      SumReducer.class,
                                                      1,
                                                      new x10.rtt.Type[] {
                                                          x10.rtt.ParameterizedType.make(x10.lang.Reducible.$RTT, x10.rtt.UnresolvedType.PARAM(0)),
                                                          x10.rtt.Types.STRUCT
                                                      });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $T; return null; }
        
        public static <$T> x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.Reducible.SumReducer<$T> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.$T = (x10.rtt.Type) $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.lang.Reducible.SumReducer $_obj = new x10.lang.Reducible.SumReducer((java.lang.System[]) null, (x10.rtt.Type) null);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.$T);
            
        }
        
        // zero value constructor
        public SumReducer(final x10.rtt.Type $T, final java.lang.System $dummy) { this.$T = $T; }
        
        // constructor just for allocation
        public SumReducer(final java.lang.System[] $dummy, final x10.rtt.Type $T) {
            x10.lang.Reducible.SumReducer.$initParams(this, $T);
            
        }
        
        // dispatcher for method abstract public x10.lang.Reducible[T].operator()(a:T, b:T){}:T
        public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1, final java.lang.Object a2, final x10.rtt.Type t2) {
            return $apply__0x10$lang$Reducible$SumReducer$$T__1x10$lang$Reducible$SumReducer$$T$G(($T)a1, ($T)a2);
            
        }
        
        private x10.rtt.Type $T;
        
        // initializer of type parameters
        public static void $initParams(final SumReducer $this, final x10.rtt.Type $T) {
            $this.$T = $T;
            
        }
        
    
        
        
        //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
        final public $T zero$G() {
            
            //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            final $T t$111706 = (($T)(($T) x10.rtt.Types.zeroValue($T)));
            
            //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            return t$111706;
        }
        
        
        //#line 44 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
        final public $T $apply__0x10$lang$Reducible$SumReducer$$T__1x10$lang$Reducible$SumReducer$$T$G(final $T a, final $T b) {
            
            //#line 44 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            final $T t$111707 = (($T)((($T)
                                        ((x10.lang.Arithmetic<$T>)x10.rtt.Types.conversion(x10.rtt.ParameterizedType.make(x10.lang.Arithmetic.$RTT, $T),a)).$plus((($T)(b)), $T))));
            
            //#line 44 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            return t$111707;
        }
        
        
        //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
        final public java.lang.String typeName() {
            try {
                return x10.rtt.Types.typeName(this);
            }
            catch (java.lang.Throwable exc$146409) {
                throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$146409);
            }
            
        }
        
        
        
        //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
        final public java.lang.String toString() {
            
            //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            return "struct x10.lang.Reducible.SumReducer";
        }
        
        
        //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
        final public int hashCode() {
            
            //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            int result = 1;
            
            //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            final int t$111708 = result;
            
            //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            return t$111708;
        }
        
        
        //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
        final public boolean equals(java.lang.Object other) {
            
            //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            final java.lang.Object t$111709 = ((java.lang.Object)(other));
            
            //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            final boolean t$111710 = x10.lang.Reducible.SumReducer.$RTT.isInstance(t$111709, $T);
            
            //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            final boolean t$111711 = !(t$111710);
            
            //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            if (t$111711) {
                
                //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
                return false;
            }
            
            //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            final x10.lang.Reducible.SumReducer this$111664 = ((x10.lang.Reducible.SumReducer)(this));
            
            //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            final java.lang.Object t$111712 = ((java.lang.Object)(other));
            
            //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            x10.lang.Reducible.SumReducer other$111663 = ((x10.lang.Reducible.SumReducer)(((x10.lang.Reducible.SumReducer)x10.rtt.Types.asStruct(x10.rtt.ParameterizedType.make(x10.lang.Reducible.SumReducer.$RTT, $T),t$111712))));
            
            //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            return true;
        }
        
        
        //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
        final public boolean equals__0$1x10$lang$Reducible$SumReducer$$T$2$O(x10.lang.Reducible.SumReducer other) {
            
            //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            return true;
        }
        
        
        //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
        final public boolean _struct_equals$O(java.lang.Object other) {
            
            //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            final java.lang.Object t$111713 = ((java.lang.Object)(other));
            
            //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            final boolean t$111714 = x10.lang.Reducible.SumReducer.$RTT.isInstance(t$111713, $T);
            
            //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            final boolean t$111715 = !(t$111714);
            
            //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            if (t$111715) {
                
                //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
                return false;
            }
            
            //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            final x10.lang.Reducible.SumReducer this$111666 = ((x10.lang.Reducible.SumReducer)(this));
            
            //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            final java.lang.Object t$111716 = ((java.lang.Object)(other));
            
            //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            x10.lang.Reducible.SumReducer other$111665 = ((x10.lang.Reducible.SumReducer)(((x10.lang.Reducible.SumReducer)x10.rtt.Types.asStruct(x10.rtt.ParameterizedType.make(x10.lang.Reducible.SumReducer.$RTT, $T),t$111716))));
            
            //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            return true;
        }
        
        
        //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
        final public boolean _struct_equals__0$1x10$lang$Reducible$SumReducer$$T$2$O(x10.lang.Reducible.SumReducer other) {
            
            //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            return true;
        }
        
        
        //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
        final public x10.lang.Reducible.SumReducer x10$lang$Reducible$SumReducer$$this$x10$lang$Reducible$SumReducer() {
            
            //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            return x10.lang.Reducible.SumReducer.this;
        }
        
        
        //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
        // creation method for java code (1-phase java constructor)
        public SumReducer(final x10.rtt.Type $T) {
            this((java.lang.System[]) null, $T);
            x10$lang$Reducible$SumReducer$$init$S();
        }
        
        // constructor for non-virtual call
        final public x10.lang.Reducible.SumReducer<$T> x10$lang$Reducible$SumReducer$$init$S() {
             {
                
                //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
                
                
                //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
                final x10.lang.Reducible.SumReducer this$111667 = this;
            }
            return this;
        }
        
        
        
        //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
        final public void __fieldInitializers_x10_lang_Reducible_SumReducer() {
            
        }
    }
    
    
    //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
    @x10.runtime.impl.java.X10Generated
    public static class MinReducer<$T> extends x10.core.Struct implements x10.lang.Reducible, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<MinReducer> $RTT = 
            x10.rtt.NamedStructType.<MinReducer> make("x10.lang.Reducible.MinReducer",
                                                      MinReducer.class,
                                                      1,
                                                      new x10.rtt.Type[] {
                                                          x10.rtt.ParameterizedType.make(x10.lang.Reducible.$RTT, x10.rtt.UnresolvedType.PARAM(0)),
                                                          x10.rtt.Types.STRUCT
                                                      });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $T; return null; }
        
        public static <$T> x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.Reducible.MinReducer<$T> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.$T = (x10.rtt.Type) $deserializer.readObject();
            $_obj.zeroVal = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.lang.Reducible.MinReducer $_obj = new x10.lang.Reducible.MinReducer((java.lang.System[]) null, (x10.rtt.Type) null);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.$T);
            $serializer.write(this.zeroVal);
            
        }
        
        // zero value constructor
        public MinReducer(final x10.rtt.Type $T, final java.lang.System $dummy) { this.$T = $T; this.zeroVal = ($T) x10.rtt.Types.zeroValue($T); }
        
        // constructor just for allocation
        public MinReducer(final java.lang.System[] $dummy, final x10.rtt.Type $T) {
            x10.lang.Reducible.MinReducer.$initParams(this, $T);
            
        }
        
        // dispatcher for method abstract public x10.lang.Reducible[T].operator()(a:T, b:T){}:T
        public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1, final java.lang.Object a2, final x10.rtt.Type t2) {
            return $apply__0x10$lang$Reducible$MinReducer$$T__1x10$lang$Reducible$MinReducer$$T$G(($T)a1, ($T)a2);
            
        }
        
        private x10.rtt.Type $T;
        
        // initializer of type parameters
        public static void $initParams(final MinReducer $this, final x10.rtt.Type $T) {
            $this.$T = $T;
            
        }
        // synthetic type for parameter mangling
        public static final class __0x10$lang$Reducible$MinReducer$$T {}
        
    
        
        //#line 48 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
        public $T zeroVal;
        
        
        //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
        // creation method for java code (1-phase java constructor)
        public MinReducer(final x10.rtt.Type $T, final $T maxValue, __0x10$lang$Reducible$MinReducer$$T $dummy) {
            this((java.lang.System[]) null, $T);
            x10$lang$Reducible$MinReducer$$init$S(maxValue, (x10.lang.Reducible.MinReducer.__0x10$lang$Reducible$MinReducer$$T) null);
        }
        
        // constructor for non-virtual call
        final public x10.lang.Reducible.MinReducer<$T> x10$lang$Reducible$MinReducer$$init$S(final $T maxValue, __0x10$lang$Reducible$MinReducer$$T $dummy) {
             {
                
                //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
                
                
                //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
                final x10.lang.Reducible.MinReducer this$111791 = this;
                
                //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
                ((x10.lang.Reducible.MinReducer<$T>)this).zeroVal = (($T)(maxValue));
            }
            return this;
        }
        
        
        
        //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
        final public $T zero$G() {
            
            //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            final $T t$111717 = (($T)(zeroVal));
            
            //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            return t$111717;
        }
        
        
        //#line 51 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
        final public $T $apply__0x10$lang$Reducible$MinReducer$$T__1x10$lang$Reducible$MinReducer$$T$G(final $T a, final $T b) {
            
            //#line 51 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            final boolean t$111718 = x10.core.Boolean.$unbox(((x10.util.Ordered<$T>)x10.rtt.Types.conversion(x10.rtt.ParameterizedType.make(x10.util.Ordered.$RTT, $T),a)).$lt$Z((($T)(b)), $T));
            
            //#line 51 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            $T t$111719 =  null;
            
            //#line 51 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            if (t$111718) {
                
                //#line 51 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
                t$111719 = (($T)(a));
            } else {
                
                //#line 51 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
                t$111719 = (($T)(b));
            }
            
            //#line 51 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            final $T t$111720 = (($T)(t$111719));
            
            //#line 51 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            return t$111720;
        }
        
        
        //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
        final public java.lang.String typeName() {
            try {
                return x10.rtt.Types.typeName(this);
            }
            catch (java.lang.Throwable exc$146410) {
                throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$146410);
            }
            
        }
        
        
        
        //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
        final public java.lang.String toString() {
            
            //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            final java.lang.String t$111721 = "struct x10.lang.Reducible.MinReducer: zeroVal=";
            
            //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            final $T t$111722 = (($T)(this.zeroVal));
            
            //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            final java.lang.String t$111723 = ((t$111721) + (t$111722));
            
            //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            return t$111723;
        }
        
        
        //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
        final public int hashCode() {
            
            //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            int result = 1;
            
            //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            final int t$111724 = result;
            
            //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            final int t$111726 = ((8191) * (((int)(t$111724))));
            
            //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            final $T t$111725 = (($T)(this.zeroVal));
            
            //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            final int t$111727 = x10.rtt.Types.hashCode(((java.lang.Object)(t$111725)));
            
            //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            final int t$111728 = ((t$111726) + (((int)(t$111727))));
            
            //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            result = t$111728;
            
            //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            final int t$111729 = result;
            
            //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            return t$111729;
        }
        
        
        //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
        final public boolean equals(java.lang.Object other) {
            
            //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            final java.lang.Object t$111730 = ((java.lang.Object)(other));
            
            //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            final boolean t$111731 = x10.lang.Reducible.MinReducer.$RTT.isInstance(t$111730, $T);
            
            //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            final boolean t$111732 = !(t$111731);
            
            //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            if (t$111732) {
                
                //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
                return false;
            }
            
            //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            final x10.lang.Reducible.MinReducer this$111674 = ((x10.lang.Reducible.MinReducer)(this));
            
            //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            final java.lang.Object t$111733 = ((java.lang.Object)(other));
            
            //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            x10.lang.Reducible.MinReducer other$111673 = ((x10.lang.Reducible.MinReducer)(((x10.lang.Reducible.MinReducer)x10.rtt.Types.asStruct(x10.rtt.ParameterizedType.make(x10.lang.Reducible.MinReducer.$RTT, $T),t$111733))));
            
            //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            final $T t$111735 = (($T)(((x10.lang.Reducible.MinReducer<$T>)this$111674).zeroVal));
            
            //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            final x10.lang.Reducible.MinReducer t$111734 = ((x10.lang.Reducible.MinReducer)(other$111673));
            
            //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            final $T t$111736 = (($T)(((x10.lang.Reducible.MinReducer<$T>)t$111734).zeroVal));
            
            //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            final boolean t$111737 = x10.rtt.Equality.equalsequals((t$111735),(t$111736));
            
            //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            return t$111737;
        }
        
        
        //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
        final public boolean equals__0$1x10$lang$Reducible$MinReducer$$T$2$O(x10.lang.Reducible.MinReducer other) {
            
            //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            final $T t$111739 = (($T)(this.zeroVal));
            
            //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            final x10.lang.Reducible.MinReducer t$111738 = ((x10.lang.Reducible.MinReducer)(other));
            
            //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            final $T t$111740 = (($T)(((x10.lang.Reducible.MinReducer<$T>)t$111738).zeroVal));
            
            //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            final boolean t$111741 = x10.rtt.Equality.equalsequals((t$111739),(t$111740));
            
            //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            return t$111741;
        }
        
        
        //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
        final public boolean _struct_equals$O(java.lang.Object other) {
            
            //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            final java.lang.Object t$111742 = ((java.lang.Object)(other));
            
            //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            final boolean t$111743 = x10.lang.Reducible.MinReducer.$RTT.isInstance(t$111742, $T);
            
            //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            final boolean t$111744 = !(t$111743);
            
            //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            if (t$111744) {
                
                //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
                return false;
            }
            
            //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            final x10.lang.Reducible.MinReducer this$111676 = ((x10.lang.Reducible.MinReducer)(this));
            
            //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            final java.lang.Object t$111745 = ((java.lang.Object)(other));
            
            //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            x10.lang.Reducible.MinReducer other$111675 = ((x10.lang.Reducible.MinReducer)(((x10.lang.Reducible.MinReducer)x10.rtt.Types.asStruct(x10.rtt.ParameterizedType.make(x10.lang.Reducible.MinReducer.$RTT, $T),t$111745))));
            
            //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            final $T t$111747 = (($T)(((x10.lang.Reducible.MinReducer<$T>)this$111676).zeroVal));
            
            //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            final x10.lang.Reducible.MinReducer t$111746 = ((x10.lang.Reducible.MinReducer)(other$111675));
            
            //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            final $T t$111748 = (($T)(((x10.lang.Reducible.MinReducer<$T>)t$111746).zeroVal));
            
            //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            final boolean t$111749 = x10.rtt.Equality.equalsequals((t$111747),(t$111748));
            
            //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            return t$111749;
        }
        
        
        //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
        final public boolean _struct_equals__0$1x10$lang$Reducible$MinReducer$$T$2$O(x10.lang.Reducible.MinReducer other) {
            
            //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            final $T t$111751 = (($T)(this.zeroVal));
            
            //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            final x10.lang.Reducible.MinReducer t$111750 = ((x10.lang.Reducible.MinReducer)(other));
            
            //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            final $T t$111752 = (($T)(((x10.lang.Reducible.MinReducer<$T>)t$111750).zeroVal));
            
            //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            final boolean t$111753 = x10.rtt.Equality.equalsequals((t$111751),(t$111752));
            
            //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            return t$111753;
        }
        
        
        //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
        final public x10.lang.Reducible.MinReducer x10$lang$Reducible$MinReducer$$this$x10$lang$Reducible$MinReducer() {
            
            //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            return x10.lang.Reducible.MinReducer.this;
        }
        
        
        //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
        final public void __fieldInitializers_x10_lang_Reducible_MinReducer() {
            
        }
    }
    
    
    //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
    @x10.runtime.impl.java.X10Generated
    public static class MaxReducer<$T> extends x10.core.Struct implements x10.lang.Reducible, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<MaxReducer> $RTT = 
            x10.rtt.NamedStructType.<MaxReducer> make("x10.lang.Reducible.MaxReducer",
                                                      MaxReducer.class,
                                                      1,
                                                      new x10.rtt.Type[] {
                                                          x10.rtt.ParameterizedType.make(x10.lang.Reducible.$RTT, x10.rtt.UnresolvedType.PARAM(0)),
                                                          x10.rtt.Types.STRUCT
                                                      });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $T; return null; }
        
        public static <$T> x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.Reducible.MaxReducer<$T> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.$T = (x10.rtt.Type) $deserializer.readObject();
            $_obj.zeroVal = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.lang.Reducible.MaxReducer $_obj = new x10.lang.Reducible.MaxReducer((java.lang.System[]) null, (x10.rtt.Type) null);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.$T);
            $serializer.write(this.zeroVal);
            
        }
        
        // zero value constructor
        public MaxReducer(final x10.rtt.Type $T, final java.lang.System $dummy) { this.$T = $T; this.zeroVal = ($T) x10.rtt.Types.zeroValue($T); }
        
        // constructor just for allocation
        public MaxReducer(final java.lang.System[] $dummy, final x10.rtt.Type $T) {
            x10.lang.Reducible.MaxReducer.$initParams(this, $T);
            
        }
        
        // dispatcher for method abstract public x10.lang.Reducible[T].operator()(a:T, b:T){}:T
        public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1, final java.lang.Object a2, final x10.rtt.Type t2) {
            return $apply__0x10$lang$Reducible$MaxReducer$$T__1x10$lang$Reducible$MaxReducer$$T$G(($T)a1, ($T)a2);
            
        }
        
        private x10.rtt.Type $T;
        
        // initializer of type parameters
        public static void $initParams(final MaxReducer $this, final x10.rtt.Type $T) {
            $this.$T = $T;
            
        }
        // synthetic type for parameter mangling
        public static final class __0x10$lang$Reducible$MaxReducer$$T {}
        
    
        
        //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
        public $T zeroVal;
        
        
        //#line 56 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
        // creation method for java code (1-phase java constructor)
        public MaxReducer(final x10.rtt.Type $T, final $T minValue, __0x10$lang$Reducible$MaxReducer$$T $dummy) {
            this((java.lang.System[]) null, $T);
            x10$lang$Reducible$MaxReducer$$init$S(minValue, (x10.lang.Reducible.MaxReducer.__0x10$lang$Reducible$MaxReducer$$T) null);
        }
        
        // constructor for non-virtual call
        final public x10.lang.Reducible.MaxReducer<$T> x10$lang$Reducible$MaxReducer$$init$S(final $T minValue, __0x10$lang$Reducible$MaxReducer$$T $dummy) {
             {
                
                //#line 56 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
                
                
                //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
                final x10.lang.Reducible.MaxReducer this$111792 = this;
                
                //#line 56 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
                ((x10.lang.Reducible.MaxReducer<$T>)this).zeroVal = (($T)(minValue));
            }
            return this;
        }
        
        
        
        //#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
        final public $T zero$G() {
            
            //#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            final $T t$111754 = (($T)(zeroVal));
            
            //#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            return t$111754;
        }
        
        
        //#line 58 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
        final public $T $apply__0x10$lang$Reducible$MaxReducer$$T__1x10$lang$Reducible$MaxReducer$$T$G(final $T a, final $T b) {
            
            //#line 58 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            final boolean t$111755 = x10.core.Boolean.$unbox(((x10.util.Ordered<$T>)x10.rtt.Types.conversion(x10.rtt.ParameterizedType.make(x10.util.Ordered.$RTT, $T),a)).$ge$Z((($T)(b)), $T));
            
            //#line 58 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            $T t$111756 =  null;
            
            //#line 58 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            if (t$111755) {
                
                //#line 58 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
                t$111756 = (($T)(a));
            } else {
                
                //#line 58 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
                t$111756 = (($T)(b));
            }
            
            //#line 58 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            final $T t$111757 = (($T)(t$111756));
            
            //#line 58 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            return t$111757;
        }
        
        
        //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
        final public java.lang.String typeName() {
            try {
                return x10.rtt.Types.typeName(this);
            }
            catch (java.lang.Throwable exc$146411) {
                throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$146411);
            }
            
        }
        
        
        
        //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
        final public java.lang.String toString() {
            
            //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            final java.lang.String t$111758 = "struct x10.lang.Reducible.MaxReducer: zeroVal=";
            
            //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            final $T t$111759 = (($T)(this.zeroVal));
            
            //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            final java.lang.String t$111760 = ((t$111758) + (t$111759));
            
            //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            return t$111760;
        }
        
        
        //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
        final public int hashCode() {
            
            //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            int result = 1;
            
            //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            final int t$111761 = result;
            
            //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            final int t$111763 = ((8191) * (((int)(t$111761))));
            
            //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            final $T t$111762 = (($T)(this.zeroVal));
            
            //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            final int t$111764 = x10.rtt.Types.hashCode(((java.lang.Object)(t$111762)));
            
            //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            final int t$111765 = ((t$111763) + (((int)(t$111764))));
            
            //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            result = t$111765;
            
            //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            final int t$111766 = result;
            
            //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            return t$111766;
        }
        
        
        //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
        final public boolean equals(java.lang.Object other) {
            
            //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            final java.lang.Object t$111767 = ((java.lang.Object)(other));
            
            //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            final boolean t$111768 = x10.lang.Reducible.MaxReducer.$RTT.isInstance(t$111767, $T);
            
            //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            final boolean t$111769 = !(t$111768);
            
            //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            if (t$111769) {
                
                //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
                return false;
            }
            
            //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            final x10.lang.Reducible.MaxReducer this$111681 = ((x10.lang.Reducible.MaxReducer)(this));
            
            //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            final java.lang.Object t$111770 = ((java.lang.Object)(other));
            
            //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            x10.lang.Reducible.MaxReducer other$111680 = ((x10.lang.Reducible.MaxReducer)(((x10.lang.Reducible.MaxReducer)x10.rtt.Types.asStruct(x10.rtt.ParameterizedType.make(x10.lang.Reducible.MaxReducer.$RTT, $T),t$111770))));
            
            //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            final $T t$111772 = (($T)(((x10.lang.Reducible.MaxReducer<$T>)this$111681).zeroVal));
            
            //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            final x10.lang.Reducible.MaxReducer t$111771 = ((x10.lang.Reducible.MaxReducer)(other$111680));
            
            //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            final $T t$111773 = (($T)(((x10.lang.Reducible.MaxReducer<$T>)t$111771).zeroVal));
            
            //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            final boolean t$111774 = x10.rtt.Equality.equalsequals((t$111772),(t$111773));
            
            //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            return t$111774;
        }
        
        
        //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
        final public boolean equals__0$1x10$lang$Reducible$MaxReducer$$T$2$O(x10.lang.Reducible.MaxReducer other) {
            
            //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            final $T t$111776 = (($T)(this.zeroVal));
            
            //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            final x10.lang.Reducible.MaxReducer t$111775 = ((x10.lang.Reducible.MaxReducer)(other));
            
            //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            final $T t$111777 = (($T)(((x10.lang.Reducible.MaxReducer<$T>)t$111775).zeroVal));
            
            //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            final boolean t$111778 = x10.rtt.Equality.equalsequals((t$111776),(t$111777));
            
            //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            return t$111778;
        }
        
        
        //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
        final public boolean _struct_equals$O(java.lang.Object other) {
            
            //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            final java.lang.Object t$111779 = ((java.lang.Object)(other));
            
            //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            final boolean t$111780 = x10.lang.Reducible.MaxReducer.$RTT.isInstance(t$111779, $T);
            
            //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            final boolean t$111781 = !(t$111780);
            
            //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            if (t$111781) {
                
                //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
                return false;
            }
            
            //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            final x10.lang.Reducible.MaxReducer this$111683 = ((x10.lang.Reducible.MaxReducer)(this));
            
            //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            final java.lang.Object t$111782 = ((java.lang.Object)(other));
            
            //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            x10.lang.Reducible.MaxReducer other$111682 = ((x10.lang.Reducible.MaxReducer)(((x10.lang.Reducible.MaxReducer)x10.rtt.Types.asStruct(x10.rtt.ParameterizedType.make(x10.lang.Reducible.MaxReducer.$RTT, $T),t$111782))));
            
            //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            final $T t$111784 = (($T)(((x10.lang.Reducible.MaxReducer<$T>)this$111683).zeroVal));
            
            //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            final x10.lang.Reducible.MaxReducer t$111783 = ((x10.lang.Reducible.MaxReducer)(other$111682));
            
            //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            final $T t$111785 = (($T)(((x10.lang.Reducible.MaxReducer<$T>)t$111783).zeroVal));
            
            //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            final boolean t$111786 = x10.rtt.Equality.equalsequals((t$111784),(t$111785));
            
            //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            return t$111786;
        }
        
        
        //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
        final public boolean _struct_equals__0$1x10$lang$Reducible$MaxReducer$$T$2$O(x10.lang.Reducible.MaxReducer other) {
            
            //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            final $T t$111788 = (($T)(this.zeroVal));
            
            //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            final x10.lang.Reducible.MaxReducer t$111787 = ((x10.lang.Reducible.MaxReducer)(other));
            
            //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            final $T t$111789 = (($T)(((x10.lang.Reducible.MaxReducer<$T>)t$111787).zeroVal));
            
            //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            final boolean t$111790 = x10.rtt.Equality.equalsequals((t$111788),(t$111789));
            
            //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            return t$111790;
        }
        
        
        //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
        final public x10.lang.Reducible.MaxReducer x10$lang$Reducible$MaxReducer$$this$x10$lang$Reducible$MaxReducer() {
            
            //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
            return x10.lang.Reducible.MaxReducer.this;
        }
        
        
        //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
        final public void __fieldInitializers_x10_lang_Reducible_MaxReducer() {
            
        }
    }
    
}

