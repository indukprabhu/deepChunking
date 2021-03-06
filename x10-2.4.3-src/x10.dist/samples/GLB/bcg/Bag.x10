import x10.compiler.*;
import x10.glb.TaskBag;
public final class Bag implements  TaskBag{
    public val lower:Rail[Int];
    public val upper:Rail[Int];
    
    public def this(size:Long) {
        lower = new Rail[Int](size);
        upper = new Rail[Int](size);
    }
    
    @Inline public def size() = lower.size;
}
