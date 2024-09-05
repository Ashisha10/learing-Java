import java.util.Iterator;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            int cho = scanner.nextInt();
            if (cho == -1) {
                flag = false;
                break;
            }
            String newCity = scanner.nextLine().toLowerCase();
            Iterator<String> it = ll.iterator();
            int i = 0;
            while (it.hasNext()) {
                String str = it.next().toLowerCase();
                if (str.compareTo(newCity) > 0) {
                    ll.add(i, newCity);
                    i++;
                    break;
                }
                i++;
            }
            if (!it.hasNext()) {
                ll.add(newCity);
            }
        }
        Iterator<String> it = ll.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}