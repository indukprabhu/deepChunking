package x10.io;


@x10.runtime.impl.java.X10Generated
public class File extends x10.core.Ref implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<File> $RTT = 
        x10.rtt.NamedType.<File> make("x10.io.File",
                                      File.class);
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.io.File $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        $_obj.parent = $deserializer.readObject();
        $_obj.name = $deserializer.readObject();
        $_obj.absolute = $deserializer.readBoolean();
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.io.File $_obj = new x10.io.File((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        $serializer.write(this.parent);
        $serializer.write(this.name);
        $serializer.write(this.absolute);
        
    }
    
    // constructor just for allocation
    public File(final java.lang.System[] $dummy) {
        
    }
    
    

    
    //#line 36 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
    ;
    
    
    //#line 118 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
    final public static char SEPARATOR = '/';
    
    //#line 119 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
    final public static char PATH_SEPARATOR = ':';
    
    //#line 123 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
    public x10.io.File parent;
    
    //#line 124 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
    public java.lang.String name;
    
    //#line 125 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
    public boolean absolute;
    
    
    //#line 127 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
    // creation method for java code (1-phase java constructor)
    public File(final java.lang.String fullName) {
        this((java.lang.System[]) null);
        x10$io$File$$init$S(fullName);
    }
    
    // constructor for non-virtual call
    final public x10.io.File x10$io$File$$init$S(final java.lang.String fullName) {
         {
            
            //#line 127 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
            
            
            //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
            final x10.io.File this$90163 = this;
            
            //#line 128 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
            final int i = (fullName).lastIndexOf(((char)('/')));
            
            //#line 129 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
            final boolean t$90097 = ((int) i) == ((int) 0);
            
            //#line 129 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
            if (t$90097) {
                
                //#line 130 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
                this.parent = null;
                
                //#line 131 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
                this.name = ((java.lang.String)(fullName));
                
                //#line 132 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
                this.absolute = true;
            } else {
                
                //#line 134 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
                final boolean t$90096 = ((i) >= (((int)(0))));
                
                //#line 134 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
                if (t$90096) {
                    
                    //#line 135 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
                    final x10.io.File alloc$90052 = ((x10.io.File)(new x10.io.File((java.lang.System[]) null)));
                    
                    //#line 135 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
                    final java.lang.String t$90162 = (fullName).substring(((int)(0)), ((int)(i)));
                    
                    //#line 135 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
                    alloc$90052.x10$io$File$$init$S(t$90162);
                    
                    //#line 135 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
                    this.parent = ((x10.io.File)(alloc$90052));
                    
                    //#line 136 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
                    final int t$90091 = ((i) + (((int)(1))));
                    
                    //#line 136 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
                    final int t$90092 = (fullName).length();
                    
                    //#line 136 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
                    final java.lang.String t$90093 = (fullName).substring(((int)(t$90091)), ((int)(t$90092)));
                    
                    //#line 136 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
                    this.name = ((java.lang.String)(t$90093));
                    
                    //#line 137 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
                    final char t$90094 = (fullName).charAt(((int)(0)));
                    
                    //#line 137 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
                    final boolean t$90095 = ((char) t$90094) == ((char) ':');
                    
                    //#line 137 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
                    this.absolute = t$90095;
                } else {
                    
                    //#line 140 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
                    this.parent = null;
                    
                    //#line 141 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
                    this.name = ((java.lang.String)(fullName));
                    
                    //#line 142 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
                    this.absolute = false;
                }
            }
        }
        return this;
    }
    
    
    
    //#line 146 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
    // creation method for java code (1-phase java constructor)
    public File(final x10.io.File p, final java.lang.String n) {
        this((java.lang.System[]) null);
        x10$io$File$$init$S(p, n);
    }
    
    // constructor for non-virtual call
    final public x10.io.File x10$io$File$$init$S(final x10.io.File p, final java.lang.String n) {
         {
            
            //#line 146 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
            
            
            //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
            final x10.io.File this$90164 = this;
            
            //#line 147 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
            assert ((p) != (null));
            
            //#line 148 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
            this.parent = ((x10.io.File)(p));
            
            //#line 149 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
            this.name = ((java.lang.String)(n));
            
            //#line 150 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
            boolean t$90098 = ((p) != (null));
            
            //#line 150 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
            if (t$90098) {
                
                //#line 150 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
                t$90098 = p.absolute;
            }
            
            //#line 150 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
            final boolean t$90099 = t$90098;
            
            //#line 150 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
            this.absolute = t$90099;
        }
        return this;
    }
    
    
    
    //#line 153 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
    public java.lang.String toString() {
        
        //#line 153 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
        final java.lang.String t$90100 = this.getPath();
        
        //#line 153 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
        return t$90100;
    }
    
    
    //#line 155 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
    public x10.io.ReaderIterator lines() {
        
        //#line 156 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
        final x10.io.FileReader t$90101 = this.openRead();
        
        //#line 156 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
        final x10.io.ReaderIterator t$90102 = t$90101.lines();
        
        //#line 156 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
        return t$90102;
    }
    
    
    //#line 157 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
    public x10.io.ReaderIterator chars() {
        
        //#line 158 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
        final x10.io.FileReader t$90103 = this.openRead();
        
        //#line 158 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
        final x10.io.ReaderIterator t$90104 = t$90103.chars();
        
        //#line 158 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
        return t$90104;
    }
    
    
    //#line 159 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
    public x10.io.ReaderIterator bytes() {
        
        //#line 160 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
        final x10.io.FileReader t$90105 = this.openRead();
        
        //#line 160 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
        final x10.io.ReaderIterator t$90106 = t$90105.bytes();
        
        //#line 160 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
        return t$90106;
    }
    
    
    //#line 161 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
    public x10.io.FileReader openRead() {
        
        //#line 162 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
        final x10.io.FileReader alloc$90053 = ((x10.io.FileReader)(new x10.io.FileReader((java.lang.System[]) null)));
        
        //#line 162 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
        alloc$90053.x10$io$FileReader$$init$S(((x10.io.File)(this)));
        
        //#line 162 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
        return alloc$90053;
    }
    
    
    //#line 163 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
    public x10.io.FileWriter openWrite() {
        
        //#line 163 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
        final x10.io.FileWriter t$90107 = this.openWrite((boolean)(false));
        
        //#line 163 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
        return t$90107;
    }
    
    
    //#line 164 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
    public x10.io.FileWriter openWrite(final boolean append) {
        
        //#line 165 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
        final x10.io.FileWriter alloc$90054 = ((x10.io.FileWriter)(new x10.io.FileWriter((java.lang.System[]) null)));
        
        //#line 165 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
        alloc$90054.x10$io$FileWriter$$init$S(((x10.io.File)(this)), ((boolean)(append)));
        
        //#line 165 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
        return alloc$90054;
    }
    
    
    //#line 166 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
    public x10.io.Printer printer() {
        
        //#line 166 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
        final x10.io.Printer t$90108 = this.printer((boolean)(false));
        
        //#line 166 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
        return t$90108;
    }
    
    
    //#line 167 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
    public x10.io.Printer printer(final boolean append) {
        
        //#line 168 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
        final x10.io.Printer alloc$90055 = ((x10.io.Printer)(new x10.io.Printer((java.lang.System[]) null)));
        
        //#line 168 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
        final x10.io.FileWriter t$90165 = this.openWrite((boolean)(append));
        
        //#line 168 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
        alloc$90055.x10$io$Printer$$init$S(((x10.io.Writer)(t$90165)));
        
        //#line 168 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
        return alloc$90055;
    }
    
    
    //#line 170 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
    public java.lang.String getName() {
        
        //#line 170 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
        final java.lang.String t$90110 = ((java.lang.String)(name));
        
        //#line 170 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
        return t$90110;
    }
    
    
    //#line 171 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
    public x10.io.File getParentFile() {
        
        //#line 171 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
        final x10.io.File t$90111 = ((x10.io.File)(parent));
        
        //#line 171 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
        return t$90111;
    }
    
    
    //#line 172 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
    public java.lang.String getPath() {
        
        //#line 172 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
        final x10.io.File t$90112 = ((x10.io.File)(parent));
        
        //#line 172 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
        final boolean t$90117 = ((t$90112) == (null));
        
        //#line 172 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
        java.lang.String t$90118 =  null;
        
        //#line 172 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
        if (t$90117) {
            
            //#line 172 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
            t$90118 = name;
        } else {
            
            //#line 172 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
            final x10.io.File t$90113 = ((x10.io.File)(parent));
            
            //#line 172 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
            final java.lang.String t$90114 = t$90113.getPath();
            
            //#line 172 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
            final java.lang.String t$90115 = ((t$90114) + ((x10.core.Char.$box('/'))));
            
            //#line 172 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
            final java.lang.String t$90116 = ((java.lang.String)(name));
            
            //#line 172 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
            t$90118 = ((t$90115) + (t$90116));
        }
        
        //#line 172 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
        final java.lang.String t$90119 = t$90118;
        
        //#line 172 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
        return t$90119;
    }
    
    
    //#line 173 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
    public boolean isAbsolute$O() {
        
        //#line 173 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
        final boolean t$90120 = absolute;
        
        //#line 173 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
        return t$90120;
    }
    
    
    //#line 175 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
    public x10.core.io.NativeFile nativeFile() {
        
        //#line 175 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
        final java.lang.String t$90121 = this.getPath();
        
        //#line 175 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
        final x10.core.io.NativeFile t$90122 = ((x10.core.io.NativeFile)(new x10.core.io.NativeFile(t$90121)));
        
        //#line 175 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
        return t$90122;
    }
    
    
    //#line 177 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
    public x10.io.File getAbsoluteFile() {
        
        //#line 177 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
        final x10.io.File alloc$90056 = ((x10.io.File)(new x10.io.File((java.lang.System[]) null)));
        
        //#line 177 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
        final x10.core.io.NativeFile t$90166 = ((x10.core.io.NativeFile)(this.nativeFile()));
        
        //#line 177 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
        final java.lang.String t$90167 = t$90166.getAbsolutePath();
        
        //#line 177 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
        alloc$90056.x10$io$File$$init$S(t$90167);
        
        //#line 177 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
        return alloc$90056;
    }
    
    
    //#line 178 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
    public x10.io.File getCanonicalFile() {
        
        //#line 179 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
        final x10.io.File alloc$90057 = ((x10.io.File)(new x10.io.File((java.lang.System[]) null)));
        
        //#line 179 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
        final x10.core.io.NativeFile t$90168 = ((x10.core.io.NativeFile)(this.nativeFile()));
        
        //#line 179 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
        final java.lang.String t$90169 = t$90168.getCanonicalPath();
        
        //#line 179 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
        alloc$90057.x10$io$File$$init$S(t$90169);
        
        //#line 179 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
        return alloc$90057;
    }
    
    
    //#line 181 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
    public boolean exists$O() {
        
        //#line 181 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
        final x10.core.io.NativeFile t$90127 = ((x10.core.io.NativeFile)(this.nativeFile()));
        
        //#line 181 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
        final boolean t$90128 = t$90127.exists();
        
        //#line 181 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
        return t$90128;
    }
    
    
    //#line 184 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
    public boolean isSymbolicLink$O() {
        
        //#line 184 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
        final java.lang.UnsupportedOperationException t$90129 = ((java.lang.UnsupportedOperationException)(new java.lang.UnsupportedOperationException()));
        
        //#line 184 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
        throw t$90129;
    }
    
    
    //#line 185 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
    public boolean isAlias$O() {
        
        //#line 185 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
        final java.lang.UnsupportedOperationException t$90130 = ((java.lang.UnsupportedOperationException)(new java.lang.UnsupportedOperationException()));
        
        //#line 185 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
        throw t$90130;
    }
    
    
    //#line 186 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
    public boolean hardLinkCount$O() {
        
        //#line 186 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
        final java.lang.UnsupportedOperationException t$90131 = ((java.lang.UnsupportedOperationException)(new java.lang.UnsupportedOperationException()));
        
        //#line 186 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
        throw t$90131;
    }
    
    
    //#line 187 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
    public long inodeNumber$O() {
        
        //#line 187 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
        final java.lang.UnsupportedOperationException t$90132 = ((java.lang.UnsupportedOperationException)(new java.lang.UnsupportedOperationException()));
        
        //#line 187 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
        throw t$90132;
    }
    
    
    //#line 188 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
    public int permissions$O() {
        
        //#line 188 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
        final java.lang.UnsupportedOperationException t$90133 = ((java.lang.UnsupportedOperationException)(new java.lang.UnsupportedOperationException()));
        
        //#line 188 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
        throw t$90133;
    }
    
    
    //#line 191 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
    public boolean isDirectory$O() {
        
        //#line 191 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
        final x10.core.io.NativeFile t$90134 = ((x10.core.io.NativeFile)(this.nativeFile()));
        
        //#line 191 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
        final boolean t$90135 = t$90134.isDirectory();
        
        //#line 191 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
        return t$90135;
    }
    
    
    //#line 192 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
    public boolean isFile$O() {
        
        //#line 192 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
        final x10.core.io.NativeFile t$90136 = ((x10.core.io.NativeFile)(this.nativeFile()));
        
        //#line 192 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
        final boolean t$90137 = t$90136.isFile();
        
        //#line 192 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
        return t$90137;
    }
    
    
    //#line 193 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
    public boolean isHidden$O() {
        
        //#line 193 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
        final x10.core.io.NativeFile t$90138 = ((x10.core.io.NativeFile)(this.nativeFile()));
        
        //#line 193 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
        final boolean t$90139 = t$90138.isHidden();
        
        //#line 193 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
        return t$90139;
    }
    
    
    //#line 195 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
    public long lastModified$O() {
        
        //#line 195 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
        final x10.core.io.NativeFile t$90140 = ((x10.core.io.NativeFile)(this.nativeFile()));
        
        //#line 195 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
        final long t$90141 = t$90140.lastModified();
        
        //#line 195 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
        return t$90141;
    }
    
    
    //#line 196 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
    public boolean setLastModified$O(final long t) {
        
        //#line 196 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
        final x10.core.io.NativeFile t$90142 = ((x10.core.io.NativeFile)(this.nativeFile()));
        
        //#line 196 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
        final boolean t$90143 = t$90142.setLastModified(((long)(t)));
        
        //#line 196 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
        return t$90143;
    }
    
    
    //#line 197 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
    public long size$O() {
        
        //#line 197 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
        final x10.core.io.NativeFile t$90144 = ((x10.core.io.NativeFile)(this.nativeFile()));
        
        //#line 197 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
        final long t$90145 = t$90144.length();
        
        //#line 197 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
        return t$90145;
    }
    
    
    //#line 199 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
    public int compareTo(final java.lang.Object f) {
        
        //#line 199 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
        final java.lang.UnsupportedOperationException t$90146 = ((java.lang.UnsupportedOperationException)(new java.lang.UnsupportedOperationException()));
        
        //#line 199 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
        throw t$90146;
    }
    
    
    //#line 201 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
    public boolean canRead$O() {
        
        //#line 201 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
        final x10.core.io.NativeFile t$90147 = ((x10.core.io.NativeFile)(this.nativeFile()));
        
        //#line 201 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
        final boolean t$90148 = t$90147.canRead();
        
        //#line 201 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
        return t$90148;
    }
    
    
    //#line 202 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
    public boolean canWrite$O() {
        
        //#line 202 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
        final x10.core.io.NativeFile t$90149 = ((x10.core.io.NativeFile)(this.nativeFile()));
        
        //#line 202 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
        final boolean t$90150 = t$90149.canWrite();
        
        //#line 202 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
        return t$90150;
    }
    
    
    //#line 204 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
    public boolean delete$O() {
        
        //#line 204 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
        final x10.core.io.NativeFile t$90151 = ((x10.core.io.NativeFile)(this.nativeFile()));
        
        //#line 204 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
        final boolean t$90152 = t$90151.delete();
        
        //#line 204 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
        return t$90152;
    }
    
    
    //#line 205 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
    public x10.core.Rail list() {
        
        //#line 205 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
        final x10.core.io.NativeFile t$90153 = ((x10.core.io.NativeFile)(this.nativeFile()));
        
        //#line 205 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
        final x10.core.Rail t$90154 = t$90153.listInternal();
        
        //#line 205 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
        return t$90154;
    }
    
    
    //#line 206 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
    public boolean mkdir$O() {
        
        //#line 206 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
        final x10.core.io.NativeFile t$90155 = ((x10.core.io.NativeFile)(this.nativeFile()));
        
        //#line 206 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
        final boolean t$90156 = t$90155.mkdir();
        
        //#line 206 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
        return t$90156;
    }
    
    
    //#line 207 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
    public boolean mkdirs$O() {
        
        //#line 207 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
        final x10.core.io.NativeFile t$90157 = ((x10.core.io.NativeFile)(this.nativeFile()));
        
        //#line 207 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
        final boolean t$90158 = t$90157.mkdirs();
        
        //#line 207 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
        return t$90158;
    }
    
    
    //#line 208 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
    public boolean renameTo$O(final x10.io.File dest) {
        
        //#line 208 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
        final x10.core.io.NativeFile t$90159 = ((x10.core.io.NativeFile)(this.nativeFile()));
        
        //#line 208 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
        final x10.core.io.NativeFile t$90160 = ((x10.core.io.NativeFile)(dest.nativeFile()));
        
        //#line 208 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
        final boolean t$90161 = t$90159.renameTo(t$90160);
        
        //#line 208 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
        return t$90161;
    }
    
    
    //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
    final public x10.io.File x10$io$File$$this$x10$io$File() {
        
        //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
        return x10.io.File.this;
    }
    
    
    //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/File.x10"
    final public void __fieldInitializers_x10_io_File() {
        
    }
    
    public static char get$SEPARATOR() {
        return x10.io.File.SEPARATOR;
    }
    
    public static char get$PATH_SEPARATOR() {
        return x10.io.File.PATH_SEPARATOR;
    }
}

