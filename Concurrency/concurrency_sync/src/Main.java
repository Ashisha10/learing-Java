//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Counter c = new Counter();
        c.increment();c.increment();c.increment();c.increment();
        System.out.println(c.getI());
        BiCounter b = new BiCounter();
        b.incrementI(); b.incrementI(); b.incrementI(); b.incrementI();
        b.incrementJ();
        b.incrementJ();
        b.incrementJ();
        System.out.println(b.getI() + " " + b.getJ());
    }
}