import java.util.ArrayList;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String[] week = new String[]{"Mon", "Tues", "Wed", "Thurs", "Fri", "Sat", "Sun"};
        ArrayList<String> week2 = new ArrayList<> (Arrays.asList("Mon", "Tues", "Wed", "Thurs", "Fri", "Sat", "Sun"));
        int maxDays = Integer.MIN_VALUE;
        String ans = "";
        for(String day: week) {
            if(day.length() > maxDays) {
                maxDays = day.length();
                ans = day;
            }
        }
        System.out.println(ans);

        for(int i = 0; i < week2.size(); i++) {
            String day = week2.get(i);
            String reversedDay = "";
            for(int j = day.length()-1; j >= 0; j--) {
                reversedDay += day.charAt(j);
            }
            week2.set(i, reversedDay);
        }
        System.out.println(week2);
        String sentence = "Java is an object oriented programming language";
        sentence = sentence.trim(); // Assign back the trimmed sentence
        String[] words = sentence.split("\\s+"); // Split by whitespace
        ArrayList<String> wordList = new ArrayList<>();
        for (String word : words) {
            wordList.add(word);
        }
        int maxLen = Integer.MIN_VALUE;
        String ans2 = "";
        for(String word: wordList) {
            if(word.length() > maxLen) {
                maxLen = word.length();
                ans2 = word;
            }
        }
        System.out.println(ans2);
    }

}