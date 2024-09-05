//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int myInt = 20000; //int is of base 32
        int yourInt = myInt/2;
        byte myByte = -80; //byte is of base 8
        //casting
        byte yourByte = (byte) (myByte /2);
        short myShort = 2000; //short is of base 16

        long myLong = (long) (50000 + 10*(myByte + myShort + yourInt)); //long is of base 64
        long myLong2 = 50000L + 10L *(myByte + myShort + yourInt);

        System.out.println(myLong);
        System.out.println(myLong2);

        //pound to kg
        int pound = 3;
        float kg = pound*0.453592f; //put f at end for readability
        System.out.println(kg);

        double poundVal = 3d;
        double convKg = poundVal*0.453592f;
        System.out.println(convKg);

        //pound to kg
        double pound2 = kg/0.453592d;
        System.out.println(pound2);

        //width of char = 16
        char ch = '\u00AE';
        System.out.println("unicode char =" +ch);

        boolean isFemale = true;

        String s = "str";
    }
}