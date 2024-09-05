abstract class myAbs {
    int num = 1;
    int imp = 0;
    public abstract void simple();
}
class Hey extends myAbs {
    public void simple() {
        System.out.println("its not that simple.");
    }
}
