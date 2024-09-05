import java.util.concurrent.atomic.AtomicInteger;

public class BiCounterWithAtomicOp {
    //this method is not applicable when multiple op may be needed - then use lock
    //automatically adds thread safety
    private AtomicInteger i;
    private AtomicInteger j;
     public void incrementI() {
        i.incrementAndGet();
    }
     public void incrementJ() {
        j.incrementAndGet();
    }

    public int getI() {
        return i.get();
    }

    public int getJ() {
        return j.get();
    }
}
