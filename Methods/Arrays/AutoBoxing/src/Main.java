import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Bank bank = new Bank("MyBank");

    public static void main(String[] args) {
        boolean quit = false;
        printOptions();
        while (!quit) {
            System.out.println("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 0:
                    printOptions();
                    break;
                case 1:
                    addBranch();
                    break;
                case 2:
                    addCustomer();
                    break;
                case 3:
                    addTransaction();
                    break;
                case 4:
                    showCustomerDetails();
                    break;
                case 5:
                    quit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
                    break;
            }
        }
        scanner.close();
    }

    private static void printOptions() {
        System.out.println("\nAvailable options:");
        System.out.println("0 - Print options");
        System.out.println("1 - Add a branch");
        System.out.println("2 - Add a customer");
        System.out.println("3 - Add a transaction");
        System.out.println("4 - Show customer details");
        System.out.println("5 - Quit");
    }

    private static void addBranch() {
        System.out.println("Enter branch name: ");
        String branchName = scanner.nextLine();
        bank.addBranch(branchName);
    }

    private static void addCustomer() {
        System.out.println("Enter branch name: ");
        String branchName = scanner.nextLine();
        System.out.println("Enter customer name: ");
        String customerName = scanner.nextLine();
        System.out.println("Enter initial transaction amount: ");
        double initialTransaction = scanner.nextDouble();
        bank.addCustomer(branchName, customerName, initialTransaction);
    }

    private static void addTransaction() {
        System.out.println("Enter branch name: ");
        String branchName = scanner.nextLine();
        System.out.println("Enter customer name: ");
        String customerName = scanner.nextLine();
        System.out.println("Enter transaction amount: ");
        double transactionAmount = scanner.nextDouble();
        bank.addTransaction(branchName, customerName, transactionAmount);
    }

    private static void showCustomerDetails() {
        System.out.println("Enter branch name: ");
        String branchName = scanner.nextLine();
        System.out.println("Do you want to show transactions? (yes/no)");
        String showTransactionsInput = scanner.nextLine();
        boolean showTransactions = showTransactionsInput.equalsIgnoreCase("yes");
        bank.showCustomerDetails(branchName, showTransactions);
    }

}
