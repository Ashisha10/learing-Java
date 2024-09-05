public class isPrime {
    public static void main(String[] args) {
        System.out.println(isPrime(13));
        printPrime();
    }
    public static boolean isPrime(int num) {
        if(num == 1) {
            return false;
        }
        //for(int i = 2; i < num/2; i++) {
        for(int i = 2; i < Math.sqrt(num); i++) {
            if(num%i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void printPrime() {
        int count = 0;
        for(int i = 1; i < 100; i++) {
            if(isPrime(i)) {
                System.out.print(i + " ");
                count++;
//                if (count == 3) {
//                    break;
//                }
            }
        }
        System.out.println("");
        System.out.println("num of primes= " +count);
    }
}
