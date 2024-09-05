//import java.util.ArrayList;
//
//public class Customer {
//    private ArrayList<Double> doubleArrayList = new ArrayList<>();
//    private double initialAmt;
//    private String name;
//    private double currAmt;
//    public Customer(String name, double initialAmt) {
//        this.initialAmt = initialAmt;
//        this.name = name;
//    }
//
//    public double getInitialAmt() {
//        return initialAmt;
//    }
//
//    public double getCurrAmt() {
//        return currAmt;
//    }
//
//    public void setCurrAmt(double currAmt) {
//        this.currAmt = currAmt;
//    }
//
//    public ArrayList<Double> getDoubleArrayList() {
//        return doubleArrayList;
//    }
//
//    public void setInitialAmt(double initialAmt) {
//        this.initialAmt = initialAmt;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//}

import java.util.ArrayList;

class Customer {
    private String customerName;
    private ArrayList<Double> transactions;

    public Customer(String customerName, double initialTransaction) {
        this.customerName = customerName;
        this.transactions = new ArrayList<>();
        addTransaction(initialTransaction);
    }

    public String getCustomerName() {
        return customerName;
    }

    public void addTransaction(double transactionAmount) {
        transactions.add(transactionAmount);
    }

    public void printTransactions() {
        for (double transaction : transactions) {
            System.out.println(transaction);
        }
    }
}