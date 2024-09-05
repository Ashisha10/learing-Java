import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BicCounterWithLock {
    private int i;
    private int j;
    Lock lockForI = new ReentrantLock();
    Lock lockForJ = new ReentrantLock();
    //this method breaks the code into chunks of synchronised code - such that parallel
    // threads are allowed and performance enhanced
    public void incrementI() {
        lockForI.lock();
        i++; //not an atomic operation -- thats why we need all these methods
        //Atomic operation - that doesnt need any other thread's interference
        lockForI.unlock();
    }
     public void incrementJ() {
        lockForJ.lock();
        j++;
        lockForJ.unlock();
    }

    public int getI() {
        return i;
    }

    public int getJ() {
        return j;
    }
}
