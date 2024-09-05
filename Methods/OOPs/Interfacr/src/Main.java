import java.util.Date;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    //if not "static" main would need another obj
    public static void main(String[] args) {
        Dog d = new Dog();
        d.run();
        d.walk();
        Bird b = new Bird();
        b.fly();
        b.run();
        b.walk();
        //ONLY reference attributes are accessable
        Walkable w = new Dog();
        w.run();
        w.walk();
        Flyable f = new Bird();
        f.fly();
        //Interfaces can have arrays because of storage of ref but they cannot make objs
        Walkable[] wArr = new Walkable[3];
        wArr[0] = new Dog();
        wArr[1] = new Bird();
        System.out.println(Util.getTodayDate());
    }

}
interface Walkable {
    void run();
    void walk();
}

interface Flyable {
    void fly();
}

class Dog implements Walkable {
    @Override
    public void run() {
        System.out.println("dog runs");
    }

    @Override
    public void walk() {
        System.out.println("dog walks");
    }
}

class Bird implements Flyable,Walkable {
    @Override
    public void run() {
        System.out.println("bird runs");
    }

    @Override
    public void walk() {
        System.out.println("bird walks");
    }

    @Override
    public void fly() {
        System.out.println("bird flies");
    }
}
class Util implements Flyable {
    @Override
    public void fly() {
        System.out.println("penguine flies");
    }
    public static Date getTodayDate() {
        Util penguin = new Util();
        penguin.fly();
        return new Date();
    }
}