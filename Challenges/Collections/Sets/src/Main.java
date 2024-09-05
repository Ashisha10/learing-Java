import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(76543);
        set.add(7654);
        set.add(765);
        set.add(76);
        //randomly ordered
        System.out.println(set);
        Set<Integer> set2 = new LinkedHashSet<>();
        set2.add(76543);
        set2.add(7654);
        set2.add(765);
        set2.add(76);
        //ordered
        System.out.println(set2);
        Set<Integer> set3 = new TreeSet<>();
        set3.add(76543);
        set3.add(7654);
        set3.add(765);
        set3.add(76);
        System.out.println(set3);
        List<Character> c = List.of('A', 'C', 'A', 'D', 'E', 'C', 'A', 'D', 'E');
        Set<Character> s = new LinkedHashSet<>(c);
        System.out.println(s);

        TreeSet<Integer> treeSet = new TreeSet<>(List.of(1, 2, 3, 4, 1, 3, 4, 6, 36, 6));
        System.out.println(treeSet);
        System.out.println(treeSet.subSet(1,36));
        System.out.println(treeSet.subSet(1,false,36, true));
    }
}