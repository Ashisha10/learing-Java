import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        MyCustomList<String> s = new MyCustomList<>();
        s.addElement("s");
        s.addElement("ccc");
        String v = s.get(0);
        System.out.println(v);
        MyCustomList<Integer> i = new MyCustomList<>();
        i.addElement(Integer.valueOf(1));
        i.addElement(Integer.valueOf(2));
        System.out.println(s);
        System.out.println(i);
        MySpecificList<Long>  l = new MySpecificList<>();
        l.addElement(2l);
        l.addElement(2l);
        System.out.println(l);
        ArrayList<Integer> ar = new ArrayList<>(List.of(1,3,21,32,23));
        MyGenericMethods.duplicate(ar);
        System.out.println(ar);
        System.out.println(MyGenericMethods.sumOfNumList(ar));
    }
}