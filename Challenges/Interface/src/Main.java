//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Caller c = new Caller("Ash", 1221, 12, 2);
        c.signingOff(false);
        c.receiving();
        c.solving(true);
        c.terminating();
        c.signingOff(true);
    }
}