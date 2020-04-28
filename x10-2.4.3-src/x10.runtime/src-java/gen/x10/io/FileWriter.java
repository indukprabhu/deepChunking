package x10.io;


@x10.runtime.impl.java.X10Generated
public class FileWriter extends x10.io.OutputStreamWriter implements x10.io.Unserializable, x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<FileWriter> $RTT = 
        x10.rtt.NamedType.<FileWriter> make("x10.io.FileWriter",
                                            FileWriter.class,
                                            new x10.rtt.Type[] {
                                                x10.io.Unserializable.$RTT,
                                                x10.io.OutputStreamWriter.$RTT
                                            });
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        throw new x10.io.NotSerializableException("Can't serialize x10.io.FileWriter");
    }
    
    // constructor just for allocation
    public FileWriter(final java.lang.System[] $dummy) {
        super($dummy);
        
    }
    
    

    
    //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FileWriter.x10"
    ;
    
    
    //#line 31 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FileWriter.x10"
    public x10.io.File file;
    
    
    //#line 34 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FileWriter.x10"
    private static x10.core.io.OutputStream make(final java.lang.String path, final boolean append) {
        
        //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FileWriter.x10"
        final x10.core.io.FileOutputStream t$90225 = ((x10.core.io.FileOutputStream)(new x10.core.io.FileOutputStream((java.lang.System[]) null).x10$io$FileReader$FileOutputStream$$init$S(path, ((boolean)(append)))));
        
        //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FileWriter.x10"
        return t$90225;
    }
    
    public static x10.core.io.OutputStream make$P(final java.lang.String path, final boolean append) {
        return x10.io.FileWriter.make(((java.lang.String)(path)), (boolean)(append));
    }
    
    
    //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FileWriter.x10"
    // creation method for java code (1-phase java constructor)
    public FileWriter(final x10.io.File file) {
        this((java.lang.System[]) null);
        x10$io$FileWriter$$init$S(file);
    }
    
    // constructor for non-virtual call
    final public x10.io.FileWriter x10$io$FileWriter$$init$S(final x10.io.File file) {
         {
            
            //#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FileWriter.x10"
            /*this.*/x10$io$FileWriter$$init$S(((x10.io.File)(file)), ((boolean)(false)));
        }
        return this;
    }
    
    
    
    //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FileWriter.x10"
    // creation method for java code (1-phase java constructor)
    public FileWriter(final x10.io.File file, final boolean append) {
        this((java.lang.System[]) null);
        x10$io$FileWriter$$init$S(file, append);
    }
    
    // constructor for non-virtual call
    final public x10.io.FileWriter x10$io$FileWriter$$init$S(final x10.io.File file, final boolean append) {
         {
            
            //#line 34 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FileWriter.x10"
            final java.lang.String path$90228 = ((java.lang.String)(file.getPath()));
            
            //#line 34 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FileWriter.x10"
            final boolean append$90229 = append;
            
            //#line 35 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FileWriter.x10"
            final x10.core.io.FileOutputStream t$90230 = ((x10.core.io.FileOutputStream)(new x10.core.io.FileOutputStream((java.lang.System[]) null).x10$io$FileReader$FileOutputStream$$init$S(path$90228, ((boolean)(append$90229)))));
            
            //#line 35 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FileWriter.x10"
            final x10.core.io.OutputStream t$90231 = ((x10.core.io.OutputStream)
                                                       t$90230);
            
            //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FileWriter.x10"
            /*super.*/x10$io$OutputStreamWriter$$init$S(t$90231);
            
            //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FileWriter.x10"
            
            
            //#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FileWriter.x10"
            final x10.io.FileWriter this$90232 = this;
            
            //#line 44 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FileWriter.x10"
            this.file = ((x10.io.File)(file));
        }
        return this;
    }
    
    
    
    //#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FileWriter.x10"
    final public x10.io.FileWriter x10$io$FileWriter$$this$x10$io$FileWriter() {
        
        //#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FileWriter.x10"
        return x10.io.FileWriter.this;
    }
    
    
    //#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FileWriter.x10"
    final public void __fieldInitializers_x10_io_FileWriter() {
        
    }
}

