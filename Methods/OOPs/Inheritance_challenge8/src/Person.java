//        Write a Java program to create a class known as Person with methods called
//        getFirstName() and getLastName(). Create a subclass called Employee
//        that adds a new method named getEmployeeId()
//        and overrides the getLastName() method to include the employee's job title.
public class Person {
    private String FirstName;
    private String LastName;

    public Person(String firstName, String lastName) {
        this.FirstName = firstName;
        this.LastName = lastName;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }
}
