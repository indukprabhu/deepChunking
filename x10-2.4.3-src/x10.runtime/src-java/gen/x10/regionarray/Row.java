package x10.regionarray;


@x10.runtime.impl.java.X10Generated
abstract public class Row extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<Row> $RTT = 
        x10.rtt.NamedType.<Row> make("x10.regionarray.Row",
                                     Row.class,
                                     new x10.rtt.Type[] {
                                         x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.INT, x10.rtt.Types.INT)
                                     });
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.regionarray.Row $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        $_obj.cols = $deserializer.readInt();
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        return null;
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        $serializer.write(this.cols);
        
    }
    
    // constructor just for allocation
    public Row(final java.lang.System[] $dummy) {
        
    }
    
    // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1){}:U
    public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1) {
        return x10.core.Int.$box($apply$O(x10.core.Int.$unbox(a1)));
        
    }
    
    // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1){}:U
    public int $apply$I(final java.lang.Object a1, final x10.rtt.Type t1) {
        return $apply$O(x10.core.Int.$unbox(a1));
        
    }
    
    
    // properties
    
    //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Row.x10"
    public int cols;
    

    
    
    //#line 20 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Row.x10"
    abstract public int $apply$O(final int i);
    
    
    //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Row.x10"
    abstract public int $set$O(final int i, final int v);
    
    
    //#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Row.x10"
    
    // constructor for non-virtual call
    final public x10.regionarray.Row x10$regionarray$Row$$init$S(final int cols) {
         {
            
            //#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Row.x10"
            this.cols = cols;
            
            
            //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Row.x10"
            final x10.regionarray.Row this$135013 = this;
        }
        return this;
    }
    
    
    
    //#line 28 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Row.x10"
    public void printInfo(final x10.io.Printer ps, final int row) {
        
        //#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Row.x10"
        ps.print(((java.lang.String)("[")));
        
        //#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Row.x10"
        int i$135078 = 0;
        
        //#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Row.x10"
        for (;
             true;
             ) {
            
            //#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Row.x10"
            final int t$135079 = i$135078;
            
            //#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Row.x10"
            final int t$135080 = cols;
            
            //#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Row.x10"
            final boolean t$135081 = ((t$135079) < (((int)(t$135080))));
            
            //#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Row.x10"
            if (!(t$135081)) {
                
                //#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Row.x10"
                break;
            }
            
            //#line 31 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Row.x10"
            final int t$135070 = i$135078;
            
            //#line 31 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Row.x10"
            final int t$135071 = this.$apply$O((int)(t$135070));
            
            //#line 31 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Row.x10"
            ps.print(x10.core.Int.$box(t$135071));
            
            //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Row.x10"
            final int t$135072 = i$135078;
            
            //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Row.x10"
            final int t$135073 = cols;
            
            //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Row.x10"
            final int t$135074 = ((t$135073) - (((int)(2))));
            
            //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Row.x10"
            final boolean t$135075 = ((int) t$135072) == ((int) t$135074);
            
            //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Row.x10"
            if (t$135075) {
                
                //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Row.x10"
                ps.print(((java.lang.String)(" |")));
            }
            
            //#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Row.x10"
            final int t$135076 = i$135078;
            
            //#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Row.x10"
            final int t$135077 = ((t$135076) + (((int)(1))));
            
            //#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Row.x10"
            i$135078 = t$135077;
        }
        
        //#line 34 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Row.x10"
        ps.print(((java.lang.String)(" ]   ")));
        
        //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Row.x10"
        this.printEqn(((x10.io.Printer)(ps)), ((java.lang.String)(" ")), (int)(row));
        
        //#line 36 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Row.x10"
        ps.println();
    }
    
    
    //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Row.x10"
    public void printEqn(final x10.io.Printer ps, final java.lang.String spc, final int row) {
        
        //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Row.x10"
        boolean first = true;
        
        //#line 44 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Row.x10"
        final java.lang.String t$135028 = (("y") + ((x10.core.Int.$box(row))));
        
        //#line 44 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Row.x10"
        final java.lang.String t$135029 = ((t$135028) + (" = "));
        
        //#line 44 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Row.x10"
        ps.print(((java.lang.String)(t$135029)));
        
        //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Row.x10"
        int i$135107 = 0;
        
        //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Row.x10"
        for (;
             true;
             ) {
            
            //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Row.x10"
            final int t$135108 = i$135107;
            
            //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Row.x10"
            final int t$135109 = cols;
            
            //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Row.x10"
            final int t$135110 = ((t$135109) - (((int)(1))));
            
            //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Row.x10"
            final boolean t$135111 = ((t$135108) < (((int)(t$135110))));
            
            //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Row.x10"
            if (!(t$135111)) {
                
                //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Row.x10"
                break;
            }
            
            //#line 46 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Row.x10"
            final int t$135082 = i$135107;
            
            //#line 46 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Row.x10"
            final int c$135083 = this.$apply$O((int)(t$135082));
            
            //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Row.x10"
            final boolean t$135084 = ((int) c$135083) == ((int) 1);
            
            //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Row.x10"
            if (t$135084) {
                
                //#line 48 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Row.x10"
                final boolean t$135085 = first;
                
                //#line 48 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Row.x10"
                if (t$135085) {
                    
                    //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Row.x10"
                    final int t$135086 = i$135107;
                    
                    //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Row.x10"
                    final java.lang.String t$135087 = (("x") + ((x10.core.Int.$box(t$135086))));
                    
                    //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Row.x10"
                    ps.print(((java.lang.String)(t$135087)));
                } else {
                    
                    //#line 51 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Row.x10"
                    final int t$135088 = i$135107;
                    
                    //#line 51 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Row.x10"
                    final java.lang.String t$135089 = (("+x") + ((x10.core.Int.$box(t$135088))));
                    
                    //#line 51 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Row.x10"
                    ps.print(((java.lang.String)(t$135089)));
                }
            } else {
                
                //#line 52 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Row.x10"
                final boolean t$135090 = ((int) c$135083) == ((int) -1);
                
                //#line 52 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Row.x10"
                if (t$135090) {
                    
                    //#line 53 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Row.x10"
                    final int t$135091 = i$135107;
                    
                    //#line 53 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Row.x10"
                    final java.lang.String t$135092 = (("-x") + ((x10.core.Int.$box(t$135091))));
                    
                    //#line 53 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Row.x10"
                    ps.print(((java.lang.String)(t$135092)));
                } else {
                    
                    //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Row.x10"
                    final boolean t$135093 = ((int) c$135083) != ((int) 0);
                    
                    //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Row.x10"
                    if (t$135093) {
                        
                        //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Row.x10"
                        boolean t$135094 = ((c$135083) >= (((int)(0))));
                        
                        //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Row.x10"
                        if (t$135094) {
                            
                            //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Row.x10"
                            final boolean t$135095 = first;
                            
                            //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Row.x10"
                            t$135094 = !(t$135095);
                        }
                        
                        //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Row.x10"
                        final boolean t$135096 = t$135094;
                        
                        //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Row.x10"
                        java.lang.String t$135097 =  null;
                        
                        //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Row.x10"
                        if (t$135096) {
                            
                            //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Row.x10"
                            t$135097 = "+";
                        } else {
                            
                            //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Row.x10"
                            t$135097 = "";
                        }
                        
                        //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Row.x10"
                        final java.lang.String t$135098 = t$135097;
                        
                        //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Row.x10"
                        final java.lang.String t$135099 = ((t$135098) + ((x10.core.Int.$box(c$135083))));
                        
                        //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Row.x10"
                        final java.lang.String t$135100 = ((t$135099) + ("*x"));
                        
                        //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Row.x10"
                        final int t$135101 = i$135107;
                        
                        //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Row.x10"
                        final java.lang.String t$135102 = ((t$135100) + ((x10.core.Int.$box(t$135101))));
                        
                        //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Row.x10"
                        final java.lang.String t$135103 = ((t$135102) + (" "));
                        
                        //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Row.x10"
                        ps.print(((java.lang.String)(t$135103)));
                    }
                }
            }
            
            //#line 56 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Row.x10"
            final boolean t$135104 = ((int) c$135083) != ((int) 0);
            
            //#line 56 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Row.x10"
            if (t$135104) {
                
                //#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Row.x10"
                first = false;
            }
            
            //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Row.x10"
            final int t$135105 = i$135107;
            
            //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Row.x10"
            final int t$135106 = ((t$135105) + (((int)(1))));
            
            //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Row.x10"
            i$135107 = t$135106;
        }
        
        //#line 59 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Row.x10"
        final int t$135059 = cols;
        
        //#line 59 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Row.x10"
        final int t$135060 = ((t$135059) - (((int)(1))));
        
        //#line 59 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Row.x10"
        final int c = this.$apply$O((int)(t$135060));
        
        //#line 60 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Row.x10"
        boolean t$135061 = ((int) c) != ((int) 0);
        
        //#line 60 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Row.x10"
        if (!(t$135061)) {
            
            //#line 60 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Row.x10"
            t$135061 = first;
        }
        
        //#line 60 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Row.x10"
        final boolean t$135068 = t$135061;
        
        //#line 60 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Row.x10"
        if (t$135068) {
            
            //#line 60 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Row.x10"
            boolean t$135063 = ((c) >= (((int)(0))));
            
            //#line 60 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Row.x10"
            if (t$135063) {
                
                //#line 60 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Row.x10"
                final boolean t$135062 = first;
                
                //#line 60 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Row.x10"
                t$135063 = !(t$135062);
            }
            
            //#line 60 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Row.x10"
            final boolean t$135064 = t$135063;
            
            //#line 60 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Row.x10"
            java.lang.String t$135065 =  null;
            
            //#line 60 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Row.x10"
            if (t$135064) {
                
                //#line 60 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Row.x10"
                t$135065 = "+";
            } else {
                
                //#line 60 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Row.x10"
                t$135065 = "";
            }
            
            //#line 60 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Row.x10"
            final java.lang.String t$135066 = t$135065;
            
            //#line 60 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Row.x10"
            final java.lang.String t$135067 = ((t$135066) + ((x10.core.Int.$box(c))));
            
            //#line 60 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Row.x10"
            ps.print(((java.lang.String)(t$135067)));
        }
    }
    
    
    //#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Row.x10"
    public java.lang.String toString() {
        
        //#line 64 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Row.x10"
        final x10.io.StringWriter os = ((x10.io.StringWriter)(new x10.io.StringWriter((java.lang.System[]) null)));
        
        //#line 64 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Row.x10"
        os.x10$io$StringWriter$$init$S();
        
        //#line 65 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Row.x10"
        final x10.io.Printer ps = ((x10.io.Printer)(new x10.io.Printer((java.lang.System[]) null)));
        
        //#line 65 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Row.x10"
        ps.x10$io$Printer$$init$S(((x10.io.Writer)(os)));
        
        //#line 66 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Row.x10"
        this.printEqn(((x10.io.Printer)(ps)), ((java.lang.String)("")), (int)(0));
        
        //#line 67 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Row.x10"
        final java.lang.String t$135069 = os.result();
        
        //#line 67 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Row.x10"
        return t$135069;
    }
    
    
    //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Row.x10"
    final public x10.regionarray.Row x10$regionarray$Row$$this$x10$regionarray$Row() {
        
        //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Row.x10"
        return x10.regionarray.Row.this;
    }
    
    
    //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Row.x10"
    final public void __fieldInitializers_x10_regionarray_Row() {
        
    }
}

