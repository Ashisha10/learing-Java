//import java.util.ArrayList;
//
//public class Branch {
//    private ArrayList<Customer> customers = new ArrayList<Customer>();
//    private String bname = this.name;
//    private String name = this.name;
//    private double initialAmt = this.initialAmt;
//    private double totalAmt;
//
//    public Branch(String bname) {
//        this.bname = bname;
//    }
//
//    public String getBname() {
//        return bname;
//    }
//
//    void addCostumers(String name, double initialAmt) {
//        Customer c = new Customer(name, initialAmt);
//        totalAmt += initialAmt;
//        customers.add(c);
//    }
//    void printTotalAmt() {
//        System.out.println("Total branch treasury atm is: " + totalAmt);
//    }
//    void addAmt(String name, double addingAmt) {
//        for(int i = 0; i < customers.size(); i++) {
//            if(customers.get(i).getName().equals(name)) {
//                double curr = customers.get(i).getCurrAmt();
//                curr += addingAmt;
//                customers.get(i).setCurrAmt(curr);
//                break;
//            }
//        }
//    }
//    void printCustomerDetails() {
//        for(int i = 0; i < customers.size(); i++) {
//            System.out.println(customers.get(i).getName() + "--> " + customers.get(i).getCurrAmt());
//        }
//    }
//}

import java.util.ArrayList;

class Branch {
    private String branchName;
    private ArrayList<Customer> customers;

    public Branch(String branchName) {
        this.branchName = branchName;
        this.customers = new ArrayList<>();
    }

    public String getBranchName() {
        return branchName;
    }

    public void addCustomer(String customerName, double initialTransaction) {
        if (findCustomer(customerName) == null) {
            customers.add(new Customer(customerName, initialTransaction));
            System.out.println("Customer '" + customerName + "' added to branch '" + branchName + "'.");
        } else {
            System.out.println("Customer '" + customerName + "' already exists in branch '" + branchName + "'.");
        }
    }

    public void addTransaction(String customerName, double transactionAmount) {
        Customer customer = findCustomer(customerName);
        if (customer != null) {
            customer.addTransaction(transactionAmount);
            System.out.println("Transaction of amount " + transactionAmount + " added for customer '" + customerName + "' in branch '" + branchName + "'.");
        } else {
            System.out.println("Customer '" + customerName + "' does not exist in branch '" + branchName + "'.");
        }
    }

    public void printCustomerDetails(boolean showTransactions) {
        System.out.println("Customer details for branch '" + branchName + "':");
        for (Customer customer : customers) {
            System.out.println("Customer: " + customer.getCustomerName());
            if (showTransactions) {
                System.out.println("Transactions:");
                customer.printTransactions();
            }
        }
    }

    private Customer findCustomer(String customerName) {
        for (Customer customer : customers) {
            if (customer.getCustomerName().equals(customerName)) {
                return customer;
            }
        }
        return null;
    }
}
