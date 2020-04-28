package x10.util;

@x10.runtime.impl.java.X10Generated
public class Option extends x10.core.Struct implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<Option> $RTT = 
        x10.rtt.NamedStructType.<Option> make("x10.util.Option",
                                              Option.class,
                                              new x10.rtt.Type[] {
                                                  x10.rtt.Types.STRUCT
                                              });
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.util.Option $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        $_obj.shortForm = $deserializer.readObject();
        $_obj.longForm = $deserializer.readObject();
        $_obj.description = $deserializer.readObject();
        $_obj.minFollow = $deserializer.readInt();
        $_obj.arbFollow = $deserializer.readBoolean();
        $_obj.required = $deserializer.readBoolean();
        $_obj.onTheFly = $deserializer.readBoolean();
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.util.Option $_obj = new x10.util.Option((java.lang.System[]) null);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        $serializer.write(this.shortForm);
        $serializer.write(this.longForm);
        $serializer.write(this.description);
        $serializer.write(this.minFollow);
        $serializer.write(this.arbFollow);
        $serializer.write(this.required);
        $serializer.write(this.onTheFly);
        
    }
    
    // zero value constructor
    public Option(final java.lang.System $dummy) { this.shortForm = null; this.longForm = null; this.description = null; this.minFollow = 0; this.arbFollow = false; this.required = false; this.onTheFly = false; }
    
    // constructor just for allocation
    public Option(final java.lang.System[] $dummy) {
        
    }
    
    

    
    //#line 51 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
    /** a string of the form "-key" that is the short name for the option */
    public java.lang.String shortForm;
    
    //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
    /** a string of the form "--key" that is the long name for the option */
    public java.lang.String longForm;
    
    //#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
    /** what you want to appear in help messages */
    public java.lang.String description;
    
    //#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
    /** 
     * the minimum number of arguments following the option that it consumes,
     * the default being 0.
     */
    public int minFollow;
    
    //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
    /** 
     * if true, any number greater than the minimum may be consumed, but the
     * default is false.
     */
    public boolean arbFollow;
    
    //#line 76 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
    /**
     * if true, this option has values and must be specified in the command line.
     * Of course, flags are NEVER required.  The default is false--that is, 
     * unless you say otherwise, an option is, as the name suggests, optional.
     */
    public boolean required;
    
    //#line 84 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
    /**
     * if true, this option was added "on the fly" to the list of valid options,
     * rather than having been specified as part of the OptionsParser's initial
     * construction.  This is useful if you just want to ignore unknown option
     * keys, but still keep a record of what you've seen.
     */
    public boolean onTheFly;
    
    
    //#line 94 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
    // creation method for java code (1-phase java constructor)
    public Option(final java.lang.String s, final java.lang.String l, final java.lang.String d) {
        this((java.lang.System[]) null);
        x10$util$Option$$init$S(s, l, d);
    }
    
    // constructor for non-virtual call
    final public x10.util.Option x10$util$Option$$init$S(final java.lang.String s, final java.lang.String l, final java.lang.String d) {
         {
            
            //#line 95 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
            /*this.*/x10$util$Option$$init$S(((java.lang.String)(s)), ((java.lang.String)(l)), ((java.lang.String)(d)), ((int)(0)), ((boolean)(false)), ((boolean)(false)), ((boolean)(false)));
        }
        return this;
    }
    
    
    
    //#line 106 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
    // creation method for java code (1-phase java constructor)
    public Option(final java.lang.String s, final java.lang.String l, final java.lang.String d, final int followers) {
        this((java.lang.System[]) null);
        x10$util$Option$$init$S(s, l, d, followers);
    }
    
    // constructor for non-virtual call
    final public x10.util.Option x10$util$Option$$init$S(final java.lang.String s, final java.lang.String l, final java.lang.String d, final int followers) {
         {
            
            //#line 107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
            /*this.*/x10$util$Option$$init$S(((java.lang.String)(s)), ((java.lang.String)(l)), ((java.lang.String)(d)), ((int)(followers)), ((boolean)(false)), ((boolean)(false)), ((boolean)(false)));
        }
        return this;
    }
    
    
    
    //#line 119 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
    // creation method for java code (1-phase java constructor)
    public Option(final java.lang.String s, final java.lang.String l, final java.lang.String d, final int followers, final boolean mayBeMore) {
        this((java.lang.System[]) null);
        x10$util$Option$$init$S(s, l, d, followers, mayBeMore);
    }
    
    // constructor for non-virtual call
    final public x10.util.Option x10$util$Option$$init$S(final java.lang.String s, final java.lang.String l, final java.lang.String d, final int followers, final boolean mayBeMore) {
         {
            
            //#line 120 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
            /*this.*/x10$util$Option$$init$S(((java.lang.String)(s)), ((java.lang.String)(l)), ((java.lang.String)(d)), ((int)(followers)), ((boolean)(mayBeMore)), ((boolean)(false)), ((boolean)(false)));
        }
        return this;
    }
    
    
    
    //#line 133 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
    // creation method for java code (1-phase java constructor)
    public Option(final java.lang.String s, final java.lang.String l, final java.lang.String d, final int followers, final boolean mayBeMore, final boolean mustSee) {
        this((java.lang.System[]) null);
        x10$util$Option$$init$S(s, l, d, followers, mayBeMore, mustSee);
    }
    
    // constructor for non-virtual call
    final public x10.util.Option x10$util$Option$$init$S(final java.lang.String s, final java.lang.String l, final java.lang.String d, final int followers, final boolean mayBeMore, final boolean mustSee) {
         {
            
            //#line 135 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
            /*this.*/x10$util$Option$$init$S(((java.lang.String)(s)), ((java.lang.String)(l)), ((java.lang.String)(d)), ((int)(followers)), ((boolean)(mayBeMore)), ((boolean)(mustSee)), ((boolean)(false)));
        }
        return this;
    }
    
    
    
    //#line 152 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
    // creation method for java code (1-phase java constructor)
    public Option(final java.lang.String s, final java.lang.String l, final java.lang.String d, final int followers, final boolean mayBeMore, final boolean mustSee, final boolean otf) {
        this((java.lang.System[]) null);
        x10$util$Option$$init$S(s, l, d, followers, mayBeMore, mustSee, otf);
    }
    
    // constructor for non-virtual call
    final public x10.util.Option x10$util$Option$$init$S(final java.lang.String s, final java.lang.String l, final java.lang.String d, final int followers, final boolean mayBeMore, final boolean mustSee, final boolean otf) {
         {
            
            //#line 152 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
            
            
            //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
            final x10.util.Option this$137968 = this;
            
            //#line 154 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
            final int t$137774 = (s).length();
            
            //#line 154 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
            final boolean t$137778 = ((int) t$137774) == ((int) 0);
            
            //#line 154 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
            java.lang.String t$137779 =  null;
            
            //#line 154 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
            if (t$137778) {
                
                //#line 154 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
                t$137779 = s;
            } else {
                
                //#line 154 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
                final char t$137775 = (s).charAt(((int)(0)));
                
                //#line 154 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
                final boolean t$137776 = ((char) t$137775) == ((char) '-');
                
                //#line 154 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
                java.lang.String t$137777 =  null;
                
                //#line 154 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
                if (t$137776) {
                    
                    //#line 154 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
                    t$137777 = s;
                } else {
                    
                    //#line 154 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
                    t$137777 = (("-") + (s));
                }
                
                //#line 154 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
                t$137779 = t$137777;
            }
            
            //#line 154 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
            final java.lang.String t$137780 = t$137779;
            
            //#line 154 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
            this.shortForm = ((java.lang.String)(t$137780));
            
            //#line 155 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
            final int t$137781 = (l).length();
            
            //#line 155 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
            final boolean t$137784 = ((int) t$137781) == ((int) 0);
            
            //#line 155 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
            java.lang.String t$137785 =  null;
            
            //#line 155 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
            if (t$137784) {
                
                //#line 155 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
                t$137785 = l;
            } else {
                
                //#line 155 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
                final boolean t$137782 = (l).startsWith("--");
                
                //#line 155 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
                java.lang.String t$137783 =  null;
                
                //#line 155 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
                if (t$137782) {
                    
                    //#line 155 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
                    t$137783 = l;
                } else {
                    
                    //#line 155 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
                    t$137783 = (("--") + (l));
                }
                
                //#line 155 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
                t$137785 = t$137783;
            }
            
            //#line 155 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
            final java.lang.String t$137786 = t$137785;
            
            //#line 155 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
            this.longForm = ((java.lang.String)(t$137786));
            
            //#line 156 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
            this.description = ((java.lang.String)(d));
            
            //#line 157 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
            this.minFollow = followers;
            
            //#line 158 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
            this.arbFollow = mayBeMore;
            
            //#line 159 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
            this.required = mustSee;
            
            //#line 160 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
            this.onTheFly = otf;
        }
        return this;
    }
    
    
    
    //#line 170 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
    final public x10.util.Option asFlag() {
        
        //#line 171 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
        final int t$137787 = minFollow;
        
        //#line 171 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
        boolean t$137789 = ((int) t$137787) == ((int) 0);
        
        //#line 171 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
        if (t$137789) {
            
            //#line 171 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
            final boolean t$137788 = arbFollow;
            
            //#line 171 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
            t$137789 = !(t$137788);
        }
        
        //#line 171 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
        final boolean t$137794 = t$137789;
        
        //#line 171 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
        if (t$137794) {
            
            //#line 171 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
            return this;
        } else {
            
            //#line 172 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
            final x10.util.Option alloc$137769 = new x10.util.Option((java.lang.System[]) null);
            
            //#line 172 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
            final java.lang.String t$137969 = ((java.lang.String)(shortForm));
            
            //#line 172 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
            final java.lang.String t$137970 = ((java.lang.String)(longForm));
            
            //#line 172 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
            final java.lang.String t$137971 = ((java.lang.String)(description));
            
            //#line 172 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
            final boolean t$137972 = onTheFly;
            
            //#line 172 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
            alloc$137769.x10$util$Option$$init$S(((java.lang.String)(t$137969)), ((java.lang.String)(t$137970)), ((java.lang.String)(t$137971)), ((int)(0)), ((boolean)(false)), ((boolean)(false)), ((boolean)(t$137972)));
            
            //#line 172 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
            return alloc$137769;
        }
    }
    
    
    //#line 185 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
    final public x10.util.Option asSimpleParm() {
        
        //#line 186 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
        final int t$137795 = minFollow;
        
        //#line 186 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
        boolean t$137797 = ((int) t$137795) == ((int) 1);
        
        //#line 186 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
        if (t$137797) {
            
            //#line 186 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
            final boolean t$137796 = arbFollow;
            
            //#line 186 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
            t$137797 = !(t$137796);
        }
        
        //#line 186 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
        final boolean t$137803 = t$137797;
        
        //#line 186 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
        if (t$137803) {
            
            //#line 186 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
            return this;
        } else {
            
            //#line 188 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
            final x10.util.Option alloc$137770 = new x10.util.Option((java.lang.System[]) null);
            
            //#line 188 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
            final java.lang.String t$137973 = ((java.lang.String)(shortForm));
            
            //#line 188 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
            final java.lang.String t$137974 = ((java.lang.String)(longForm));
            
            //#line 188 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
            final java.lang.String t$137975 = ((java.lang.String)(description));
            
            //#line 188 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
            final boolean t$137976 = required;
            
            //#line 188 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
            final boolean t$137977 = onTheFly;
            
            //#line 188 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
            alloc$137770.x10$util$Option$$init$S(((java.lang.String)(t$137973)), ((java.lang.String)(t$137974)), ((java.lang.String)(t$137975)), ((int)(1)), ((boolean)(false)), ((boolean)(t$137976)), ((boolean)(t$137977)));
            
            //#line 188 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
            return alloc$137770;
        }
    }
    
    
    //#line 200 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
    final public java.lang.String otherForm(final java.lang.String key) {
        
        //#line 201 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
        final java.lang.String t$137804 = ((java.lang.String)(shortForm));
        
        //#line 201 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
        final boolean t$137808 = (key).equals(t$137804);
        
        //#line 201 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
        java.lang.String t$137809 =  null;
        
        //#line 201 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
        if (t$137808) {
            
            //#line 201 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
            t$137809 = longForm;
        } else {
            
            //#line 202 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
            final java.lang.String t$137805 = ((java.lang.String)(longForm));
            
            //#line 202 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
            final boolean t$137806 = (key).equals(t$137805);
            
            //#line 202 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
            java.lang.String t$137807 =  null;
            
            //#line 202 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
            if (t$137806) {
                
                //#line 202 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
                t$137807 = ((java.lang.String)(shortForm));
            } else {
                
                //#line 202 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
                t$137807 = null;
            }
            
            //#line 201 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
            t$137809 = t$137807;
        }
        
        //#line 201 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
        final java.lang.String t$137810 = t$137809;
        
        //#line 201 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
        return t$137810;
    }
    
    
    //#line 208 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
    final public java.lang.String toString() {
        
        //#line 208 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
        final java.lang.String t$137811 = ((java.lang.String)(shortForm));
        
        //#line 208 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
        final java.lang.String t$137812 = (("{\n   short: \"") + (t$137811));
        
        //#line 208 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
        final java.lang.String t$137813 = ((t$137812) + ("\",\n   long: \""));
        
        //#line 209 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
        final java.lang.String t$137814 = ((java.lang.String)(longForm));
        
        //#line 208 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
        final java.lang.String t$137815 = ((t$137813) + (t$137814));
        
        //#line 208 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
        final java.lang.String t$137816 = ((t$137815) + ("\",\n   minFollow: "));
        
        //#line 210 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
        final int t$137817 = minFollow;
        
        //#line 208 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
        final java.lang.String t$137818 = ((t$137816) + ((x10.core.Int.$box(t$137817))));
        
        //#line 208 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
        final java.lang.String t$137819 = ((t$137818) + (",\n   arbFollow: "));
        
        //#line 211 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
        final boolean t$137820 = arbFollow;
        
        //#line 208 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
        final java.lang.String t$137821 = ((t$137819) + ((x10.core.Boolean.$box(t$137820))));
        
        //#line 208 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
        final java.lang.String t$137822 = ((t$137821) + (",\n   required: "));
        
        //#line 212 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
        final boolean t$137823 = required;
        
        //#line 208 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
        final java.lang.String t$137824 = ((t$137822) + ((x10.core.Boolean.$box(t$137823))));
        
        //#line 208 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
        final java.lang.String t$137825 = ((t$137824) + (",\n   description: \""));
        
        //#line 213 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
        final java.lang.String t$137826 = ((java.lang.String)(description));
        
        //#line 208 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
        final java.lang.String t$137827 = ((t$137825) + (t$137826));
        
        //#line 208 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
        final java.lang.String t$137828 = ((t$137827) + ("\"\n}"));
        
        //#line 208 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
        return t$137828;
    }
    
    
    //#line 220 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
    final public java.lang.String usage() {
        
        //#line 221 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
        java.lang.String keys = shortForm;
        
        //#line 222 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
        final java.lang.String t$137829 = ((java.lang.String)(longForm));
        
        //#line 222 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
        final int t$137830 = (t$137829).length();
        
        //#line 222 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
        final long t$137831 = ((long)(((int)(t$137830))));
        
        //#line 222 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
        final boolean t$137841 = ((t$137831) > (((long)(0L))));
        
        //#line 222 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
        if (t$137841) {
            
            //#line 223 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
            final java.lang.String t$137832 = ((java.lang.String)(shortForm));
            
            //#line 223 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
            final int t$137833 = (t$137832).length();
            
            //#line 223 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
            final long t$137834 = ((long)(((int)(t$137833))));
            
            //#line 223 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
            final boolean t$137840 = ((t$137834) > (((long)(0L))));
            
            //#line 223 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
            if (t$137840) {
                
                //#line 223 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
                final java.lang.String t$137836 = ((java.lang.String)(keys));
                
                //#line 223 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
                final java.lang.String t$137835 = ((java.lang.String)(longForm));
                
                //#line 223 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
                final java.lang.String t$137837 = ((" or ") + (t$137835));
                
                //#line 223 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
                final java.lang.String t$137838 = ((t$137836) + (t$137837));
                
                //#line 223 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
                keys = ((java.lang.String)(t$137838));
            } else {
                
                //#line 224 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
                final java.lang.String t$137839 = ((java.lang.String)(longForm));
                
                //#line 224 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
                keys = ((java.lang.String)(t$137839));
            }
        }
        
        //#line 226 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
        java.lang.String values = ": ";
        
        //#line 227 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
        final boolean t$137855 = arbFollow;
        
        //#line 227 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
        if (t$137855) {
            
            //#line 228 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
            final int t$137842 = minFollow;
            
            //#line 228 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
            final java.lang.String t$137843 = ((" (") + ((x10.core.Int.$box(t$137842))));
            
            //#line 228 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
            final java.lang.String t$137844 = ((t$137843) + (" or more values): "));
            
            //#line 228 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
            values = ((java.lang.String)(t$137844));
        } else {
            
            //#line 230 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
            final int t$137845 = minFollow;
            
            //#line 230 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
            final boolean t$137854 = ((int) t$137845) == ((int) 1);
            
            //#line 230 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
            if (t$137854) {
                
                //#line 230 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
                final int t$137846 = minFollow;
                
                //#line 230 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
                final java.lang.String t$137847 = ((" (") + ((x10.core.Int.$box(t$137846))));
                
                //#line 230 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
                final java.lang.String t$137848 = ((t$137847) + (" value): "));
                
                //#line 230 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
                values = ((java.lang.String)(t$137848));
            } else {
                
                //#line 231 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
                final int t$137849 = minFollow;
                
                //#line 231 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
                final boolean t$137853 = ((t$137849) > (((int)(1))));
                
                //#line 231 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
                if (t$137853) {
                    
                    //#line 231 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
                    final int t$137850 = minFollow;
                    
                    //#line 231 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
                    final java.lang.String t$137851 = ((" (") + ((x10.core.Int.$box(t$137850))));
                    
                    //#line 231 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
                    final java.lang.String t$137852 = ((t$137851) + (" values): "));
                    
                    //#line 231 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
                    values = ((java.lang.String)(t$137852));
                }
            }
        }
        
        //#line 232 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
        final boolean t$137856 = required;
        
        //#line 232 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
        java.lang.String t$137857 =  null;
        
        //#line 232 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
        if (t$137856) {
            
            //#line 232 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
            t$137857 = " (required)";
        } else {
            
            //#line 232 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
            t$137857 = "";
        }
        
        //#line 232 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
        final java.lang.String req = t$137857;
        
        //#line 233 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
        final java.lang.String t$137858 = ((java.lang.String)(keys));
        
        //#line 233 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
        final java.lang.String t$137859 = ((java.lang.String)(values));
        
        //#line 233 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
        final java.lang.String t$137860 = ((t$137858) + (t$137859));
        
        //#line 233 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
        final java.lang.String t$137861 = ((java.lang.String)(description));
        
        //#line 233 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
        final java.lang.String t$137862 = ((t$137860) + (t$137861));
        
        //#line 233 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
        final java.lang.String t$137863 = ((t$137862) + (req));
        
        //#line 233 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
        return t$137863;
    }
    
    
    //#line 240 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
    private static x10.util.Option HELP;
    
    //#line 246 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
    private static x10.util.Option BAD;
    
    
    //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
    final public java.lang.String typeName() {
        try {
            return x10.rtt.Types.typeName(this);
        }
        catch (java.lang.Throwable exc$146447) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$146447);
        }
        
    }
    
    
    
    //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
    final public int hashCode() {
        
        //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
        int result = 1;
        
        //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
        final int t$137864 = result;
        
        //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
        final int t$137866 = ((8191) * (((int)(t$137864))));
        
        //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
        final java.lang.String t$137865 = ((java.lang.String)(this.shortForm));
        
        //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
        final int t$137867 = (t$137865).hashCode();
        
        //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
        final int t$137868 = ((t$137866) + (((int)(t$137867))));
        
        //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
        result = t$137868;
        
        //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
        final int t$137869 = result;
        
        //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
        final int t$137871 = ((8191) * (((int)(t$137869))));
        
        //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
        final java.lang.String t$137870 = ((java.lang.String)(this.longForm));
        
        //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
        final int t$137872 = (t$137870).hashCode();
        
        //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
        final int t$137873 = ((t$137871) + (((int)(t$137872))));
        
        //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
        result = t$137873;
        
        //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
        final int t$137874 = result;
        
        //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
        final int t$137876 = ((8191) * (((int)(t$137874))));
        
        //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
        final java.lang.String t$137875 = ((java.lang.String)(this.description));
        
        //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
        final int t$137877 = (t$137875).hashCode();
        
        //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
        final int t$137878 = ((t$137876) + (((int)(t$137877))));
        
        //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
        result = t$137878;
        
        //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
        final int t$137879 = result;
        
        //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
        final int t$137881 = ((8191) * (((int)(t$137879))));
        
        //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
        final int t$137880 = this.minFollow;
        
        //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
        final int t$137882 = x10.rtt.Types.hashCode(t$137880);
        
        //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
        final int t$137883 = ((t$137881) + (((int)(t$137882))));
        
        //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
        result = t$137883;
        
        //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
        final int t$137884 = result;
        
        //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
        final int t$137886 = ((8191) * (((int)(t$137884))));
        
        //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
        final boolean t$137885 = this.arbFollow;
        
        //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
        final int t$137887 = x10.rtt.Types.hashCode(t$137885);
        
        //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
        final int t$137888 = ((t$137886) + (((int)(t$137887))));
        
        //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
        result = t$137888;
        
        //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
        final int t$137889 = result;
        
        //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
        final int t$137891 = ((8191) * (((int)(t$137889))));
        
        //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
        final boolean t$137890 = this.required;
        
        //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
        final int t$137892 = x10.rtt.Types.hashCode(t$137890);
        
        //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
        final int t$137893 = ((t$137891) + (((int)(t$137892))));
        
        //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
        result = t$137893;
        
        //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
        final int t$137894 = result;
        
        //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
        final int t$137896 = ((8191) * (((int)(t$137894))));
        
        //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
        final boolean t$137895 = this.onTheFly;
        
        //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
        final int t$137897 = x10.rtt.Types.hashCode(t$137895);
        
        //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
        final int t$137898 = ((t$137896) + (((int)(t$137897))));
        
        //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
        result = t$137898;
        
        //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
        final int t$137899 = result;
        
        //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
        return t$137899;
    }
    
    
    //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
    final public boolean equals(java.lang.Object other) {
        
        //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
        final java.lang.Object t$137900 = ((java.lang.Object)(other));
        
        //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
        final boolean t$137901 = x10.util.Option.$RTT.isInstance(t$137900);
        
        //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
        final boolean t$137902 = !(t$137901);
        
        //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
        if (t$137902) {
            
            //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
            return false;
        }
        
        //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
        final java.lang.Object t$137903 = ((java.lang.Object)(other));
        
        //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
        final x10.util.Option t$137904 = ((x10.util.Option)x10.rtt.Types.asStruct(x10.util.Option.$RTT,t$137903));
        
        //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
        final boolean t$137905 = this.equals$O(((x10.util.Option)(t$137904)));
        
        //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
        return t$137905;
    }
    
    
    //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
    final public boolean equals$O(x10.util.Option other) {
        
        //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
        final java.lang.String t$137907 = ((java.lang.String)(this.shortForm));
        
        //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
        final x10.util.Option t$137906 = ((x10.util.Option)(other));
        
        //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
        final java.lang.String t$137908 = ((java.lang.String)(t$137906.shortForm));
        
        //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
        boolean t$137912 = x10.rtt.Equality.equalsequals((t$137907),(t$137908));
        
        //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
        if (t$137912) {
            
            //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
            final java.lang.String t$137910 = ((java.lang.String)(this.longForm));
            
            //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
            final x10.util.Option t$137909 = ((x10.util.Option)(other));
            
            //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
            final java.lang.String t$137911 = ((java.lang.String)(t$137909.longForm));
            
            //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
            t$137912 = x10.rtt.Equality.equalsequals((t$137910),(t$137911));
        }
        
        //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
        boolean t$137916 = t$137912;
        
        //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
        if (t$137916) {
            
            //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
            final java.lang.String t$137914 = ((java.lang.String)(this.description));
            
            //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
            final x10.util.Option t$137913 = ((x10.util.Option)(other));
            
            //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
            final java.lang.String t$137915 = ((java.lang.String)(t$137913.description));
            
            //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
            t$137916 = x10.rtt.Equality.equalsequals((t$137914),(t$137915));
        }
        
        //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
        boolean t$137920 = t$137916;
        
        //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
        if (t$137920) {
            
            //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
            final int t$137918 = this.minFollow;
            
            //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
            final x10.util.Option t$137917 = ((x10.util.Option)(other));
            
            //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
            final int t$137919 = t$137917.minFollow;
            
            //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
            t$137920 = ((int) t$137918) == ((int) t$137919);
        }
        
        //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
        boolean t$137924 = t$137920;
        
        //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
        if (t$137924) {
            
            //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
            final boolean t$137922 = this.arbFollow;
            
            //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
            final x10.util.Option t$137921 = ((x10.util.Option)(other));
            
            //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
            final boolean t$137923 = t$137921.arbFollow;
            
            //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
            t$137924 = ((boolean) t$137922) == ((boolean) t$137923);
        }
        
        //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
        boolean t$137928 = t$137924;
        
        //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
        if (t$137928) {
            
            //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
            final boolean t$137926 = this.required;
            
            //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
            final x10.util.Option t$137925 = ((x10.util.Option)(other));
            
            //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
            final boolean t$137927 = t$137925.required;
            
            //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
            t$137928 = ((boolean) t$137926) == ((boolean) t$137927);
        }
        
        //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
        boolean t$137932 = t$137928;
        
        //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
        if (t$137932) {
            
            //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
            final boolean t$137930 = this.onTheFly;
            
            //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
            final x10.util.Option t$137929 = ((x10.util.Option)(other));
            
            //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
            final boolean t$137931 = t$137929.onTheFly;
            
            //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
            t$137932 = ((boolean) t$137930) == ((boolean) t$137931);
        }
        
        //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
        final boolean t$137933 = t$137932;
        
        //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
        return t$137933;
    }
    
    
    //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
    final public boolean _struct_equals$O(java.lang.Object other) {
        
        //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
        final java.lang.Object t$137934 = ((java.lang.Object)(other));
        
        //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
        final boolean t$137935 = x10.util.Option.$RTT.isInstance(t$137934);
        
        //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
        final boolean t$137936 = !(t$137935);
        
        //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
        if (t$137936) {
            
            //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
            return false;
        }
        
        //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
        final java.lang.Object t$137937 = ((java.lang.Object)(other));
        
        //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
        final x10.util.Option t$137938 = ((x10.util.Option)x10.rtt.Types.asStruct(x10.util.Option.$RTT,t$137937));
        
        //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
        final boolean t$137939 = this._struct_equals$O(((x10.util.Option)(t$137938)));
        
        //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
        return t$137939;
    }
    
    
    //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
    final public boolean _struct_equals$O(x10.util.Option other) {
        
        //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
        final java.lang.String t$137941 = ((java.lang.String)(this.shortForm));
        
        //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
        final x10.util.Option t$137940 = ((x10.util.Option)(other));
        
        //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
        final java.lang.String t$137942 = ((java.lang.String)(t$137940.shortForm));
        
        //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
        boolean t$137946 = x10.rtt.Equality.equalsequals((t$137941),(t$137942));
        
        //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
        if (t$137946) {
            
            //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
            final java.lang.String t$137944 = ((java.lang.String)(this.longForm));
            
            //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
            final x10.util.Option t$137943 = ((x10.util.Option)(other));
            
            //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
            final java.lang.String t$137945 = ((java.lang.String)(t$137943.longForm));
            
            //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
            t$137946 = x10.rtt.Equality.equalsequals((t$137944),(t$137945));
        }
        
        //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
        boolean t$137950 = t$137946;
        
        //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
        if (t$137950) {
            
            //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
            final java.lang.String t$137948 = ((java.lang.String)(this.description));
            
            //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
            final x10.util.Option t$137947 = ((x10.util.Option)(other));
            
            //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
            final java.lang.String t$137949 = ((java.lang.String)(t$137947.description));
            
            //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
            t$137950 = x10.rtt.Equality.equalsequals((t$137948),(t$137949));
        }
        
        //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
        boolean t$137954 = t$137950;
        
        //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
        if (t$137954) {
            
            //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
            final int t$137952 = this.minFollow;
            
            //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
            final x10.util.Option t$137951 = ((x10.util.Option)(other));
            
            //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
            final int t$137953 = t$137951.minFollow;
            
            //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
            t$137954 = ((int) t$137952) == ((int) t$137953);
        }
        
        //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
        boolean t$137958 = t$137954;
        
        //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
        if (t$137958) {
            
            //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
            final boolean t$137956 = this.arbFollow;
            
            //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
            final x10.util.Option t$137955 = ((x10.util.Option)(other));
            
            //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
            final boolean t$137957 = t$137955.arbFollow;
            
            //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
            t$137958 = ((boolean) t$137956) == ((boolean) t$137957);
        }
        
        //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
        boolean t$137962 = t$137958;
        
        //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
        if (t$137962) {
            
            //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
            final boolean t$137960 = this.required;
            
            //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
            final x10.util.Option t$137959 = ((x10.util.Option)(other));
            
            //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
            final boolean t$137961 = t$137959.required;
            
            //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
            t$137962 = ((boolean) t$137960) == ((boolean) t$137961);
        }
        
        //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
        boolean t$137966 = t$137962;
        
        //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
        if (t$137966) {
            
            //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
            final boolean t$137964 = this.onTheFly;
            
            //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
            final x10.util.Option t$137963 = ((x10.util.Option)(other));
            
            //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
            final boolean t$137965 = t$137963.onTheFly;
            
            //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
            t$137966 = ((boolean) t$137964) == ((boolean) t$137965);
        }
        
        //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
        final boolean t$137967 = t$137966;
        
        //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
        return t$137967;
    }
    
    
    //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
    final public x10.util.Option x10$util$Option$$this$x10$util$Option() {
        
        //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
        return x10.util.Option.this;
    }
    
    
    //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
    final public void __fieldInitializers_x10_util_Option() {
        
    }
    
    final private static x10.core.concurrent.AtomicInteger initStatus$BAD = new x10.core.concurrent.AtomicInteger(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED);
    private static x10.lang.ExceptionInInitializer exception$BAD;
    final private static x10.core.concurrent.AtomicInteger initStatus$HELP = new x10.core.concurrent.AtomicInteger(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED);
    private static x10.lang.ExceptionInInitializer exception$HELP;
    
    public static x10.util.Option get$HELP() {
        if (((int) x10.util.Option.initStatus$HELP.get()) == ((int) x10.runtime.impl.java.InitDispatcher.INITIALIZED)) {
            return x10.util.Option.HELP;
        }
        if (((int) x10.util.Option.initStatus$HELP.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
            throw x10.util.Option.exception$HELP;
        }
        if (x10.util.Option.initStatus$HELP.compareAndSet((int)(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED), (int)(x10.runtime.impl.java.InitDispatcher.INITIALIZING))) {
            try {{
                x10.util.Option.HELP = new x10.util.Option((java.lang.System[]) null).x10$util$Option$$init$S(((java.lang.String)("?")), ((java.lang.String)("help")), ((java.lang.String)("displays this message and exits")));
            }}catch (java.lang.Throwable exc$137978) {
                x10.util.Option.exception$HELP = new x10.lang.ExceptionInInitializer(exc$137978);
                x10.util.Option.initStatus$HELP.set((int)(x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED));
                x10.runtime.impl.java.InitDispatcher.lockInitialized();
                x10.runtime.impl.java.InitDispatcher.notifyInitialized();
                throw x10.util.Option.exception$HELP;
            }
            x10.util.Option.initStatus$HELP.set((int)(x10.runtime.impl.java.InitDispatcher.INITIALIZED));
            x10.runtime.impl.java.InitDispatcher.lockInitialized();
            x10.runtime.impl.java.InitDispatcher.notifyInitialized();
        } else {
            if (x10.util.Option.initStatus$HELP.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                x10.runtime.impl.java.InitDispatcher.lockInitialized();
                while (x10.util.Option.initStatus$HELP.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                    x10.runtime.impl.java.InitDispatcher.awaitInitialized();
                }
                x10.runtime.impl.java.InitDispatcher.unlockInitialized();
                if (((int) x10.util.Option.initStatus$HELP.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
                    throw x10.util.Option.exception$HELP;
                }
            }
        }
        return x10.util.Option.HELP;
    }
    
    public static x10.util.Option get$BAD() {
        if (((int) x10.util.Option.initStatus$BAD.get()) == ((int) x10.runtime.impl.java.InitDispatcher.INITIALIZED)) {
            return x10.util.Option.BAD;
        }
        if (((int) x10.util.Option.initStatus$BAD.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
            throw x10.util.Option.exception$BAD;
        }
        if (x10.util.Option.initStatus$BAD.compareAndSet((int)(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED), (int)(x10.runtime.impl.java.InitDispatcher.INITIALIZING))) {
            try {{
                x10.util.Option.BAD = new x10.util.Option((java.lang.System[]) null).x10$util$Option$$init$S(((java.lang.String)("")), ((java.lang.String)("")), ((java.lang.String)("")), ((int)(0)), ((boolean)(true)), ((boolean)(true)));
            }}catch (java.lang.Throwable exc$137979) {
                x10.util.Option.exception$BAD = new x10.lang.ExceptionInInitializer(exc$137979);
                x10.util.Option.initStatus$BAD.set((int)(x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED));
                x10.runtime.impl.java.InitDispatcher.lockInitialized();
                x10.runtime.impl.java.InitDispatcher.notifyInitialized();
                throw x10.util.Option.exception$BAD;
            }
            x10.util.Option.initStatus$BAD.set((int)(x10.runtime.impl.java.InitDispatcher.INITIALIZED));
            x10.runtime.impl.java.InitDispatcher.lockInitialized();
            x10.runtime.impl.java.InitDispatcher.notifyInitialized();
        } else {
            if (x10.util.Option.initStatus$BAD.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                x10.runtime.impl.java.InitDispatcher.lockInitialized();
                while (x10.util.Option.initStatus$BAD.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                    x10.runtime.impl.java.InitDispatcher.awaitInitialized();
                }
                x10.runtime.impl.java.InitDispatcher.unlockInitialized();
                if (((int) x10.util.Option.initStatus$BAD.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
                    throw x10.util.Option.exception$BAD;
                }
            }
        }
        return x10.util.Option.BAD;
    }
}

