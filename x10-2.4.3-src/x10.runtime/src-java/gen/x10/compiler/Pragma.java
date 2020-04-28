package x10.compiler;


@x10.runtime.impl.java.X10Generated
public interface Pragma extends x10.lang.annotations.StatementAnnotation, x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<Pragma> $RTT = 
        x10.rtt.NamedType.<Pragma> make("x10.compiler.Pragma",
                                        Pragma.class,
                                        new x10.rtt.Type[] {
                                            x10.lang.annotations.StatementAnnotation.$RTT
                                        });
    
    

    
    //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/Pragma.x10"
    int FINISH_ASYNC = 1;
    
    //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/Pragma.x10"
    int FINISH_HERE = 2;
    
    //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/Pragma.x10"
    int FINISH_SPMD = 3;
    
    //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/Pragma.x10"
    int FINISH_LOCAL = 4;
    
    //#line 31 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/Pragma.x10"
    int FINISH_DENSE = 5;
    
    //#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/Pragma.x10"
    int FINISH_ASYNC_AND_BACK = 2;
    
    //#line 34 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/Pragma.x10"
    int FINISH_ATEACH_UNIQUE = 3;
    
    //#line 36 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/Pragma.x10"
    int FINISH_RESILIENT_PLACE_ZERO = 100;
    
    //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/Pragma.x10"
    int FINISH_RESILIENT_ZOO_KEEPER = 101;
    
    //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/Pragma.x10"
    int FINISH_RESILIENT_DISTRIBUTED = 102;
    @x10.runtime.impl.java.X10Generated
    abstract public class $Shadow extends x10.core.Ref implements x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Shadow> $RTT = 
            x10.rtt.NamedType.<$Shadow> make("x10.compiler.Pragma.$Shadow",
                                             $Shadow.class);
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.compiler.Pragma.$Shadow $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            return null;
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            
        }
        
        // constructor just for allocation
        public $Shadow(final java.lang.System[] $dummy) {
            
        }
        
        
    
        
        public static int get$FINISH_ASYNC() {
            return x10.compiler.Pragma.FINISH_ASYNC;
        }
        
        public static int get$FINISH_HERE() {
            return x10.compiler.Pragma.FINISH_HERE;
        }
        
        public static int get$FINISH_SPMD() {
            return x10.compiler.Pragma.FINISH_SPMD;
        }
        
        public static int get$FINISH_LOCAL() {
            return x10.compiler.Pragma.FINISH_LOCAL;
        }
        
        public static int get$FINISH_DENSE() {
            return x10.compiler.Pragma.FINISH_DENSE;
        }
        
        public static int get$FINISH_ASYNC_AND_BACK() {
            return x10.compiler.Pragma.FINISH_ASYNC_AND_BACK;
        }
        
        public static int get$FINISH_ATEACH_UNIQUE() {
            return x10.compiler.Pragma.FINISH_ATEACH_UNIQUE;
        }
        
        public static int get$FINISH_RESILIENT_PLACE_ZERO() {
            return x10.compiler.Pragma.FINISH_RESILIENT_PLACE_ZERO;
        }
        
        public static int get$FINISH_RESILIENT_ZOO_KEEPER() {
            return x10.compiler.Pragma.FINISH_RESILIENT_ZOO_KEEPER;
        }
        
        public static int get$FINISH_RESILIENT_DISTRIBUTED() {
            return x10.compiler.Pragma.FINISH_RESILIENT_DISTRIBUTED;
        }
    }
    
}

