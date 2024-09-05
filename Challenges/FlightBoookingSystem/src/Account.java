public class Account {
    public String name;
    public int age;
    public String phoneNum;
    private String password;
    public String emailId;
    public String type;

    public Account(String name, int age, String phoneNum, String password, String emailId, String type) {
        this.name = name;
        this.age = age;
        this.phoneNum = phoneNum;
        this.password = password;
        this.emailId = emailId;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
