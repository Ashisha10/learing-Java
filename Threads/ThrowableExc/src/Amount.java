public class Amount {
    int amt = this.amt;
    String currency = this.currency;
    public Amount(int amt, String currency) {
        this.amt = amt;
        this.currency = currency;
    }
    public void add(Amount that) throws Exception, CurrenciesDoNotMatchExc {
//        if(!this.currency.equals(that.currency)) {
//            throw new Exception("Currencies dont match");
//        }
        if(!this.currency.equals(that.currency)) {
            throw new CurrenciesDoNotMatchExc("Currencies dont match");
        }
        else {
            this.amt = this.amt + that.amt;
        }
    }

    public String toString() {
        return this.amt + " " + this.currency;
    }

     class CurrenciesDoNotMatchExc extends Throwable {
        public CurrenciesDoNotMatchExc(String msg) {
            super(msg);
        }
    }
}
