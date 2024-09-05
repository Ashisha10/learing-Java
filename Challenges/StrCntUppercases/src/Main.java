//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String str = "AshiSHA";
        System.out.println(countUppercaseLetters(str));
    }
    static int countUppercaseLetters(String str) {
        if(str.isEmpty()) {
            return 0;
        }
        int cnt = 0;
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(Character.isUpperCase(ch)) {
                cnt++;
            }
        }
        return cnt;
    }
}