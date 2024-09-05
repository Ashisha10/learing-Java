//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] myIntArray = new int[10];
        int j = 100;
        for(int i = 0; i < myIntArray.length; i++) {
            myIntArray[i] = j;
            j++;
        }
        for (int i = 0; i < myIntArray.length; i++) {
            System.out.print(myIntArray[i] + " ");
        }
        System.out.println();
        double[] myDoubleArray = new double[10];
        for (int i = 0; i <  myDoubleArray.length; i++) {
            myDoubleArray[i] = i;
            System.out.print(myDoubleArray[i] + " ");
        }
    }
}