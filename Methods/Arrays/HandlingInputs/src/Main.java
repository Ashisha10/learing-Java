import java.util.*;

import static java.util.Collections.*;

public class Main {
    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        String username = s.nextLine();
//        System.out.println(username);
        Scanner s = new Scanner(System.in);
        int number = s.nextInt();
        int[] ar = getNum(number);
        for(int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + " ");
        }
        System.out.println();
        System.out.println(getAvg(ar));
    }
    public static int[] getNum(int number) {
        int[] arr = new int[number];
        Scanner s = new Scanner(System.in);
        for(int i = 0; i < number; i++) {
            arr[i] = s.nextInt();
        }
        return arr;
    }
    public static float getAvg(int[] ar) {
        int sum = 0;
        for(int i = 0; i < ar.length; i++) {
            sum += ar[i];
        }
        return (float) ((sum/1.0)/ar.length);
    }

    public static int[] sortArray(int[] ar) {
        boolean flag = true;
        int temp = ar[0];
        while(flag) {
            flag = false;
            for(int i = 0; i < ar.length; i++) {
                temp = ar[i];
                
            }
        }
    }
}
