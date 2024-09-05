import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class DesceendingComp implements Comparator<Student> {

    @Override
    public int compare(Student student1, Student student2) {
        return Integer.compare(student2.getId(), student1.getId());
    }
}

class AscendingComp implements Comparator<Student> {

    @Override
    public int compare(Student student1, Student student2) {
        return Integer.compare(student1.getId(), student2.getId());
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("A", 1);
        Student s2 = new Student("C", 3);
        Student s3 = new Student("B", 2);
        List studList = List.of(s1, s2, s3);
        ArrayList<Student> studAl= new ArrayList<>(studList);
        System.out.println(studAl);
        Collections.sort(studAl);
        System.out.println("asc: " + studAl);
        Collections.sort(studAl, new DesceendingComp());
        System.out.println("desc: " + studAl);
        studAl.sort(new AscendingComp());
        System.out.println("asc: " + studAl);
    }
}