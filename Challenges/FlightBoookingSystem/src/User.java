public class User extends Account {
    public User(String name, int age, String phoneNum, String password, String emailId) {
        super(name, age, phoneNum, password, emailId, "user");
    }

}