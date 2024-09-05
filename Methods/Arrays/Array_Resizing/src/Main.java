import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        int[] arr = getArray();
        printingAr(arr);
        System.out.println("size of 1st = " + arr.length);
        int[] secArr = getSecArray(arr);
        printingAr(secArr);
        System.out.println("size of 2nd = " + secArr.length);

    }
     static int[] getArray() {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the values of numbers in array: ");
        int num = s.nextInt();
        int[] impArray = new int[num];
        for(int i = 0; i < impArray.length; i++) {
            impArray[i] = s.nextInt();
        }
        return impArray;
    }
     static int[] getSecArray(int[] arr) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the values of numbers in array: ");
        int num = s.nextInt();
        int[] ar = new int[num];
        int i=0;
        int j = 0;
        while(j < num) {
            if(j < arr.length) {
                ar[j] = arr[j];
            }
            else{
                ar[j] = s.nextInt();
            }
            j++;
        }
        return ar;
    }
     static void printingAr(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }



}