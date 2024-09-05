import java.util.ArrayList;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] ar = {2,3,3,2,1};
        System.out.println(ar.length);
        System.out.println(Arrays.toString(ar));
        System.out.println(sum(1,3,4));
    }
     static int sum(int... values) {
        int sum = 0;
        for (int value: values) {
            sum += value;
        }
        return sum;
    }
}