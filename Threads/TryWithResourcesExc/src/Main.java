import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //this try automatically calls for the closing of the scanner because in the
        //update Scanner implements Closeable which extends AutoCloseable 
        try(Scanner scanner = new Scanner(System.in)){
            int[] numbers = {13,42,124};
            int number = numbers[11];
        }
    }
}