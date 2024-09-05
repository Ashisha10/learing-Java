import java.awt.*;
import java.util.*;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<String> list = List.of("baby", "munchkin", "precious");
        List<String> arrayList = new ArrayList<>(list);
        System.out.println(arrayList);
        arrayList.add("bubbles");
        arrayList.add(0, "Ashisha");
        for (String element : arrayList) {
            if (element.endsWith("y")) {
                arrayList.remove(element);
                break;
            }
        }
        System.out.println(arrayList.get(1));
        arrayList.set(1, "deleted");
        System.out.println(arrayList);

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i) + " ");
        }
        System.out.println();
        for (String element : arrayList) {
            System.out.print(element + " ");
        }
        System.out.println();
        Iterator arrayListIt = arrayList.iterator();
        while (arrayListIt.hasNext()) {
            System.out.print(arrayListIt.next() + " ");
        }
        Collections.sort(arrayList);
        System.out.println(arrayList);
        System.out.println();
        List<String> linkedList = new LinkedList<>(list);
        System.out.println(linkedList);
        List<String> vector = new Vector<>(list);
        System.out.println(vector);
    }
}
