//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        try {
            someOtherMethod();
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("eeee");
            e.printStackTrace();
        }
        someOtherMethod(); //this needs exceptional method signature
        someOtherMethod2(); //this does not
        //why????

    }
    private static void someOtherMethod2() throws RuntimeException {

    }
    private static void someOtherMethod() throws InterruptedException {
        Thread.sleep(2000);
    }

    //exceptions under Exception but not Runtime exception are called Checked Exceptions

}