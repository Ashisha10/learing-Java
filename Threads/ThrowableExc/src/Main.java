//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Amount.CurrenciesDoNotMatchExc, Exception {
        Amount amt1 = new Amount(12, "USD");
        Amount amt2 = new Amount(18, "UAE");
        amt1.add(amt2);
        System.out.println(amt1);
    }
}