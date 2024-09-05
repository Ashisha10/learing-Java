public class Loops {
    public static void main(String[] args) {
        for(int val = 1; val <9; val++) {
            String str = String.format("%.2f", calc(10000, val));
            //System.out.println("10,000 at " + val + "% is " + calc(10000,val));
            System.out.println("10,000 at " + val + "% is " + String.format("%.2f", calc(10000, val)));
        }
        System.out.println("");
        for (int val = 8; val >=2; val--) {
            System.out.println(String.format("%.2f", calc(10000, val)));
        }
    }

    public static double calc(double amt, double rate) {
        return (amt*(rate/100));
    }
}
