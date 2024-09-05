//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Person p = new Person("Ashisha", "Tulsian");
        Employee e = new Employee("Lily", "Dell");
        System.out.println(e.getFirstName()+ " " + e.getLastName());
    }
}