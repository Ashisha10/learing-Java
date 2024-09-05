//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.work();
        boolean ans = e.getSalary();
        if(ans){
            System.out.println("yay");
        };
        HRmanager h = new HRmanager();
        h.work();
        boolean ans2 = h.getSalary();
        if(ans2){
            System.out.println("yay, salaryy");
        };
        h.addEmployee();
    }
}