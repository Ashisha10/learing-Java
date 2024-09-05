public class convMethod {
    public static void main(String[] args) {
        calcFeetAndInchesToCenti(157);
    }
    public static double calcFeetAndInchesToCenti(double feet, double inch) {
        if(feet < 0 || inch < 0 || inch > 12) {
            return -1;
        }
        double ans = (feet*12)*2.54d + (inch*2.54d);
        System.out.print(" i.e " + ans + " centimeters");
        return ans;
    }
    public static double calcFeetAndInchesToCenti(double inch) {
        if(inch < 0) {
            return -1;
        }
        double feetAns = (int)(inch/12);
        double inchAns = inch%12;
        System.out.print("there are " + feetAns + " ft and " + inchAns + " inches in " + inch + " inches");
        return calcFeetAndInchesToCenti(feetAns,inchAns);
    }

}
