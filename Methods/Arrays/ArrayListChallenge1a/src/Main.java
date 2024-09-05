//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        MobilePhone m = new MobilePhone();
        Contact c1 = new Contact("Abhijeet", "314159");
        Contact c2 = new Contact("Ashisha", "2341124");
        m.addContact(c1);
        m.addContact(c2);
        m.printContacts();
        Contact c3 = new Contact("Abhijeet", "314159");
        m.updateContact(1, c1, c3);
        m.printContacts();
    }
}