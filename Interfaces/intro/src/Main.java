//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //standardise the way a particular set of classes is used
        //creates a commitment that cannot be changed
        //the class methods, var etc once defined here wont be changed
        Telephone ashPhone = new DeskPhone(21342);
        ashPhone.powerOn();
        ashPhone.makeCall(213421);
        ashPhone.callPhone(21342);
        ashPhone.answer();
        System.out.println("===================================");
        ashPhone = new MobilePhone(314159);
        ashPhone.powerOn();
        ashPhone.makeCall(2141141);
        ashPhone.callPhone(314159);
        ashPhone.answer();
    }
}