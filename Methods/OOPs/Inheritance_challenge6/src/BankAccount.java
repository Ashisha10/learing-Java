
public class BankAccount {
    private int currentBalance;

    public BankAccount(){
        System.out.println("new acc has been opened with 0 balance");
        this.currentBalance = 0;
    }

    public void deposit(int balance) {
        this.currentBalance += balance;
        System.out.println("now the balance is " + this.currentBalance);
    }
    public void withdraw(int out) {
        if(this.currentBalance < out) {
            System.out.println("transaction not possible");
        }
        else{
            this.currentBalance -= out;
            System.out.println("remaining balance is " + this.currentBalance);;
        }
    }
}