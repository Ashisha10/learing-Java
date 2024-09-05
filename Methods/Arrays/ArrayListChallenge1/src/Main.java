import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        MobilePhone m = new MobilePhone();
        System.out.println("0 - To print choice options.\n" +
                "1 - To print the list of grocery items.\n" +
                "2 - To add a contact to the list.\n" +
                "3 - To update an contact in the list.\n" +
                "4 - To remove a contact from the list.\n" +
                "5 - To search for a contact in the list.\n" +
                "6 - To quit the application. \n");
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        int choice = -1;
        while(flag) {
            if(choice == 6) {
                break;
            }
            System.out.println("enter choice: ");
            switch (choice) {
                case 0:
                    scanner.nextLine();
                    String num = scanner.nextLine();
                    String name = scanner.nextLine();
                    m.addNumber(name, num);
                    break;
                case 1:
                    m.printContacts();
                    break;
                case 2:
                    int pos = scanner.nextInt();
                    m.printContacts(pos);
                    break;
                case 3:
                    m.updateContact(newName, );
            }
        }
    }
}