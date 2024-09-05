import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = null;
        try {
            scanner = new Scanner(System.in);
            int[] numbers = {1, 2, 3, 4};
            int number = numbers[11];
            //return;
        } catch (Exception e) {
            System.out.println("caught exc");
            //System.exit(1);
            e.getStackTrace();
        } finally {     //always executed -- no matter exc caught ot not, or even if try returns
            //finally is not executed only if the code crashes - exit fn
            //try + finally w/o catch also compile the code 
            System.out.println("before scanner close");
            scanner.close();
        }
        System.out.println("before main close");
    }
}

