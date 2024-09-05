//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void staticFn() {
        String str = "blabla";
        System.out.println(str);
    }
    public void publicFn() {
        String str = "blabla";
        System.out.println("public " + str);
    }

    //java automatically inherits some objects when a new class is cretaed
    public static void main(String[] args) {
        //Car porsche;                //defining an object of a class
        Car porsche = new Car(10);        //initialising an object of a class-- this created a new datatype
        System.out.println(porsche.wheels); //accessing an attribute using '.'
        porsche.wheels = 3;                 //modifying an attribite
        System.out.println(porsche.wheels);

        //for making an attribute unmodifiable we make it 'final'
        System.out.println(porsche.doors);
        //porsche.doors = 3; gives error as it is a final attribute--it is unchangeable
        staticFn();
        //publicFn();
        Main blah = new Main();
        blah.publicFn();
        System.out.println(porsche.range);
        //myAbs life = new myAbs(); gives error as it is abstract and abstract classes cannot make objs
        Hey life = new Hey();
        life.simple();
    }
}