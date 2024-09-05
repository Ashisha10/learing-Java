public class BiCounter {
    private int i;
    private int j;

    synchronized public void incrementI() {
        i++;
    }
    //now this fn will for incI to end for its excesuion - 1 thread - performance impact
    synchronized public void incrementJ() {
        j++;
    }

    public int getI() {
        return i;
    }

    public int getJ() {
        return j;
    }

    //solved using Locks
}
