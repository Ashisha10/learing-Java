
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.LongAdder;
//thus ConcurrentHashMap not only has atomic operations but it also divides the hashmap into multiple regions or
//sections that have seperate locks, increasing concurrency.

public class ConcurrentHashMapMethod {

    public static void main(String[] args) {
        String str = "ABCD ABCD ABCD ABCD    ";
        ConcurrentHashMap<Character, LongAdder> occurences = new ConcurrentHashMap<>();
        for (char character : str.toCharArray()) {
            occurences.computeIfAbsent(character, ch -> new LongAdder()).increment();
        }
        System.out.println(occurences);
    }
}

//hashmap locks the entire map, all fn are sync
//concurrentHashMap is locked in sections -- allowing parallel threading


