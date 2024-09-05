import java.util.*;

public class Main {
    static GListArray n = new GListArray();

    public static void main(String[] args) {
        System.out.println("0 - To print choice options.\n" +
                "1 - To print the list of grocery items.\n" +
                "2 - To add an item to the list.\n" +
                "3 - To modify an item in the list.\n" +
                "4 - To remove an item from the list.\n" +
                "5 - To search for an item in the list.\n" +
                "6 - To quit the application. \n");
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while(flag) {
            System.out.println("enter choice: ");
            int choice = scanner.nextInt();
            if(choice == 6) {
                flag = false;
                break;
            }
            switch (choice) {
                case 0:
                    int idx = scanner.nextInt();
                    n.printItems(idx);
                    break;
                case 1:
                    scanner.nextLine();
                    n.printItems();
                    break;
                case 2:
                    scanner.nextLine();
                    String item = scanner.nextLine();
                    n.addItems(item);
                    break;
                case 3:
                    System.out.println("10- modify by pos and name\n" + "11- modify by name");
                    int inner_choice = scanner.nextInt();
                    switch (inner_choice) {
                        case 10:
                            int pos = scanner.nextInt();
                            String newItem = scanner.nextLine();
                            n.modifyItems(pos, newItem);
                            break;
                        case 11:
                            scanner.nextLine();
                            String newItem2 = scanner.nextLine();
                            n.modifyItems(newItem2);
                            break;
                    }
                    break;
                case 4:
                    System.out.println("10- remove by pos \n" + "11- remove by name");
                    int inner_choice2 = scanner.nextInt();
                    switch (inner_choice2) {
                        case 10:
                            int pos = scanner.nextInt();
                            n.rmItem(pos);
                            break;
                        case 11:
                            scanner.nextLine();
                            String rmItem = scanner.nextLine();
                            n.rmItem(rmItem);
                            break;
                    }
                    break;
                case 5:
                    String findingItem = scanner.nextLine();
                    n.findItem(findingItem);
                    break;
            }
        }

    }
}