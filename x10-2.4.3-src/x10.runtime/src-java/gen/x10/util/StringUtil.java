package x10.util;

@x10.runtime.impl.java.X10Generated
public class StringUtil extends x10.core.Ref implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<StringUtil> $RTT = 
        x10.rtt.NamedType.<StringUtil> make("x10.util.StringUtil",
                                            StringUtil.class);
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.util.StringUtil $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.util.StringUtil $_obj = new x10.util.StringUtil((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        
    }
    
    // constructor just for allocation
    public StringUtil(final java.lang.System[] $dummy) {
        
    }
    
    

    
    
    //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
    public static int radix$O(java.lang.String v) {
        
        //#line 44 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
        final java.lang.String t$142682 = ((java.lang.String)(v));
        
        //#line 44 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
        final char t$142683 = (t$142682).charAt(((int)(0)));
        
        //#line 44 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
        final boolean t$142686 = ((char) t$142683) == ((char) '-');
        
        //#line 44 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
        if (t$142686) {
            
            //#line 44 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
            final java.lang.String t$142684 = ((java.lang.String)(v));
            
            //#line 44 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
            final java.lang.String t$142685 = (t$142684).substring(((int)(1)));
            
            //#line 44 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
            v = ((java.lang.String)(t$142685));
        }
        
        //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
        final java.lang.String t$142687 = ((java.lang.String)(v));
        
        //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
        final int t$142688 = (t$142687).length();
        
        //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
        boolean t$142691 = ((t$142688) < (((int)(2))));
        
        //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
        if (!(t$142691)) {
            
            //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
            final java.lang.String t$142689 = ((java.lang.String)(v));
            
            //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
            final char t$142690 = (t$142689).charAt(((int)(0)));
            
            //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
            t$142691 = ((char) t$142690) != ((char) '0');
        }
        
        //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
        final boolean t$142698 = t$142691;
        
        //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
        if (t$142698) {
            
            //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
            return 10;
        } else {
            
            //#line 46 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
            final java.lang.String t$142692 = ((java.lang.String)(v));
            
            //#line 46 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
            final char t$142693 = (t$142692).charAt(((int)(1)));
            
            //#line 46 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
            boolean t$142696 = ((char) t$142693) == ((char) 'x');
            
            //#line 46 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
            if (!(t$142696)) {
                
                //#line 46 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
                final java.lang.String t$142694 = ((java.lang.String)(v));
                
                //#line 46 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
                final char t$142695 = (t$142694).charAt(((int)(1)));
                
                //#line 46 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
                t$142696 = ((char) t$142695) == ((char) 'X');
            }
            
            //#line 46 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
            final boolean t$142697 = t$142696;
            
            //#line 46 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
            if (t$142697) {
                
                //#line 46 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
                return 16;
            } else {
                
                //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
                return 8;
            }
        }
    }
    
    
    //#line 52 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
    private static java.lang.String stripRadix(java.lang.String v) {
        
        //#line 53 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
        final java.lang.String t$142699 = ((java.lang.String)(v));
        
        //#line 53 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
        final char t$142700 = (t$142699).charAt(((int)(0)));
        
        //#line 53 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
        final boolean t$142703 = ((char) t$142700) == ((char) '-');
        
        //#line 53 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
        if (t$142703) {
            
            //#line 53 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
            final java.lang.String t$142701 = ((java.lang.String)(v));
            
            //#line 53 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
            final java.lang.String t$142702 = (t$142701).substring(((int)(1)));
            
            //#line 53 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
            v = ((java.lang.String)(t$142702));
        }
        
        //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
        final java.lang.String t$142704 = ((java.lang.String)(v));
        
        //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
        final int t$142714 = x10.util.StringUtil.radix$O(((java.lang.String)(t$142704)));
        
        //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
        switch (t$142714) {
            
            //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
            case 10:
                
                //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
                final java.lang.String t$142705 = ((java.lang.String)(v));
                
                //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
                return t$142705;
            
            //#line 56 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
            case 16:
                
                //#line 56 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
                final java.lang.String t$142706 = ((java.lang.String)(v));
                
                //#line 56 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
                final java.lang.String t$142707 = (t$142706).substring(((int)(2)));
                
                //#line 56 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
                return t$142707;
            
            //#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
            case 8:
                
                //#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
                final java.lang.String t$142708 = ((java.lang.String)(v));
                
                //#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
                final java.lang.String t$142709 = (t$142708).substring(((int)(1)));
                
                //#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
                return t$142709;
            
            //#line 58 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
            default:
                
                //#line 58 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
                final java.lang.String t$142710 = ((java.lang.String)(v));
                
                //#line 58 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
                final int t$142711 = x10.util.StringUtil.radix$O(((java.lang.String)(t$142710)));
                
                //#line 58 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
                final java.lang.String t$142712 = (("Unexpected radix, ") + ((x10.core.Int.$box(t$142711))));
                
                //#line 58 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
                final java.lang.IllegalArgumentException t$142713 = ((java.lang.IllegalArgumentException)(new java.lang.IllegalArgumentException(t$142712)));
                
                //#line 58 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
                throw t$142713;
        }
    }
    
    public static java.lang.String stripRadix$P(java.lang.String v) {
        return x10.util.StringUtil.stripRadix(((java.lang.String)(v)));
    }
    
    
    //#line 73 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
    public static x10.util.Pair stripNumericType(final java.lang.String s) {
        
        //#line 74 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
        final int sLength = (s).length();
        
        //#line 75 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
        int n = ((sLength) - (((int)(1))));
        
        //#line 76 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
        java.lang.String typeLit =  null;
        
        //#line 77 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
        final java.lang.String sUpper = (s).toUpperCase();
        
        //#line 78 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
        final int xIndex = (sUpper).indexOf("X");
        
        //#line 79 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
        final int dotIndex = (sUpper).indexOf(".");
        
        //#line 80 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
        final boolean t$142733 = ((xIndex) < (((int)(0))));
        
        //#line 80 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
        if (t$142733) {
            
            //#line 81 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
            final boolean t$142715 = ((dotIndex) > (((int)(0))));
            
            //#line 81 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
            int t$142716 =  0;
            
            //#line 81 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
            if (t$142715) {
                
                //#line 81 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
                t$142716 = dotIndex;
            } else {
                
                //#line 81 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
                t$142716 = 0;
            }
            
            //#line 81 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
            final int lastN = t$142716;
            
            //#line 84 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
            while (true) {
                
                //#line 84 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
                final int t$142717 = n;
                
                //#line 84 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
                boolean t$142721 = ((t$142717) > (((int)(lastN))));
                
                //#line 84 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
                if (t$142721) {
                    
                    //#line 84 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
                    final int t$142718 = n;
                    
                    //#line 84 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
                    final char t$142719 = (sUpper).charAt(((int)(t$142718)));
                    
                    //#line 84 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
                    final boolean t$142720 = java.lang.Character.isDigit(t$142719);
                    
                    //#line 84 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
                    t$142721 = !(t$142720);
                }
                
                //#line 84 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
                final boolean t$142724 = t$142721;
                
                //#line 84 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
                if (!(t$142724)) {
                    
                    //#line 84 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
                    break;
                }
                
                //#line 84 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
                final int t$142860 = n;
                
                //#line 84 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
                final int t$142861 = ((t$142860) - (((int)(1))));
                
                //#line 84 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
                n = t$142861;
            }
        } else {
            
            //#line 86 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
            while (true) {
                
                //#line 86 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
                final int t$142725 = n;
                
                //#line 86 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
                boolean t$142729 = ((t$142725) > (((int)(0))));
                
                //#line 86 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
                if (t$142729) {
                    
                    //#line 86 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
                    final int t$142726 = n;
                    
                    //#line 86 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
                    final char t$142727 = (sUpper).charAt(((int)(t$142726)));
                    
                    //#line 86 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
                    final boolean t$142728 = x10.util.StringUtil.isHexDigit$O((char)(t$142727));
                    
                    //#line 86 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
                    t$142729 = !(t$142728);
                }
                
                //#line 86 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
                final boolean t$142732 = t$142729;
                
                //#line 86 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
                if (!(t$142732)) {
                    
                    //#line 86 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
                    break;
                }
                
                //#line 86 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
                final int t$142862 = n;
                
                //#line 86 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
                final int t$142863 = ((t$142862) - (((int)(1))));
                
                //#line 86 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
                n = t$142863;
            }
        }
        
        //#line 87 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
        final int t$142734 = n;
        
        //#line 87 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
        final int t$142735 = ((sLength) - (((int)(1))));
        
        //#line 87 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
        final boolean t$142743 = ((t$142734) < (((int)(t$142735))));
        
        //#line 87 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
        if (t$142743) {
            
            //#line 87 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
            final int t$142736 = n;
            
            //#line 87 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
            final int t$142737 = ((t$142736) + (((int)(1))));
            
            //#line 87 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
            final java.lang.String t$142738 = (sUpper).substring(((int)(t$142737)));
            
            //#line 87 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
            typeLit = ((java.lang.String)(t$142738));
        } else {
            
            //#line 88 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
            final boolean t$142742 = ((xIndex) > (((int)(0))));
            
            //#line 88 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
            if (t$142742) {
                
                //#line 88 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
                typeLit = ((java.lang.String)("I"));
            } else {
                
                //#line 89 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
                final boolean t$142741 = ((dotIndex) >= (((int)(0))));
                
                //#line 89 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
                if (t$142741) {
                    
                    //#line 89 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
                    typeLit = ((java.lang.String)("D"));
                } else {
                    
                    //#line 90 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
                    final int t$142739 = (sUpper).indexOf("E");
                    
                    //#line 90 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
                    final boolean t$142740 = ((t$142739) > (((int)(0))));
                    
                    //#line 90 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
                    if (t$142740) {
                        
                        //#line 90 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
                        typeLit = ((java.lang.String)("D"));
                    } else {
                        
                        //#line 91 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
                        typeLit = ((java.lang.String)("I"));
                    }
                }
            }
        }
        
        //#line 92 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
        final x10.util.Pair alloc$140712 = new x10.util.Pair<java.lang.String, java.lang.String>((java.lang.System[]) null, x10.rtt.Types.STRING, x10.rtt.Types.STRING);
        
        //#line 92 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
        final int t$142744 = n;
        
        //#line 92 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
        final int t$142745 = ((t$142744) + (((int)(1))));
        
        //#line 21 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Pair.x10"
        final java.lang.String first$142674 = ((java.lang.String)((sUpper).substring(((int)(0)), ((int)(t$142745)))));
        
        //#line 21 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Pair.x10"
        final java.lang.String second$142675 = ((java.lang.String)(typeLit));
        
        //#line 22 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Pair.x10"
        ((x10.util.Pair<java.lang.String, java.lang.String>)alloc$140712).first = ((java.lang.String)(first$142674));
        
        //#line 23 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Pair.x10"
        ((x10.util.Pair<java.lang.String, java.lang.String>)alloc$140712).second = ((java.lang.String)(second$142675));
        
        //#line 92 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
        return alloc$140712;
    }
    
    
    //#line 95 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
    private static boolean isHexDigit$O(final char c) {
        
        //#line 96 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
        final int ordC = ((int) (c));
        
        //#line 97 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
        final long t$142746 = ((long)(((int)(ordC))));
        
        //#line 97 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
        boolean t$142748 = ((t$142746) >= (((long)(48L))));
        
        //#line 97 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
        if (t$142748) {
            
            //#line 97 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
            final long t$142747 = ((long)(((int)(ordC))));
            
            //#line 97 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
            t$142748 = ((t$142747) <= (((long)(57L))));
        }
        
        //#line 97 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
        boolean t$142752 = t$142748;
        
        //#line 97 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
        if (!(t$142752)) {
            
            //#line 97 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
            final long t$142749 = ((long)(((int)(ordC))));
            
            //#line 97 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
            boolean t$142751 = ((t$142749) >= (((long)(65L))));
            
            //#line 97 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
            if (t$142751) {
                
                //#line 97 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
                final long t$142750 = ((long)(((int)(ordC))));
                
                //#line 97 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
                t$142751 = ((t$142750) <= (((long)(70L))));
            }
            
            //#line 97 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
            t$142752 = t$142751;
        }
        
        //#line 97 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
        final boolean t$142753 = t$142752;
        
        //#line 97 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
        return t$142753;
    }
    
    public static boolean isHexDigit$P$O(final char c) {
        return x10.util.StringUtil.isHexDigit$O((char)(c));
    }
    
    
    //#line 100 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
    public static byte parseByte$O(final java.lang.String s) {
        
        //#line 100 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
        final char t$142754 = (s).charAt(((int)(0)));
        
        //#line 100 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
        final boolean t$142755 = ((char) t$142754) == ((char) '-');
        
        //#line 100 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
        byte t$142756 =  0;
        
        //#line 100 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
        if (t$142755) {
            
            //#line 100 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
            t$142756 = ((byte) -1);
        } else {
            
            //#line 100 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
            t$142756 = ((byte) 1);
        }
        
        //#line 100 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
        final byte t$142759 = t$142756;
        
        //#line 100 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
        final java.lang.String t$142757 = x10.util.StringUtil.stripRadix(((java.lang.String)(s)));
        
        //#line 100 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
        final int t$142758 = x10.util.StringUtil.radix$O(((java.lang.String)(s)));
        
        //#line 100 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
        final byte t$142760 = java.lang.Byte.parseByte(t$142757, ((int)(t$142758)));
        
        //#line 100 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
        final byte t$142761 = ((byte) ((t$142759) * (((byte)(t$142760)))));
        
        //#line 100 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
        return t$142761;
    }
    
    
    //#line 101 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
    public static short parseShort$O(final java.lang.String s) {
        
        //#line 101 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
        final char t$142762 = (s).charAt(((int)(0)));
        
        //#line 101 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
        final boolean t$142763 = ((char) t$142762) == ((char) '-');
        
        //#line 101 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
        short t$142764 =  0;
        
        //#line 101 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
        if (t$142763) {
            
            //#line 101 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
            t$142764 = ((short) -1);
        } else {
            
            //#line 101 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
            t$142764 = ((short) 1);
        }
        
        //#line 101 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
        final short t$142767 = t$142764;
        
        //#line 101 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
        final java.lang.String t$142765 = x10.util.StringUtil.stripRadix(((java.lang.String)(s)));
        
        //#line 101 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
        final int t$142766 = x10.util.StringUtil.radix$O(((java.lang.String)(s)));
        
        //#line 101 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
        final short t$142768 = java.lang.Short.parseShort(t$142765, ((int)(t$142766)));
        
        //#line 101 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
        final short t$142769 = ((short) ((t$142767) * (((short)(t$142768)))));
        
        //#line 101 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
        return t$142769;
    }
    
    
    //#line 102 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
    public static int parseInt$O(final java.lang.String s) {
        
        //#line 102 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
        final char t$142770 = (s).charAt(((int)(0)));
        
        //#line 102 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
        final boolean t$142771 = ((char) t$142770) == ((char) '-');
        
        //#line 102 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
        int t$142772 =  0;
        
        //#line 102 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
        if (t$142771) {
            
            //#line 102 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
            t$142772 = -1;
        } else {
            
            //#line 102 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
            t$142772 = 1;
        }
        
        //#line 102 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
        final int t$142775 = t$142772;
        
        //#line 102 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
        final java.lang.String t$142773 = x10.util.StringUtil.stripRadix(((java.lang.String)(s)));
        
        //#line 102 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
        final int t$142774 = x10.util.StringUtil.radix$O(((java.lang.String)(s)));
        
        //#line 102 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
        final int t$142776 = java.lang.Integer.parseInt(t$142773, ((int)(t$142774)));
        
        //#line 102 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
        final int t$142777 = ((t$142775) * (((int)(t$142776))));
        
        //#line 102 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
        return t$142777;
    }
    
    
    //#line 103 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
    public static long parseLong$O(final java.lang.String s) {
        
        //#line 103 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
        final char t$142778 = (s).charAt(((int)(0)));
        
        //#line 103 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
        final boolean t$142779 = ((char) t$142778) == ((char) '-');
        
        //#line 103 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
        long t$142780 =  0;
        
        //#line 103 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
        if (t$142779) {
            
            //#line 103 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
            t$142780 = -1L;
        } else {
            
            //#line 103 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
            t$142780 = 1L;
        }
        
        //#line 103 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
        final long t$142783 = t$142780;
        
        //#line 103 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
        final java.lang.String t$142781 = x10.util.StringUtil.stripRadix(((java.lang.String)(s)));
        
        //#line 103 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
        final int t$142782 = x10.util.StringUtil.radix$O(((java.lang.String)(s)));
        
        //#line 103 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
        final long t$142784 = java.lang.Long.parseLong(t$142781, ((int)(t$142782)));
        
        //#line 103 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
        final long t$142785 = ((t$142783) * (((long)(t$142784))));
        
        //#line 103 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
        return t$142785;
    }
    
    
    //#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
    public static byte parseUByte$O(final java.lang.String s) {
        
        //#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
        final java.lang.String t$142786 = x10.util.StringUtil.stripRadix(((java.lang.String)(s)));
        
        //#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
        final int t$142787 = x10.util.StringUtil.radix$O(((java.lang.String)(s)));
        
        //#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
        final byte t$142788 = ((byte)(java.lang.Integer.parseInt(t$142786, ((int)(t$142787))) & 0xff));
        
        //#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
        return t$142788;
    }
    
    
    //#line 105 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
    public static short parseUShort$O(final java.lang.String s) {
        
        //#line 105 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
        final java.lang.String t$142789 = x10.util.StringUtil.stripRadix(((java.lang.String)(s)));
        
        //#line 105 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
        final int t$142790 = x10.util.StringUtil.radix$O(((java.lang.String)(s)));
        
        //#line 105 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
        final short t$142791 = ((short)(java.lang.Integer.parseInt(t$142789, ((int)(t$142790))) & 0xffff));
        
        //#line 105 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
        return t$142791;
    }
    
    
    //#line 106 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
    public static int parseUInt$O(final java.lang.String s) {
        
        //#line 106 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
        final java.lang.String t$142792 = x10.util.StringUtil.stripRadix(((java.lang.String)(s)));
        
        //#line 106 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
        final int t$142793 = x10.util.StringUtil.radix$O(((java.lang.String)(s)));
        
        //#line 106 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
        final int t$142794 = java.lang.Integer.parseInt(t$142792, ((int)(t$142793)));
        
        //#line 106 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
        return t$142794;
    }
    
    
    //#line 107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
    public static long parseULong$O(final java.lang.String s) {
        
        //#line 107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
        final java.lang.String t$142795 = x10.util.StringUtil.stripRadix(((java.lang.String)(s)));
        
        //#line 107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
        final int t$142796 = x10.util.StringUtil.radix$O(((java.lang.String)(s)));
        
        //#line 107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
        final long t$142797 = x10.runtime.impl.java.ULongUtils.parseULong(t$142795, ((int)(t$142796)));
        
        //#line 107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
        return t$142797;
    }
    
    
    //#line 109 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
    public static <$T>java.lang.String formatArray__0$1x10$util$StringUtil$$T$2(final x10.rtt.Type $T, final x10.core.Rail<$T> a) {
        
        //#line 109 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
        final java.lang.String t$142798 = x10.util.StringUtil.<$T> formatArray__0$1x10$util$StringUtil$$T$2($T, ((x10.core.Rail)(a)), ((java.lang.String)(", ")), ((java.lang.String)("    ")), (int)(80));
        
        //#line 109 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
        return t$142798;
    }
    
    
    //#line 110 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
    public static <$T>java.lang.String formatArray__0$1x10$util$StringUtil$$T$2(final x10.rtt.Type $T, final x10.core.Rail<$T> a, final java.lang.String separator, final java.lang.String leftPad, final int maxLength) {
        
        //#line 111 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
        final long t$142799 = ((x10.core.Rail<$T>)a).size;
        
        //#line 111 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
        final boolean t$142800 = ((long) t$142799) == ((long) 0L);
        
        //#line 111 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
        if (t$142800) {
            
            //#line 111 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
            return "";
        }
        
        //#line 112 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
        final x10.util.StringBuilder lines = ((x10.util.StringBuilder)(new x10.util.StringBuilder((java.lang.System[]) null)));
        
        //#line 112 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
        lines.x10$util$StringBuilder$$init$S();
        
        //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
        x10.util.StringBuilder aLine = new x10.util.StringBuilder((java.lang.System[]) null);
        
        //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
        aLine.x10$util$StringBuilder$$init$S();
        
        //#line 114 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
        final x10.util.StringBuilder t$142801 = ((x10.util.StringBuilder)(aLine));
        
        //#line 114 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
        t$142801.add(((java.lang.String)(leftPad)));
        
        //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
        final long t$142882 = ((x10.core.Rail<$T>)a).size;
        
        //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
        final long i$140716max$142883 = ((t$142882) - (((long)(2L))));
        
        //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
        long i$142879 = 0L;
        
        //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
        for (;
             true;
             ) {
            
            //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
            final long t$142880 = i$142879;
            
            //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
            final boolean t$142881 = ((t$142880) <= (((long)(i$140716max$142883))));
            
            //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
            if (!(t$142881)) {
                
                //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
                break;
            }
            
            //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
            final long n$142876 = i$142879;
            
            //#line 116 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
            final x10.util.StringBuilder t$142864 = ((x10.util.StringBuilder)(aLine));
            
            //#line 116 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
            final $T t$142865 = (($T)(((x10.core.Rail<$T>)a).$apply$G((long)(n$142876))));
            
            //#line 116 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
            final java.lang.String t$142866 = x10.rtt.Types.toString(((java.lang.Object)(t$142865)));
            
            //#line 116 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
            t$142864.add(((java.lang.String)(t$142866)));
            
            //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
            final x10.util.StringBuilder t$142867 = ((x10.util.StringBuilder)(aLine));
            
            //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
            t$142867.add(((java.lang.String)(separator)));
            
            //#line 118 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
            final x10.util.StringBuilder t$142868 = ((x10.util.StringBuilder)(aLine));
            
            //#line 118 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
            final long t$142869 = t$142868.length();
            
            //#line 118 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
            final long t$142870 = ((long)(((int)(maxLength))));
            
            //#line 118 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
            final boolean t$142871 = ((t$142869) >= (((long)(t$142870))));
            
            //#line 118 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
            if (t$142871) {
                
                //#line 119 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
                final x10.util.StringBuilder t$142872 = ((x10.util.StringBuilder)(aLine));
                
                //#line 119 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
                final java.lang.String t$142873 = t$142872.result();
                
                //#line 119 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
                lines.add(((java.lang.String)(t$142873)));
                
                //#line 120 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
                lines.add(((java.lang.String)("\n")));
                
                //#line 121 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
                final x10.util.StringBuilder alloc$142874 = ((x10.util.StringBuilder)(new x10.util.StringBuilder((java.lang.System[]) null)));
                
                //#line 121 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
                alloc$142874.x10$util$StringBuilder$$init$S();
                
                //#line 121 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
                aLine = ((x10.util.StringBuilder)(alloc$142874));
                
                //#line 122 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
                final x10.util.StringBuilder t$142875 = ((x10.util.StringBuilder)(aLine));
                
                //#line 122 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
                t$142875.add(((java.lang.String)(leftPad)));
            }
            
            //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
            final long t$142877 = i$142879;
            
            //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
            final long t$142878 = ((t$142877) + (((long)(1L))));
            
            //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
            i$142879 = t$142878;
        }
        
        //#line 125 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
        final x10.util.StringBuilder t$142819 = ((x10.util.StringBuilder)(aLine));
        
        //#line 125 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
        final long t$142820 = t$142819.length();
        
        //#line 125 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
        final long t$142821 = ((long)(((int)(maxLength))));
        
        //#line 125 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
        final boolean t$142825 = ((t$142820) >= (((long)(t$142821))));
        
        //#line 125 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
        if (t$142825) {
            
            //#line 126 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
            final x10.util.StringBuilder t$142822 = ((x10.util.StringBuilder)(aLine));
            
            //#line 126 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
            final java.lang.String t$142823 = t$142822.result();
            
            //#line 126 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
            lines.add(((java.lang.String)(t$142823)));
            
            //#line 127 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
            lines.add(((java.lang.String)("\n")));
            
            //#line 128 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
            final x10.util.StringBuilder alloc$140714 = ((x10.util.StringBuilder)(new x10.util.StringBuilder((java.lang.System[]) null)));
            
            //#line 128 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
            alloc$140714.x10$util$StringBuilder$$init$S();
            
            //#line 128 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
            aLine = ((x10.util.StringBuilder)(alloc$140714));
            
            //#line 129 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
            final x10.util.StringBuilder t$142824 = ((x10.util.StringBuilder)(aLine));
            
            //#line 129 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
            t$142824.add(((java.lang.String)(leftPad)));
        }
        
        //#line 131 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
        final x10.util.StringBuilder t$142828 = ((x10.util.StringBuilder)(aLine));
        
        //#line 131 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
        final long t$142826 = ((x10.core.Rail<$T>)a).size;
        
        //#line 131 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
        final long t$142827 = ((t$142826) - (((long)(2L))));
        
        //#line 131 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
        final $T t$142829 = (($T)(((x10.core.Rail<$T>)a).$apply$G((long)(t$142827))));
        
        //#line 131 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
        t$142828.add(((java.lang.Object)(t$142829)));
        
        //#line 132 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
        final x10.util.StringBuilder t$142830 = ((x10.util.StringBuilder)(aLine));
        
        //#line 132 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
        final long t$142831 = t$142830.length();
        
        //#line 132 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
        final long t$142832 = ((long)(((int)(maxLength))));
        
        //#line 132 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
        final boolean t$142834 = ((t$142831) >= (((long)(t$142832))));
        
        //#line 132 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
        if (t$142834) {
            
            //#line 132 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
            final x10.util.StringBuilder t$142833 = ((x10.util.StringBuilder)(aLine));
            
            //#line 132 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
            t$142833.add(((java.lang.String)("\n")));
        }
        
        //#line 133 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
        final x10.util.StringBuilder t$142835 = ((x10.util.StringBuilder)(aLine));
        
        //#line 133 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
        lines.add(((java.lang.Object)(t$142835)));
        
        //#line 134 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
        final java.lang.String t$142836 = lines.result();
        
        //#line 134 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
        return t$142836;
    }
    
    
    //#line 137 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
    private static <$T>x10.util.HashSet makeSet__0$1x10$util$StringUtil$$T$2(final x10.rtt.Type $T, final x10.core.Rail<$T> a) {
        
        //#line 138 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
        final long t$142837 = ((x10.core.Rail<$T>)a).size;
        
        //#line 138 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
        final int t$142838 = ((int)(long)(((long)(t$142837))));
        
        //#line 138 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
        final int t$142839 = ((3) * (((int)(t$142838))));
        
        //#line 138 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
        final int t$142840 = ((t$142839) / (((int)(2))));
        
        //#line 138 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
        final x10.util.HashSet t$142841 = ((x10.util.HashSet)(x10.util.StringUtil.<$T> makeSet__0$1x10$util$StringUtil$$T$2($T, ((x10.core.Rail)(a)), (int)(t$142840))));
        
        //#line 138 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
        return t$142841;
    }
    
    public static <$T>x10.util.HashSet makeSet$P__0$1x10$util$StringUtil$$T$2(final x10.rtt.Type $T, final x10.core.Rail<$T> a) {
        return x10.util.StringUtil.<$T> makeSet__0$1x10$util$StringUtil$$T$2($T, ((x10.core.Rail)(a)));
    }
    
    
    //#line 141 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
    private static <$T>x10.util.HashSet makeSet__0$1x10$util$StringUtil$$T$2(final x10.rtt.Type $T, final x10.core.Rail<$T> a, final int hashTableSize) {
        
        //#line 142 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
        final x10.util.HashSet set = ((x10.util.HashSet)(new x10.util.HashSet<$T>((java.lang.System[]) null, $T)));
        
        //#line 142 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
        set.x10$util$HashSet$$init$S(((int)(hashTableSize)));
        
        //#line 143 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
        final x10.core.Rail rail$142891 = ((x10.core.Rail)(a));
        
        //#line 143 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
        final long size$142892 = ((x10.core.Rail<$T>)rail$142891).size;
        
        //#line 143 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
        long idx$142888 = 0L;
        
        //#line 143 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
        for (;
             true;
             ) {
            
            //#line 143 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
            final long t$142889 = idx$142888;
            
            //#line 143 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
            final boolean t$142890 = ((t$142889) < (((long)(size$142892))));
            
            //#line 143 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
            if (!(t$142890)) {
                
                //#line 143 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
                break;
            }
            
            //#line 143 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
            final long t$142884 = idx$142888;
            
            //#line 143 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
            final $T v$142885 = (($T)(((x10.core.Rail<$T>)rail$142891).$apply$G((long)(t$142884))));
            
            //#line 143 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
            ((x10.util.MapSet<$T>)set).add__0x10$util$MapSet$$T$O((($T)(v$142885)));
            
            //#line 143 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
            final long t$142886 = idx$142888;
            
            //#line 143 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
            final long t$142887 = ((t$142886) + (((long)(1L))));
            
            //#line 143 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
            idx$142888 = t$142887;
        }
        
        //#line 144 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
        return set;
    }
    
    public static <$T>x10.util.HashSet makeSet$P__0$1x10$util$StringUtil$$T$2(final x10.rtt.Type $T, final x10.core.Rail<$T> a, final int hashTableSize) {
        return x10.util.StringUtil.<$T> makeSet__0$1x10$util$StringUtil$$T$2($T, ((x10.core.Rail)(a)), (int)(hashTableSize));
    }
    
    
    //#line 147 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
    private static x10.core.Rail<java.lang.String> TRUE_STRINGS;
    
    //#line 150 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
    private static x10.util.HashSet<java.lang.String> trueStrings;
    
    //#line 151 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
    private static x10.core.Rail<java.lang.String> FALSE_STRINGS;
    
    //#line 154 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
    private static x10.util.HashSet<java.lang.String> falseStrings;
    
    
    //#line 155 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
    private static x10.util.HashMap makeBooleanMap() {
        
        //#line 156 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
        final x10.util.HashMap map = ((x10.util.HashMap)(new x10.util.HashMap<java.lang.String, x10.core.Int>((java.lang.System[]) null, x10.rtt.Types.STRING, x10.rtt.Types.INT)));
        
        //#line 156 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
        map.x10$util$HashMap$$init$S();
        
        //#line 157 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
        final x10.util.HashSet t$142895 = ((x10.util.HashSet)(x10.util.StringUtil.get$trueStrings()));
        
        //#line 157 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
        final x10.lang.Iterator s$142896 = ((x10.lang.Iterator<java.lang.String>)
                                             ((x10.util.MapSet<java.lang.String>)t$142895).iterator());
        
        //#line 157 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
        for (;
             true;
             ) {
            
            //#line 157 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
            final boolean t$142897 = ((x10.lang.Iterator<java.lang.String>)s$142896).hasNext$O();
            
            //#line 157 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
            if (!(t$142897)) {
                
                //#line 157 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
                break;
            }
            
            //#line 157 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
            final java.lang.String s$142893 = ((java.lang.String)(((x10.lang.Iterator<java.lang.String>)s$142896).next$G()));
            
            //#line 157 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
            ((x10.util.HashMap<java.lang.String, x10.core.Int>)map).put__0x10$util$HashMap$$K__1x10$util$HashMap$$V(((java.lang.String)(s$142893)), x10.core.Int.$box(1));
        }
        
        //#line 158 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
        final x10.util.HashSet t$142898 = ((x10.util.HashSet)(x10.util.StringUtil.get$falseStrings()));
        
        //#line 158 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
        final x10.lang.Iterator s$142899 = ((x10.lang.Iterator<java.lang.String>)
                                             ((x10.util.MapSet<java.lang.String>)t$142898).iterator());
        
        //#line 158 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
        for (;
             true;
             ) {
            
            //#line 158 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
            final boolean t$142900 = ((x10.lang.Iterator<java.lang.String>)s$142899).hasNext$O();
            
            //#line 158 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
            if (!(t$142900)) {
                
                //#line 158 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
                break;
            }
            
            //#line 158 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
            final java.lang.String s$142894 = ((java.lang.String)(((x10.lang.Iterator<java.lang.String>)s$142899).next$G()));
            
            //#line 158 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
            ((x10.util.HashMap<java.lang.String, x10.core.Int>)map).put__0x10$util$HashMap$$K__1x10$util$HashMap$$V(((java.lang.String)(s$142894)), x10.core.Int.$box(0));
        }
        
        //#line 159 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
        return map;
    }
    
    public static x10.util.HashMap makeBooleanMap$P() {
        return x10.util.StringUtil.makeBooleanMap();
    }
    
    
    //#line 162 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
    private static x10.util.HashMap<java.lang.String, x10.core.Int> booleans;
    
    
    //#line 177 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
    public static boolean checkBoolean$O(final java.lang.String v) {
        
        //#line 178 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
        final java.lang.String vlow = (v).toLowerCase();
        
        //#line 179 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
        final x10.util.HashMap t$142854 = ((x10.util.HashMap)(x10.util.StringUtil.get$booleans()));
        
        //#line 179 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
        final int fromMap = x10.core.Int.$unbox(((x10.util.HashMap<java.lang.String, x10.core.Int>)t$142854).getOrElse__0x10$util$HashMap$$K__1x10$util$HashMap$$V$G(((java.lang.String)(vlow)), x10.core.Int.$box(-1)));
        
        //#line 180 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
        final boolean t$142859 = ((int) fromMap) == ((int) 1);
        
        //#line 180 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
        if (t$142859) {
            
            //#line 180 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
            return true;
        } else {
            
            //#line 181 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
            final boolean t$142858 = ((int) fromMap) == ((int) 0);
            
            //#line 181 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
            if (t$142858) {
                
                //#line 181 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
                return false;
            } else {
                
                //#line 183 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
                final java.lang.String t$142855 = (("Expected boolean string literal, got \"") + (v));
                
                //#line 183 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
                final java.lang.String t$142856 = ((t$142855) + ("\""));
                
                //#line 183 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
                final java.lang.IllegalArgumentException t$142857 = ((java.lang.IllegalArgumentException)(new java.lang.IllegalArgumentException(t$142856)));
                
                //#line 183 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
                throw t$142857;
            }
        }
    }
    
    
    //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
    final public x10.util.StringUtil x10$util$StringUtil$$this$x10$util$StringUtil() {
        
        //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
        return x10.util.StringUtil.this;
    }
    
    
    //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
    // creation method for java code (1-phase java constructor)
    public StringUtil() {
        this((java.lang.System[]) null);
        x10$util$StringUtil$$init$S();
    }
    
    // constructor for non-virtual call
    final public x10.util.StringUtil x10$util$StringUtil$$init$S() {
         {
            
            //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
            
            
            //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
            final x10.util.StringUtil this$142679 = this;
        }
        return this;
    }
    
    
    
    //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
    final public void __fieldInitializers_x10_util_StringUtil() {
        
    }
    
    final private static x10.core.concurrent.AtomicInteger initStatus$booleans = new x10.core.concurrent.AtomicInteger(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED);
    private static x10.lang.ExceptionInInitializer exception$booleans;
    final private static x10.core.concurrent.AtomicInteger initStatus$falseStrings = new x10.core.concurrent.AtomicInteger(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED);
    private static x10.lang.ExceptionInInitializer exception$falseStrings;
    final private static x10.core.concurrent.AtomicInteger initStatus$FALSE_STRINGS = new x10.core.concurrent.AtomicInteger(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED);
    private static x10.lang.ExceptionInInitializer exception$FALSE_STRINGS;
    final private static x10.core.concurrent.AtomicInteger initStatus$trueStrings = new x10.core.concurrent.AtomicInteger(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED);
    private static x10.lang.ExceptionInInitializer exception$trueStrings;
    final private static x10.core.concurrent.AtomicInteger initStatus$TRUE_STRINGS = new x10.core.concurrent.AtomicInteger(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED);
    private static x10.lang.ExceptionInInitializer exception$TRUE_STRINGS;
    
    public static x10.core.Rail get$TRUE_STRINGS() {
        if (((int) x10.util.StringUtil.initStatus$TRUE_STRINGS.get()) == ((int) x10.runtime.impl.java.InitDispatcher.INITIALIZED)) {
            return x10.util.StringUtil.TRUE_STRINGS;
        }
        if (((int) x10.util.StringUtil.initStatus$TRUE_STRINGS.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
            throw x10.util.StringUtil.exception$TRUE_STRINGS;
        }
        if (x10.util.StringUtil.initStatus$TRUE_STRINGS.compareAndSet((int)(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED), (int)(x10.runtime.impl.java.InitDispatcher.INITIALIZING))) {
            try {{
                x10.util.StringUtil.TRUE_STRINGS = ((x10.core.Rail)(x10.runtime.impl.java.ArrayUtils.<java.lang.String> makeRailFromJavaArray(x10.rtt.Types.STRING, new java.lang.String[] {"1", "yea", "yes", "si", "sim", "oui", "ja", "ok", "okay", "true", "t", "on"})));
            }}catch (java.lang.Throwable exc$142901) {
                x10.util.StringUtil.exception$TRUE_STRINGS = new x10.lang.ExceptionInInitializer(exc$142901);
                x10.util.StringUtil.initStatus$TRUE_STRINGS.set((int)(x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED));
                x10.runtime.impl.java.InitDispatcher.lockInitialized();
                x10.runtime.impl.java.InitDispatcher.notifyInitialized();
                throw x10.util.StringUtil.exception$TRUE_STRINGS;
            }
            x10.util.StringUtil.initStatus$TRUE_STRINGS.set((int)(x10.runtime.impl.java.InitDispatcher.INITIALIZED));
            x10.runtime.impl.java.InitDispatcher.lockInitialized();
            x10.runtime.impl.java.InitDispatcher.notifyInitialized();
        } else {
            if (x10.util.StringUtil.initStatus$TRUE_STRINGS.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                x10.runtime.impl.java.InitDispatcher.lockInitialized();
                while (x10.util.StringUtil.initStatus$TRUE_STRINGS.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                    x10.runtime.impl.java.InitDispatcher.awaitInitialized();
                }
                x10.runtime.impl.java.InitDispatcher.unlockInitialized();
                if (((int) x10.util.StringUtil.initStatus$TRUE_STRINGS.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
                    throw x10.util.StringUtil.exception$TRUE_STRINGS;
                }
            }
        }
        return x10.util.StringUtil.TRUE_STRINGS;
    }
    
    public static x10.util.HashSet get$trueStrings() {
        if (((int) x10.util.StringUtil.initStatus$trueStrings.get()) == ((int) x10.runtime.impl.java.InitDispatcher.INITIALIZED)) {
            return x10.util.StringUtil.trueStrings;
        }
        if (((int) x10.util.StringUtil.initStatus$trueStrings.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
            throw x10.util.StringUtil.exception$trueStrings;
        }
        if (x10.util.StringUtil.initStatus$trueStrings.compareAndSet((int)(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED), (int)(x10.runtime.impl.java.InitDispatcher.INITIALIZING))) {
            try {{
                x10.util.StringUtil.trueStrings = ((x10.util.HashSet)(x10.util.StringUtil.<java.lang.String> makeSet__0$1x10$util$StringUtil$$T$2(x10.rtt.Types.STRING, ((x10.core.Rail)(x10.util.StringUtil.get$TRUE_STRINGS())))));
            }}catch (java.lang.Throwable exc$142902) {
                x10.util.StringUtil.exception$trueStrings = new x10.lang.ExceptionInInitializer(exc$142902);
                x10.util.StringUtil.initStatus$trueStrings.set((int)(x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED));
                x10.runtime.impl.java.InitDispatcher.lockInitialized();
                x10.runtime.impl.java.InitDispatcher.notifyInitialized();
                throw x10.util.StringUtil.exception$trueStrings;
            }
            x10.util.StringUtil.initStatus$trueStrings.set((int)(x10.runtime.impl.java.InitDispatcher.INITIALIZED));
            x10.runtime.impl.java.InitDispatcher.lockInitialized();
            x10.runtime.impl.java.InitDispatcher.notifyInitialized();
        } else {
            if (x10.util.StringUtil.initStatus$trueStrings.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                x10.runtime.impl.java.InitDispatcher.lockInitialized();
                while (x10.util.StringUtil.initStatus$trueStrings.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                    x10.runtime.impl.java.InitDispatcher.awaitInitialized();
                }
                x10.runtime.impl.java.InitDispatcher.unlockInitialized();
                if (((int) x10.util.StringUtil.initStatus$trueStrings.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
                    throw x10.util.StringUtil.exception$trueStrings;
                }
            }
        }
        return x10.util.StringUtil.trueStrings;
    }
    
    public static x10.core.Rail get$FALSE_STRINGS() {
        if (((int) x10.util.StringUtil.initStatus$FALSE_STRINGS.get()) == ((int) x10.runtime.impl.java.InitDispatcher.INITIALIZED)) {
            return x10.util.StringUtil.FALSE_STRINGS;
        }
        if (((int) x10.util.StringUtil.initStatus$FALSE_STRINGS.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
            throw x10.util.StringUtil.exception$FALSE_STRINGS;
        }
        if (x10.util.StringUtil.initStatus$FALSE_STRINGS.compareAndSet((int)(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED), (int)(x10.runtime.impl.java.InitDispatcher.INITIALIZING))) {
            try {{
                x10.util.StringUtil.FALSE_STRINGS = ((x10.core.Rail)(x10.runtime.impl.java.ArrayUtils.<java.lang.String> makeRailFromJavaArray(x10.rtt.Types.STRING, new java.lang.String[] {"0", "no", "non", "nao", "nay", "nein", "false", "f", "off"})));
            }}catch (java.lang.Throwable exc$142903) {
                x10.util.StringUtil.exception$FALSE_STRINGS = new x10.lang.ExceptionInInitializer(exc$142903);
                x10.util.StringUtil.initStatus$FALSE_STRINGS.set((int)(x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED));
                x10.runtime.impl.java.InitDispatcher.lockInitialized();
                x10.runtime.impl.java.InitDispatcher.notifyInitialized();
                throw x10.util.StringUtil.exception$FALSE_STRINGS;
            }
            x10.util.StringUtil.initStatus$FALSE_STRINGS.set((int)(x10.runtime.impl.java.InitDispatcher.INITIALIZED));
            x10.runtime.impl.java.InitDispatcher.lockInitialized();
            x10.runtime.impl.java.InitDispatcher.notifyInitialized();
        } else {
            if (x10.util.StringUtil.initStatus$FALSE_STRINGS.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                x10.runtime.impl.java.InitDispatcher.lockInitialized();
                while (x10.util.StringUtil.initStatus$FALSE_STRINGS.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                    x10.runtime.impl.java.InitDispatcher.awaitInitialized();
                }
                x10.runtime.impl.java.InitDispatcher.unlockInitialized();
                if (((int) x10.util.StringUtil.initStatus$FALSE_STRINGS.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
                    throw x10.util.StringUtil.exception$FALSE_STRINGS;
                }
            }
        }
        return x10.util.StringUtil.FALSE_STRINGS;
    }
    
    public static x10.util.HashSet get$falseStrings() {
        if (((int) x10.util.StringUtil.initStatus$falseStrings.get()) == ((int) x10.runtime.impl.java.InitDispatcher.INITIALIZED)) {
            return x10.util.StringUtil.falseStrings;
        }
        if (((int) x10.util.StringUtil.initStatus$falseStrings.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
            throw x10.util.StringUtil.exception$falseStrings;
        }
        if (x10.util.StringUtil.initStatus$falseStrings.compareAndSet((int)(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED), (int)(x10.runtime.impl.java.InitDispatcher.INITIALIZING))) {
            try {{
                x10.util.StringUtil.falseStrings = ((x10.util.HashSet)(x10.util.StringUtil.<java.lang.String> makeSet__0$1x10$util$StringUtil$$T$2(x10.rtt.Types.STRING, ((x10.core.Rail)(x10.util.StringUtil.get$FALSE_STRINGS())))));
            }}catch (java.lang.Throwable exc$142904) {
                x10.util.StringUtil.exception$falseStrings = new x10.lang.ExceptionInInitializer(exc$142904);
                x10.util.StringUtil.initStatus$falseStrings.set((int)(x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED));
                x10.runtime.impl.java.InitDispatcher.lockInitialized();
                x10.runtime.impl.java.InitDispatcher.notifyInitialized();
                throw x10.util.StringUtil.exception$falseStrings;
            }
            x10.util.StringUtil.initStatus$falseStrings.set((int)(x10.runtime.impl.java.InitDispatcher.INITIALIZED));
            x10.runtime.impl.java.InitDispatcher.lockInitialized();
            x10.runtime.impl.java.InitDispatcher.notifyInitialized();
        } else {
            if (x10.util.StringUtil.initStatus$falseStrings.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                x10.runtime.impl.java.InitDispatcher.lockInitialized();
                while (x10.util.StringUtil.initStatus$falseStrings.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                    x10.runtime.impl.java.InitDispatcher.awaitInitialized();
                }
                x10.runtime.impl.java.InitDispatcher.unlockInitialized();
                if (((int) x10.util.StringUtil.initStatus$falseStrings.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
                    throw x10.util.StringUtil.exception$falseStrings;
                }
            }
        }
        return x10.util.StringUtil.falseStrings;
    }
    
    public static x10.util.HashMap get$booleans() {
        if (((int) x10.util.StringUtil.initStatus$booleans.get()) == ((int) x10.runtime.impl.java.InitDispatcher.INITIALIZED)) {
            return x10.util.StringUtil.booleans;
        }
        if (((int) x10.util.StringUtil.initStatus$booleans.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
            throw x10.util.StringUtil.exception$booleans;
        }
        if (x10.util.StringUtil.initStatus$booleans.compareAndSet((int)(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED), (int)(x10.runtime.impl.java.InitDispatcher.INITIALIZING))) {
            try {{
                x10.util.StringUtil.booleans = ((x10.util.HashMap)(x10.util.StringUtil.makeBooleanMap()));
            }}catch (java.lang.Throwable exc$142905) {
                x10.util.StringUtil.exception$booleans = new x10.lang.ExceptionInInitializer(exc$142905);
                x10.util.StringUtil.initStatus$booleans.set((int)(x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED));
                x10.runtime.impl.java.InitDispatcher.lockInitialized();
                x10.runtime.impl.java.InitDispatcher.notifyInitialized();
                throw x10.util.StringUtil.exception$booleans;
            }
            x10.util.StringUtil.initStatus$booleans.set((int)(x10.runtime.impl.java.InitDispatcher.INITIALIZED));
            x10.runtime.impl.java.InitDispatcher.lockInitialized();
            x10.runtime.impl.java.InitDispatcher.notifyInitialized();
        } else {
            if (x10.util.StringUtil.initStatus$booleans.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                x10.runtime.impl.java.InitDispatcher.lockInitialized();
                while (x10.util.StringUtil.initStatus$booleans.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                    x10.runtime.impl.java.InitDispatcher.awaitInitialized();
                }
                x10.runtime.impl.java.InitDispatcher.unlockInitialized();
                if (((int) x10.util.StringUtil.initStatus$booleans.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
                    throw x10.util.StringUtil.exception$booleans;
                }
            }
        }
        return x10.util.StringUtil.booleans;
    }
}

