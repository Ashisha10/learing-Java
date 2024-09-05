//import java.util.ArrayList;
//
//public class Bank {
//    private String bname;
//    private ArrayList<Branch> branches = new ArrayList<Branch>();
//    void addBranch(String bname) {
//        Branch b = new Branch(bname);
//        branches.add(b);
//    }
//    void printBranches() {
//        for(int i =0; i < branches.size(); i++) {
//            System.out.println(i+1 + ". " + branches.get(i).getBname());
//        }
//    }
//}
import java.util.ArrayList;

public class Bank {
    private String bankName;
    private ArrayList<Branch> branches;

    public Bank(String bankName) {
        this.bankName = bankName;
        this.branches = new ArrayList<>();
    }

    public void addBranch(String branchName) {
        Branch branch = findBranch(branchName);
        if (branch == null) {
            branches.add(new Branch(branchName));
            System.out.println("Branch '" + branchName + "' added to the bank.");
        } else {
            System.out.println("Branch '" + branchName + "' already exists in the bank.");
        }
    }

    public void addCustomer(String branchName, String customerName, double initialTransaction) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            branch.addCustomer(customerName, initialTransaction);
        } else {
            System.out.println("Branch '" + branchName + "' does not exist.");
        }
    }

    public void addTransaction(String branchName, String customerName, double transactionAmount) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            branch.addTransaction(customerName, transactionAmount);
        } else {
            System.out.println("Branch '" + branchName + "' does not exist.");
        }
    }

    public void showCustomerDetails(String branchName, boolean showTransactions) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            branch.printCustomerDetails(showTransactions);
        } else {
            System.out.println("Branch '" + branchName + "' does not exist.");
        }
    }

    private Branch findBranch(String branchName) {
        for (Branch branch : branches) {
            if (branch.getBranchName().equals(branchName)) {
                return branch;
            }
        }
        return null;
    }
    private void showBranches() {
        for(Branch branch : branches) {

        }
    }
}

