import java.sql.Array;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Main ended");
        method1();
        method2();
    }

    private static void method2() {
        try {
            String str = null;
            System.out.println(str.length());
            int[] i = {1,2};
            int num = i[3];
            System.out.println(num);
        } catch(NullPointerException ex){
            System.out.println("Null ptr exc");
            ex.getStackTrace();
        } catch (Exception exe) {
            System.out.println("overflow exc");
            exe.getStackTrace();
        }
    }

    private static void method1() {
        System.out.println("Method 1 ended");
    }
}