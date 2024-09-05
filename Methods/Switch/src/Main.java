//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int if_val = 0;
        if(if_val == 0) {
            System.out.println(if_val + "; yay its null");
        } else if (if_val == 1) {
            System.out.println(if_val + "; damn, 1");
        } else{
            System.out.println(if_val + "; doomed");
        }
        int switch_val = 1;
        switch (switch_val) {
            case 0:
                System.out.println(switch_val + "; yay its null");
                break;
            case 1:
                System.out.println(switch_val + "; damn, 1");
                break;
            default:
                System.out.println(switch_val +"; doomed");
                break;
        }

        char letter = 'F';
        switch (letter){
            case 'A':
                System.out.println('A');
                break;
            case 'B':
                System.out.println('B');
                break;
            case 'C':
                System.out.println('C');
                break;
            case 'D':
                System.out.println('D');
                break;
            case 'E':
                System.out.println('E');
                break;
            case 'F': case 'G': case 'H': case 'I':
                System.out.println(letter + " found");
                break;
            default:
                System.out.println("none");
                break;
        }
        String month = "feB";
        String small_month = month.toLowerCase();
        String big_month = month.toUpperCase();
        int len = month.length();
        char[] mon = big_month.toCharArray();
        switch (small_month){
            case "jan": case "feb": case "march": case "april":
                //System.out.println(mon[0] + small_month.substring(1, len));
                System.out.println(big_month.substring(0,1).toUpperCase() + small_month.substring(1,len));
                break;
            default:
                System.out.println("out of quarter");
                break;
        }

    }

}