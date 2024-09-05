
//        Write a Java program to create a class known as Person with methods called
//        getFirstName() and getLastName(). Create a subclass called Employee
//        that adds a new method named getEmployeeId()
//        and overrides the getLastName() method to include the employee's job title.

public class Employee extends Person {
    private String title = "Intern";
    private int employeeId = 123;
    public Employee(String firstName, String lastName) {
        super(firstName, lastName);
        this.title = title;
        this.employeeId = employeeId;

    }
    public int getEmployeeId() {
        return employeeId;
    }

    public String getLastName() {
        return super.getLastName() + ", " + title ; //super keyword is necessary to avoid stack overflow
    }
}
