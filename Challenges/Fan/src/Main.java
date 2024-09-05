//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Fan f = new Fan("Man1", 2.3, "blue");
        f.switchOn();
        System.out.println(f);
        f.changeSpeed(3);
        System.out.println(f );
    }
}