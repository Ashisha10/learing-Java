public class Caller implements Phone{
    String name = "Staff";
    int num = 1233;
    int age = 18;
    int exp = 2;
    boolean probSolved = false;
    @Override
    public void receiving() {
        System.out.println(name + " is receiving your call");
    }

    @Override
    public void solving(boolean success) {
        System.out.println(name + " has solved " + exp + " problems, they are solving this");
        if(success == true) {
            probSolved = true;
        }
    }

    @Override
    public void solving() {
        probSolved = false;
    }

    @Override
    public void terminating() {
        if(probSolved) {
            System.out.println("great, we solved it");
        }
        else{
            System.out.println("sorry, retry");
        }
    }

    public Caller(String name, int num, int age, int exp) {
        this.num = num;
        this.name = name;
        this.age = age;
        this.exp = exp;
    }

    public void signingOff(boolean activity) {
        if(activity == true) {
            System.out.println("Caller is going off");
        }
        else{
            System.out.println("Caller is online");
        }
    }
}
