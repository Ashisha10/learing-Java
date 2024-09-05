//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*;

public class Main {
    public static void main(String[] args) {
        MuxTable m = new MuxTable(5);
        m.printTable();
        int number = 10003;
        String n = "" + number;
        System.out.println(n.charAt(n.length()-1) - '0');
    }
}