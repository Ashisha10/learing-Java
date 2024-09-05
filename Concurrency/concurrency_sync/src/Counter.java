public class Counter {

    private int i;
    public void increment() {
        i++;
    }

    synchronized public int getI() {
        return i;
    }
}
