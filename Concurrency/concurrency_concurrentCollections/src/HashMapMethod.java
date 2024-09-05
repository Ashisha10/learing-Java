import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.atomic.LongAdder;

//THIS IS NOT THREAD SAFE YET
public class HashMapMethod {
    public static void main(String[] args) {
        String str = "ABCD ABCD ABCD ABCD";
        Map<Character, LongAdder> occurences = new Hashtable<>();
        for (char character:str.toCharArray()) {
            LongAdder longAdder = occurences.get(character);
            if(longAdder == null) {
                longAdder = new LongAdder();
            }
            //If longAdder is null, meaning the character hasn't been encountered before,
            //a new LongAdder object is created.
            //increment() method of LongAdder is called to increment the count
            // of occurrences for the current character.
            longAdder.increment();
            occurences.put(character, longAdder);
        }
        //System.out.println(occurences);
    }
}
